package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.fh;
import com.google.android.gms.internal.hj.a;
import java.util.Map;

class dk extends t {
    private static final String a = eg.CONSTANT.toString();
    private static final String b = fh.VALUE.toString();

    public dk() {
        super(a, b);
    }

    public static String d() {
        return a;
    }

    public static String e() {
        return b;
    }

    public a a(Map<String, a> map) {
        return (a) map.get(b);
    }

    public boolean a() {
        return true;
    }
}
