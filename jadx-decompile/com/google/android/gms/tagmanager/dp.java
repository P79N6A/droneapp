package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.hj.a;
import java.util.Map;

class dp extends cr {
    private static final String a = eg.CONTAINS.toString();

    public dp() {
        super(a);
    }

    protected boolean a(String str, String str2, Map<String, a> map) {
        return str.contains(str2);
    }
}
