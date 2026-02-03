#!/usr/bin/env bash
set -e

self=$(readlink -f $BASH_SOURCE)
self_dir=$(dirname "$self")
root_dir=$(readlink -f "$self_dir/../..")
. $root_dir/scripts/common.sh $1

src_dir="$self_dir/src"

build_distribution() {
    echo "Building distribution ..."
    npm install
    npm run build
    npm pack
}

check_if_npm_pushed() {
    # Check if this version already exists on npm
    npm view "${project_dash}@${package_version}" version 2>/dev/null && return 0 || return 1
}

upload_to_npm() {
    echo "Uploading to npm ..."

    check_if_npm_pushed && {
        echo "Package version already exists on npm, not pushing"
        return 0
    }

    if [[ "$CI" == "true" ]] && [[ -n "$NPM_TOKEN" ]]; then
        # Configure npm for CI publishing
        echo "//registry.npmjs.org/:_authToken=${NPM_TOKEN}" > .npmrc
        npm publish --access public
    else
        echo "Skipping npm publish (not in CI or NPM_TOKEN not set)"
    fi
}

upload_to_cloudsmith() {
    echo "Uploading to Cloudsmith ..."

    local package_file="${project_dash}-${package_version}.tgz"

    if [[ ! -f "$package_file" ]]; then
        echo "Package file not found: $package_file"
        ls -la *.tgz 2>/dev/null || echo "No .tgz files found"
        return 1
    fi

    export PATH="$HOME/.local/bin:$PATH"
    cloudsmith push npm \
        ${cloudsmith_repo_api} \
        "$package_file" \
        --skip-errors \
        --no-wait-for-sync
}

set -e
cd "$src_dir"
build_distribution
upload_to_npm
upload_to_cloudsmith
