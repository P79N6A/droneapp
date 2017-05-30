package com.google.android.gms.internal;

import android.content.Context;

class abv$2 implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ abv b;

    abv$2(abv com_google_android_gms_internal_abv, Context context) {
        this.b = com_google_android_gms_internal_abv;
        this.a = context;
    }

    public void run() {
        synchronized (abv.a(this.b)) {
            abv.a(this.b, this.b.c(this.a));
            abv.a(this.b).notifyAll();
        }
    }
}
