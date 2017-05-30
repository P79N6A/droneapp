package com.fimi.kernel;

import android.app.Activity;
import android.content.Context;
import com.fimi.kernel.b.d;
import com.fimi.kernel.c.a;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.view.b;

public final class c {
    private static Context a = null;
    private static Activity b = null;
    private static String c = null;

    private c() {
    }

    public static Context a() {
        return a;
    }

    public static <T> T a(d dVar) {
        return com.fimi.kernel.b.c.a(dVar);
    }

    public static void a(Activity activity) {
        b = null;
        b = activity;
        c = b.getClass().getName();
    }

    public static void a(Context context) {
        a = context;
    }

    public static b b() {
        return com.fimi.kernel.view.c.a();
    }

    public static void b(Activity activity) {
        if (activity.getClass().getName().equals(c)) {
            b = null;
            c = null;
        }
    }

    public static a c() {
        return com.fimi.kernel.c.c.a();
    }

    public static Activity d() {
        return b;
    }

    public static v e() {
        return v.a(a());
    }
}
