#!/usr/bin/env bash
self=$(readlink -f $BASH_SOURCE)
self_dir=$(dirname "$self")
root_dir=$(readlink -f "$self_dir/../..")
. $root_dir/scripts/common.sh $1

src_dir="$self_dir/src"

build_distribution() {
  echo "Building distribution ..."
  rm -f ./*.gem
  gem update bundler
  bundle install --path vendor/bundle --clean
  gem build ${project_dash}.gemspec
}

check_if_rubygems_pushed() {
  # list all versions for the gem and search for the version we want to upload
  gem search --remote --all cloudsmith-api | grep ${api_version}
}

upload_to_rubygems() {
  echo "Uploading to Rubygems ..."

  check_if_rubygems_pushed && {
    echo "Gem version already exists, not pushing to Rubygems"
    return 0
  }

  local gem_args="${project_dash}-${api_version}.gem"

  if [[ "$CI" == "true" ]]
  then
    {
      mkdir -p "$HOME/.gem"
      cat > "$HOME/.gem/credentials" <<-EOH
---
:rubygems_api_key: $RUBYGEMS_API_KEY
EOH
      chmod 0600 "$HOME/.gem/credentials"

      gem push \
        "$gem_args" \
        -k rubygems
    } || {
      gem push \
        "$gem_args"
    }
  fi
}

upload_to_cloudsmith() {
  echo "Uploading to Cloudsmith ..."
  export PATH="$HOME/.local/bin:$PATH"
  cloudsmith push ruby \
    ${cloudsmith_repo_api} \
    "${project_dash}-${api_version}.gem" \
    --skip-errors
}

set -e
cd "$src_dir"
build_distribution
upload_to_rubygems
upload_to_cloudsmith
