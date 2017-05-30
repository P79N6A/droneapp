package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.hj.a;
import java.util.Map;

class at extends bm {
    private static final String a = eg.LESS_THAN.toString();

    public at() {
        super(a);
    }

    protected boolean a(cv cvVar, cv cvVar2, Map<String, a> map) {
        return cvVar.a(cvVar2) < 0;
    }
}
