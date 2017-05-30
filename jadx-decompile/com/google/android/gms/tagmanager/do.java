package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.hj.a;
import java.util.Map;

class do extends t {
    private static final String a = eg.CONTAINER_VERSION.toString();
    private final String b;

    public do(String str) {
        super(a, new String[0]);
        this.b = str;
    }

    public a a(Map<String, a> map) {
        return this.b == null ? cw.g() : cw.f(this.b);
    }

    public boolean a() {
        return true;
    }
}
