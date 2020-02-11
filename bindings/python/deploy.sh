#!/usr/bin/env bash
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
  python setup.py bdist_wheel --universal
}

upload_to_pypi() {
  echo "Uploading to PyPi ..."

  twine_args=" --skip-existing --non-interactive dist/${project_underscore}-${api_version}-py2.py3-none-any.whl"

  if [[ "$CI" == "true" ]]
  then 
    {
      twine upload \
        -u csm-api-bot \
        -p "$PYPI_PASSWORD" \
        "$twine_args"
    } || {
      twine upload "$twine_args"
    }
  fi
}

upload_to_cloudsmith() {
  echo "Uploading to Cloudsmith ..."

  cloudsmith_args="dist/${project_underscore}-${api_version}-py2.py3-none-any.whl --skip-errors"

  cloudsmith push python \
    ${cloudsmith_repo_api} \
    "${cloudsmith_args}"

  cloudsmith push python \
    ${cloudsmith_repo_cli} \
    "${cloudsmith_args}"
}

set -e
cd "$src_dir"
install_dependencies
build_distribution
upload_to_pypi
upload_to_cloudsmith
