package com.android.volley;

import android.os.Process;
import com.android.volley.b.a;
import java.util.concurrent.BlockingQueue;

public class c extends Thread {
    private static final boolean a = v.b;
    private final BlockingQueue<n<?>> b;
    private final BlockingQueue<n<?>> c;
    private final b d;
    private final q e;
    private volatile boolean f = false;

    public c(BlockingQueue<n<?>> blockingQueue, BlockingQueue<n<?>> blockingQueue2, b bVar, q qVar) {
        this.b = blockingQueue;
        this.c = blockingQueue2;
        this.d = bVar;
        this.e = qVar;
    }

    public void a() {
        this.f = true;
        interrupt();
    }

    public void run() {
        if (a) {
            v.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.d.a();
        while (true) {
            try {
                final n nVar = (n) this.b.take();
                try {
                    nVar.a("cache-queue-take");
                    if (nVar.m()) {
                        nVar.b("cache-discard-canceled");
                    } else {
                        a a = this.d.a(nVar.j());
                        if (a == null) {
                            nVar.a("cache-miss");
                            this.c.put(nVar);
                        } else if (a.a()) {
                            nVar.a("cache-hit-expired");
                            nVar.a(a);
                            this.c.put(nVar);
                        } else {
                            nVar.a("cache-hit");
                            p a2 = nVar.a(new j(a.a, a.g));
                            nVar.a("cache-hit-parsed");
                            if (a.b()) {
                                nVar.a("cache-hit-refresh-needed");
                                nVar.a(a);
                                a2.d = true;
                                this.e.a(nVar, a2, new Runnable(this) {
                                    final /* synthetic */ c b;

                                    public void run() {
                                        try {
                                            this.b.c.put(nVar);
                                        } catch (InterruptedException e) {
                                        }
                                    }
                                });
                            } else {
                                this.e.a(nVar, a2);
                            }
                        }
                    }
                } catch (Throwable e) {
                    v.a(e, "Unhandled exception %s", e.toString());
                }
            } catch (InterruptedException e2) {
                if (this.f) {
                    return;
                }
            }
        }
    }
}
