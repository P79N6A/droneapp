package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.b;

class ye$6 implements Runnable {
    final /* synthetic */ ye a;

    ye$6(ye yeVar) {
        this.a = yeVar;
    }

    public void run() {
        try {
            ye.a(this.a).b();
        } catch (Throwable e) {
            b.d("Could not call onAdClosed.", e);
        }
    }
}
