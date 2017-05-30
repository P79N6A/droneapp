package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.d;
import java.util.concurrent.TimeUnit;

public final class c implements m {
    private final Status a;
    private final i<?>[] b;

    c(Status status, i<?>[] iVarArr) {
        this.a = status;
        this.b = iVarArr;
    }

    public Status a() {
        return this.a;
    }

    public <R extends m> R a(d<R> dVar) {
        d.b(dVar.a < this.b.length, "The result token does not belong to this batch");
        return this.b[dVar.a].a(0, TimeUnit.MILLISECONDS);
    }
}
