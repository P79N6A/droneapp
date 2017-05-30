package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.e;

class au implements bu {
    private final long a;
    private final long b;
    private final int c;
    private double d;
    private long e;
    private final Object f = new Object();
    private final String g;
    private final e h;

    public au(int i, int i2, long j, long j2, String str, e eVar) {
        this.c = i2;
        this.d = (double) Math.min(i, i2);
        this.a = j;
        this.b = j2;
        this.g = str;
        this.h = eVar;
    }

    public boolean a() {
        boolean z = false;
        synchronized (this.f) {
            long a = this.h.a();
            String str;
            if (a - this.e < this.b) {
                str = this.g;
                aw.b(new StringBuilder(String.valueOf(str).length() + 34).append("Excessive ").append(str).append(" detected; call ignored.").toString());
            } else {
                if (this.d < ((double) this.c)) {
                    double d = ((double) (a - this.e)) / ((double) this.a);
                    if (d > 0.0d) {
                        this.d = Math.min((double) this.c, d + this.d);
                    }
                }
                this.e = a;
                if (this.d >= 1.0d) {
                    this.d -= 1.0d;
                    z = true;
                } else {
                    str = this.g;
                    aw.b(new StringBuilder(String.valueOf(str).length() + 34).append("Excessive ").append(str).append(" detected; call ignored.").toString());
                }
            }
        }
        return z;
    }
}
