package com.fimi.kernel.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class x {
    private static ExecutorService a;

    public static synchronized ExecutorService a() {
        ExecutorService executorService;
        synchronized (x.class) {
            if (a == null) {
                a = Executors.newCachedThreadPool();
            }
            executorService = a;
        }
        return executorService;
    }

    public static void a(Runnable runnable) {
        a().execute(runnable);
    }

    public static void b() {
        if (a != null) {
            a.shutdownNow();
            a = null;
        }
    }

    public static void b(Runnable runnable) {
        a().execute(runnable);
    }
}
