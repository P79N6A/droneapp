package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.hj.a;
import java.util.Map;

class bi extends t {
    private static final String a = eg.ADVERTISING_TRACKING_ENABLED.toString();
    private final g b;

    public bi(Context context) {
        this(g.a(context));
    }

    bi(g gVar) {
        super(a, new String[0]);
        this.b = gVar;
    }

    public a a(Map<String, a> map) {
        return cw.f(Boolean.valueOf(!this.b.b()));
    }

    public boolean a() {
        return false;
    }
}
