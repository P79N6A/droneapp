package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.fh;
import com.google.android.gms.internal.hj.a;
import java.util.Map;

class db extends t {
    private static final String a = eg.ADWORDS_CLICK_REFERRER.toString();
    private static final String b = fh.COMPONENT.toString();
    private static final String c = fh.CONVERSION_ID.toString();
    private final Context d;

    public db(Context context) {
        super(a, c);
        this.d = context;
    }

    public a a(Map<String, a> map) {
        a aVar = (a) map.get(c);
        if (aVar == null) {
            return cw.g();
        }
        String a = cw.a(aVar);
        aVar = (a) map.get(b);
        Object a2 = an.a(this.d, a, aVar != null ? cw.a(aVar) : null);
        return a2 != null ? cw.f(a2) : cw.g();
    }

    public boolean a() {
        return true;
    }
}
