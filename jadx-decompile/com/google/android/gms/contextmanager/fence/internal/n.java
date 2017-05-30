package com.google.android.gms.contextmanager.fence.internal;

import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.qh;

public class n {
    private final qh a;

    public n(qh qhVar) {
        this.a = (qh) d.a(qhVar);
    }

    public static n a(int i, int i2, double d) {
        d.b(d >= 0.0d);
        return new n(a(2, 1, i, i2, d, d, 3000, 0));
    }

    public static n a(int i, int i2, double d, long j) {
        d.b(d >= 0.0d);
        return new n(a(1, 1, i, i2, d, d, 0, j));
    }

    private static qh a(int i, int i2, int i3, int i4, double d, double d2, long j, long j2) {
        qh qhVar = new qh();
        qhVar.a = i;
        qhVar.b = i2;
        qhVar.c = j;
        qhVar.h = j2;
        if (i2 == 1) {
            qhVar.d = i3;
            qhVar.e = i4;
            qhVar.f = d;
            qhVar.g = d2;
        }
        return qhVar;
    }

    public static n b(int i, int i2, double d) {
        d.b(d >= 0.0d);
        return new n(a(3, 1, i, i2, d, d, 3000, 0));
    }

    public qh a() {
        return this.a;
    }
}
