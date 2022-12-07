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
    "allowUnicodeIdentifiers": $allow_unicode_identifiers,
    "apiPackage": "io.cloudsmith.api.apis",
    "artifactId": "$project_dash",
    "artifactUrl": "$openapi_url",
    "artifactVersion": "$package_version",
    "artifactDescription": "$summary",
    "dateLibrary": "java8",
    "developerName": "$author",
    "developerEmail": "$author_email",
    "developerOrganization": "$author",
    "developerOrganizationUrl": "$author_url",
    "ensureUniqueParams": $ensure_unique_params,
    "hideGenerationTimestamp": $hide_generation_timestamp,
    "java8": true,
    "library": "okhttp-gson",
    "licenseName": "$license",
    "licenseUrl": "$license_url",
    "invokerPackage": "io.cloudsmith.api",
    "groupId": "io.cloudsmith.api",
    "modelPackage": "io.cloudsmith.api.models",
    "parcelableModel": false,
    "performBeanValidation": true,
    "serializableModel": true,
    "sortParamsByRequiredFlag": $sort_params,
    "useBeanValidation": true,
    "useGzipFeature": false,
    "withXml": false
}
EOC

$root_dir/bin/swagger-codegen-cli generate \
    -c $build_json \
    -i $openapi_url \
    -l java \
    -o $src_dir \
    $common_codegen_options
