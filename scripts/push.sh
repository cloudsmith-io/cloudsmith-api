#!/usr/bin/env bash
self=$(readlink -f $BASH_SOURCE)
self_dir=$(dirname $self)
root_dir=$(readlink -f "$self_dir/..")
travis_dir=${root_dir}/.travis
. $root_dir/scripts/common.sh

setup_git_user() {
  test "$TRAVIS" == "true" && {
    git config --global user.email "api-bot@cloudsmith.io"
    git config --global user.name "API Bot"
  }
}

push_language() {
  local language=$1

  echo "Pushing $language bindings ..."
  git add $root_dir/bindings/$language/src
  local message="Update bindings: $api_version / lang: $language"

  test "$TRAVIS" == "true" && {
    test "$TRAVIS_PULL_REQUEST" != "false" && {
      echo "Skipping push for pull request ..."
      # Don't push on pull requests
      exit 0
    }

    # Decrypt and store the deploy key
    eval "$(ssh-agent -s)"
    openssl aes-256-cbc -d \
      -K $encrypted_eb1d88bc3502_key \
      -iv $encrypted_eb1d88bc3502_iv \
      -in ${travis_dir}/deploy.enc \
      -out ${travis_dir}/deploy
    chmod 600 ${travis_dir}/deploy
    ssh-add ${travis_dir}/deploy

    # Setup git and push back
    git remote add deploy git@github.com:cloudsmith-io/cloudsmith-api.git
    git config lfs.https://lfs.github.com/cloudsmith-io/cloudsmith-api.git/info/lfs.locksverify false
    git config lfs.https://github.com/cloudsmith-io/cloudsmith-api.git/info/lfs.locksverify false
    git commit -m "$message / build: #${TRAVIS_BUILD_NUMBER:-0} [ci skip]"
    rm -rf ${root_dir}/.git/hooks/pre-push
    git fetch
    git pull --rebase -Xtheirs || return $?
    git push deploy HEAD:$TRAVIS_BRANCH || return 0
  } || {
    git commit -m "$message [ci skip]"
    git push || return 0
  }
}

setup_git_user

test -z "$language" && {
  for I in $root_dir/bindings/*; do
    push_language $(basename $I)
  done
} || {
  push_language $language
}
