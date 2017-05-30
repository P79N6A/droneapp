package com.google.android.gms.internal;

import java.util.Collections;
import java.util.Map;

public interface ru {

    public static class a {
        public byte[] a;
        public String b;
        public long c;
        public long d;
        public long e;
        public long f;
        public Map<String, String> g = Collections.emptyMap();

        public boolean a() {
            return this.e < System.currentTimeMillis();
        }

        public boolean b() {
            return this.f < System.currentTimeMillis();
        }
    }

    a a(String str);

    void a();

    void a(String str, a aVar);
}
