#!/usr/bin/env bash
self=$(readlink -f $BASH_SOURCE)
self_dir=$(dirname $self)
root_dir=$(readlink -f "$self_dir/../..")
. $root_dir/scripts/common.sh $1

src_dir="$self_dir/src"

build_distribution() {
  echo "Building distribution ..."
  mvn release:clean package
}

upload_to_maven_central() {
  echo "Uploading to Maven Central (skipped) ..."
}

upload_to_cloudsmith() {
  echo "Uploading to Cloudsmith ..."
  base_name="target/${project_dash}-${api_version}"
  export PATH="$HOME/.local/bin:$PATH"
  cloudsmith push maven \
    ${cloudsmith_repo_api} \
    $base_name.jar \
    --pom-file=pom.xml \
    --javadoc-file=${base_name}-javadoc.jar \
    --sources-file=${base_name}-sources.jar \
    --skip-errors
}

set -e
cd $src_dir
build_distribution
upload_to_maven_central
upload_to_cloudsmith
