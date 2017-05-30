package com.google.android.gms.internal;

class xo$1 implements Runnable {
    final /* synthetic */ xl a;
    final /* synthetic */ xo b;

    xo$1(xo xoVar, xl xlVar) {
        this.b = xoVar;
        this.a = xlVar;
    }

    public void run() {
        try {
            this.a.c.c();
        } catch (Throwable e) {
            abr.d("Could not destroy mediation adapter.", e);
        }
    }
}
