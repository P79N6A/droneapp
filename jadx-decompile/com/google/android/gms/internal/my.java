package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

public class my {
    private int a;
    private long b;
    private Map<String, mt> c;
    private boolean d;

    public my() {
        this(-1);
    }

    public my(int i, long j, Map<String, mt> map, boolean z) {
        Map hashMap;
        this.a = i;
        this.b = j;
        if (map == null) {
            hashMap = new HashMap();
        }
        this.c = hashMap;
        this.d = z;
    }

    public my(long j) {
        this(0, j, null, false);
    }

    public int a() {
        return this.a;
    }

    public void a(int i) {
        this.a = i;
    }

    public void a(long j) {
        this.b = j;
    }

    public void a(String str) {
        if (this.c.get(str) != null) {
            this.c.remove(str);
        }
    }

    public void a(String str, mt mtVar) {
        this.c.put(str, mtVar);
    }

    public void a(Map<String, mt> map) {
        Map hashMap;
        if (map == null) {
            hashMap = new HashMap();
        }
        this.c = hashMap;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public boolean b() {
        return this.d;
    }

    public Map<String, mt> c() {
        return this.c;
    }

    public long d() {
        return this.b;
    }
}
