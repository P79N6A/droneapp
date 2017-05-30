package com.google.android.gms.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class dw {
    private final Map<String, dz> a;
    private final dz b;

    public static class a {
        private final Map<String, dz> a = new HashMap();
        private dz b;

        public a a(dz dzVar) {
            this.b = dzVar;
            return this;
        }

        public a a(String str, dz dzVar) {
            this.a.put(str, dzVar);
            return this;
        }

        public dw a() {
            return new dw(this.a, this.b);
        }
    }

    private dw(Map<String, dz> map, dz dzVar) {
        this.a = Collections.unmodifiableMap(map);
        this.b = dzVar;
    }

    public Map<String, dz> a() {
        return this.a;
    }

    public String toString() {
        String valueOf = String.valueOf(a());
        String valueOf2 = String.valueOf(this.b);
        return new StringBuilder((String.valueOf(valueOf).length() + 32) + String.valueOf(valueOf2).length()).append("Properties: ").append(valueOf).append(" pushAfterEvaluate: ").append(valueOf2).toString();
    }
}
