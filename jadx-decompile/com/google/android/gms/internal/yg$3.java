package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.u;

class yg$3 implements Runnable {
    final /* synthetic */ AdOverlayInfoParcel a;
    final /* synthetic */ yg b;

    yg$3(yg ygVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.b = ygVar;
        this.a = adOverlayInfoParcel;
    }

    public void run() {
        u.c().a(yg.b(this.b), this.a);
    }
}
