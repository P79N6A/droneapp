package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.Map;

class aoy {
    private final long a;
    private final long b;
    private final long c;
    private String d;
    private String e;
    private Map<String, String> f;
    private String g;

    aoy(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    long a() {
        return this.a;
    }

    void a(String str) {
        if (str != null && !TextUtils.isEmpty(str.trim())) {
            this.d = str;
        }
    }

    void a(Map<String, String> map) {
        this.f = map;
    }

    long b() {
        return this.c;
    }

    void b(String str) {
        this.e = str;
    }

    String c() {
        return this.d;
    }

    void c(String str) {
        this.g = str;
    }

    String d() {
        return this.e;
    }

    Map<String, String> e() {
        return this.f;
    }

    String f() {
        return this.g;
    }
}
