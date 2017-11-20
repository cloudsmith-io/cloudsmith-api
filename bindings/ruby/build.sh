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
    "allowUnicodeIdentifiers": $allow_unicode_identifiers,
    "ensureUniqueParams": $ensure_unique_params,
    "gemAuthor": "$author",
    "gemAuthorEmail": "$author_email",
    "gemLicense": "$license_spdx",
    "gemHomepage": "$api_url",
    "gemName": "$project_dash",
    "gemRequiredRubyVersion": ">= 1.9",
    "gemSummary": "$summary",
    "gemVersion": "$api_version",
    "hideGenerationTimestamp": $hide_generation_timestamp,
    "moduleName": "$project_camelcase",
    "sortParamsByRequiredFlag": $sort_params
}
EOC

java -jar $root_dir/bin/swagger-codegen-cli.jar generate \
    -c $build_json \
    -i $api_url \
    -l ruby \
    -o $src_dir \
    $common_codegen_options
