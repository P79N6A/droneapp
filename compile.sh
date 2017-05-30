#!/bin/bash -e
if ! [ "$1" ]; then
    echo "usage: $0 <original.apk>"
    exit -1
fi

fn=${1%.apk}

rm -f $fn.unaligned.apk $fn.smali.apk
rm -rf smali/build

java -jar apktool_2.2.2.jar b -f smali/ -o $fn.unaligned.apk


#keytool -genkey -v -keystore ~/.android/debug.keystore -alias androiddebugkey -keyalg RSA -keysize 2048 -validity 10000

jarsigner -verbose -sigalg MD5withRSA -digestalg SHA1 -keystore ~/.android/debug.keystore  -storepass android  $fn.unaligned.apk  androiddebugkey
./zipalign -v 4 $fn.unaligned.apk $fn.smali.apk
rm -rf smali/build
