package com.google.android.gms.analytics.internal;

public enum ae {
    NONE,
    GZIP;

    public static ae a(String str) {
        return "GZIP".equalsIgnoreCase(str) ? GZIP : NONE;
    }
}
