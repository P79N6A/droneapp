package com.google.android.gms.internal;

import com.google.android.gms.internal.df.a;

public class sm extends sq {
    public sm(rw rwVar, String str, String str2, a aVar, int i, int i2) {
        super(rwVar, str, str2, aVar, i, i2);
    }

    protected void a() {
        synchronized (this.e) {
            rv rvVar = new rv((String) this.f.invoke(null, new Object[0]));
            this.e.Q = rvVar.a;
            this.e.R = rvVar.b;
        }
    }
}
