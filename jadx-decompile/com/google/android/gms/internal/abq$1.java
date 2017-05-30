package com.google.android.gms.internal;

class abq$1 implements Runnable {
    final /* synthetic */ abq a;

    abq$1(abq com_google_android_gms_internal_abq) {
        this.a = com_google_android_gms_internal_abq;
    }

    public final void run() {
        abq.a(this.a, Thread.currentThread());
        this.a.a();
    }
}
