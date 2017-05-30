package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.support.annotation.NonNull;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.common.util.e;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

public class ai extends b {
    private static final AtomicLong j = new AtomicLong(Long.MIN_VALUE);
    private d a;
    private d b;
    private final PriorityBlockingQueue<FutureTask<?>> c = new PriorityBlockingQueue();
    private final BlockingQueue<FutureTask<?>> d = new LinkedBlockingQueue();
    private final UncaughtExceptionHandler e = new b(this, "Thread death: Uncaught exception on worker thread");
    private final UncaughtExceptionHandler f = new b(this, "Thread death: Uncaught exception on network thread");
    private final Object g = new Object();
    private final Semaphore h = new Semaphore(2);
    private volatile boolean i;

    static class a extends RuntimeException {
    }

    private final class b implements UncaughtExceptionHandler {
        final /* synthetic */ ai a;
        private final String b;

        public b(ai aiVar, String str) {
            this.a = aiVar;
            com.google.android.gms.common.internal.d.a(str);
            this.b = str;
        }

        public synchronized void uncaughtException(Thread thread, Throwable th) {
            this.a.w().f().a(this.b, th);
        }
    }

    private final class c<V> extends FutureTask<V> implements Comparable<c> {
        final /* synthetic */ ai a;
        private final long b = ai.j.getAndIncrement();
        private final boolean c;
        private final String d;

        c(ai aiVar, Runnable runnable, boolean z, String str) {
            this.a = aiVar;
            super(runnable, null);
            com.google.android.gms.common.internal.d.a(str);
            this.d = str;
            this.c = z;
            if (this.b == Long.MAX_VALUE) {
                aiVar.w().f().a("Tasks index overflow");
            }
        }

        c(ai aiVar, Callable<V> callable, boolean z, String str) {
            this.a = aiVar;
            super(callable);
            com.google.android.gms.common.internal.d.a(str);
            this.d = str;
            this.c = z;
            if (this.b == Long.MAX_VALUE) {
                aiVar.w().f().a("Tasks index overflow");
            }
        }

        public int a(@NonNull c cVar) {
            if (this.c != cVar.c) {
                return this.c ? -1 : 1;
            } else {
                if (this.b < cVar.b) {
                    return -1;
                }
                if (this.b > cVar.b) {
                    return 1;
                }
                this.a.w().g().a("Two tasks share the same index. index", Long.valueOf(this.b));
                return 0;
            }
        }

        public /* synthetic */ int compareTo(@NonNull Object obj) {
            return a((c) obj);
        }

        protected void setException(Throwable th) {
            this.a.w().f().a(this.d, th);
            if (th instanceof a) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
            super.setException(th);
        }
    }

    private final class d extends Thread {
        final /* synthetic */ ai a;
        private final Object b = new Object();
        private final BlockingQueue<FutureTask<?>> c;

        public d(ai aiVar, String str, BlockingQueue<FutureTask<?>> blockingQueue) {
            this.a = aiVar;
            com.google.android.gms.common.internal.d.a(str);
            com.google.android.gms.common.internal.d.a(blockingQueue);
            this.c = blockingQueue;
            setName(str);
        }

        private void a(InterruptedException interruptedException) {
            this.a.w().z().a(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
        }

        public void a() {
            synchronized (this.b) {
                this.b.notifyAll();
            }
        }

        public void run() {
            Object obj = null;
            while (obj == null) {
                try {
                    this.a.h.acquire();
                    obj = 1;
                } catch (InterruptedException e) {
                    a(e);
                }
            }
            while (true) {
                try {
                    FutureTask futureTask = (FutureTask) this.c.poll();
                    if (futureTask != null) {
                        futureTask.run();
                    } else {
                        synchronized (this.b) {
                            if (this.c.peek() == null && !this.a.i) {
                                try {
                                    this.b.wait(NotificationOptions.b);
                                } catch (InterruptedException e2) {
                                    a(e2);
                                }
                            }
                        }
                        synchronized (this.a.g) {
                            if (this.c.peek() == null) {
                                break;
                            }
                        }
                    }
                } catch (Throwable th) {
                    synchronized (this.a.g) {
                        this.a.h.release();
                        this.a.g.notifyAll();
                        if (this == this.a.a) {
                            this.a.a = null;
                        } else if (this == this.a.b) {
                            this.a.b = null;
                        } else {
                            this.a.w().f().a("Current scheduler thread is neither worker nor network");
                        }
                    }
                }
            }
            synchronized (this.a.g) {
                this.a.h.release();
                this.a.g.notifyAll();
                if (this == this.a.a) {
                    this.a.a = null;
                } else if (this == this.a.b) {
                    this.a.b = null;
                } else {
                    this.a.w().f().a("Current scheduler thread is neither worker nor network");
                }
            }
        }
    }

    ai(aj ajVar) {
        super(ajVar);
    }

    private void a(c<?> cVar) {
        synchronized (this.g) {
            this.c.add(cVar);
            if (this.a == null) {
                this.a = new d(this, "Measurement Worker", this.c);
                this.a.setUncaughtExceptionHandler(this.e);
                this.a.start();
            } else {
                this.a.a();
            }
        }
    }

    private void a(FutureTask<?> futureTask) {
        synchronized (this.g) {
            this.d.add(futureTask);
            if (this.b == null) {
                this.b = new d(this, "Measurement Network", this.d);
                this.b.setUncaughtExceptionHandler(this.f);
                this.b.start();
            } else {
                this.b.a();
            }
        }
    }

    public <V> Future<V> a(Callable<V> callable) {
        c();
        com.google.android.gms.common.internal.d.a(callable);
        c cVar = new c(this, (Callable) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.a) {
            cVar.run();
        } else {
            a(cVar);
        }
        return cVar;
    }

    public void a(Runnable runnable) {
        c();
        com.google.android.gms.common.internal.d.a(runnable);
        a(new c(this, runnable, false, "Task exception on worker thread"));
    }

    public <V> Future<V> b(Callable<V> callable) {
        c();
        com.google.android.gms.common.internal.d.a(callable);
        c cVar = new c(this, (Callable) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.a) {
            cVar.run();
        } else {
            a(cVar);
        }
        return cVar;
    }

    public void b(Runnable runnable) {
        c();
        com.google.android.gms.common.internal.d.a(runnable);
        a(new c(this, runnable, false, "Task exception on network thread"));
    }

    protected void e() {
    }

    public /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    public void i() {
        if (Thread.currentThread() != this.b) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public void j() {
        if (Thread.currentThread() != this.a) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public /* bridge */ /* synthetic */ o k() {
        return super.k();
    }

    public /* bridge */ /* synthetic */ d l() {
        return super.l();
    }

    public /* bridge */ /* synthetic */ z m() {
        return super.m();
    }

    public /* bridge */ /* synthetic */ s n() {
        return super.n();
    }

    public /* bridge */ /* synthetic */ e o() {
        return super.o();
    }

    public /* bridge */ /* synthetic */ e p() {
        return super.p();
    }

    public /* bridge */ /* synthetic */ Context q() {
        return super.q();
    }

    public /* bridge */ /* synthetic */ q r() {
        return super.r();
    }

    public /* bridge */ /* synthetic */ m s() {
        return super.s();
    }

    public /* bridge */ /* synthetic */ ah t() {
        return super.t();
    }

    public /* bridge */ /* synthetic */ g u() {
        return super.u();
    }

    public /* bridge */ /* synthetic */ ai v() {
        return super.v();
    }

    public /* bridge */ /* synthetic */ ab w() {
        return super.w();
    }

    public /* bridge */ /* synthetic */ af x() {
        return super.x();
    }

    public /* bridge */ /* synthetic */ p y() {
        return super.y();
    }
}
