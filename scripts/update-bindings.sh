#!/bin/bash

set -e

REPO_NAME="cloudsmith-api"
REPO_URL="https://github.com/cloudsmith-io/cloudsmith-api"
BRANCH_PREFIX="update-bindings"
COMMON_SCRIPT="scripts/common.sh"
BUILD_SCRIPT="scripts/build.sh"

RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
NC='\033[0m'

log_info() {
    echo -e "${BLUE}[INFO]${NC} $1"
}

log_success() {
    echo -e "${GREEN}[SUCCESS]${NC} $1"
}

log_warning() {
    echo -e "${YELLOW}[WARNING]${NC} $1"
}

log_error() {
    echo -e "${RED}[ERROR]${NC} $1"
}

check_dependencies() {
    log_info "Checking dependencies..."
    
    local missing_deps=()
    
    if ! command -v git &> /dev/null; then
        missing_deps+=("git")
    fi
    
    if ! command -v gh &> /dev/null; then
        missing_deps+=("gh (GitHub CLI)")
    fi
    
    if [ ${#missing_deps[@]} -ne 0 ]; then
        log_error "Missing dependencies: ${missing_deps[*]}"
        log_error "Please install the missing dependencies and try again."
        exit 1
    fi
    
    log_success "All dependencies are installed"
}

validate_version() {
    local version="$1"
    if [[ ! $version =~ ^[0-9]+\.[0-9]+\.[0-9]+$ ]]; then
        log_error "Invalid version format: $version"
        log_error "Version should be in format: X.Y.Z (e.g., 1.2.3)"
        exit 1
    fi
}

check_repository() {
    if [ ! -f "$COMMON_SCRIPT" ] || [ ! -f "$BUILD_SCRIPT" ]; then
        log_error "This doesn't appear to be the cloudsmith-api repository"
        log_error "Required files not found: $COMMON_SCRIPT, $BUILD_SCRIPT"
        exit 1
    fi
    log_success "Repository validation passed"
}

get_current_version() {
    if [ ! -f "$COMMON_SCRIPT" ]; then
        log_error "File $COMMON_SCRIPT not found"
        exit 1
    fi
    
    local current_version=$(grep -E "^package_version=" "$COMMON_SCRIPT" | cut -d'=' -f2 | tr -d '"' | tr -d "'")
    echo "$current_version"
}

get_api_version() {
    local api_url="https://api.cloudsmith.io/"
    log_info "Fetching current API version from CloudSmith..."
    
    local api_version=$(curl -s "${api_url}status/check/basic/" 2>/dev/null | jq -r '.version' 2>/dev/null)
    
    if [ "$api_version" = "null" ] || [ -z "$api_version" ]; then
        log_warning "Could not fetch API version from CloudSmith API"
        return 1
    fi
    
    echo "$api_version"
}

update_version() {
    local new_version="$1"
    local current_version=$(get_current_version)
    
    log_info "Updating version from $current_version to $new_version"
    
    log_info "Current package_version line:"
    grep "package_version" "$COMMON_SCRIPT" || {
        log_error "No package_version line found in $COMMON_SCRIPT"
        exit 1
    }
    
    cp "$COMMON_SCRIPT" "$COMMON_SCRIPT.backup"
    
    awk -v new_ver="$new_version" '
        /^package_version=/ {
            print "package_version=\"" new_ver "\""
            next
        }
        { print }
    ' "$COMMON_SCRIPT" > "$COMMON_SCRIPT.tmp" && mv "$COMMON_SCRIPT.tmp" "$COMMON_SCRIPT"
    
    local updated_version=$(get_current_version)
    if [ "$updated_version" != "$new_version" ]; then
        log_error "Failed to update version in $COMMON_SCRIPT"
        log_error "Expected: $new_version, Got: $updated_version"
        
        log_error "Updated package_version line:"
        grep "package_version" "$COMMON_SCRIPT" || log_error "No package_version line found"
        
        mv "$COMMON_SCRIPT.backup" "$COMMON_SCRIPT"
        exit 1
    fi
    
    rm "$COMMON_SCRIPT.backup"
    log_success "Version updated successfully"
}

generate_bindings() {
    log_info "Generating bindings..."
    
    if [ ! -x "$BUILD_SCRIPT" ]; then
        log_warning "Making $BUILD_SCRIPT executable"
        chmod +x "$BUILD_SCRIPT"
    fi
    
    if ./"$BUILD_SCRIPT"; then
        log_success "Bindings generated successfully"
    else
        log_error "Failed to generate bindings"
        exit 1
    fi
}

create_and_push_branch() {
    local version="$1"
    local branch_name="${BRANCH_PREFIX}-v${version}"
    
    log_info "Creating branch: $branch_name"
    
    if git show-ref --verify --quiet "refs/heads/$branch_name"; then
        log_warning "Branch $branch_name already exists locally. Deleting it."
        git branch -D "$branch_name"
    fi
    
    if git ls-remote --heads origin "$branch_name" | grep -q "$branch_name"; then
        log_warning "Branch $branch_name already exists on remote."
        read -p "Do you want to delete the remote branch and create a new one? (y/N): " -n 1 -r
        echo
        if [[ $REPLY =~ ^[Yy]$ ]]; then
            log_info "Deleting remote branch $branch_name..."
            git push origin --delete "$branch_name" || {
                log_warning "Could not delete remote branch (it might not exist or you might not have permissions)"
            }
        else
            local timestamp=$(date +"%Y%m%d-%H%M%S")
            branch_name="${BRANCH_PREFIX}-v${version}-${timestamp}"
            log_info "Using unique branch name: $branch_name"
        fi
    fi
    
    git checkout -b "$branch_name"
    git add .
    
    if git diff --staged --quiet; then
        log_warning "No changes to commit. The bindings might already be up to date."
        return 1
    fi
    
    git commit -m "Update API bindings to version $version

- Updated package_version in scripts/common.sh
- Regenerated bindings for Python, Ruby, and Java
- Ready for automated deployment via CircleCI"
    
    log_info "Pushing branch to origin..."
    if ! git push origin "$branch_name"; then
        log_warning "Normal push failed, trying force push..."
        git push origin "$branch_name" --force-with-lease || {
            log_error "Failed to push branch even with force. Check your permissions."
            exit 1
        }
    fi
    
    log_success "Branch created and pushed successfully"
    echo "$branch_name"
}

create_pull_request() {
    local version="$1"
    local branch_name="$2"
    local api_version="$3"
    
    log_info "Creating pull request..."
    
    local pr_title="Update API bindings to version $version"
    local pr_body="## API Bindings Update

**API Version:** $api_version
**Binding Version:** $version

### Changes Made:
- Updated \`package_version\` in \`scripts/common.sh\` to \`$version\`
- Regenerated bindings using \`./scripts/build.sh\`
- Updated bindings for:
  - Python
  - Ruby  
  - Java

### Deployment:
Once this PR is merged, the bindings will be automatically deployed via CircleCI.

### Testing:
- [ ] Bindings generated successfully
- [ ] No compilation errors
- [ ] Ready for deployment

---
*This PR was created automatically by the update script.*"
    
    local pr_url
    if pr_url=$(gh pr create --title "$pr_title" --body "$pr_body" --head "$branch_name" --base "main" 2>/dev/null); then
        log_success "Pull request created: $pr_url"
        echo "$pr_url"
    elif pr_url=$(gh pr create --title "$pr_title" --body "$pr_body" --head "$branch_name" --base "master" 2>/dev/null); then
        log_success "Pull request created: $pr_url"
        echo "$pr_url"
    else
        log_error "Failed to create pull request"
        log_error "Please create the PR manually or check your GitHub CLI authentication"
        exit 1
    fi
}

usage() {
    echo "Usage: $0 [OPTIONS]"
    echo ""
    echo "Options:"
    echo "  -v, --version VERSION       New binding version (required)"
    echo "  -a, --api-version VERSION   API version (required, unless --auto-api is used)"
    echo "      --auto-api              Auto-fetch current API version from CloudSmith API"
    echo "  -h, --help                  Show this help message"
    echo ""
    echo "Examples:"
    echo "  $0 -v 2.0.19 -a 1.697.0                    # Specify both versions explicitly"
    echo "  $0 -v 2.0.19 --auto-api                    # Auto-fetch API version"
    echo "  $0 --version 2.0.19 --api-version 1.697.0  # Long form"
    echo ""
    echo "Note:"
    echo "  - Binding version: Version of your generated client library"
    echo "  - API version: Version of the CloudSmith API specification"
    echo "  - These are different things and should not be the same!"
}

main() {
    local new_version=""
    local api_version=""
    local auto_fetch_api_version=false
    
    while [[ $# -gt 0 ]]; do
        case $1 in
            -v|--version)
                new_version="$2"
                shift 2
                ;;
            -a|--api-version)
                api_version="$2"
                shift 2
                ;;
            --auto-api)
                auto_fetch_api_version=true
                shift
                ;;
            -h|--help)
                usage
                exit 0
                ;;
            *)
                log_error "Unknown option: $1"
                usage
                exit 1
                ;;
        esac
    done
    
    if [ -z "$new_version" ]; then
        log_error "Binding version is required"
        usage
        exit 1
    fi
    
    if [ -z "$api_version" ]; then
        if [ "$auto_fetch_api_version" = true ]; then
            if api_version=$(get_api_version); then
                log_info "Auto-fetched API version: $api_version"
            else
                log_error "Failed to auto-fetch API version"
                log_error "Please specify API version manually with -a or --api-version"
                exit 1
            fi
        else
            log_error "API version is required. Either:"
            log_error "  1. Specify it manually: -a 1.697.0"
            log_error "  2. Auto-fetch from API: --auto-api"
            exit 1
        fi
    fi
    
    validate_version "$new_version"
    validate_version "$api_version"
    
    log_info "Starting CloudSmith API bindings update process..."
    log_info "New binding version: $new_version"
    log_info "API version: $api_version"
    
    check_dependencies
    check_repository
    
    local current_version=$(get_current_version)
    log_info "Current version: $current_version"
    
    if [ "$current_version" = "$new_version" ]; then
        log_warning "Version $new_version is the same as current version"
        read -p "Do you want to continue anyway? (y/N): " -n 1 -r
        echo
        if [[ ! $REPLY =~ ^[Yy]$ ]]; then
            log_info "Operation cancelled"
            exit 0
        fi
    fi
    
    local current_branch=$(git branch --show-current)
    log_info "Current branch: $current_branch"
    
    if [[ "$current_branch" == "main" || "$current_branch" == "master" ]]; then
        log_info "Already on main branch ($current_branch)"
    else
        if ! git diff-index --quiet HEAD --; then
            log_error "You have uncommitted changes. Please commit or stash them first:"
            git status --short
            exit 1
        fi
        
        log_info "Switching to main branch..."
        
        if git show-ref --verify --quiet refs/heads/main; then
            git checkout main || {
                log_error "Could not switch to main branch"
                exit 1
            }
        elif git show-ref --verify --quiet refs/heads/master; then
            git checkout master || {
                log_error "Could not switch to master branch"
                exit 1
            }
        else
            log_error "Neither 'main' nor 'master' branch found"
            log_error "Available branches:"
            git branch -a
            exit 1
        fi
    fi
    
    log_info "Pulling latest changes..."
    git pull origin $(git branch --show-current)
    
    update_version "$new_version"
    generate_bindings
    
    local branch_name
    if branch_name=$(create_and_push_branch "$new_version"); then
        local pr_url
        pr_url=$(create_pull_request "$new_version" "$branch_name" "$api_version")
        
        log_success "Automation completed successfully!"
        echo ""
        echo "Summary:"
        echo "- Version updated from $current_version to $new_version"
        echo "- Bindings regenerated"
        echo "- Branch created: $branch_name"
        echo "- Pull request: $pr_url"
        echo ""
        echo "Next steps:"
        echo "1. Review the pull request"
        echo "2. Get approval from team members"
        echo "3. Merge the PR"
        echo "4. CircleCI will automatically deploy the bindings"
    else
        log_warning "No changes detected. The bindings may already be up to date."
    fi
}

main "$@"