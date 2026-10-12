#!/usr/bin/env bash
set -e

self=$(readlink -f $BASH_SOURCE)
self_dir=$(dirname $self)
root_dir=$(readlink -f "$self_dir/../..")
. $root_dir/scripts/common.sh $1

src_dir="$self_dir/src"

rm -rf $src_dir
mkdir -p $src_dir
cp "$self_dir/.openapi-generator-ignore" "$src_dir/.openapi-generator-ignore"

docker container run --rm --user "${codegen_run_user:?}" -v $self_dir:/local "${openapi_generator_cli_image:?}" generate \
    -i $openapi_url \
    -g python \
    -o /local/src \
    --additional-properties "packageName=$project_underscore,projectName=$project_dash,packageVersion=$package_version,packageUrl=$openapi_url,hideGenerationTimestamp=$hide_generation_timestamp" \
    $common_codegen_options

# Dependabot updates release/pyproject.toml. Replace the generated packaging with it.
cp "$root_dir/LICENSE" "$src_dir/LICENSE"
awk -v version="$package_version" \
    '!done && sub(/^version = "[^"]*"/, "version = \"" version "\"") { done = 1 } 1' \
    "$self_dir/release/pyproject.toml" > "$src_dir/pyproject.toml"
