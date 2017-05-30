package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.fh;
import com.google.android.gms.internal.hj.a;
import java.util.Map;

class ay extends t {
    private static final String a = eg.LOWERCASE_STRING.toString();
    private static final String b = fh.ARG0.toString();

    public ay() {
        super(a, b);
    }

    public a a(Map<String, a> map) {
        return cw.f(cw.a((a) map.get(b)).toLowerCase());
    }

    public boolean a() {
        return true;
    }
}
