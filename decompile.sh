#!/bin/bash -e
if ! [ "$1" ]; then
    echo "usage: $0 <file.apk>"
    exit -1
fi

fn=${1%.apk}
target_apk=$fn.apk
java -jar apktool_2.2.2.jar d -f "$target_apk" -o smali
echo "Done."
