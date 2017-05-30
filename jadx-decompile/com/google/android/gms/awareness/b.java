package com.google.android.gms.awareness;

import com.google.android.gms.common.api.a.a.d;

public class b implements d {
    public static final int a = -1;
    private final String b;
    private final int c;
    private final String d;
    private final String e;
    private final int f;

    protected b(String str, int i, String str2, String str3, int i2) {
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = i2;
    }

    public static b a(String str) {
        com.google.android.gms.common.internal.d.a(str);
        return new b(str, 1, null, null, -1);
    }

    public String a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public String d() {
        return this.e;
    }

    public int e() {
        return this.f;
    }
}
