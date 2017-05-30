package org.a.a.i.b;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.a.a.d.c;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

class v<V> implements Callable<V> {
    private final HttpUriRequest a;
    private final HttpClient b;
    private final AtomicBoolean c = new AtomicBoolean(false);
    private final long d = System.currentTimeMillis();
    private long e = -1;
    private long f = -1;
    private final HttpContext g;
    private final ResponseHandler<V> h;
    private final c<V> i;
    private final q j;

    v(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext, ResponseHandler<V> responseHandler, c<V> cVar, q qVar) {
        this.b = httpClient;
        this.h = responseHandler;
        this.a = httpUriRequest;
        this.g = httpContext;
        this.i = cVar;
        this.j = qVar;
    }

    public long a() {
        return this.d;
    }

    public long b() {
        return this.e;
    }

    public long c() {
        return this.f;
    }

    public V call() {
        if (this.c.get()) {
            throw new IllegalStateException("call has been cancelled for request " + this.a.getURI());
        }
        try {
            this.j.a().incrementAndGet();
            this.e = System.currentTimeMillis();
            this.j.b().decrementAndGet();
            Object execute = this.b.execute(this.a, this.h, this.g);
            this.f = System.currentTimeMillis();
            this.j.c().a(this.e);
            if (this.i != null) {
                this.i.a(execute);
            }
            this.j.e().a(this.e);
            this.j.f().a(this.e);
            this.j.a().decrementAndGet();
            return execute;
        } catch (Exception e) {
            this.j.d().a(this.e);
            this.f = System.currentTimeMillis();
            if (this.i != null) {
                this.i.a(e);
            }
            throw e;
        } catch (Throwable th) {
            this.j.e().a(this.e);
            this.j.f().a(this.e);
            this.j.a().decrementAndGet();
        }
    }

    public void d() {
        this.c.set(true);
        if (this.i != null) {
            this.i.a();
        }
    }
}
