package com.google.firebase.messaging;

import android.os.Bundle;

public class RemoteMessage$b {
    private final String a;
    private final String b;
    private final String[] c;
    private final String d;
    private final String e;
    private final String[] f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;

    private RemoteMessage$b(Bundle bundle) {
        this.a = c.a(bundle, "gcm.n.title");
        this.b = c.b(bundle, "gcm.n.title");
        this.c = a(bundle, "gcm.n.title");
        this.d = c.a(bundle, "gcm.n.body");
        this.e = c.b(bundle, "gcm.n.body");
        this.f = a(bundle, "gcm.n.body");
        this.g = c.a(bundle, "gcm.n.icon");
        this.h = c.c(bundle);
        this.i = c.a(bundle, "gcm.n.tag");
        this.j = c.a(bundle, "gcm.n.color");
        this.k = c.a(bundle, "gcm.n.click_action");
    }

    private String[] a(Bundle bundle, String str) {
        Object[] c = c.c(bundle, str);
        if (c == null) {
            return null;
        }
        String[] strArr = new String[c.length];
        for (int i = 0; i < c.length; i++) {
            strArr[i] = String.valueOf(c[i]);
        }
        return strArr;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String[] c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    public String e() {
        return this.e;
    }

    public String[] f() {
        return this.f;
    }

    public String g() {
        return this.g;
    }

    public String h() {
        return this.h;
    }

    public String i() {
        return this.i;
    }

    public String j() {
        return this.j;
    }

    public String k() {
        return this.k;
    }
}
