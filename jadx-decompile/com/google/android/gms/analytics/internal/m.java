package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.e;

class m {
    private final e a;
    private long b;

    public m(e eVar) {
        d.a((Object) eVar);
        this.a = eVar;
    }

    public m(e eVar, long j) {
        d.a((Object) eVar);
        this.a = eVar;
        this.b = j;
    }

    public void a() {
        this.b = this.a.b();
    }

    public boolean a(long j) {
        return this.b == 0 || this.a.b() - this.b > j;
    }

    public void b() {
        this.b = 0;
    }
}
