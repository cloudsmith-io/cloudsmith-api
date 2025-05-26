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

# Logging functions
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

get_current_version() {
    if [ ! -f "$COMMON_SCRIPT" ]; then
        log_error "File $COMMON_SCRIPT not found"
        exit 1
    fi
    
    local current_version=$(grep -E "^package_version=" "$COMMON_SCRIPT" | cut -d'=' -f2 | tr -d '"' | tr -d "'")
    echo "$current_version"
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
    
    # Create backup
    cp "$COMMON_SCRIPT" "$COMMON_SCRIPT.backup"
    
    # Use a more reliable approach with awk
    awk -v new_ver="$new_version" '
        /^package_version=/ {
            print "package_version=\"" new_ver "\""
            next
        }
        { print }
    ' "$COMMON_SCRIPT" > "$COMMON_SCRIPT.tmp" && mv "$COMMON_SCRIPT.tmp" "$COMMON_SCRIPT"
    
    # Alternative: If awk fails, try perl
    if [ $? -ne 0 ]; then
        log_warning "awk failed, trying perl..."
        cp "$COMMON_SCRIPT.backup" "$COMMON_SCRIPT"
        
        if command -v perl &> /dev/null; then
            perl -i -pe "s/^package_version=.*/package_version=\"$new_version\"/" "$COMMON_SCRIPT"
        else
            log_error "Neither awk nor perl worked, trying basic sed..."
            # Very basic sed approach
            if [[ "$OSTYPE" == "darwin"* ]]; then
                sed -i '' "s/package_version=\".*\"/package_version=\"$new_version\"/" "$COMMON_SCRIPT"
            else
                sed -i "s/package_version=\".*\"/package_version=\"$new_version\"/" "$COMMON_SCRIPT"
            fi
        fi
    fi
    
    # Verify the update
    local updated_version=$(get_current_version)
    if [ "$updated_version" != "$new_version" ]; then
        log_error "Failed to update version in $COMMON_SCRIPT"
        log_error "Expected: $new_version, Got: $updated_version"
        
        # Show what's actually in the file for debugging
        log_error "Updated package_version line:"
        grep "package_version" "$COMMON_SCRIPT" || log_error "No package_version line found"
        
        # Restore backup
        mv "$COMMON_SCRIPT.backup" "$COMMON_SCRIPT"
        exit 1
    fi
    
    # Remove backup
    rm "$COMMON_SCRIPT.backup"
    log_success "Version updated successfully"
}

# Function to generate bindings
generate_bindings() {
    log_info "Generating bindings..."
    
    if [ ! -x "$BUILD_SCRIPT" ]; then
        log_warning "Making $BUILD_SCRIPT executable"
        chmod +x "$BUILD_SCRIPT"
    fi
    
    # Run the build script
    if ./"$BUILD_SCRIPT"; then
        log_success "Bindings generated successfully"
    else
        log_error "Failed to generate bindings"
        exit 1
    fi
}

# Function to create and push branch
create_and_push_branch() {
    local version="$1"
    local branch_name="${BRANCH_PREFIX}-v${version}"
    
    log_info "Creating branch: $branch_name"
    
    # Check if branch already exists
    if git show-ref --verify --quiet "refs/heads/$branch_name"; then
        log_warning "Branch $branch_name already exists locally. Deleting it."
        git branch -D "$branch_name"
    fi
    
    # Create new branch
    git checkout -b "$branch_name"
    
    # Add all changes
    git add .
    
    # Check if there are changes to commit
    if git diff --staged --quiet; then
        log_warning "No changes to commit. The bindings might already be up to date."
        return 1
    fi
    
    # Commit changes
    git commit -m "Update API bindings to version $version

- Updated package_version in scripts/common.sh
- Regenerated bindings for Python, Ruby, and Java
- Ready for automated deployment via CircleCI"
    
    # Push branch
    log_info "Pushing branch to origin..."
    git push origin "$branch_name"
    
    log_success "Branch created and pushed successfully"
    echo "$branch_name"
}

# Function to create pull request
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
    
    # Create PR using GitHub CLI
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

# Function to display usage
usage() {
    echo "Usage: $0 [OPTIONS]"
    echo ""
    echo "Options:"
    echo "  -v, --version VERSION    New binding version (required)"
    echo "  -a, --api-version VERSION API version (optional, defaults to binding version)"
    echo "  -h, --help              Show this help message"
    echo ""
    echo "Examples:"
    echo "  $0 -v 1.2.3"
    echo "  $0 --version 1.2.3 --api-version 2.1.0"
}

main() {
    local new_version=""
    local api_version=""
    
    # Parse command line arguments
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
    
    # Check if version is provided
    if [ -z "$new_version" ]; then
        log_error "Version is required"
        usage
        exit 1
    fi
    
    # Default API version to binding version if not provided
    if [ -z "$api_version" ]; then
        api_version="$new_version"
    fi
    
    validate_version "$new_version"
    validate_version "$api_version"
    
    log_info "Starting CloudSmith API bindings update process..."
    log_info "New binding version: $new_version"
    log_info "API version: $api_version"
    
    check_dependencies
    
    # Get current version for comparison
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
    
    # Ensure we're on master branch
    local current_branch=$(git branch --show-current)
    if [[ "$current_branch" != "master" ]]; then
        log_info "Switching to master branch..."
        git checkout master 2>/dev/null || {
            log_error "Could not switch to master branch"
            exit 1
        }
    fi
    
    log_info "Pulling latest changes..."
    git pull origin $(git branch --show-current)
    
    update_version "$new_version"
    
    generate_bindings
    
    # Create branch, push & create PR
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