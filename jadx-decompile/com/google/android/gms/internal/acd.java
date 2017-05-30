package com.google.android.gms.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.d;

@aaa
public class acd {
    private HandlerThread a = null;
    private Handler b = null;
    private int c = 0;
    private final Object d = new Object();

    public Looper a() {
        Looper looper;
        synchronized (this.d) {
            if (this.c != 0) {
                d.a(this.a, (Object) "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.a == null) {
                abr.e("Starting the looper thread.");
                this.a = new HandlerThread("LooperProvider");
                this.a.start();
                this.b = new Handler(this.a.getLooper());
                abr.e("Looper thread started.");
            } else {
                abr.e("Resuming the looper thread");
                this.d.notifyAll();
            }
            this.c++;
            looper = this.a.getLooper();
        }
        return looper;
    }

    public void b() {
        synchronized (this.d) {
            d.b(this.c > 0, "Invalid state: release() called more times than expected.");
            int i = this.c - 1;
            this.c = i;
            if (i == 0) {
                this.b.post(new 1(this));
            }
        }
    }
}
