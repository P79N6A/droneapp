package com.google.android.gms.internal;

import java.util.concurrent.ScheduledExecutorService;

public class hn {
    private final ScheduledExecutorService a;
    private final hm b;
    private final kt c;
    private final boolean d;
    private final String e;
    private final String f;

    public hn(kt ktVar, hm hmVar, ScheduledExecutorService scheduledExecutorService, boolean z, String str, String str2) {
        this.c = ktVar;
        this.b = hmVar;
        this.a = scheduledExecutorService;
        this.d = z;
        this.e = str;
        this.f = str2;
    }

    public kt a() {
        return this.c;
    }

    public hm b() {
        return this.b;
    }

    public ScheduledExecutorService c() {
        return this.a;
    }

    public boolean d() {
        return this.d;
    }

    public String e() {
        return this.e;
    }

    public String f() {
        return this.f;
    }
}
