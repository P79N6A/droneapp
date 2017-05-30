package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.hj.a;
import java.util.Map;

class n extends cr {
    private static final String a = eg.ENDS_WITH.toString();

    public n() {
        super(a);
    }

    protected boolean a(String str, String str2, Map<String, a> map) {
        return str.endsWith(str2);
    }
}
