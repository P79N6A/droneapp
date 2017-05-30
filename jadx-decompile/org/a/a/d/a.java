package org.a.a.d;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class a<T> implements Future<T>, b {
    private final c<T> a;
    private volatile boolean b;
    private volatile boolean c;
    private volatile T d;
    private volatile Exception e;

    public a(c<T> cVar) {
        this.a = cVar;
    }

    private T b() {
        if (this.e == null) {
            return this.d;
        }
        throw new ExecutionException(this.e);
    }

    public boolean a() {
        return cancel(true);
    }

    public boolean a(Exception exception) {
        boolean z = true;
        synchronized (this) {
            if (this.b) {
                z = false;
            } else {
                this.b = true;
                this.e = exception;
                notifyAll();
                if (this.a != null) {
                    this.a.a(exception);
                }
            }
        }
        return z;
    }

    public boolean a(T t) {
        boolean z = true;
        synchronized (this) {
            if (this.b) {
                z = false;
            } else {
                this.b = true;
                this.d = t;
                notifyAll();
                if (this.a != null) {
                    this.a.a((Object) t);
                }
            }
        }
        return z;
    }

    public boolean cancel(boolean z) {
        boolean z2 = true;
        synchronized (this) {
            if (this.b) {
                z2 = false;
            } else {
                this.b = true;
                this.c = true;
                notifyAll();
                if (this.a != null) {
                    this.a.a();
                }
            }
        }
        return z2;
    }

    public synchronized T get() {
        while (!this.b) {
            wait();
        }
        return b();
    }

    public synchronized T get(long j, TimeUnit timeUnit) {
        T b;
        org.a.a.o.a.a((Object) timeUnit, "Time unit");
        long toMillis = timeUnit.toMillis(j);
        long currentTimeMillis = toMillis <= 0 ? 0 : System.currentTimeMillis();
        if (this.b) {
            b = b();
        } else if (toMillis <= 0) {
            throw new TimeoutException();
        } else {
            long j2 = toMillis;
            do {
                wait(j2);
                if (this.b) {
                    b = b();
                } else {
                    j2 = toMillis - (System.currentTimeMillis() - currentTimeMillis);
                }
            } while (j2 > 0);
            throw new TimeoutException();
        }
        return b;
    }

    public boolean isCancelled() {
        return this.c;
    }

    public boolean isDone() {
        return this.b;
    }
}
