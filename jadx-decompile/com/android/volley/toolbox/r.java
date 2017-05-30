package com.android.volley.toolbox;

import com.android.volley.n;
import com.android.volley.p.a;
import com.android.volley.p.b;
import com.android.volley.u;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class r<T> implements a, b<T>, Future<T> {
    private n<?> a;
    private boolean b = false;
    private T c;
    private u d;

    private r() {
    }

    public static <E> r<E> a() {
        return new r();
    }

    private synchronized T a(Long l) {
        T t;
        if (this.d != null) {
            throw new ExecutionException(this.d);
        } else if (this.b) {
            t = this.c;
        } else {
            if (l == null) {
                wait(0);
            } else if (l.longValue() > 0) {
                wait(l.longValue());
            }
            if (this.d != null) {
                throw new ExecutionException(this.d);
            } else if (this.b) {
                t = this.c;
            } else {
                throw new TimeoutException();
            }
        }
        return t;
    }

    public void a(n<?> nVar) {
        this.a = nVar;
    }

    public synchronized void a(u uVar) {
        this.d = uVar;
        notifyAll();
    }

    public synchronized void a(T t) {
        this.b = true;
        this.c = t;
        notifyAll();
    }

    public synchronized boolean cancel(boolean z) {
        boolean z2 = false;
        synchronized (this) {
            if (this.a != null) {
                if (!isDone()) {
                    this.a.l();
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public T get() {
        try {
            return a(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    public T get(long j, TimeUnit timeUnit) {
        return a(Long.valueOf(TimeUnit.MILLISECONDS.convert(j, timeUnit)));
    }

    public boolean isCancelled() {
        return this.a == null ? false : this.a.m();
    }

    public synchronized boolean isDone() {
        boolean z;
        z = this.b || this.d != null || isCancelled();
        return z;
    }
}
