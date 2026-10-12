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
cp "$self_dir/.openapi-generator-ignore" "$src_dir/.openapi-generator-ignore"

cat > $build_json <<EOC
{
    "allowUnicodeIdentifiers": $allow_unicode_identifiers,
    "apiPackage": "io.cloudsmith.api.apis",
    "artifactId": "$project_dash",
    "artifactUrl": "$openapi_url",
    "artifactVersion": "$package_version",
    "artifactDescription": "$summary",
    "containerDefaultToNull": true,
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
    "performBeanValidation": false,
    "serializableModel": true,
    "sortParamsByRequiredFlag": $sort_params,
    "useBeanValidation": false,
    "useGzipFeature": false,
    "withXml": false
}
EOC

write_client_spec "$self_dir/.openapi.json"

docker container run --rm --user "${codegen_run_user:?}" -v $self_dir:/local "${openapi_generator_cli_image:?}" generate \
    --type-mappings Integer=java.math.BigInteger \
    -c /local/src/build.json \
    -i /local/.openapi.json \
    -g java \
    -o /local/src \
    $common_codegen_options
rm -f "$self_dir/.openapi.json"

# Dependabot updates release/pom.xml. Replace the generated pom with it.
awk -v version="$package_version" \
    '!done && sub(/<version>[^<]*<\/version>/, "<version>" version "</version>") { done = 1 } 1' \
    "$self_dir/release/pom.xml" > "$src_dir/pom.xml"
