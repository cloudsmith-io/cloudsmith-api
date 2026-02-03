#!/usr/bin/env bash
set -e

self=$(readlink -f $BASH_SOURCE)
self_dir=$(dirname $self)
root_dir=$(readlink -f "$self_dir/../..")
. $root_dir/scripts/common.sh $1

src_dir="$self_dir/src"
build_json="$src_dir/build.json"
template_dir="$self_dir/templates"

# OpenAPI Generator image for TypeScript (better TypeScript support than swagger-codegen)
openapi_generator_image="openapitools/openapi-generator-cli:v7.10.0"

rm -rf $src_dir
mkdir -p $src_dir

cat > $build_json <<EOC
{
    "allowUnicodeIdentifiers": $allow_unicode_identifiers,
    "ensureUniqueParams": $ensure_unique_params,
    "hideGenerationTimestamp": $hide_generation_timestamp,
    "npmName": "$project_dash",
    "npmVersion": "$package_version",
    "sortParamsByRequiredFlag": $sort_params,
    "supportsES6": true,
    "typescriptThreePlus": true,
    "withInterfaces": true,
    "modelPropertyNaming": "original",
    "enumPropertyNaming": "original",
    "paramNaming": "original"
}
EOC

# Check if custom templates exist
template_args=""
if [[ -d "$template_dir" ]] && [[ "$(ls -A $template_dir 2>/dev/null)" ]]; then
    template_args="-t /local/templates"
fi

docker container run --rm -v $self_dir:/local "${openapi_generator_image:?}" generate \
    -c /local/src/build.json \
    -i $openapi_url \
    -g typescript-fetch \
    -o /local/src \
    $template_args \
    --git-user-id $git_user_id \
    --git-repo-id $git_repo_id \
    --additional-properties=projectName="$project_dash" \
    --additional-properties=projectDescription="$summary" \
    --additional-properties=projectVersion="$package_version" \
    --additional-properties=licenseName="$license_spdx"

# Post-generation fixes

# UNCOMMENT BELOW TO ENABLE POST-GENERATION FIXES

# cd "$src_dir"

# # Fix package.json with correct metadata
# if [[ -f package.json ]]; then
#     tmp=$(mktemp)
#     cat package.json | \
#         sed "s|\"version\":.*|\"version\": \"$package_version\",|" | \
#         sed "s|\"name\":.*|\"name\": \"$project_dash\",|" | \
#         sed "s|\"author\":.*|\"author\": \"$author <$author_email>\",|" | \
#         sed "s|\"homepage\":.*|\"homepage\": \"$author_url\",|" \
#         > "$tmp" && mv "$tmp" package.json
# fi

# # Fix invalid TypeScript enum identifiers generated from OpenAPI spec
# # Some enum values in the API spec (like '<<', '>>', '~>') result in invalid TS identifiers
# fix_invalid_enum_identifiers() {
#     local file=$1
#     if [[ -f "$file" ]]; then
#         sed -i.bak \
#             -e 's/^    : '\''<<'\'',$/    LessLess: '\''<<'\'',/' \
#             -e 's/^    2: '\''>>'\'',$/    GreaterGreater: '\''>>'\'',/' \
#             -e 's/^    3: '\''~>'\'',$/    TildeGreater: '\''~>'\'',/' \
#             "$file" && rm -f "${file}.bak"
#     fi
# }

# # Apply fixes to any generated model files with invalid identifiers
# for ts_file in src/models/*.ts; do
#     if grep -q "^    : '\|^    [0-9]: '" "$ts_file" 2>/dev/null; then
#         echo "Fixing invalid enum identifiers in $ts_file"
#         fix_invalid_enum_identifiers "$ts_file"
#     fi
# done

echo "TypeScript bindings generated successfully in $src_dir"
