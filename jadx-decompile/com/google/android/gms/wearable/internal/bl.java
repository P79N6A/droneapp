package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.d;
import com.google.android.gms.wearable.internal.v.a;

public final class bl extends a {
    private final Object a = new Object();
    private bm b;
    private be c;

    public void a(int i, int i2) {
        synchronized (this.a) {
            bm bmVar = this.b;
            be beVar = new be(i, i2);
            this.c = beVar;
        }
        if (bmVar != null) {
            bmVar.a(beVar);
        }
    }

    public void a(bm bmVar) {
        synchronized (this.a) {
            this.b = (bm) d.a(bmVar);
            be beVar = this.c;
        }
        if (beVar != null) {
            bmVar.a(beVar);
        }
    }
}
