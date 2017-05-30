package com.google.android.gms.internal;

import com.google.android.gms.internal.df.a;

public class se extends sq {
    private long i;

    public se(rw rwVar, String str, String str2, a aVar, long j, int i, int i2) {
        super(rwVar, str, str2, aVar, i, i2);
        this.i = j;
    }

    protected void a() {
        long longValue = ((Long) this.f.invoke(null, new Object[0])).longValue();
        synchronized (this.e) {
            this.e.ae = Long.valueOf(longValue);
            if (this.i != 0) {
                this.e.q = Long.valueOf(longValue - this.i);
                this.e.v = Long.valueOf(this.i);
            }
        }
    }
}
