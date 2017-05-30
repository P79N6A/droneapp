# droneapp

This project aims to do some reverse engineering on the app.

- .smali files -> can be modified and compiled
- .java files -> up to now only for reference.

- compile.sh -> compile, sign, zipalign the smali files
- decompile.sh -> generate smali files for .apk

smali/

|_ Generated with apktool (decompile.sh)

shitty-jd-gui-code/

|_ Generated with dex2jar + jd-gui

jadx-decompile/

|_ Generated with JADX

For signing the apk you must to generate a sign key, just check compile.sh that theres a commented line with the command keytool.

The zipalign binary included here is built for OS X, so maybe you'll gonna need to lookup for zipalign if you don't have yet. please check -compile.sh-

I had included a .smali.apk file that had been compiled from smali files. 

The version i am working is 0.0.4.11. The newer versions are packed with a chinese packer (ijiami.ajm file protects newer versions for being decompiled and modified)
