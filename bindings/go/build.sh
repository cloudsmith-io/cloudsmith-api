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


# Apply fixes for missing imports
#
# This is a temporary measure as a larger API/swagger update is due soon which
# should resolve this and other issues properly.

sed -i 's/	\"fmt\"/	\"fmt\"\n	\"github.com\/antihax\/optional\"/g' $src_dir/api_files.go
sed -i 's/	\"strings\"/	\"strings\"\n	\"github.com\/antihax\/optional\"/g' $src_dir/api_user.go
