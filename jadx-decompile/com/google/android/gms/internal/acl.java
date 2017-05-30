package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.u;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@aaa
public class acl<T> implements aco<T> {
    private final Object a = new Object();
    private T b;
    private Throwable c;
    private boolean d;
    private boolean e;
    private final acp f = new acp();

    private boolean a() {
        return this.c != null || this.d;
    }

    public void a(Runnable runnable) {
        this.f.a(runnable);
    }

    public void a(Throwable th) {
        synchronized (this.a) {
            if (this.e) {
            } else if (a()) {
                u.i().a(new IllegalStateException("Provided CallbackFuture with multiple values."), "CallbackFuture.provideException");
            } else {
                this.c = th;
                this.a.notifyAll();
                this.f.a();
            }
        }
    }

    public void b(@Nullable T t) {
        synchronized (this.a) {
            if (this.e) {
            } else if (a()) {
                u.i().a(new IllegalStateException("Provided CallbackFuture with multiple values."), "CallbackFuture.provideValue");
            } else {
                this.d = true;
                this.b = t;
                this.a.notifyAll();
                this.f.a();
            }
        }
    }

    public void b(Runnable runnable) {
        this.f.b(runnable);
    }

    public boolean cancel(boolean z) {
        if (!z) {
            return false;
        }
        synchronized (this.a) {
            if (a()) {
                return false;
            }
            this.e = true;
            this.d = true;
            this.a.notifyAll();
            this.f.a();
            return true;
        }
    }

    public T get() {
        T t;
        synchronized (this.a) {
            if (!a()) {
                try {
                    this.a.wait();
                } catch (InterruptedException e) {
                    throw e;
                }
            }
            if (this.c != null) {
                throw new ExecutionException(this.c);
            } else if (this.e) {
                throw new CancellationException("CallbackFuture was cancelled.");
            } else {
                t = this.b;
            }
        }
        return t;
    }

    public T get(long j, TimeUnit timeUnit) {
        T t;
        synchronized (this.a) {
            if (!a()) {
                try {
                    long toMillis = timeUnit.toMillis(j);
                    if (toMillis != 0) {
                        this.a.wait(toMillis);
                    }
                } catch (InterruptedException e) {
                    throw e;
                }
            }
            if (this.c != null) {
                throw new ExecutionException(this.c);
            } else if (!this.d) {
                throw new TimeoutException("CallbackFuture timed out.");
            } else if (this.e) {
                throw new CancellationException("CallbackFuture was cancelled.");
            } else {
                t = this.b;
            }
        }
        return t;
    }

    public boolean isCancelled() {
        boolean z;
        synchronized (this.a) {
            z = this.e;
        }
        return z;
    }

    public boolean isDone() {
        boolean a;
        synchronized (this.a) {
            a = a();
        }
        return a;
    }
}
