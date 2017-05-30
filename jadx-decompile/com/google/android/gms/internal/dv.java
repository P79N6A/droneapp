package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class dv {
    private final List<dx> a;
    private final Map<String, dw> b;
    private String c;
    private int d;

    public static class a {
        private final List<dx> a = new ArrayList();
        private final Map<String, dw> b = new HashMap();
        private String c = "";
        private int d = 0;

        public a a(dw dwVar) {
            this.b.put(((dz) dwVar.a().get("instance_name")).toString(), dwVar);
            return this;
        }

        public a a(dx dxVar) {
            this.a.add(dxVar);
            return this;
        }

        public a a(String str) {
            this.c = str;
            return this;
        }

        public dv a() {
            return new dv(this.a, this.b, this.c, 0);
        }
    }

    public dv(List<dx> list, Map<String, dw> map, String str, int i) {
        this.a = Collections.unmodifiableList(list);
        this.b = Collections.unmodifiableMap(map);
        this.c = str;
        this.d = i;
    }

    public dw a(String str) {
        return (dw) this.b.get(str);
    }

    public List<dx> a() {
        return this.a;
    }

    public String b() {
        return this.c;
    }

    public String toString() {
        String valueOf = String.valueOf(a());
        String valueOf2 = String.valueOf(this.b);
        return new StringBuilder((String.valueOf(valueOf).length() + 18) + String.valueOf(valueOf2).length()).append("Rules: ").append(valueOf).append("\n  Macros: ").append(valueOf2).toString();
    }
}
