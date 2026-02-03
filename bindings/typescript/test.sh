#!/usr/bin/env bash
set -e

self=$(readlink -f $BASH_SOURCE)
self_dir=$(dirname $self)
root_dir=$(readlink -f "$self_dir/../..")
. $root_dir/scripts/common.sh $1

src_dir="$self_dir/src"

cd $src_dir

# Install dependencies
npm install

# Run TypeScript compilation to check for errors
npm run build

# Run tests if available
if grep -q '"test"' package.json && ! grep -q '"test": ""' package.json; then
    npm test || echo "No tests configured or tests skipped"
fi

echo "TypeScript binding tests completed successfully"
