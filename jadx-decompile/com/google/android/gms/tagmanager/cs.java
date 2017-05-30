package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.hj.a;
import java.util.Map;

class cs extends t {
    private static final String a = eg.TIME.toString();

    public cs() {
        super(a, new String[0]);
    }

    public a a(Map<String, a> map) {
        return cw.f(Long.valueOf(System.currentTimeMillis()));
    }

    public boolean a() {
        return false;
    }
}
