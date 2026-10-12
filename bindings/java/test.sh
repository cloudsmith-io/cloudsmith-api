#!/usr/bin/env bash
set -e

self=$(readlink -f $BASH_SOURCE)
self_dir=$(dirname $self)
root_dir=$(readlink -f "$self_dir/../..")
. $root_dir/scripts/common.sh $1

src_dir="$self_dir/src"

cd $src_dir

# Build with release/pom.xml, because the next generation ships it. Run the
# package phase too, which builds the jars that deploy.sh uploads.
release_pom=".release-pom.xml"
write_release_pom "$src_dir/$release_pom"
trap 'rm -f "$src_dir/$release_pom"' EXIT
mvn -f "$release_pom" test
mvn -f "$release_pom" -DskipTests package
