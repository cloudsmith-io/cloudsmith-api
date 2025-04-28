#!/usr/bin/env bash
set -e

self=$(readlink -f $BASH_SOURCE)
self_dir=$(dirname $self)
root_dir=$(readlink -f "$self_dir/../..")
. $root_dir/scripts/common.sh $1

src_dir="$self_dir/src"

build_distribution() {
  echo "Building distribution ..."
  cargo package 
}

upload_to_crates_io() {
  echo "Uploading to crates.io (skipped) ..."
}

upload_to_cloudsmith() {
  echo "Uploading to Cloudsmith (skipped)..."
}

set -e
cd $src_dir
build_distribution
upload_to_crates_io
upload_to_cloudsmith
