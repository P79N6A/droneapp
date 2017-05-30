package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.b;

class ye$9 implements Runnable {
    final /* synthetic */ ye a;

    ye$9(ye yeVar) {
        this.a = yeVar;
    }

    public void run() {
        try {
            ye.a(this.a).d();
        } catch (Throwable e) {
            b.d("Could not call onAdOpened.", e);
        }
    }
}
