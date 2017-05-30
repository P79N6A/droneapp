package com.google.android.gms.games.internal.request;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.games.internal.b.s;
import java.util.HashMap;
import java.util.Set;

public final class b {
    private static final String[] a = new String[]{"requestId", "outcome"};
    private final int b;
    private final HashMap<String, Integer> c;

    public static final class a {
        private HashMap<String, Integer> a = new HashMap();
        private int b = 0;

        public a a(int i) {
            this.b = i;
            return this;
        }

        public a a(String str, int i) {
            if (s.a(i)) {
                this.a.put(str, Integer.valueOf(i));
            }
            return this;
        }

        public b a() {
            return new b(this.b, this.a);
        }
    }

    private b(int i, HashMap<String, Integer> hashMap) {
        this.b = i;
        this.c = hashMap;
    }

    public static b a(DataHolder dataHolder) {
        a aVar = new a();
        aVar.a(dataHolder.e());
        int g = dataHolder.g();
        for (int i = 0; i < g; i++) {
            int a = dataHolder.a(i);
            aVar.a(dataHolder.c("requestId", i, a), dataHolder.b("outcome", i, a));
        }
        return aVar.a();
    }

    public int a(String str) {
        d.b(this.c.containsKey(str), new StringBuilder(String.valueOf(str).length() + 46).append("Request ").append(str).append(" was not part of the update operation!").toString());
        return ((Integer) this.c.get(str)).intValue();
    }

    public Set<String> a() {
        return this.c.keySet();
    }
}
