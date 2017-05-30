package com.google.android.gms.auth.api.credentials.internal;

import android.content.Context;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.m;
import com.google.android.gms.internal.ahl.a;

abstract class f<R extends m> extends a<R, g> {
    f(g gVar) {
        super(com.google.android.gms.auth.api.a.e, gVar);
    }

    protected abstract void a(Context context, k kVar);

    protected final void a(g gVar) {
        a(gVar.B(), (k) gVar.G());
    }
}
