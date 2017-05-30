package com.google.android.gms.internal;

import android.os.Process;
import com.google.android.gms.internal.ru.a;
import java.util.concurrent.BlockingQueue;

public class sv extends Thread {
    private static final boolean a = ajg.b;
    private final BlockingQueue<abd<?>> b;
    private final BlockingQueue<abd<?>> c;
    private final ru d;
    private final aeg e;
    private volatile boolean f = false;

    public sv(BlockingQueue<abd<?>> blockingQueue, BlockingQueue<abd<?>> blockingQueue2, ru ruVar, aeg com_google_android_gms_internal_aeg) {
        super("VolleyCacheDispatcher");
        this.b = blockingQueue;
        this.c = blockingQueue2;
        this.d = ruVar;
        this.e = com_google_android_gms_internal_aeg;
    }

    public void a() {
        this.f = true;
        interrupt();
    }

    public void run() {
        if (a) {
            ajg.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.d.a();
        while (true) {
            try {
                final abd com_google_android_gms_internal_abd = (abd) this.b.take();
                com_google_android_gms_internal_abd.b("cache-queue-take");
                if (com_google_android_gms_internal_abd.f()) {
                    com_google_android_gms_internal_abd.c("cache-discard-canceled");
                } else {
                    a a = this.d.a(com_google_android_gms_internal_abd.d());
                    if (a == null) {
                        com_google_android_gms_internal_abd.b("cache-miss");
                        this.c.put(com_google_android_gms_internal_abd);
                    } else if (a.a()) {
                        com_google_android_gms_internal_abd.b("cache-hit-expired");
                        com_google_android_gms_internal_abd.a(a);
                        this.c.put(com_google_android_gms_internal_abd);
                    } else {
                        com_google_android_gms_internal_abd.b("cache-hit");
                        adf a2 = com_google_android_gms_internal_abd.a(new zb(a.a, a.g));
                        com_google_android_gms_internal_abd.b("cache-hit-parsed");
                        if (a.b()) {
                            com_google_android_gms_internal_abd.b("cache-hit-refresh-needed");
                            com_google_android_gms_internal_abd.a(a);
                            a2.d = true;
                            this.e.a(com_google_android_gms_internal_abd, a2, new Runnable(this) {
                                final /* synthetic */ sv b;

                                public void run() {
                                    try {
                                        this.b.c.put(com_google_android_gms_internal_abd);
                                    } catch (InterruptedException e) {
                                    }
                                }
                            });
                        } else {
                            this.e.a(com_google_android_gms_internal_abd, a2);
                        }
                    }
                }
            } catch (InterruptedException e) {
                if (this.f) {
                    return;
                }
            }
        }
    }
}
