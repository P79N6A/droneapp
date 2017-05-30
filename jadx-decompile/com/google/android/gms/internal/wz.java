package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

public class wz extends Thread {
    private final BlockingQueue<abd<?>> a;
    private final vy b;
    private final ru c;
    private final aeg d;
    private volatile boolean e = false;

    public wz(BlockingQueue<abd<?>> blockingQueue, vy vyVar, ru ruVar, aeg com_google_android_gms_internal_aeg) {
        super("VolleyNetworkDispatcher");
        this.a = blockingQueue;
        this.b = vyVar;
        this.c = ruVar;
        this.d = com_google_android_gms_internal_aeg;
    }

    @TargetApi(14)
    private void a(abd<?> com_google_android_gms_internal_abd_) {
        if (VERSION.SDK_INT >= 14) {
            TrafficStats.setThreadStatsTag(com_google_android_gms_internal_abd_.b());
        }
    }

    private void a(abd<?> com_google_android_gms_internal_abd_, aii com_google_android_gms_internal_aii) {
        this.d.a((abd) com_google_android_gms_internal_abd_, com_google_android_gms_internal_abd_.a(com_google_android_gms_internal_aii));
    }

    public void a() {
        this.e = true;
        interrupt();
    }

    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                abd com_google_android_gms_internal_abd = (abd) this.a.take();
                try {
                    com_google_android_gms_internal_abd.b("network-queue-take");
                    if (com_google_android_gms_internal_abd.f()) {
                        com_google_android_gms_internal_abd.c("network-discard-cancelled");
                    } else {
                        a(com_google_android_gms_internal_abd);
                        zb a = this.b.a(com_google_android_gms_internal_abd);
                        com_google_android_gms_internal_abd.b("network-http-complete");
                        if (a.d && com_google_android_gms_internal_abd.u()) {
                            com_google_android_gms_internal_abd.c("not-modified");
                        } else {
                            adf a2 = com_google_android_gms_internal_abd.a(a);
                            com_google_android_gms_internal_abd.b("network-parse-complete");
                            if (com_google_android_gms_internal_abd.p() && a2.b != null) {
                                this.c.a(com_google_android_gms_internal_abd.d(), a2.b);
                                com_google_android_gms_internal_abd.b("network-cache-written");
                            }
                            com_google_android_gms_internal_abd.t();
                            this.d.a(com_google_android_gms_internal_abd, a2);
                        }
                    }
                } catch (aii e) {
                    e.a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    a(com_google_android_gms_internal_abd, e);
                } catch (Throwable e2) {
                    ajg.a(e2, "Unhandled exception %s", e2.toString());
                    aii com_google_android_gms_internal_aii = new aii(e2);
                    com_google_android_gms_internal_aii.a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    this.d.a(com_google_android_gms_internal_abd, com_google_android_gms_internal_aii);
                }
            } catch (InterruptedException e3) {
                if (this.e) {
                    return;
                }
            }
        }
    }
}
