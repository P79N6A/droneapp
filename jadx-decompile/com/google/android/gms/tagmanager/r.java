package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.hj.a;
import java.util.Map;

class r extends t {
    private static final String a = eg.EVENT.toString();
    private final cg b;

    public r(cg cgVar) {
        super(a, new String[0]);
        this.b = cgVar;
    }

    public a a(Map<String, a> map) {
        Object a = this.b.a();
        return a == null ? cw.g() : cw.f(a);
    }

    public boolean a() {
        return false;
    }
}
