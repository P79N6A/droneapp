package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.analytics.e;

@Deprecated
public class f {
    private static volatile e a;

    static {
        a(new ai());
    }

    public static e a() {
        return a;
    }

    public static void a(e eVar) {
        a = eVar;
    }

    public static void a(String str) {
        g b = g.b();
        if (b != null) {
            b.s(str);
        } else if (a(1)) {
            Log.i((String) ao.c.a(), str);
        }
        e eVar = a;
        if (eVar != null) {
            eVar.b(str);
        }
    }

    public static void a(String str, Object obj) {
        g b = g.b();
        if (b != null) {
            b.e(str, obj);
        } else if (a(3)) {
            String stringBuilder;
            if (obj != null) {
                String valueOf = String.valueOf(obj);
                stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(valueOf).length()).append(str).append(":").append(valueOf).toString();
            } else {
                stringBuilder = str;
            }
            Log.e((String) ao.c.a(), stringBuilder);
        }
        e eVar = a;
        if (eVar != null) {
            eVar.d(str);
        }
    }

    public static boolean a(int i) {
        return a() != null && a().a() <= i;
    }

    public static void b(String str) {
        g b = g.b();
        if (b != null) {
            b.q(str);
        } else if (a(0)) {
            Log.v((String) ao.c.a(), str);
        }
        e eVar = a;
        if (eVar != null) {
            eVar.a(str);
        }
    }

    public static void c(String str) {
        g b = g.b();
        if (b != null) {
            b.t(str);
        } else if (a(2)) {
            Log.w((String) ao.c.a(), str);
        }
        e eVar = a;
        if (eVar != null) {
            eVar.c(str);
        }
    }
}
