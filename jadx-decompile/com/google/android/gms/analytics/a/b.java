package com.google.android.gms.analytics.a;

import com.google.android.gms.analytics.n;
import com.google.android.gms.common.internal.d;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class b {
    public static final String a = "detail";
    public static final String b = "click";
    public static final String c = "add";
    public static final String d = "remove";
    public static final String e = "checkout";
    public static final String f = "checkout_option";
    @Deprecated
    public static final String g = "checkout_options";
    public static final String h = "purchase";
    public static final String i = "refund";
    Map<String, String> j = new HashMap();

    public b(String str) {
        a("&pa", str);
    }

    public b a(double d) {
        a("&tr", Double.toString(d));
        return this;
    }

    public b a(int i) {
        a("&cos", Integer.toString(i));
        return this;
    }

    public b a(String str) {
        a("&ti", str);
        return this;
    }

    public Map<String, String> a() {
        return new HashMap(this.j);
    }

    void a(String str, String str2) {
        d.a((Object) str, (Object) "Name should be non-null");
        this.j.put(str, str2);
    }

    public b b(double d) {
        a("&tt", Double.toString(d));
        return this;
    }

    public b b(String str) {
        a("&ta", str);
        return this;
    }

    public b c(double d) {
        a("&ts", Double.toString(d));
        return this;
    }

    public b c(String str) {
        a("&tcc", str);
        return this;
    }

    public b d(String str) {
        a("&col", str);
        return this;
    }

    public b e(String str) {
        a("&pal", str);
        return this;
    }

    public b f(String str) {
        a("&pls", str);
        return this;
    }

    public String toString() {
        Map hashMap = new HashMap();
        for (Entry entry : this.j.entrySet()) {
            if (((String) entry.getKey()).startsWith("&")) {
                hashMap.put(((String) entry.getKey()).substring(1), (String) entry.getValue());
            } else {
                hashMap.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return n.a(hashMap);
    }
}
