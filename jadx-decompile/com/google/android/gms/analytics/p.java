package com.google.android.gms.analytics;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.ado;
import com.google.android.gms.internal.adt;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class p {
    private static volatile p a;
    private final Context b;
    private final List<q> c = new CopyOnWriteArrayList();
    private final k d = new k();
    private final a e = new a(this);
    private volatile ado f;
    private UncaughtExceptionHandler g;

    private class a extends ThreadPoolExecutor {
        final /* synthetic */ p a;

        public a(p pVar) {
            this.a = pVar;
            super(1, 1, 1, TimeUnit.MINUTES, new LinkedBlockingQueue());
            setThreadFactory(new b());
            allowCoreThreadTimeOut(true);
        }

        protected <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
            return new FutureTask<T>(this, runnable, t) {
                final /* synthetic */ a a;

                protected void setException(Throwable th) {
                    UncaughtExceptionHandler b = this.a.a.g;
                    if (b != null) {
                        b.uncaughtException(Thread.currentThread(), th);
                    } else if (Log.isLoggable("GAv4", 6)) {
                        String valueOf = String.valueOf(th);
                        Log.e("GAv4", new StringBuilder(String.valueOf(valueOf).length() + 37).append("MeasurementExecutor: job failed with ").append(valueOf).toString());
                    }
                    super.setException(th);
                }
            };
        }
    }

    private static class b implements ThreadFactory {
        private static final AtomicInteger a = new AtomicInteger();

        private b() {
        }

        public Thread newThread(Runnable runnable) {
            return new c(runnable, "measurement-" + a.incrementAndGet());
        }
    }

    private static class c extends Thread {
        c(Runnable runnable, String str) {
            super(runnable, str);
        }

        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    p(Context context) {
        Object applicationContext = context.getApplicationContext();
        d.a(applicationContext);
        this.b = applicationContext;
    }

    public static p a(Context context) {
        d.a((Object) context);
        if (a == null) {
            synchronized (p.class) {
                if (a == null) {
                    a = new p(context);
                }
            }
        }
        return a;
    }

    private void b(l lVar) {
        d.c("deliver should be called from worker thread");
        d.b(lVar.f(), "Measurement must be submitted");
        List<r> c = lVar.c();
        if (!c.isEmpty()) {
            Set hashSet = new HashSet();
            for (r rVar : c) {
                Uri a = rVar.a();
                if (!hashSet.contains(a)) {
                    hashSet.add(a);
                    rVar.a(lVar);
                }
            }
        }
    }

    public static void d() {
        if (!(Thread.currentThread() instanceof c)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public ado a() {
        if (this.f == null) {
            synchronized (this) {
                if (this.f == null) {
                    ado com_google_android_gms_internal_ado = new ado();
                    PackageManager packageManager = this.b.getPackageManager();
                    String packageName = this.b.getPackageName();
                    com_google_android_gms_internal_ado.c(packageName);
                    com_google_android_gms_internal_ado.d(packageManager.getInstallerPackageName(packageName));
                    String str = null;
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(this.b.getPackageName(), 0);
                        if (packageInfo != null) {
                            CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (!TextUtils.isEmpty(applicationLabel)) {
                                packageName = applicationLabel.toString();
                            }
                            str = packageInfo.versionName;
                        }
                    } catch (NameNotFoundException e) {
                        String str2 = "GAv4";
                        String str3 = "Error retrieving package info: appName set to ";
                        String valueOf = String.valueOf(packageName);
                        Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                    }
                    com_google_android_gms_internal_ado.a(packageName);
                    com_google_android_gms_internal_ado.b(str);
                    this.f = com_google_android_gms_internal_ado;
                }
            }
        }
        return this.f;
    }

    public <V> Future<V> a(Callable<V> callable) {
        d.a((Object) callable);
        if (!(Thread.currentThread() instanceof c)) {
            return this.e.submit(callable);
        }
        Future futureTask = new FutureTask(callable);
        futureTask.run();
        return futureTask;
    }

    void a(l lVar) {
        if (lVar.j()) {
            throw new IllegalStateException("Measurement prototype can't be submitted");
        } else if (lVar.f()) {
            throw new IllegalStateException("Measurement can only be submitted once");
        } else {
            final l a = lVar.a();
            a.g();
            this.e.execute(new Runnable(this) {
                final /* synthetic */ p b;

                public void run() {
                    a.h().a(a);
                    for (q a : this.b.c) {
                        a.a(a);
                    }
                    this.b.b(a);
                }
            });
        }
    }

    public void a(Runnable runnable) {
        d.a((Object) runnable);
        this.e.submit(runnable);
    }

    public void a(UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.g = uncaughtExceptionHandler;
    }

    public adt b() {
        DisplayMetrics displayMetrics = this.b.getResources().getDisplayMetrics();
        adt com_google_android_gms_internal_adt = new adt();
        com_google_android_gms_internal_adt.a(com.google.android.gms.analytics.internal.p.a(Locale.getDefault()));
        com_google_android_gms_internal_adt.b(displayMetrics.widthPixels);
        com_google_android_gms_internal_adt.c(displayMetrics.heightPixels);
        return com_google_android_gms_internal_adt;
    }

    public Context c() {
        return this.b;
    }
}
