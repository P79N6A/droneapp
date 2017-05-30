package com.google.android.gms.internal;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class ix implements ig {
    private final ThreadPoolExecutor a;

    public ix(final ThreadFactory threadFactory, final iw iwVar) {
        int i = 1;
        this.a = new ThreadPoolExecutor(1, i, 3, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory(this) {
            final /* synthetic */ ix c;

            public Thread newThread(Runnable runnable) {
                Thread newThread = threadFactory.newThread(runnable);
                iwVar.a(newThread, "FirebaseDatabaseEventTarget");
                iwVar.a(newThread, true);
                return newThread;
            }
        });
    }

    public void a() {
        this.a.setCorePoolSize(0);
    }

    public void a(Runnable runnable) {
        this.a.execute(runnable);
    }

    public void b() {
        this.a.setCorePoolSize(1);
    }
}
