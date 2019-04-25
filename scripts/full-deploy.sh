#!/usr/bin/env bash
self=$(readlink -f $BASH_SOURCE)
self_dir=$(dirname $self)
root_dir=$(readlink -f "$self_dir/..")
language=$1
api_url=$2
. $root_dir/scripts/common.sh

full_deploy() {
  local language=$1
  $root_dir/scripts/build.sh || die "Could not build"
  $root_dir/scripts/test.sh || die "Could not test"
  $root_dir/scripts/push.sh || die "Could not push"
  $root_dir/scripts/deploy.sh || die "Could not deploy"
}

test -z "$language" && {
  for I in `ls -1 $root_dir/bindings`; do
    full_deploy $(basename $I)
  done
} || {
  full_deploy $language
}

