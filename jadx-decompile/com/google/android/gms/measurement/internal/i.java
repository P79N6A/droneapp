package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.e;

class i {
    private final e a;
    private long b;

    public i(e eVar) {
        d.a(eVar);
        this.a = eVar;
    }

    public void a() {
        this.b = this.a.b();
    }

    public boolean a(long j) {
        return this.b == 0 || this.a.b() - this.b >= j;
    }

    public void b() {
        this.b = 0;
    }
}
