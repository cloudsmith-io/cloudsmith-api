#!/usr/bin/env bash
language=${1:-""}
api_url=${2:-${api_url:-"https://api.cloudsmith.io/"}}
# build.sh, test.sh, push.sh, deploy.sh and full-deploy.sh run the per-language
export api_url
api_version=$(curl -s "${api_url}status/check/basic/" | jq -r '.version')
openapi_url="${api_url}?format=openapi"
package_version="2.0.42"
# Dependabot updates the image in codegen/Dockerfile.
swagger_codegen_cli_image=$(awk '/^FROM / {print $2}' "$root_dir/codegen/Dockerfile")

location=$(curl -s $openapi_url | grep Location | cut -d' ' -f2)
[[ "$location" != "" ]] && {
  openapi_scheme=$(echo $openapi_url | awk -F[/:] '{print $1}')
  openapi_hostname=$(echo $openapi_url | awk -F[/:] '{print $4}')
  openapi_url="${openapi_scheme}://${openapi_hostname}${location}"
}

# Bindings attributes/config 
allow_unicode_identifiers="true"
author="Cloudsmith Ltd"
author_email="support@cloudsmith.io"
author_url="https://cloudsmith.io"
ensure_unique_params="true"
cloudsmith_repo_api="cloudsmith/api"
git_user_id="cloudsmith-io"
git_repo_id="cloudsmith-api"
hide_generation_timestamp="true"
license="Apache License 2.0"
license_spdx="Apache-2.0"
license_url="https://spdx.org/licenses/Apache-2.0"
project_camelcase="CloudsmithApi"
project_dash="cloudsmith-api"
project_underscore="cloudsmith_api"
sort_params="true"
summary="Cloudsmith API"

common_codegen_options="--git-user-id $git_user_id --git-repo-id $git_repo_id"

# Codegen writes into a bind-mounted directory. On Linux the container's root
# user owns the result, which blocks the post-generation fixups (Ruby
# re-escaping, ruff autofixes) from rewriting those files, so run as the
# invoking user instead.
codegen_run_user="$(id -u):$(id -g)"

# CircleCI deploys on every merge to master, and most merges do not change the
# version. Cloudsmith rejects a second upload of the same version, so check
# for a completed package of this version before a deploy.
function cloudsmith_version_published {
  local format=$1
  local query="format:$format AND name:^$project_dash\$ AND version:^$package_version\$ AND status:completed"
  local auth=()
  [ -n "$CLOUDSMITH_API_KEY" ] && auth=(-H "X-Api-Key: $CLOUDSMITH_API_KEY")
  local count
  count=$(curl -sf --max-time 30 -G "${api_url}v1/packages/${cloudsmith_repo_api}/" "${auth[@]}" \
    --data-urlencode "query=$query" | jq 'length') || return 1
  [ "${count:-0}" -gt 0 ]
}

# Dependabot updates bindings/java/release/pom.xml. Write it with the package
# version, as the pom that the Java binding ships.
function write_release_pom {
  awk -v version="$package_version" \
    '!done && sub(/<version>[^<]*<\/version>/, "<version>" version "</version>") { done = 1 } 1' \
    "$root_dir/bindings/java/release/pom.xml" > "$1"
}

function die {
  echo "$@"
  exit 1
}
