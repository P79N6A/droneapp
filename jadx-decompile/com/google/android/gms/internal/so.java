package com.google.android.gms.internal;

import com.google.android.gms.internal.df.a;

public class so extends sq {
    public so(rw rwVar, String str, String str2, a aVar, int i, int i2) {
        super(rwVar, str, str2, aVar, i, i2);
    }

    protected void a() {
        this.e.O = Integer.valueOf(2);
        boolean booleanValue = ((Boolean) this.f.invoke(null, new Object[]{this.b.b()})).booleanValue();
        synchronized (this.e) {
            if (booleanValue) {
                this.e.O = Integer.valueOf(1);
            } else {
                this.e.O = Integer.valueOf(0);
            }
        }
    }
}
