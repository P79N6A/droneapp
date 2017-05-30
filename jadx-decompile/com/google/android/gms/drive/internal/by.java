package com.google.android.gms.drive.internal;

import android.content.Context;
import com.google.android.gms.common.internal.ab;

public final class by {
    private static final ab a = new ab("GmsDrive");

    public static void a(Context context, String str, String str2) {
        a(context, str, str2, new Throwable());
    }

    public static void a(Context context, String str, String str2, Throwable th) {
        a.d(str, str2, th);
    }

    public static void a(String str, String str2) {
        a.a(str, str2);
    }

    public static void a(String str, Throwable th, String str2) {
        a.c(str, str2, th);
    }

    public static void b(String str, String str2) {
        a.b(str, str2);
    }

    public static void c(String str, String str2) {
        a.c(str, str2);
    }
}
