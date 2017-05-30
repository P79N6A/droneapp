package com.google.android.gms.internal;

import android.util.Log;
import com.google.ads.a;
import com.google.android.gms.ads.internal.util.client.b;

@aaa
public final class abr extends b {
    public static boolean a() {
        return ((Boolean) uf.aG.c()).booleanValue();
    }

    private static boolean b() {
        return b.a(2) && a();
    }

    public static void e(String str) {
        if (b()) {
            Log.v(a.b, str);
        }
    }
}
