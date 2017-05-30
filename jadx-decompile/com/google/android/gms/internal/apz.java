package com.google.android.gms.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

class apz {

    private static class a {
        private static final ExecutorService a = Executors.newSingleThreadExecutor(new ThreadFactory() {
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "google-tag-manager-background-thread");
            }
        });
    }

    private static class b {
        private static final ScheduledExecutorService a = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() {
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "google-tag-manager-scheduler-thread");
            }
        });
    }

    static ExecutorService a() {
        return a.a;
    }

    static ScheduledExecutorService b() {
        return b.a;
    }
}
