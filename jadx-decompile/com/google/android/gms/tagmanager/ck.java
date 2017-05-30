package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;

class ck implements bu {
    private final long a;
    private final int b;
    private double c;
    private long d;
    private final Object e;
    private final e f;

    public ck() {
        this(60, 2000);
    }

    public ck(int i, long j) {
        this.e = new Object();
        this.b = i;
        this.c = (double) this.b;
        this.a = j;
        this.f = h.d();
    }

    public boolean a() {
        boolean z;
        synchronized (this.e) {
            long a = this.f.a();
            if (this.c < ((double) this.b)) {
                double d = ((double) (a - this.d)) / ((double) this.a);
                if (d > 0.0d) {
                    this.c = Math.min((double) this.b, d + this.c);
                }
            }
            this.d = a;
            if (this.c >= 1.0d) {
                this.c -= 1.0d;
                z = true;
            } else {
                aw.b("No more tokens available.");
                z = false;
            }
        }
        return z;
    }
}
