#!/usr/bin/env bash
set -e

self=$(readlink -f $BASH_SOURCE)
self_dir=$(dirname $self)
root_dir=$(readlink -f "$self_dir/../..")
. $root_dir/scripts/common.sh $1

src_dir="$self_dir/src"
build_json="$src_dir/build.json"

rm -rf $src_dir
mkdir -p $src_dir

cat > $build_json <<EOC
{
    "hideGenerationTimestamp": $hide_generation_timestamp,
    "packageName": "$project_underscore",
    "packageVersion": "$api_version"
}
EOC

$root_dir/bin/swagger-codegen-cli generate \
    -c $build_json \
    -i $openapi_url \
    -l go \
    -o $src_dir \
    $common_codegen_options
