#!/usr/bin/env bash
set -e

self=$(readlink -f $BASH_SOURCE)
self_dir=$(dirname $self)
root_dir=$(readlink -f "$self_dir/../..")
. $root_dir/scripts/common.sh $1

src_dir="$self_dir/src"

cd $src_dir
rm -f *.gem
gem install bundler --user-install
bundle config set clean true
bundle config set path 'vendor/bundle'
bundle install
bundle exec rake spec
