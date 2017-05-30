package com.google.android.gms.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

class acn$1 implements Runnable {
    final /* synthetic */ acl a;
    final /* synthetic */ acn$a b;
    final /* synthetic */ aco c;

    acn$1(acl com_google_android_gms_internal_acl, acn$a com_google_android_gms_internal_acn_a, aco com_google_android_gms_internal_aco) {
        this.a = com_google_android_gms_internal_acl;
        this.b = com_google_android_gms_internal_acn_a;
        this.c = com_google_android_gms_internal_aco;
    }

    public void run() {
        try {
            this.a.b(this.b.a(this.c.get()));
            return;
        } catch (CancellationException e) {
        } catch (InterruptedException e2) {
        } catch (ExecutionException e3) {
        }
        this.a.cancel(true);
    }
}
