package org.a.a.i.b;

import java.io.Closeable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.a.a.a.d;
import org.a.a.d.c;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

@d
public class r implements Closeable {
    private final HttpClient a;
    private final ExecutorService b;
    private final q c = new q();
    private final AtomicBoolean d = new AtomicBoolean(false);

    public r(HttpClient httpClient, ExecutorService executorService) {
        this.a = httpClient;
        this.b = executorService;
    }

    public q a() {
        return this.c;
    }

    public <T> u<T> a(HttpUriRequest httpUriRequest, HttpContext httpContext, ResponseHandler<T> responseHandler) {
        return a(httpUriRequest, httpContext, responseHandler, null);
    }

    public <T> u<T> a(HttpUriRequest httpUriRequest, HttpContext httpContext, ResponseHandler<T> responseHandler, c<T> cVar) {
        if (this.d.get()) {
            throw new IllegalStateException("Close has been called on this httpclient instance.");
        }
        this.c.b().incrementAndGet();
        Object uVar = new u(httpUriRequest, new v(this.a, httpUriRequest, httpContext, responseHandler, cVar, this.c));
        this.b.execute(uVar);
        return uVar;
    }

    public void close() {
        this.d.set(true);
        this.b.shutdownNow();
        if (this.a instanceof Closeable) {
            ((Closeable) this.a).close();
        }
    }
}
