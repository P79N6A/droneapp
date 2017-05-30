package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.config.internal.AnalyticsUserProperty;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface ajr {

    public interface b extends m {
        Status a();

        byte[] a(String str, byte[] bArr, String str2);

        long b();

        Map<String, Set<String>> c();
    }

    public static class a {
        private final long a;
        private final Map<String, String> b;
        private final int c;
        private final List<AnalyticsUserProperty> d;

        public static class a {
            private long a = 43200;
            private Map<String, String> b;
            private int c;

            public a a(int i) {
                this.c = i;
                return this;
            }

            public a a(long j) {
                this.a = j;
                return this;
            }

            public a a(String str, String str2) {
                if (this.b == null) {
                    this.b = new HashMap();
                }
                this.b.put(str, str2);
                return this;
            }

            public a a() {
                return new a();
            }
        }

        private a(a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = null;
        }

        public long a() {
            return this.a;
        }

        public Map<String, String> b() {
            return this.b == null ? Collections.emptyMap() : this.b;
        }

        public int c() {
            return this.c;
        }
    }

    i<b> a(g gVar, a aVar);
}
