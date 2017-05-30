package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.hj.a;
import java.util.Map;

abstract class cr extends br {
    public cr(String str) {
        super(str);
    }

    protected boolean a(a aVar, a aVar2, Map<String, a> map) {
        String a = cw.a(aVar);
        String a2 = cw.a(aVar2);
        return (a == cw.f() || a2 == cw.f()) ? false : a(a, a2, (Map) map);
    }

    protected abstract boolean a(String str, String str2, Map<String, a> map);
}
