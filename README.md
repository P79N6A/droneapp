# droneapp

This project aims to do some reverse engineering on the app.

- .smali files -> can be modified and compiled
- .java files -> up to now only for reference.

- compile.sh -> compile, sign, zipalign the smali files
- decompile.sh -> generate smali files for .apk

smali/
|_ Generated with apktool (decompile.sh)

classes-dex-java-reference-only/
|_ Generated with dex2jar + jd-gui

For signing the apk you must to generate a sign key, just check compile.sh that theres a commented line with the command keytool.

The zipalign binary included here is built for OS X, so maybe you'll gonna need to lookup for zipalign if you don't have yet. please check -compile.sh-
