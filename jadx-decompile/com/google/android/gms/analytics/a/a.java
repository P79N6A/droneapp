package com.google.android.gms.analytics.a;

import com.google.android.gms.analytics.j;
import com.google.android.gms.analytics.n;
import com.google.android.gms.common.internal.d;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class a {
    Map<String, String> a = new HashMap();

    public a a(double d) {
        a("pr", Double.toString(d));
        return this;
    }

    public a a(int i) {
        a("ps", Integer.toString(i));
        return this;
    }

    public a a(int i, int i2) {
        a(j.m(i), Integer.toString(i2));
        return this;
    }

    public a a(int i, String str) {
        a(j.l(i), str);
        return this;
    }

    public a a(String str) {
        a("id", str);
        return this;
    }

    void a(String str, String str2) {
        d.a((Object) str, (Object) "Name should be non-null");
        this.a.put(str, str2);
    }

    public a b(int i) {
        a("qt", Integer.toString(i));
        return this;
    }

    public a b(String str) {
        a("nm", str);
        return this;
    }

    public a c(String str) {
        a("br", str);
        return this;
    }

    public a d(String str) {
        a("ca", str);
        return this;
    }

    public a e(String str) {
        a("va", str);
        return this;
    }

    public a f(String str) {
        a("cc", str);
        return this;
    }

    public Map<String, String> g(String str) {
        Map<String, String> hashMap = new HashMap();
        for (Entry entry : this.a.entrySet()) {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf((String) entry.getKey());
            hashMap.put(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), (String) entry.getValue());
        }
        return hashMap;
    }

    public String toString() {
        return n.a(this.a);
    }
}
