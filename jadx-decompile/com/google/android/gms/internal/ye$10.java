package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.b;

class ye$10 implements Runnable {
    final /* synthetic */ ye a;

    ye$10(ye yeVar) {
        this.a = yeVar;
    }

    public void run() {
        try {
            ye.a(this.a).e();
        } catch (Throwable e) {
            b.d("Could not call onAdLoaded.", e);
        }
    }
}
