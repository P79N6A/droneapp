package com.google.android.gms.contextmanager.fence.internal;

import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.pv;

public class a {
    private final pv a;

    public a(pv pvVar) {
        this.a = (pv) d.a(pvVar);
    }

    public static a a(int i, int[] iArr) {
        boolean z = iArr != null && iArr.length > 0;
        d.b(z);
        return new a(a(i, iArr, 3000));
    }

    public static a a(int[] iArr) {
        return a(1, iArr);
    }

    private static pv a(int i, int[] iArr, long j) {
        pv pvVar = new pv();
        pvVar.a = i;
        pvVar.b = j;
        pvVar.c = iArr;
        return pvVar;
    }

    public pv a() {
        return this.a;
    }
}
