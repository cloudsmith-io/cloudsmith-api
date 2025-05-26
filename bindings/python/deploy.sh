#!/usr/bin/env bash
set -e

self=$(readlink -f $BASH_SOURCE)
self_dir="$(dirname $self)"
root_dir=$(readlink -f "$self_dir/../..")
. $root_dir/scripts/common.sh $1

src_dir="$self_dir/src"

install_dependencies() {
  pip install --upgrade --user twine
  export PATH="$HOME/.local/bin:$PATH"
}

build_distribution() {
  echo "Building distribution ..."
  python setup.py sdist bdist_wheel --universal
}

upload_to_pypi() {
  echo "Uploading to PyPi ..."

  distribution_filepath="dist/${project_underscore}-${package_version}-py2.py3-none-any.whl"
  sdist_filepath="dist/${project_underscore}-${package_version}.tar.gz"

  if [[ "$CI" == "true" ]]
  then
    twine upload -u __token__ -p "$PYPI_PASSWORD" --skip-existing --non-interactive "$distribution_filepath" "$sdist_filepath"
  else
    twine upload --skip-existing --non-interactive "$distribution_filepath" "$sdist_filepath"
  fi
}

upload_to_cloudsmith() {
  echo "Uploading to Cloudsmith ..."

  distribution_filepath="dist/${project_underscore}-${package_version}-py2.py3-none-any.whl"

  # no-wait-for-sync necessary to prevent upload from failing due to sync failure
  cloudsmith push python ${cloudsmith_repo_api} "${distribution_filepath}" --skip-errors --no-wait-for-sync
}

set -e
cd "$src_dir"
install_dependencies
build_distribution
upload_to_pypi
upload_to_cloudsmith
