package com.fimi.soul.base;

public class LoadKey {
    static {
        System.loadLibrary("key-service-jni");
    }

    public static native String getKeyToken();
}
