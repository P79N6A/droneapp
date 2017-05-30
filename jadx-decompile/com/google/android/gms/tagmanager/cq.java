package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.hj.a;
import java.util.Map;

class cq extends cr {
    private static final String a = eg.STARTS_WITH.toString();

    public cq() {
        super(a);
    }

    protected boolean a(String str, String str2, Map<String, a> map) {
        return str.startsWith(str2);
    }
}
