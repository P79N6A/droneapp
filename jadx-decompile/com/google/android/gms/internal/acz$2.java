package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.overlay.d;

class acz$2 implements Runnable {
    final /* synthetic */ acz a;

    acz$2(acz com_google_android_gms_internal_acz) {
        this.a = com_google_android_gms_internal_acz;
    }

    public void run() {
        this.a.a.B();
        d i = this.a.a.i();
        if (i != null) {
            i.m();
        }
        if (acz.a(this.a) != null) {
            acz.a(this.a).a();
            acz.a(this.a, null);
        }
    }
}
