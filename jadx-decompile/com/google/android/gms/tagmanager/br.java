package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.fh;
import com.google.android.gms.internal.hj.a;
import java.util.Map;
import java.util.Set;

public abstract class br extends t {
    private static final String a = fh.ARG0.toString();
    private static final String b = fh.ARG1.toString();

    public br(String str) {
        super(str, a, b);
    }

    public a a(Map<String, a> map) {
        for (a aVar : map.values()) {
            if (aVar == cw.g()) {
                return cw.f(Boolean.valueOf(false));
            }
        }
        a aVar2 = (a) map.get(a);
        a aVar3 = (a) map.get(b);
        boolean a = (aVar2 == null || aVar3 == null) ? false : a(aVar2, aVar3, map);
        return cw.f(Boolean.valueOf(a));
    }

    public boolean a() {
        return true;
    }

    protected abstract boolean a(a aVar, a aVar2, Map<String, a> map);

    public /* bridge */ /* synthetic */ String b() {
        return super.b();
    }

    public /* bridge */ /* synthetic */ Set c() {
        return super.c();
    }
}
