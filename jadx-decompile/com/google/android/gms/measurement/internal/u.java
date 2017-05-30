package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.d;

class u {
    final String a;
    final String b;
    final long c;
    final long d;
    final long e;

    u(String str, String str2, long j, long j2, long j3) {
        boolean z = true;
        d.a(str);
        d.a(str2);
        d.b(j >= 0);
        if (j2 < 0) {
            z = false;
        }
        d.b(z);
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = j3;
    }

    u a() {
        return new u(this.a, this.b, this.c + 1, this.d + 1, this.e);
    }

    u a(long j) {
        return new u(this.a, this.b, this.c, this.d, j);
    }
}
