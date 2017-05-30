package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.b;

class ye$3 implements Runnable {
    final /* synthetic */ ye a;

    ye$3(ye yeVar) {
        this.a = yeVar;
    }

    public void run() {
        try {
            ye.a(this.a).c();
        } catch (Throwable e) {
            b.d("Could not call onAdLeftApplication.", e);
        }
    }
}
