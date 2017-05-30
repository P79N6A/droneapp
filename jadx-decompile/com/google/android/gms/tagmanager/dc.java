package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.hj.a;
import java.util.Map;

class dc extends t {
    private static final String a = eg.APP_ID.toString();
    private final Context b;

    public dc(Context context) {
        super(a, new String[0]);
        this.b = context;
    }

    public a a(Map<String, a> map) {
        return cw.f(this.b.getPackageName());
    }

    public boolean a() {
        return true;
    }
}
