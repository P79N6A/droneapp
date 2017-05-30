package com.google.android.gms.ads.mediation.customevent;

import com.google.ads.mediation.j;
import java.util.HashMap;

@Deprecated
public final class d implements j {
    private final HashMap<String, Object> a = new HashMap();

    public Object a(String str) {
        return this.a.get(str);
    }

    public void a(String str, Object obj) {
        this.a.put(str, obj);
    }
}
