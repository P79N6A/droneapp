package com.google.android.gms.internal;

import java.util.concurrent.Callable;

class ue$1 implements Callable<T> {
    final /* synthetic */ ub a;
    final /* synthetic */ ue b;

    ue$1(ue ueVar, ub ubVar) {
        this.b = ueVar;
        this.a = ubVar;
    }

    public T call() {
        return this.a.a(ue.a(this.b));
    }
}
