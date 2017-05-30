package com.google.android.gms.tagmanager;

import android.os.Build.VERSION;
import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.hj.a;
import java.util.Map;

class bo extends t {
    private static final String a = eg.OS_VERSION.toString();

    public bo() {
        super(a, new String[0]);
    }

    public a a(Map<String, a> map) {
        return cw.f(VERSION.RELEASE);
    }

    public boolean a() {
        return true;
    }
}
