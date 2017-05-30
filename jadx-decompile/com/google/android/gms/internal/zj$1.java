package com.google.android.gms.internal;

class zj$1 implements Runnable {
    final /* synthetic */ zj a;

    zj$1(zj zjVar) {
        this.a = zjVar;
    }

    public void run() {
        if (zj.a(this.a).get()) {
            abr.b("Timed out waiting for WebView to finish loading.");
            this.a.d();
        }
    }
}
