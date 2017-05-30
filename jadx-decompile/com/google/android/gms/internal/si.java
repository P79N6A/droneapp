package com.google.android.gms.internal;

import com.google.android.gms.internal.df.a;

public class si extends sq {
    private long i = -1;

    public si(rw rwVar, String str, String str2, a aVar, int i, int i2) {
        super(rwVar, str, str2, aVar, i, i2);
    }

    protected void a() {
        this.e.l = Long.valueOf(-1);
        if (this.i == -1) {
            this.i = (long) ((Integer) this.f.invoke(null, new Object[]{this.b.a()})).intValue();
        }
        synchronized (this.e) {
            this.e.l = Long.valueOf(this.i);
        }
    }
}
