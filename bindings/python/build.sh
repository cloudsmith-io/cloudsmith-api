#!/usr/bin/env bash
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
    "projectName": "$project_dash",
    "packageVersion": "$version",
    "packageUrl": "$openapi_url",
    "sortParamsByRequiredFlag": $sort_params
}
EOC

docker run --rm --mount type=bind,source=${self_dir},target=/local \
  openapitools/openapi-generator-cli generate \
    -c "/local/src/build.json" \
    -i $openapi_url \
    -g python \
    -o "/local/src/" \
    $common_codegen_options
sudo chown $USER:$USER -R $src_dir
