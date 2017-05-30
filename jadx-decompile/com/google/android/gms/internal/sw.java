package com.google.android.gms.internal;

import android.util.Log;

public class sw {
    private static boolean a = false;

    public static String a(String str, String str2) {
        if (!a(2)) {
            return "";
        }
        String a = a(str, str2, new Object[0]);
        Log.v("ctxmgr", a);
        return a;
    }

    public static String a(String str, String str2, Object obj) {
        if (!a(6)) {
            return "";
        }
        String a = a(str, str2, obj);
        Log.e("ctxmgr", a);
        return a;
    }

    public static String a(String str, String str2, Throwable th) {
        if (!a(6)) {
            return "";
        }
        String a = a(str, str2, new Object[0]);
        Log.e("ctxmgr", a, th);
        return a;
    }

    private static String a(String str, String str2, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return String.format("[%s]%s", new Object[]{str, str2});
        }
        String valueOf = String.valueOf(String.format("[%s]", new Object[]{str}));
        String valueOf2 = String.valueOf(String.format(str2, objArr));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private static boolean a(int i) {
        return Log.isLoggable("ctxmgr", i);
    }

    public static String b(String str, String str2) {
        if (!a(6)) {
            return "";
        }
        String a = a(str, str2, new Object[0]);
        Log.e("ctxmgr", a);
        return a;
    }
}
