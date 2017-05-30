package com.google.android.gms.tagmanager;

import android.text.TextUtils;

class z {
    private final long a;
    private final long b;
    private final long c;
    private String d;

    z(long j, long j2, long j3) {
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

    long b() {
        return this.c;
    }

    String c() {
        return this.d;
    }
}
