#!/usr/bin/env bash
set -e

self=$(readlink -f $BASH_SOURCE)
self_dir=$(dirname $self)
root_dir=$(readlink -f "$self_dir/..")
. $root_dir/scripts/common.sh

test_language() {
  local language=$1
  echo "Testing $language bindings ..."
  $root_dir/bindings/$language/test.sh
}

test -z "$language" && {
  for I in $root_dir/bindings/*; do
    test_language $(basename $I)
  done
} || {
  test_language $language
}
