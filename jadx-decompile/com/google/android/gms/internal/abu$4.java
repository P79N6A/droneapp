package com.google.android.gms.internal;

import java.util.concurrent.Future;

class abu$4 implements Runnable {
    final /* synthetic */ acl a;
    final /* synthetic */ Future b;

    abu$4(acl com_google_android_gms_internal_acl, Future future) {
        this.a = com_google_android_gms_internal_acl;
        this.b = future;
    }

    public void run() {
        if (this.a.isCancelled()) {
            this.b.cancel(true);
        }
    }
}
