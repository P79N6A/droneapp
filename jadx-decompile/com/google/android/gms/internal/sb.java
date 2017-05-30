package com.google.android.gms.internal;

import com.google.android.gms.internal.df.a;

public class sb extends sq {
    private static volatile km i = null;
    private static final Object j = new Object();
    private boolean k = false;

    public sb(rw rwVar, String str, String str2, a aVar, int i, int i2, boolean z) {
        super(rwVar, str, str2, aVar, i, i2);
        this.k = z;
    }

    protected void a() {
        if (i == null) {
            synchronized (j) {
                if (i == null) {
                    i = new km((String) this.f.invoke(null, new Object[]{this.b.a(), Boolean.valueOf(this.k)}));
                }
            }
        }
        synchronized (this.e) {
            if (i != null) {
                this.e.w = i.a;
                this.e.C = Long.valueOf(i.b);
                this.e.B = i.c;
                if (this.k) {
                    this.e.M = i.d;
                    this.e.N = i.e;
                }
            }
        }
    }
}
