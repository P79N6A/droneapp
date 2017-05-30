package com.google.android.gms.internal;

class aps implements apo {
    private final long a;
    private final int b;
    private double c;
    private long d;
    private final Object e;

    public aps() {
        this(60, 2000);
    }

    public aps(int i, long j) {
        this.e = new Object();
        this.b = i;
        this.c = (double) this.b;
        this.a = j;
    }

    public boolean a() {
        boolean z;
        synchronized (this.e) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.c < ((double) this.b)) {
                double d = ((double) (currentTimeMillis - this.d)) / ((double) this.a);
                if (d > 0.0d) {
                    this.c = Math.min((double) this.b, d + this.c);
                }
            }
            this.d = currentTimeMillis;
            if (this.c >= 1.0d) {
                this.c -= 1.0d;
                z = true;
            } else {
                aph.b("No more tokens available.");
                z = false;
            }
        }
        return z;
    }
}
