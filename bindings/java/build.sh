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
    "apiPackage": "io.cloudsmith.apis",
    "artifactId": "$project_dash",
    "artifactUrl": "$api_url",
    "artifactVersion": "$api_version",
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
    "invokerPackage": "io.cloudsmith",
    "groupId": "io.cloudsmith",
    "modelPackage": "io.cloudsmith.models",
    "parcelableModel": false,
    "performBeanValidation": true,
    "serializableModel": true,
    "sortParamsByRequiredFlag": $sort_params,
    "useBeanValidation": true,
    "useGzipFeature": false,
    "withXml": false
}
EOC

java -jar $root_dir/bin/swagger-codegen-cli.jar generate \
    -c $build_json \
    -i $api_url \
    -l java \
    -o $src_dir \
    $common_codegen_options
