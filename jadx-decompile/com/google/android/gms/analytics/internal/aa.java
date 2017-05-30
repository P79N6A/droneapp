package com.google.android.gms.analytics.internal;

import com.google.android.gms.internal.ado;

public class aa extends t {
    private final ado a = new ado();

    aa(v vVar) {
        super(vVar);
    }

    protected void a() {
        r().a().a(this.a);
        b();
    }

    public void b() {
        q v = v();
        String c = v.c();
        if (c != null) {
            this.a.a(c);
        }
        String b = v.b();
        if (b != null) {
            this.a.b(b);
        }
    }

    public ado c() {
        D();
        return this.a;
    }
}
