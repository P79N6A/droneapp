package com.google.android.gms.internal;

class xk$1 implements Runnable {
    final /* synthetic */ xj a;
    final /* synthetic */ xk b;

    xk$1(xk xkVar, xj xjVar) {
        this.b = xkVar;
        this.a = xjVar;
    }

    public void run() {
        synchronized (xk.a(this.b)) {
            if (xk.b(this.b) != -2) {
                return;
            }
            xk.a(this.b, xk.c(this.b));
            if (xk.d(this.b) == null) {
                this.b.a(4);
            } else if (!xk.e(this.b) || xk.a(this.b, 1)) {
                this.a.a(this.b);
                xk.a(this.b, this.a);
            } else {
                String f = xk.f(this.b);
                abr.d(new StringBuilder(String.valueOf(f).length() + 56).append("Ignoring adapter ").append(f).append(" as delayed impression is not supported").toString());
                this.b.a(2);
            }
        }
    }
}
