#!/usr/bin/env bash
self=$(readlink -f $BASH_SOURCE)
self_dir=$(dirname $self)
root_dir=$(readlink -f "$self_dir/../..")
. $root_dir/scripts/common.sh $1

src_dir="$self_dir/src"

build_distribution() {
  echo "Building distribution ..."
  rm -f *.gem
  bundle install --path vendor/bundle --clean
  bundle exec gem build ${project_dash}.gemspec
}

upload_to_rubygems() {
  echo "Uploading to Rubygems (skipped) ..."
  gem_args="\
    ${project_dash}-${api_version}.gem"

  test "$TRAVIS" == "true" && {
    mkdir -p $HOME/.gem
    cat > $HOME/.gem/credentials <<-EOH
---
:rubygems_api_key: $RUBYGEMS_API_KEY
EOH
    bundle exec gem push \
      $gem_args \
      -k rubygems
  } || {
    bundle exec gem push \
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
exit 0
upload_to_rubygems
upload_to_cloudsmith
