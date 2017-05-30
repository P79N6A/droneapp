package org.a.a.i.b;

import java.util.concurrent.FutureTask;
import org.apache.http.client.methods.HttpUriRequest;

public class u<V> extends FutureTask<V> {
    private final HttpUriRequest a;
    private final v<V> b;

    public u(HttpUriRequest httpUriRequest, v<V> vVar) {
        super(vVar);
        this.a = httpUriRequest;
        this.b = vVar;
    }

    public long a() {
        return this.b.a();
    }

    public long b() {
        return this.b.b();
    }

    public long c() {
        if (isDone()) {
            return this.b.c();
        }
        throw new IllegalStateException("Task is not done yet");
    }

    public boolean cancel(boolean z) {
        this.b.d();
        if (z) {
            this.a.abort();
        }
        return super.cancel(z);
    }

    public long d() {
        if (isDone()) {
            return c() - b();
        }
        throw new IllegalStateException("Task is not done yet");
    }

    public long e() {
        if (isDone()) {
            return c() - a();
        }
        throw new IllegalStateException("Task is not done yet");
    }

    public String toString() {
        return this.a.getRequestLine().getUri();
    }
}
