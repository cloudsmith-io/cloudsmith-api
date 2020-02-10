#!/usr/bin/env bash
self=$(readlink -f $BASH_SOURCE)
self_dir=$(dirname $self)
root_dir=$(readlink -f "$self_dir/../..")
. $root_dir/scripts/common.sh $1

src_dir="$self_dir/src"

build_distribution() {
  echo "Building distribution ..."
  rm -f *.gem
  gem update bundler
  bundle install --path vendor/bundle --clean
  gem build ${project_dash}.gemspec
}

check_rubygems_not_pushed() {
  local curdir=$(pwd)
  local tmpdir=$(mktemp -d)
  cd $tmpdir

  gem fetch cloudsmith-api -v ${api_version} | grep ERROR &>/dev/null
  local does_not_exist=$?
  rm -rf *.gem
  cd $curdir

  return $does_not_exist
}

upload_to_rubygems() {
  echo "Uploading to Rubygems ..."

  check_rubygems_not_pushed || {
    return 0
  }

  local gem_args="\
    ${project_dash}-${api_version}.gem"

  test "$TRAVIS" == "true" && {
    mkdir -p $HOME/.gem
    cat > $HOME/.gem/credentials <<-EOH
---
:rubygems_api_key: $RUBYGEMS_API_KEY
EOH
    gem push \
      $gem_args \
      -k rubygems
  } || {
    gem push \
      $gem_args
  }
}

upload_to_cloudsmith() {
  echo "Uploading to Cloudsmith ..."
  cloudsmith push ruby \
    ${cloudsmith_repo_api} \
    ${project_dash}-${api_version}.gem \
    --skip-errors
}

set -e
cd $src_dir
build_distribution
upload_to_rubygems
upload_to_cloudsmith
