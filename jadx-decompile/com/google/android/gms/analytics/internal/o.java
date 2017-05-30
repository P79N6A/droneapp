package com.google.android.gms.analytics.internal;

import android.app.Activity;
import java.util.HashMap;
import java.util.Map;

public class o implements af {
    public String a;
    public double b = -1.0d;
    public int c = -1;
    public int d = -1;
    public int e = -1;
    public int f = -1;
    public Map<String, String> g = new HashMap();

    public String a(Activity activity) {
        return a(activity.getClass().getCanonicalName());
    }

    public String a(String str) {
        String str2 = (String) this.g.get(str);
        return str2 != null ? str2 : str;
    }

    public boolean a() {
        return this.a != null;
    }

    public String b() {
        return this.a;
    }

    public boolean c() {
        return this.b >= 0.0d;
    }

    public double d() {
        return this.b;
    }

    public boolean e() {
        return this.c >= 0;
    }

    public int f() {
        return this.c;
    }

    public boolean g() {
        return this.d != -1;
    }

    public boolean h() {
        return this.d == 1;
    }

    public boolean i() {
        return this.e != -1;
    }

    public boolean j() {
        return this.e == 1;
    }

    public boolean k() {
        return this.f == 1;
    }
}
