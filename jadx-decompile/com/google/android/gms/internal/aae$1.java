package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import java.util.concurrent.Callable;

class aae$1 implements Callable<Void> {
    final /* synthetic */ aad a;
    final /* synthetic */ Context b;
    final /* synthetic */ AdRequestInfoParcel c;
    final /* synthetic */ Bundle d;

    aae$1(aad com_google_android_gms_internal_aad, Context context, AdRequestInfoParcel adRequestInfoParcel, Bundle bundle) {
        this.a = com_google_android_gms_internal_aad;
        this.b = context;
        this.c = adRequestInfoParcel;
        this.d = bundle;
    }

    public Void a() {
        this.a.a.a(this.b, this.c.g.packageName, this.d);
        return null;
    }

    public /* synthetic */ Object call() {
        return a();
    }
}
