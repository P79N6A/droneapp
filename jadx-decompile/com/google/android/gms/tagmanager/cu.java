package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.hj.a;
import java.util.Map;

abstract class cu extends t {
    public cu(String str, String... strArr) {
        super(str, strArr);
    }

    public a a(Map<String, a> map) {
        b(map);
        return cw.g();
    }

    public boolean a() {
        return false;
    }

    public abstract void b(Map<String, a> map);
}
