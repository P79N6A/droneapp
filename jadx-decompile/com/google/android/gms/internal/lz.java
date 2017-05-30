package com.google.android.gms.internal;

public class lz {
    private static final boolean a = b();

    public static boolean a() {
        return a;
    }

    private static boolean b() {
        try {
            Class.forName("android.app.Activity");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }
}
