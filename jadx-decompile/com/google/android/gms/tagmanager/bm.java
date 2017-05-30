package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.hj.a;
import java.util.Map;

abstract class bm extends br {
    public bm(String str) {
        super(str);
    }

    protected boolean a(a aVar, a aVar2, Map<String, a> map) {
        cv b = cw.b(aVar);
        cv b2 = cw.b(aVar2);
        return (b == cw.e() || b2 == cw.e()) ? false : a(b, b2, (Map) map);
    }

    protected abstract boolean a(cv cvVar, cv cvVar2, Map<String, a> map);
}
