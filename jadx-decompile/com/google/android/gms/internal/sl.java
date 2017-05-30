package com.google.android.gms.internal;

import com.google.android.gms.internal.df.a;

public class sl extends sq {
    private final StackTraceElement[] i;

    public sl(rw rwVar, String str, String str2, a aVar, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(rwVar, str, str2, aVar, i, i2);
        this.i = stackTraceElementArr;
    }

    protected void a() {
        if (this.i != null) {
            rt rtVar = new rt((String) this.f.invoke(null, new Object[]{this.i}));
            synchronized (this.e) {
                this.e.L = rtVar.a;
                if (rtVar.b.booleanValue()) {
                    this.e.V = Integer.valueOf(rtVar.c.booleanValue() ? 0 : 1);
                }
            }
        }
    }
}
