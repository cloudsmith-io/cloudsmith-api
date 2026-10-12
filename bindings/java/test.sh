#!/usr/bin/env bash
set -e

self=$(readlink -f $BASH_SOURCE)
self_dir=$(dirname $self)
root_dir=$(readlink -f "$self_dir/../..")
. $root_dir/scripts/common.sh $1

src_dir="$self_dir/src"

cd $src_dir
mvn test

mvn -q dependency:build-classpath -Dmdep.outputFile=target/classpath.txt
classpath="target/classes:$(cat target/classpath.txt)"
mkdir -p target/compat-tests
javac -cp "$classpath" -d target/compat-tests "$self_dir"/tests/*.java
for test_file in "$self_dir"/tests/*.java; do
  java -cp "target/compat-tests:$classpath" "$(basename "$test_file" .java)"
done
