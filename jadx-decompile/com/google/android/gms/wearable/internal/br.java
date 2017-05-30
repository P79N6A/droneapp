package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.j;
import com.google.android.gms.wearable.f;
import com.google.android.gms.wearable.h;

public final class br extends j implements f {
    private final int c;

    public br(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.c = i2;
    }

    public /* synthetic */ Object a() {
        return e();
    }

    public h c() {
        return new g(this.c_, this.d_, this.c);
    }

    public int d() {
        return c("event_type");
    }

    public f e() {
        return new bq(this);
    }

    public String toString() {
        String str = d() == 1 ? "changed" : d() == 2 ? "deleted" : "unknown";
        String valueOf = String.valueOf(c());
        return new StringBuilder((String.valueOf(str).length() + 32) + String.valueOf(valueOf).length()).append("DataEventRef{ type=").append(str).append(", dataitem=").append(valueOf).append(" }").toString();
    }
}
