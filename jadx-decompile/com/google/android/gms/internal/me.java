package com.google.android.gms.internal;

import com.google.firebase.database.d;
import com.google.firebase.database.g;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public abstract class me implements ip {
    private ScheduledThreadPoolExecutor a = new ScheduledThreadPoolExecutor(this, 1, new a()) {
        final /* synthetic */ me a;

        protected void afterExecute(Runnable runnable, Throwable th) {
            super.afterExecute(runnable, th);
            if (th == null && (runnable instanceof Future)) {
                Future future = (Future) runnable;
                try {
                    if (future.isDone()) {
                        future.get();
                    }
                } catch (CancellationException e) {
                } catch (ExecutionException e2) {
                    th = e2.getCause();
                } catch (InterruptedException e3) {
                    Thread.currentThread().interrupt();
                }
            }
            if (th != null) {
                this.a.a(th);
            }
        }
    };

    private class a implements ThreadFactory {
        final /* synthetic */ me a;

        private a(me meVar) {
            this.a = meVar;
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = this.a.a().newThread(runnable);
            iw b = this.a.b();
            b.a(newThread, "FirebaseDatabaseWorker");
            b.a(newThread, true);
            b.a(newThread, new UncaughtExceptionHandler(this) {
                final /* synthetic */ a a;

                {
                    this.a = r1;
                }

                public void uncaughtException(Thread thread, Throwable th) {
                    this.a.a.a(th);
                }
            });
            return newThread;
        }
    }

    public me() {
        this.a.setKeepAliveTime(3, TimeUnit.SECONDS);
    }

    public static String b(Throwable th) {
        if (th instanceof OutOfMemoryError) {
            return "Firebase Database encountered an OutOfMemoryError. You may need to reduce the amount of data you are syncing to the client (e.g. by using queries or syncing a deeper path). See https://firebase.google.com/docs/database/ios/structure-data#best_practices_for_data_structure and https://firebase.google.com/docs/database/android/retrieve-data#filtering_data";
        }
        if (th instanceof d) {
            return "";
        }
        String valueOf = String.valueOf(g.g());
        return new StringBuilder(String.valueOf(valueOf).length() + 104).append("Uncaught exception in Firebase Database runloop (").append(valueOf).append("). Please report to firebase-database-client@google.com").toString();
    }

    protected ThreadFactory a() {
        return Executors.defaultThreadFactory();
    }

    public void a(Runnable runnable) {
        this.a.execute(runnable);
    }

    public abstract void a(Throwable th);

    protected iw b() {
        return iw.a;
    }

    public void c() {
        this.a.setCorePoolSize(0);
    }

    public void d() {
        this.a.setCorePoolSize(1);
    }

    public ScheduledExecutorService e() {
        return this.a;
    }
}
