package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.l;
import com.google.android.gms.ads.internal.u;

class aae$5 implements Runnable {
    final /* synthetic */ AdRequestInfoParcel a;
    final /* synthetic */ l b;
    final /* synthetic */ aae c;

    aae$5(aae com_google_android_gms_internal_aae, AdRequestInfoParcel adRequestInfoParcel, l lVar) {
        this.c = com_google_android_gms_internal_aae;
        this.a = adRequestInfoParcel;
        this.b = lVar;
    }

    public void run() {
        AdResponseParcel a;
        try {
            a = this.c.a(this.a);
        } catch (Throwable e) {
            u.i().a(e, "AdRequestServiceImpl.loadAdAsync");
            abr.d("Could not fetch ad response due to an Exception.", e);
            a = null;
        }
        if (a == null) {
            a = new AdResponseParcel(0);
        }
        try {
            this.b.a(a);
        } catch (Throwable e2) {
            abr.d("Fail to forward ad response.", e2);
        }
    }
}
