package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.b;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@aaa
public final class abu {
    private static final ThreadPoolExecutor a = new ThreadPoolExecutor(10, 10, 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), a("Default"));
    private static final ThreadPoolExecutor b = new ThreadPoolExecutor(5, 5, 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), a("Loader"));

    static {
        a.allowCoreThreadTimeOut(true);
        b.allowCoreThreadTimeOut(true);
    }

    public static aco<Void> a(int i, Runnable runnable) {
        return i == 1 ? a(b, new 1(runnable)) : a(a, new 2(runnable));
    }

    public static aco<Void> a(Runnable runnable) {
        return a(0, runnable);
    }

    public static <T> aco<T> a(Callable<T> callable) {
        return a(a, (Callable) callable);
    }

    public static <T> aco<T> a(ExecutorService executorService, Callable<T> callable) {
        Object com_google_android_gms_internal_acl = new acl();
        try {
            com_google_android_gms_internal_acl.b(new 4(com_google_android_gms_internal_acl, executorService.submit(new 3(com_google_android_gms_internal_acl, callable))));
        } catch (Throwable e) {
            b.d("Thread execution is rejected.", e);
            com_google_android_gms_internal_acl.cancel(true);
        }
        return com_google_android_gms_internal_acl;
    }

    private static ThreadFactory a(String str) {
        return new 5(str);
    }
}
