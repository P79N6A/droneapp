package com.google.android.gms.common.internal;

import android.util.Log;

public final class ab {
    public static final int a = (23 - " PII_LOG".length());
    private static final String b = null;
    private final String c;
    private final String d;

    public ab(String str) {
        this(str, null);
    }

    public ab(String str, String str2) {
        d.a((Object) str, (Object) "log tag cannot be null");
        d.b(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, Integer.valueOf(23));
        this.c = str;
        if (str2 == null || str2.length() <= 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
    }

    private String a(String str) {
        return this.d == null ? str : this.d.concat(str);
    }

    public void a(String str, String str2) {
        if (a(3)) {
            Log.d(str, a(str2));
        }
    }

    public void a(String str, String str2, Throwable th) {
        if (a(4)) {
            Log.i(str, a(str2), th);
        }
    }

    public boolean a(int i) {
        return Log.isLoggable(this.c, i);
    }

    public void b(String str, String str2) {
        if (a(5)) {
            Log.w(str, a(str2));
        }
    }

    public void b(String str, String str2, Throwable th) {
        if (a(5)) {
            Log.w(str, a(str2), th);
        }
    }

    public void c(String str, String str2) {
        if (a(6)) {
            Log.e(str, a(str2));
        }
    }

    public void c(String str, String str2, Throwable th) {
        if (a(6)) {
            Log.e(str, a(str2), th);
        }
    }

    public void d(String str, String str2, Throwable th) {
        if (a(7)) {
            Log.e(str, a(str2), th);
            Log.wtf(str, a(str2), th);
        }
    }
}
