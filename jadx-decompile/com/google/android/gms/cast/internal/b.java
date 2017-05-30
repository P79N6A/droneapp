package com.google.android.gms.cast.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.m;
import com.google.android.gms.internal.ahl.a;

public abstract class b<R extends m> extends a<R, e> {
    public b(g gVar) {
        super(com.google.android.gms.cast.a.k, gVar);
    }

    public void a(int i) {
        b(b(new Status(i)));
    }

    public void a(int i, String str) {
        b(b(new Status(i, str, null)));
    }
}
