#!/usr/bin/env bash
set -e

self=$(readlink -f $BASH_SOURCE)
self_dir=$(dirname $self)
root_dir=$(readlink -f "$self_dir/..")
. $root_dir/scripts/common.sh

# Ensure a Docker-compatible daemon is reachable. We use OrbStack, which ships a
# drop-in `docker` CLI; start it on demand if the daemon isn't up yet.
ensure_docker_daemon() {
  docker info >/dev/null 2>&1 && return 0

  echo "Docker daemon not reachable. Attempting to start OrbStack ..."
  if command -v orb >/dev/null 2>&1; then
    orb start || true
  elif [[ "$(uname)" == "Darwin" ]]; then
    open -a OrbStack 2>/dev/null || true
  fi

  for _ in $(seq 1 30); do
    docker info >/dev/null 2>&1 && return 0
    sleep 1
  done

  die "Docker daemon not available via OrbStack. Install/start OrbStack: https://orbstack.dev"
}

ensure_docker_daemon

docker image pull -q "${swagger_codegen_cli_image:?}"

build_language() {
  local language=$1
  echo "Building $language bindings ..."
  $root_dir/bindings/$language/build.sh
}

test -z "$language" && {
  for I in $root_dir/bindings/*; do
    build_language $(basename $I)
  done
} || {
  build_language $language
}

echo "Applying ruff autofixes to generated sources ..."
uvx ruff check --fix "$root_dir"
