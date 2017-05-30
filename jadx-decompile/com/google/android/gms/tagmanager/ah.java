package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.hj.a;
import java.util.Map;

class ah extends t {
    private static final String a = eg.ADVERTISER_ID.toString();
    private final g b;

    public ah(Context context) {
        this(g.a(context));
    }

    ah(g gVar) {
        super(a, new String[0]);
        this.b = gVar;
        this.b.a();
    }

    public a a(Map<String, a> map) {
        Object a = this.b.a();
        return a == null ? cw.g() : cw.f(a);
    }

    public boolean a() {
        return false;
    }
}
