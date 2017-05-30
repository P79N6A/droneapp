package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.u;
import java.util.concurrent.Callable;

class uf$1 implements Callable<Void> {
    final /* synthetic */ Context a;

    uf$1(Context context) {
        this.a = context;
    }

    public Void a() {
        u.q().a(this.a);
        return null;
    }

    public /* synthetic */ Object call() {
        return a();
    }
}
