package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.client.AdRequestParcel;

class aav$1 implements Runnable {
    final /* synthetic */ AdRequestParcel a;
    final /* synthetic */ xr b;
    final /* synthetic */ aav c;

    aav$1(aav com_google_android_gms_internal_aav, AdRequestParcel adRequestParcel, xr xrVar) {
        this.c = com_google_android_gms_internal_aav;
        this.a = adRequestParcel;
        this.b = xrVar;
    }

    public void run() {
        aav.a(this.c, this.a, this.b);
    }
}
