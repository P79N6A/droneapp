package com.google.android.gms.ads.internal.util.client;

import android.util.Log;
import com.google.ads.a;
import com.google.android.gms.internal.aaa;

@aaa
public class b {
    public static void a(String str) {
        if (a(3)) {
            Log.d(a.b, str);
        }
    }

    public static void a(String str, Throwable th) {
        if (a(3)) {
            Log.d(a.b, str, th);
        }
    }

    public static boolean a(int i) {
        return i >= 5 || Log.isLoggable(a.b, i);
    }

    public static void b(String str) {
        if (a(6)) {
            Log.e(a.b, str);
        }
    }

    public static void b(String str, Throwable th) {
        if (a(6)) {
            Log.e(a.b, str, th);
        }
    }

    public static void c(String str) {
        if (a(4)) {
            Log.i(a.b, str);
        }
    }

    public static void c(String str, Throwable th) {
        if (a(4)) {
            Log.i(a.b, str, th);
        }
    }

    public static void d(String str) {
        if (a(5)) {
            Log.w(a.b, str);
        }
    }

    public static void d(String str, Throwable th) {
        if (a(5)) {
            Log.w(a.b, str, th);
        }
    }
}
