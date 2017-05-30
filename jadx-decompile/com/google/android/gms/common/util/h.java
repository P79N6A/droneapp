package com.google.android.gms.common.util;

import android.os.SystemClock;

public final class h implements e {
    private static h a;

    public static synchronized e d() {
        e eVar;
        synchronized (h.class) {
            if (a == null) {
                a = new h();
            }
            eVar = a;
        }
        return eVar;
    }

    public long a() {
        return System.currentTimeMillis();
    }

    public long b() {
        return SystemClock.elapsedRealtime();
    }

    public long c() {
        return System.nanoTime();
    }
}
