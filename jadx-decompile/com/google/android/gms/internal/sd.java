package com.google.android.gms.internal;

import com.google.android.gms.internal.df.a;

public class sd extends sq {
    private static volatile Long i = null;
    private static final Object j = new Object();

    public sd(rw rwVar, String str, String str2, a aVar, int i, int i2) {
        super(rwVar, str, str2, aVar, i, i2);
    }

    protected void a() {
        if (i == null) {
            synchronized (j) {
                if (i == null) {
                    i = (Long) this.f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.e) {
            this.e.K = i;
        }
    }
}
