package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.m;
import com.google.android.gms.internal.ahl.a;
import java.util.Collections;

public class ahx implements ahz {
    private final aia a;

    public ahx(aia com_google_android_gms_internal_aia) {
        this.a = com_google_android_gms_internal_aia;
    }

    public <A extends c, R extends m, T extends a<R, A>> T a(T t) {
        this.a.i.c.add(t);
        return t;
    }

    public void a() {
        this.a.j();
        this.a.i.f = Collections.emptySet();
    }

    public void a(int i) {
    }

    public void a(Bundle bundle) {
    }

    public void a(ConnectionResult connectionResult, com.google.android.gms.common.api.a<?> aVar, int i) {
    }

    public <A extends c, T extends a<? extends m, A>> T b(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public boolean b() {
        return true;
    }

    public void c() {
        this.a.h();
    }
}
