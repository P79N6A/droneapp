package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.b;

class ye$1 implements Runnable {
    final /* synthetic */ ye a;

    ye$1(ye yeVar) {
        this.a = yeVar;
    }

    public void run() {
        try {
            ye.a(this.a).a();
        } catch (Throwable e) {
            b.d("Could not call onAdClicked.", e);
        }
    }
}
