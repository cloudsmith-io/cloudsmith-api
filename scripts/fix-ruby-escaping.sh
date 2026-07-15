#!/usr/bin/env bash

# swagger-codegen emits the `disable_reason` enum value
# `RSA key did not verify the upstream's APKINDEX signature` into single-quoted
# Ruby string literals in the *_upstream.rb model files. The raw apostrophe
# terminates the literal and produces a syntax error, so it must be re-escaped
# to `upstream\'s APKINDEX` after every regeneration. This is idempotent.

set -e

self=$(readlink -f "$BASH_SOURCE")
self_dir=$(dirname "$self")
root_dir=$(readlink -f "$self_dir/..")

ruby_models_dir="$root_dir/bindings/ruby/src/lib/cloudsmith-api/models"
raw_apostrophe="upstream's APKINDEX"

if [ ! -d "$ruby_models_dir" ]; then
    echo "Ruby models directory not found; nothing to fix: $ruby_models_dir"
    exit 0
fi

affected_files=$(grep -rl "$raw_apostrophe" "$ruby_models_dir" 2>/dev/null || true)

if [ -z "$affected_files" ]; then
    echo "No unescaped Ruby apostrophes found; nothing to fix"
    exit 0
fi

if ! command -v ruby &> /dev/null; then
    echo "ruby is required to fix Ruby apostrophe escaping but was not found" >&2
    exit 1
fi

echo "Re-escaping apostrophe in Ruby upstream models:"
while IFS= read -r rb_file; do
    [ -n "$rb_file" ] || continue
    echo "  $rb_file"
    ruby -i -pe 'gsub("upstream\x27s APKINDEX") { "upstream\\\x27s APKINDEX" }' "$rb_file"
    ruby -c "$rb_file" > /dev/null
done <<< "$affected_files"

echo "Ruby apostrophe escaping fixed (verified with ruby -c)"
