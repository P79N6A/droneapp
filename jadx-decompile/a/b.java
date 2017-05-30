package a;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class b {
    static final int a = (f + 1);
    static final int b = ((f * 2) + 1);
    static final long c = 1;
    private static final b d = new b();
    private static final int f = Runtime.getRuntime().availableProcessors();
    private final Executor e = new a();

    private static class a implements Executor {
        private a() {
        }

        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    private b() {
    }

    public static ExecutorService a() {
        ExecutorService threadPoolExecutor = new ThreadPoolExecutor(a, b, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
        a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    public static ExecutorService a(ThreadFactory threadFactory) {
        ExecutorService threadPoolExecutor = new ThreadPoolExecutor(a, b, 1, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    @SuppressLint({"NewApi"})
    public static void a(ThreadPoolExecutor threadPoolExecutor, boolean z) {
        if (VERSION.SDK_INT >= 9) {
            threadPoolExecutor.allowCoreThreadTimeOut(z);
        }
    }

    public static Executor b() {
        return d.e;
    }
}
