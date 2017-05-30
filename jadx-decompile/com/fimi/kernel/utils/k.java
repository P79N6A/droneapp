package com.fimi.kernel.utils;

import android.content.Context;
import android.util.Log;
import com.tencent.mm.sdk.platformtools.LocaleUtil;
import java.util.Calendar;

public class k {
    public static boolean a = false;
    public static boolean b = false;
    public static boolean c = false;
    public static long d = 0;

    public static void a() {
        a = true;
        b = true;
        c = true;
    }

    public static void a(Context context) {
        a(context.getClass().getSimpleName());
    }

    public static void a(Context context, String str) {
        a(context.getClass().getSimpleName(), str);
    }

    public static void a(Context context, String str, boolean z) {
        a(context.getClass().getSimpleName(), str, z);
    }

    public static void a(Class<?> cls) {
        a(cls.getSimpleName());
    }

    public static void a(Class<?> cls, String str) {
        a(cls.getSimpleName(), str);
    }

    public static void a(Class<?> cls, String str, boolean z) {
        a(cls.getSimpleName(), str, z);
    }

    public static void a(String str) {
        d = Calendar.getInstance().getTimeInMillis();
        Log.d(str, "日志计时开始：" + d);
    }

    public static void a(String str, String str2) {
        if (a) {
            Log.d(str, str2);
        }
    }

    public static void a(String str, String str2, boolean z) {
        Log.d(str, str2 + ":" + (Calendar.getInstance().getTimeInMillis() - d) + LocaleUtil.MALAY);
    }

    public static void a(boolean z) {
        a = z;
    }

    public static void a(boolean z, boolean z2, boolean z3) {
        a = z;
        b = z2;
        c = z3;
    }

    public static void b() {
        a = false;
        b = false;
        c = false;
    }

    public static void b(Context context, String str) {
        b(context.getClass().getSimpleName(), str);
    }

    public static void b(Class<?> cls, String str) {
        b(cls.getSimpleName(), str);
    }

    public static void b(String str, String str2) {
        Log.i(str, str2);
    }

    public static void b(boolean z) {
        b = z;
    }

    public static void c(Context context, String str) {
        c(context.getClass().getSimpleName(), str);
    }

    public static void c(Class<?> cls, String str) {
        c(cls.getSimpleName(), str);
    }

    public static void c(String str, String str2) {
        Log.e(str, str2);
    }

    public static void c(boolean z) {
        c = z;
    }
}
