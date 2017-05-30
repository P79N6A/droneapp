package com.google.android.gms.internal;

class acd$1 implements Runnable {
    final /* synthetic */ acd a;

    acd$1(acd com_google_android_gms_internal_acd) {
        this.a = com_google_android_gms_internal_acd;
    }

    public void run() {
        synchronized (acd.a(this.a)) {
            abr.e("Suspending the looper thread");
            while (acd.b(this.a) == 0) {
                try {
                    acd.a(this.a).wait();
                    abr.e("Looper thread resumed");
                } catch (InterruptedException e) {
                    abr.e("Looper thread interrupted.");
                }
            }
        }
    }
}
