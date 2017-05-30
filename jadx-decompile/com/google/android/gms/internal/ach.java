package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.u;

@aaa
public class ach {
    private long a;
    private long b = Long.MIN_VALUE;
    private Object c = new Object();

    public ach(long j) {
        this.a = j;
    }

    public boolean a() {
        boolean z;
        synchronized (this.c) {
            long b = u.k().b();
            if (this.b + this.a > b) {
                z = false;
            } else {
                this.b = b;
                z = true;
            }
        }
        return z;
    }
}
