package org.a.a.i.b;

import java.util.concurrent.TimeUnit;
import org.a.a.a.d;
import org.a.a.c.a.c;
import org.a.a.c.c.b;
import org.a.a.c.c.n;
import org.a.a.i.f.f;
import org.a.a.i.g;
import org.a.a.o.a;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpRequestExecutor;

@d
class y extends h {
    private final org.a.a.f.d a;
    private final f b;
    private final HttpParams c = new BasicHttpParams();

    public y(org.a.a.f.d dVar) {
        this.a = (org.a.a.f.d) a.a((Object) dVar, "HTTP connection manager");
        this.b = new f(new HttpRequestExecutor(), dVar, g.a, k.a);
    }

    protected b a(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        a.a((Object) httpHost, "Target host");
        a.a((Object) httpRequest, "HTTP request");
        org.a.a.c.c.f fVar = httpRequest instanceof org.a.a.c.c.f ? (org.a.a.c.c.f) httpRequest : null;
        try {
            n a = n.a(httpRequest);
            if (httpContext == null) {
                httpContext = new org.a.a.n.a();
            }
            org.a.a.c.e.a a2 = org.a.a.c.e.a.a(httpContext);
            HttpRoute httpRoute = new HttpRoute(httpHost);
            c v_ = httpRequest instanceof org.a.a.c.c.c ? ((org.a.a.c.c.c) httpRequest).v_() : null;
            if (v_ != null) {
                a2.a(v_);
            }
            return this.b.a(httpRoute, a, a2, fVar);
        } catch (Throwable e) {
            throw new ClientProtocolException(e);
        }
    }

    public void close() {
        this.a.b();
    }

    public ClientConnectionManager getConnectionManager() {
        return new ClientConnectionManager(this) {
            final /* synthetic */ y a;

            {
                this.a = r1;
            }

            public void closeExpiredConnections() {
                this.a.a.a();
            }

            public void closeIdleConnections(long j, TimeUnit timeUnit) {
                this.a.a.a(j, timeUnit);
            }

            public SchemeRegistry getSchemeRegistry() {
                throw new UnsupportedOperationException();
            }

            public void releaseConnection(ManagedClientConnection managedClientConnection, long j, TimeUnit timeUnit) {
                throw new UnsupportedOperationException();
            }

            public ClientConnectionRequest requestConnection(HttpRoute httpRoute, Object obj) {
                throw new UnsupportedOperationException();
            }

            public void shutdown() {
                this.a.a.b();
            }
        };
    }

    public HttpParams getParams() {
        return this.c;
    }
}
