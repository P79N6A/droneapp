package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.fh;
import com.google.android.gms.internal.hj.a;
import java.util.Map;

class cy extends t {
    private static final String a = eg.UPPERCASE_STRING.toString();
    private static final String b = fh.ARG0.toString();

    public cy() {
        super(a, b);
    }

    public a a(Map<String, a> map) {
        return cw.f(cw.a((a) map.get(b)).toUpperCase());
    }

    public boolean a() {
        return true;
    }
}
