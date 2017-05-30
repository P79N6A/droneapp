package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;

class aae$3 implements Runnable {
    final /* synthetic */ aad a;
    final /* synthetic */ Context b;
    final /* synthetic */ aag c;
    final /* synthetic */ AdRequestInfoParcel d;

    aae$3(aad com_google_android_gms_internal_aad, Context context, aag com_google_android_gms_internal_aag, AdRequestInfoParcel adRequestInfoParcel) {
        this.a = com_google_android_gms_internal_aad;
        this.b = context;
        this.c = com_google_android_gms_internal_aag;
        this.d = adRequestInfoParcel;
    }

    public void run() {
        this.a.e.a(this.b, this.c, this.d.k);
    }
}
