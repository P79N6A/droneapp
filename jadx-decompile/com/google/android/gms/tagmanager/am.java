package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.fh;
import com.google.android.gms.internal.hj.a;
import java.util.Map;

class am extends t {
    private static final String a = eg.INSTALL_REFERRER.toString();
    private static final String b = fh.COMPONENT.toString();
    private final Context c;

    public am(Context context) {
        super(a, new String[0]);
        this.c = context;
    }

    public a a(Map<String, a> map) {
        Object b = an.b(this.c, ((a) map.get(b)) != null ? cw.a((a) map.get(b)) : null);
        return b != null ? cw.f(b) : cw.g();
    }

    public boolean a() {
        return true;
    }
}
