package com.google.android.gms.internal;

class zp$1 implements Runnable {
    final /* synthetic */ abi a;
    final /* synthetic */ zp b;

    zp$1(zp zpVar, abi com_google_android_gms_internal_abi) {
        this.b = zpVar;
        this.a = com_google_android_gms_internal_abi;
    }

    public void run() {
        zp.a(this.b).b(this.a);
    }
}
