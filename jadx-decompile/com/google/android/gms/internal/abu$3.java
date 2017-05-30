package com.google.android.gms.internal;

import android.os.Process;
import com.google.android.gms.ads.internal.u;
import java.util.concurrent.Callable;

class abu$3 implements Runnable {
    final /* synthetic */ acl a;
    final /* synthetic */ Callable b;

    abu$3(acl com_google_android_gms_internal_acl, Callable callable) {
        this.a = com_google_android_gms_internal_acl;
        this.b = callable;
    }

    public void run() {
        try {
            Process.setThreadPriority(10);
            this.a.b(this.b.call());
        } catch (Throwable e) {
            u.i().a(e, "AdThreadPool.submit");
            this.a.a(e);
        }
    }
}
