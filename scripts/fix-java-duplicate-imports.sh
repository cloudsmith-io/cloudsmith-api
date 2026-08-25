#!/usr/bin/env bash

# swagger-codegen emits repeated import statements into the generated Java
# sources (e.g. `java.lang.reflect.Type` in every *Api.java, and one
# `io.cloudsmith.api.models.*` per model in JSON.java). The duplicates are
# harmless to javac but are flagged by linters and reviewers, so they are
# collapsed to a single occurrence after every regeneration. This is idempotent.

set -e

self=$(readlink -f "$BASH_SOURCE")
self_dir=$(dirname "$self")
root_dir=$(readlink -f "$self_dir/..")

java_src_dir="$root_dir/bindings/java/src/src"

if [ ! -d "$java_src_dir" ]; then
    echo "Java sources directory not found; nothing to fix: $java_src_dir"
    exit 0
fi

is_duplicated='/^import [^ ]+;[[:space:]]*$/ && seen[$0]++ { found = 1 } END { exit !found }'
deduplicate='/^import [^ ]+;[[:space:]]*$/ && seen[$0]++ { next } { print }'

fixed=0
while IFS= read -r -d '' java_file; do
    awk "$is_duplicated" "$java_file" || continue

    # Keep only the first occurrence of each identical import line.
    awk "$deduplicate" "$java_file" > "$java_file.tmp"
    mv "$java_file.tmp" "$java_file"
    echo "  $java_file"
    fixed=$((fixed + 1))
done < <(find "$java_src_dir" -name '*.java' -type f -print0)

if [ "$fixed" -eq 0 ]; then
    echo "No duplicate Java imports found; nothing to fix"
else
    echo "Removed duplicate imports from $fixed Java file(s)"
fi
