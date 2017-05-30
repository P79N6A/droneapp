package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class ec extends ea<Double> {
    private static final Map<String, aqe> c;
    private Double b;

    static {
        Map hashMap = new HashMap();
        hashMap.put("hasOwnProperty", r.a);
        hashMap.put("toString", new au());
        c = Collections.unmodifiableMap(hashMap);
    }

    public ec(Double d) {
        d.a(d);
        this.b = d;
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
        throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 53).append("Native Method ").append(str).append(" is not defined for type DoubleWrapper.").toString());
    }

    public Double d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        return this == obj ? true : obj instanceof ec ? this.b.equals((Double) ((ec) obj).b()) : false;
    }

    public String toString() {
        return this.b.toString();
    }
}
