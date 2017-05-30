package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.n;
import java.util.concurrent.CountDownLatch;

class zr$1 implements Runnable {
    final /* synthetic */ CountDownLatch a;
    final /* synthetic */ zr b;

    zr$1(zr zrVar, CountDownLatch countDownLatch) {
        this.b = zrVar;
        this.a = countDownLatch;
    }

    public void run() {
        synchronized (this.b.d) {
            zr.a(this.b, n.a(zr.a(this.b), this.b.h, this.a));
        }
    }
}
