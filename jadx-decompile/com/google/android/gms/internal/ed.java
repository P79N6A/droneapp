package com.google.android.gms.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ed extends ea<aqe> {
    private static final Map<String, aqe> c;
    private aqe b;

    static {
        Map hashMap = new HashMap();
        hashMap.put("hasOwnProperty", r.a);
        c = Collections.unmodifiableMap(hashMap);
    }

    public ed(aqe com_google_android_gms_internal_aqe) {
        this.b = com_google_android_gms_internal_aqe;
    }

    public Iterator<ea<?>> a() {
        return c();
    }

    public /* synthetic */ Object b() {
        return d();
    }

    public boolean c(String str) {
        return c.containsKey(str);
    }

    public aqe d() {
        return this.b;
    }

    public aqe d(String str) {
        if (c(str)) {
            return (aqe) c.get(str);
        }
        throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 60).append("Native Method ").append(str).append(" is not defined for type InstructionReference.").toString());
    }

    public String toString() {
        return this.b.toString();
    }
}
