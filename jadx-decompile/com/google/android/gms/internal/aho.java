package com.google.android.gms.internal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.d;

public class aho implements b, c {
    public final a<?> a;
    private final int d;
    private ahp e;

    public aho(a<?> aVar, int i) {
        this.a = aVar;
        this.d = i;
    }

    private void a() {
        d.a(this.e, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }

    public void a(int i) {
        a();
        this.e.a(i);
    }

    public void a(@Nullable Bundle bundle) {
        a();
        this.e.a(bundle);
    }

    public void a(@NonNull ConnectionResult connectionResult) {
        a();
        this.e.a(connectionResult, this.a, this.d);
    }

    public void a(ahp com_google_android_gms_internal_ahp) {
        this.e = com_google_android_gms_internal_ahp;
    }
}
