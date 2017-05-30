package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class eh extends ea<Map<String, ea<?>>> {
    private static final Map<String, aqe> b;
    private boolean c = false;

    static {
        Map hashMap = new HashMap();
        hashMap.put("hasOwnProperty", r.a);
        b = Collections.unmodifiableMap(hashMap);
    }

    public eh(Map<String, ea<?>> map) {
        this.a = (Map) d.a(map);
    }

    public Iterator<ea<?>> a() {
        return c();
    }

    public ea<?> b(String str) {
        ea<?> b = super.b(str);
        return b == null ? ee.e : b;
    }

    public /* synthetic */ Object b() {
        return d();
    }

    public boolean c(String str) {
        return b.containsKey(str);
    }

    public aqe d(String str) {
        if (c(str)) {
            return (aqe) b.get(str);
        }
        throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 51).append("Native Method ").append(str).append(" is not defined for type ListWrapper.").toString());
    }

    public Map<String, ea<?>> d() {
        return this.a;
    }

    public void e() {
        this.c = true;
    }

    public boolean equals(Object obj) {
        return this == obj ? true : obj instanceof eh ? this.a.entrySet().equals(((Map) ((eh) obj).b()).entrySet()) : false;
    }

    public boolean f() {
        return this.c;
    }

    public String toString() {
        return this.a.toString();
    }
}
