#!/usr/bin/env bash
self=$(readlink -f $BASH_SOURCE)
self_dir=$(dirname $self)
root_dir=$(readlink -f "$self_dir/..")
. $root_dir/scripts/common.sh

deploy_language() {
  local language=$1
  echo "Deploying $language bindings ..."
  $root_dir/bindings/$language/deploy.sh
}

test -z "$language" && {
  for I in $root_dir/bindings/*; do
    deploy_language $(basename $I)
  done
} || {
  deploy_language $language
}
