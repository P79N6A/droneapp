package org.a.a.i.f;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.URI;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.a.a.a.b;
import org.a.a.c.a.c;
import org.a.a.c.c.n;
import org.a.a.c.e.e;
import org.a.a.c.f.i;
import org.a.a.f.d;
import org.a.a.n.h;
import org.a.a.n.j;
import org.a.a.n.k;
import org.a.a.o.a;
import org.a.a.o.g;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;

@b
public class f implements b {
    private final HttpRequestExecutor a;
    private final d b;
    private final ConnectionReuseStrategy c;
    private final ConnectionKeepAliveStrategy d;
    private final HttpProcessor e = new org.a.a.n.f(new HttpRequestInterceptor[]{new h(), new j(), new e(), new k(g.a("Apache-HttpClient", "org.apache.http.client", getClass()))});

    public f(HttpRequestExecutor httpRequestExecutor, d dVar, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy) {
        a.a((Object) httpRequestExecutor, "HTTP request executor");
        a.a((Object) dVar, "Client connection manager");
        a.a((Object) connectionReuseStrategy, "Connection reuse strategy");
        a.a((Object) connectionKeepAliveStrategy, "Connection keep alive strategy");
        this.a = httpRequestExecutor;
        this.b = dVar;
        this.c = connectionReuseStrategy;
        this.d = connectionKeepAliveStrategy;
    }

    static void a(n nVar, HttpRoute httpRoute) {
        try {
            URI uri = nVar.getURI();
            if (uri != null) {
                nVar.a(uri.isAbsolute() ? i.a(uri, null, true) : i.a(uri));
            }
        } catch (Throwable e) {
            throw new ProtocolException("Invalid URI: " + nVar.getRequestLine().getUri(), e);
        }
    }

    public org.a.a.c.c.b a(HttpRoute httpRoute, n nVar, org.a.a.c.e.a aVar, org.a.a.c.c.f fVar) {
        Throwable e;
        a.a((Object) httpRoute, "HTTP route");
        a.a((Object) nVar, "HTTP request");
        a.a((Object) aVar, "HTTP context");
        a(nVar, httpRoute);
        Object a = this.b.a(httpRoute, null);
        if (fVar != null) {
            if (fVar.isAborted()) {
                a.a();
                throw new i("Request aborted");
            }
            fVar.a(a);
        }
        c n = aVar.n();
        try {
            int n2;
            HttpResponse execute;
            HttpEntity entity;
            int m = n.m();
            HttpClientConnection a2 = a.a(m > 0 ? (long) m : 0, TimeUnit.MILLISECONDS);
            c cVar = new c(this.b, a2);
            if (fVar != null) {
                try {
                    if (fVar.isAborted()) {
                        cVar.close();
                        throw new i("Request aborted");
                    }
                    fVar.a(cVar);
                } catch (Throwable e2) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("Connection has been shut down");
                    interruptedIOException.initCause(e2);
                    throw interruptedIOException;
                } catch (HttpException e3) {
                    cVar.abortConnection();
                    throw e3;
                } catch (IOException e4) {
                    cVar.abortConnection();
                    throw e4;
                } catch (RuntimeException e5) {
                    cVar.abortConnection();
                    throw e5;
                }
            }
            if (!a2.isOpen()) {
                n2 = n.n();
                d dVar = this.b;
                if (n2 <= 0) {
                    n2 = 0;
                }
                dVar.a(a2, httpRoute, n2, (HttpContext) aVar);
                this.b.b(a2, httpRoute, aVar);
            }
            n2 = n.o();
            if (n2 >= 0) {
                a2.setSocketTimeout(n2);
            }
            HttpRequest a3 = nVar.a();
            if (a3 instanceof HttpUriRequest) {
                URI uri = ((HttpUriRequest) a3).getURI();
                if (uri.isAbsolute()) {
                    a = new HttpHost(uri.getHost(), uri.getPort(), uri.getScheme());
                    if (a == null) {
                        a = httpRoute.getTargetHost();
                    }
                    aVar.setAttribute(org.a.a.n.c.q, a);
                    aVar.setAttribute(org.a.a.n.c.o, nVar);
                    aVar.setAttribute(org.a.a.n.c.n, a2);
                    aVar.setAttribute(org.a.a.c.e.a.a, httpRoute);
                    this.e.process(nVar, aVar);
                    execute = this.a.execute(nVar, a2, aVar);
                    this.e.process(execute, aVar);
                    if (this.c.keepAlive(execute, aVar)) {
                        cVar.d();
                    } else {
                        cVar.a(this.d.getKeepAliveDuration(execute, aVar), TimeUnit.MILLISECONDS);
                        cVar.c();
                    }
                    entity = execute.getEntity();
                    if (entity == null && entity.isStreaming()) {
                        return new d(execute, cVar);
                    }
                    cVar.releaseConnection();
                    return new d(execute, null);
                }
            }
            a = null;
            if (a == null) {
                a = httpRoute.getTargetHost();
            }
            aVar.setAttribute(org.a.a.n.c.q, a);
            aVar.setAttribute(org.a.a.n.c.o, nVar);
            aVar.setAttribute(org.a.a.n.c.n, a2);
            aVar.setAttribute(org.a.a.c.e.a.a, httpRoute);
            this.e.process(nVar, aVar);
            execute = this.a.execute(nVar, a2, aVar);
            this.e.process(execute, aVar);
            if (this.c.keepAlive(execute, aVar)) {
                cVar.d();
            } else {
                cVar.a(this.d.getKeepAliveDuration(execute, aVar), TimeUnit.MILLISECONDS);
                cVar.c();
            }
            entity = execute.getEntity();
            if (entity == null) {
            }
            cVar.releaseConnection();
            return new d(execute, null);
        } catch (Throwable e22) {
            Thread.currentThread().interrupt();
            throw new i("Request aborted", e22);
        } catch (ExecutionException e6) {
            e22 = e6;
            Throwable cause = e22.getCause();
            if (cause != null) {
                e22 = cause;
            }
            throw new i("Request execution failed", e22);
        }
    }
}
