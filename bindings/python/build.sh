#!/usr/bin/env bash
set -e

self=$(readlink -f $BASH_SOURCE)
self_dir=$(dirname $self)
root_dir=$(readlink -f "$self_dir/../..")
. $root_dir/scripts/common.sh $1

src_dir="$self_dir/src"
build_json="$src_dir/build.json"
template_dir="$self_dir/templates"
python_requires=">=3.10"

rm -rf $src_dir
mkdir -p $src_dir

cat > $build_json <<EOC
{
    "hideGenerationTimestamp": $hide_generation_timestamp,
    "packageName": "$project_underscore",
    "projectName": "$project_underscore",
    "packageVersion": "$package_version",
    "packageUrl": "$openapi_url",
    "sortParamsByRequiredFlag": $sort_params
}
EOC

docker container run --rm --user "${codegen_run_user:?}" -v $self_dir:/local "${swagger_codegen_cli_image:?}" generate \
    -c /local/src/build.json \
    -i $openapi_url \
    -l python \
    -o /local/src \
    -t /local/templates \
    --ignore-file-override /local/.swagger-codegen-ignore \
    --additional-properties "pythonRequires=$python_requires" \
    $common_codegen_options

# Restore release metadata after clean regeneration.
cp "$root_dir/LICENSE" "$src_dir/LICENSE"
cp "$self_dir/release/pyproject.toml" "$src_dir/pyproject.toml"
