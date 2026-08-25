#!/usr/bin/env bash
language=${1:-""}
api_url=${2:-${api_url:-"https://api.cloudsmith.io/"}}
api_version=$(curl -s "${api_url}status/check/basic/" | jq -r '.version')
openapi_url="${api_url}?format=openapi"
package_version="2.0.32"
swagger_codegen_cli_image="swaggerapi/swagger-codegen-cli:v2.4.50"

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

function die {
  echo "$@"
  exit 1
}
