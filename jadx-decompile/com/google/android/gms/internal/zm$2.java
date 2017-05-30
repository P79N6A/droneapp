package com.google.android.gms.internal;

class zm$2 implements Runnable {
    final /* synthetic */ abi a;
    final /* synthetic */ zm b;

    zm$2(zm zmVar, abi com_google_android_gms_internal_abi) {
        this.b = zmVar;
        this.a = com_google_android_gms_internal_abi;
    }

    public void run() {
        synchronized (this.b.c) {
            this.b.a(this.a);
        }
    }
}
