package com.google.android.gms.internal;

import com.google.android.gms.internal.df.a;

public class sj extends sq {
    private static volatile String i = null;
    private static final Object j = new Object();

    public sj(rw rwVar, String str, String str2, a aVar, int i, int i2) {
        super(rwVar, str, str2, aVar, i, i2);
    }

    protected void a() {
        this.e.a = "E";
        if (i == null) {
            synchronized (j) {
                if (i == null) {
                    i = (String) this.f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.e) {
            this.e.a = i;
        }
    }
}
