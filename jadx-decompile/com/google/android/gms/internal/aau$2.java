package com.google.android.gms.internal;

import com.google.android.gms.internal.abi.a;

class aau$2 implements Runnable {
    final /* synthetic */ a a;
    final /* synthetic */ aau b;

    aau$2(aau com_google_android_gms_internal_aau, a aVar) {
        this.b = com_google_android_gms_internal_aau;
        this.a = aVar;
    }

    public void run() {
        this.b.b(new abi(this.a, null, null, null, null, null, null, null));
    }
}
