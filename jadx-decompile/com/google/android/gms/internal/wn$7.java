package com.google.android.gms.internal;

class wn$7 implements Runnable {
    final /* synthetic */ wn$a a;
    final /* synthetic */ wo b;
    final /* synthetic */ wn c;

    wn$7(wn wnVar, wn$a com_google_android_gms_internal_wn_a, wo woVar) {
        this.c = wnVar;
        this.a = com_google_android_gms_internal_wn_a;
        this.b = woVar;
    }

    public void run() {
        try {
            this.a.a(this.b);
        } catch (Throwable e) {
            abr.d("Could not propagate interstitial ad event.", e);
        }
    }
}
