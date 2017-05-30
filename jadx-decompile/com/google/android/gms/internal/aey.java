package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.auth.api.proxy.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.m;
import com.google.android.gms.internal.ahl.a;

abstract class aey extends a<b.a, aev> {
    public aey(g gVar) {
        super(com.google.android.gms.auth.api.b.b, gVar);
    }

    protected b.a a(Status status) {
        return new afa(status);
    }

    protected abstract void a(Context context, aex com_google_android_gms_internal_aex);

    protected final void a(aev com_google_android_gms_internal_aev) {
        a(com_google_android_gms_internal_aev.B(), (aex) com_google_android_gms_internal_aev.G());
    }

    protected /* synthetic */ m b(Status status) {
        return a(status);
    }
}
