package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.f;
import com.google.android.gms.wearable.h;

public class bq implements f {
    private int c;
    private h d;

    public bq(f fVar) {
        this.c = fVar.d();
        this.d = (h) fVar.c().a();
    }

    public /* synthetic */ Object a() {
        return e();
    }

    public boolean b() {
        return true;
    }

    public h c() {
        return this.d;
    }

    public int d() {
        return this.c;
    }

    public f e() {
        return this;
    }

    public String toString() {
        String str = d() == 1 ? "changed" : d() == 2 ? "deleted" : "unknown";
        String valueOf = String.valueOf(c());
        return new StringBuilder((String.valueOf(str).length() + 35) + String.valueOf(valueOf).length()).append("DataEventEntity{ type=").append(str).append(", dataitem=").append(valueOf).append(" }").toString();
    }
}
