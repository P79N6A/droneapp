package com.google.android.gms.tagmanager;

import android.os.Build.VERSION;
import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.hj.a;
import java.util.Map;

class ci extends t {
    private static final String a = eg.SDK_VERSION.toString();

    public ci() {
        super(a, new String[0]);
    }

    public a a(Map<String, a> map) {
        return cw.f(Integer.valueOf(VERSION.SDK_INT));
    }

    public boolean a() {
        return true;
    }
}
