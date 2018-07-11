#!/usr/bin/env bash

mkdir -p classes
# Find all java files in src directory
java_files=$(find src -name "*.java")
javac -cp src/main/resources/:lib/*:. -d classes $java_files
