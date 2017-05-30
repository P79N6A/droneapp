package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.c.f;

class aav$2 implements Runnable {
    final /* synthetic */ xr a;
    final /* synthetic */ AdRequestParcel b;
    final /* synthetic */ aaz c;
    final /* synthetic */ aav d;

    aav$2(aav com_google_android_gms_internal_aav, xr xrVar, AdRequestParcel adRequestParcel, aaz com_google_android_gms_internal_aaz) {
        this.d = com_google_android_gms_internal_aav;
        this.a = xrVar;
        this.b = adRequestParcel;
        this.c = com_google_android_gms_internal_aaz;
    }

    public void run() {
        try {
            this.a.a(f.a(aav.a(this.d)), this.b, null, this.c, aav.b(this.d));
        } catch (Throwable e) {
            Throwable th = e;
            String str = "Fail to initialize adapter ";
            String valueOf = String.valueOf(aav.c(this.d));
            abr.d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), th);
            this.d.a(aav.c(this.d), 0);
        }
    }
}
