#!/usr/bin/env bash

# Fail when a Java file contains the same import statement more than once.

set -e

awk '
    FNR == 1 { delete seen }
    /^import [^ ]+;[[:space:]]*$/ && seen[$0]++ {
        print FILENAME ":" FNR ": duplicate " $0
        found = 1
    }
    END { exit found }
' "$@"
