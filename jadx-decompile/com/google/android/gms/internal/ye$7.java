package com.google.android.gms.internal;

import com.google.ads.a.a;
import com.google.android.gms.ads.internal.util.client.b;

class ye$7 implements Runnable {
    final /* synthetic */ a a;
    final /* synthetic */ ye b;

    ye$7(ye yeVar, a aVar) {
        this.b = yeVar;
        this.a = aVar;
    }

    public void run() {
        try {
            ye.a(this.b).a(yf.a(this.a));
        } catch (Throwable e) {
            b.d("Could not call onAdFailedToLoad.", e);
        }
    }
}
