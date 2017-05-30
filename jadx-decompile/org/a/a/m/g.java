package org.a.a.m;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import org.a.a.a.d;
import org.a.a.d.c;
import org.a.a.o.a;

@d
abstract class g<T> implements Future<T> {
    private final Lock a;
    private final c<T> b;
    private final Condition c;
    private volatile boolean d;
    private volatile boolean e;
    private T f;

    g(Lock lock, c<T> cVar) {
        this.a = lock;
        this.c = lock.newCondition();
        this.b = cVar;
    }

    public void a() {
        this.a.lock();
        try {
            this.c.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    public boolean a(Date date) {
        this.a.lock();
        try {
            if (this.d) {
                throw new InterruptedException("Operation interrupted");
            }
            boolean awaitUntil;
            if (date != null) {
                awaitUntil = this.c.awaitUntil(date);
            } else {
                this.c.await();
                awaitUntil = true;
            }
            if (!this.d) {
                return awaitUntil;
            }
            throw new InterruptedException("Operation interrupted");
        } finally {
            this.a.unlock();
        }
    }

    protected abstract T b(long j, TimeUnit timeUnit);

    public boolean cancel(boolean z) {
        this.a.lock();
        try {
            if (this.e) {
                return false;
            }
            this.e = true;
            this.d = true;
            if (this.b != null) {
                this.b.a();
            }
            this.c.signalAll();
            this.a.unlock();
            return true;
        } finally {
            this.a.unlock();
        }
    }

    public T get() {
        try {
            return get(0, TimeUnit.MILLISECONDS);
        } catch (Throwable e) {
            throw new ExecutionException(e);
        }
    }

    public T get(long j, TimeUnit timeUnit) {
        a.a((Object) timeUnit, "Time unit");
        this.a.lock();
        try {
            T t;
            if (this.e) {
                t = this.f;
                this.a.unlock();
            } else {
                this.f = b(j, timeUnit);
                this.e = true;
                if (this.b != null) {
                    this.b.a(this.f);
                }
                t = this.f;
                this.a.unlock();
            }
            return t;
        } catch (Exception e) {
            this.e = true;
            this.f = null;
            if (this.b != null) {
                this.b.a(e);
            }
            throw new ExecutionException(e);
        } catch (Throwable th) {
            this.a.unlock();
        }
    }

    public boolean isCancelled() {
        return this.d;
    }

    public boolean isDone() {
        return this.e;
    }
}
