package com.google.android.gms.internal;

import java.util.concurrent.Callable;

class xn$1 implements Callable<xl> {
    final /* synthetic */ xk a;
    final /* synthetic */ xn b;

    xn$1(xn xnVar, xk xkVar) {
        this.b = xnVar;
        this.a = xkVar;
    }

    public xl a() {
        synchronized (xn.a(this.b)) {
            if (xn.b(this.b)) {
                return null;
            }
            return this.a.a(xn.c(this.b), xn.d(this.b));
        }
    }

    public /* synthetic */ Object call() {
        return a();
    }
}
