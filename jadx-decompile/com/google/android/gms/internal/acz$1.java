package com.google.android.gms.internal;

class acz$1 implements Runnable {
    final /* synthetic */ acz a;

    acz$1(acz com_google_android_gms_internal_acz) {
        this.a = com_google_android_gms_internal_acz;
    }

    public void run() {
        if (this.a.b != null) {
            this.a.b.a(this.a.a.b());
        }
    }
}
