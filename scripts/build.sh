#!/usr/bin/env bash
set -e

self=$(readlink -f $BASH_SOURCE)
self_dir=$(dirname $self)
root_dir=$(readlink -f "$self_dir/..")
. $root_dir/scripts/common.sh

build_language() {
  local language=$1
  echo "Building $language bindings ..."
  $root_dir/bindings/$language/build.sh
}

test -z "$language" && {
  for I in $root_dir/bindings/*; do
    build_language $(basename $I)
  done
} || {
  build_language $language
}
