package com.google.android.gms.internal;

import com.google.android.gms.internal.df.a;

public class rz extends sq {
    public rz(rw rwVar, String str, String str2, a aVar, int i, int i2) {
        super(rwVar, str, str2, aVar, i, i2);
    }

    protected void a() {
        synchronized (this.e) {
            this.e.c = Long.valueOf(-1);
            this.e.c = (Long) this.f.invoke(null, new Object[]{this.b.a()});
        }
    }
}
