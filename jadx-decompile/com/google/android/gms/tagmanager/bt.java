package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.fh;
import com.google.android.gms.internal.hj.a;
import java.util.Map;

class bt extends t {
    private static final String a = eg.RANDOM.toString();
    private static final String b = fh.MIN.toString();
    private static final String c = fh.MAX.toString();

    public bt() {
        super(a, new String[0]);
    }

    public a a(Map<String, a> map) {
        double doubleValue;
        double d;
        a aVar = (a) map.get(b);
        a aVar2 = (a) map.get(c);
        if (!(aVar == null || aVar == cw.g() || aVar2 == null || aVar2 == cw.g())) {
            cv b = cw.b(aVar);
            cv b2 = cw.b(aVar2);
            if (!(b == cw.e() || b2 == cw.e())) {
                double doubleValue2 = b.doubleValue();
                doubleValue = b2.doubleValue();
                if (doubleValue2 <= doubleValue) {
                    d = doubleValue2;
                    return cw.f(Long.valueOf(Math.round(((doubleValue - d) * Math.random()) + d)));
                }
            }
        }
        doubleValue = 2.147483647E9d;
        d = 0.0d;
        return cw.f(Long.valueOf(Math.round(((doubleValue - d) * Math.random()) + d)));
    }

    public boolean a() {
        return false;
    }
}
