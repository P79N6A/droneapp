package com.google.android.gms.analytics.internal;

public class e {
    private final long a;
    private final int b;
    private double c;
    private long d;
    private final Object e;
    private final String f;
    private final com.google.android.gms.common.util.e g;

    public e(int i, long j, String str, com.google.android.gms.common.util.e eVar) {
        this.e = new Object();
        this.b = i;
        this.c = (double) this.b;
        this.a = j;
        this.f = str;
        this.g = eVar;
    }

    public e(String str, com.google.android.gms.common.util.e eVar) {
        this(60, 2000, str, eVar);
    }

    public boolean a() {
        boolean z;
        synchronized (this.e) {
            long a = this.g.a();
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
                String str = this.f;
                f.c(new StringBuilder(String.valueOf(str).length() + 34).append("Excessive ").append(str).append(" detected; call ignored.").toString());
                z = false;
            }
        }
        return z;
    }
}
