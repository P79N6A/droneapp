package com.google.android.gms.internal;

import java.util.concurrent.Callable;

class abu$1 implements Callable<Void> {
    final /* synthetic */ Runnable a;

    abu$1(Runnable runnable) {
        this.a = runnable;
    }

    public Void a() {
        this.a.run();
        return null;
    }

    public /* synthetic */ Object call() {
        return a();
    }
}
