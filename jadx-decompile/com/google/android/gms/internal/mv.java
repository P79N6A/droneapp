package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class mv {
    private Map<String, Map<String, byte[]>> a;
    private long b;

    public mv(Map<String, Map<String, byte[]>> map, long j) {
        this.a = map;
        this.b = j;
    }

    public Map<String, Map<String, byte[]>> a() {
        return this.a;
    }

    public void a(long j) {
        this.b = j;
    }

    public void a(Map<String, byte[]> map, String str) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.put(str, map);
    }

    public boolean a(String str) {
        if (str == null) {
            return false;
        }
        boolean z = (!b() || this.a.get(str) == null || ((Map) this.a.get(str)).isEmpty()) ? false : true;
        return z;
    }

    public boolean a(String str, String str2) {
        return b() && a(str2) && b(str, str2) != null;
    }

    public boolean b() {
        return (this.a == null || this.a.isEmpty()) ? false : true;
    }

    public byte[] b(String str, String str2) {
        return (str == null || !a(str2)) ? null : (byte[]) ((Map) this.a.get(str2)).get(str);
    }

    public long c() {
        return this.b;
    }

    public Set<String> c(String str, String str2) {
        Set<String> treeSet = new TreeSet();
        if (!a(str2)) {
            return treeSet;
        }
        if (str == null || str.isEmpty()) {
            return ((Map) this.a.get(str2)).keySet();
        }
        for (String str3 : ((Map) this.a.get(str2)).keySet()) {
            if (str3.startsWith(str)) {
                treeSet.add(str3);
            }
        }
        return treeSet;
    }
}
