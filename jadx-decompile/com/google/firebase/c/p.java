package com.google.firebase.c;

import android.support.annotation.NonNull;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class p {
    public static p a = new p();
    private static BlockingQueue<Runnable> b = new LinkedBlockingQueue(128);
    private static final ThreadPoolExecutor c = new ThreadPoolExecutor(5, 5, 5, TimeUnit.SECONDS, b, new a("Command-"));
    private static BlockingQueue<Runnable> d = new LinkedBlockingQueue(128);
    private static final ThreadPoolExecutor e = new ThreadPoolExecutor(2, 2, 5, TimeUnit.SECONDS, d, new a("Upload-"));
    private static BlockingQueue<Runnable> f = new LinkedBlockingQueue(128);
    private static final ThreadPoolExecutor g = new ThreadPoolExecutor(3, 3, 5, TimeUnit.SECONDS, f, new a("Download-"));
    private static BlockingQueue<Runnable> h = new LinkedBlockingQueue(128);
    private static final ThreadPoolExecutor i = new ThreadPoolExecutor(1, 1, 5, TimeUnit.SECONDS, h, new a("Callbacks-"));

    static class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);
        private final String b;

        a(@NonNull String str) {
            this.b = str;
        }

        public Thread newThread(@NonNull Runnable runnable) {
            String str = this.b;
            Thread thread = new Thread(runnable, new StringBuilder(String.valueOf(str).length() + 27).append("FirebaseStorage-").append(str).append(this.a.getAndIncrement()).toString());
            thread.setDaemon(false);
            thread.setPriority(9);
            return thread;
        }
    }

    static {
        c.allowCoreThreadTimeOut(true);
        e.allowCoreThreadTimeOut(true);
        g.allowCoreThreadTimeOut(true);
        i.allowCoreThreadTimeOut(true);
    }

    public static p a() {
        return a;
    }

    public void a(Runnable runnable) {
        c.execute(runnable);
    }

    public void b(Runnable runnable) {
        e.execute(runnable);
    }

    public void c(Runnable runnable) {
        g.execute(runnable);
    }

    public void d(Runnable runnable) {
        i.execute(runnable);
    }
}
