package com.android.volley;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

public class h extends Thread {
    private final BlockingQueue<n<?>> a;
    private final g b;
    private final b c;
    private final q d;
    private volatile boolean e = false;

    public h(BlockingQueue<n<?>> blockingQueue, g gVar, b bVar, q qVar) {
        this.a = blockingQueue;
        this.b = gVar;
        this.c = bVar;
        this.d = qVar;
    }

    @TargetApi(14)
    private void a(n<?> nVar) {
        if (VERSION.SDK_INT >= 14) {
            TrafficStats.setThreadStatsTag(nVar.d());
        }
    }

    private void a(n<?> nVar, u uVar) {
        this.d.a((n) nVar, nVar.a(uVar));
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
                n nVar = (n) this.a.take();
                try {
                    nVar.a("network-queue-take");
                    if (nVar.m()) {
                        nVar.b("network-discard-cancelled");
                    } else {
                        a(nVar);
                        j a = this.b.a(nVar);
                        nVar.a("network-http-complete");
                        if (a.d && nVar.B()) {
                            nVar.b("not-modified");
                        } else {
                            p a2 = nVar.a(a);
                            nVar.a("network-parse-complete");
                            if (nVar.w() && a2.b != null) {
                                this.c.a(nVar.j(), a2.b);
                                nVar.a("network-cache-written");
                            }
                            nVar.A();
                            this.d.a(nVar, a2);
                        }
                    }
                } catch (u e) {
                    e.a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    a(nVar, e);
                } catch (Throwable e2) {
                    v.a(e2, "Unhandled exception %s", e2.toString());
                    u uVar = new u(e2);
                    uVar.a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    this.d.a(nVar, uVar);
                }
            } catch (InterruptedException e3) {
                if (this.e) {
                    return;
                }
            }
        }
    }
}
