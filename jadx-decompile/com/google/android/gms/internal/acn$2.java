package com.google.android.gms.internal;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

class acn$2 implements Runnable {
    final /* synthetic */ AtomicInteger a;
    final /* synthetic */ int b;
    final /* synthetic */ acl c;
    final /* synthetic */ List d;

    acn$2(AtomicInteger atomicInteger, int i, acl com_google_android_gms_internal_acl, List list) {
        this.a = atomicInteger;
        this.b = i;
        this.c = com_google_android_gms_internal_acl;
        this.d = list;
    }

    public void run() {
        Throwable e;
        if (this.a.incrementAndGet() >= this.b) {
            try {
                this.c.b(acn.b(this.d));
                return;
            } catch (ExecutionException e2) {
                e = e2;
            } catch (InterruptedException e3) {
                e = e3;
            }
        } else {
            return;
        }
        abr.d("Unable to convert list of futures to a future of list", e);
    }
}
