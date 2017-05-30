package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.fh;
import com.google.android.gms.internal.hj.a;
import java.util.Map;

class dt extends t {
    private static final String a = eg.CUSTOM_VAR.toString();
    private static final String b = fh.NAME.toString();
    private static final String c = fh.DEFAULT_VALUE.toString();
    private final e d;

    public dt(e eVar) {
        super(a, b);
        this.d = eVar;
    }

    public a a(Map<String, a> map) {
        Object c = this.d.c(cw.a((a) map.get(b)));
        if (c != null) {
            return cw.f(c);
        }
        a aVar = (a) map.get(c);
        return aVar != null ? aVar : cw.g();
    }

    public boolean a() {
        return false;
    }
}
