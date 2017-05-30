package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class eb extends ea<Boolean> {
    private static final Map<String, aqe> c;
    private final Boolean b;

    static {
        Map hashMap = new HashMap();
        hashMap.put("hasOwnProperty", r.a);
        hashMap.put("toString", new au());
        c = Collections.unmodifiableMap(hashMap);
    }

    public eb(Boolean bool) {
        d.a(bool);
        this.b = bool;
    }

    public /* synthetic */ Object b() {
        return d();
    }

    public boolean c(String str) {
        return c.containsKey(str);
    }

    public aqe d(String str) {
        if (c(str)) {
            return (aqe) c.get(str);
        }
        throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 54).append("Native Method ").append(str).append(" is not defined for type BooleanWrapper.").toString());
    }

    public Boolean d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb)) {
            return false;
        }
        return ((Boolean) ((eb) obj).b()) == this.b;
    }

    public String toString() {
        return this.b.toString();
    }
}
