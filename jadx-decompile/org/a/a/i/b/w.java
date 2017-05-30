package org.a.a.i.b;

import android.util.Log;
import java.io.Closeable;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.a.a.a.d;
import org.a.a.b.c;
import org.a.a.c.c.f;
import org.a.a.c.c.n;
import org.a.a.i.f.b;
import org.a.a.o.a;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

@d
class w extends h {
    private static final String a = "HttpClient";
    private final b b;
    private final org.a.a.f.d c;
    private final HttpRoutePlanner d;
    private final org.a.a.e.b<org.a.a.g.b> e;
    private final org.a.a.e.b<c> f;
    private final CookieStore g;
    private final CredentialsProvider h;
    private final org.a.a.c.a.c i;
    private final List<Closeable> j;

    public w(b bVar, org.a.a.f.d dVar, HttpRoutePlanner httpRoutePlanner, org.a.a.e.b<org.a.a.g.b> bVar2, org.a.a.e.b<c> bVar3, CookieStore cookieStore, CredentialsProvider credentialsProvider, org.a.a.c.a.c cVar, List<Closeable> list) {
        a.a((Object) bVar, "HTTP client exec chain");
        a.a((Object) dVar, "HTTP connection manager");
        a.a((Object) httpRoutePlanner, "HTTP route planner");
        this.b = bVar;
        this.c = dVar;
        this.d = httpRoutePlanner;
        this.e = bVar2;
        this.f = bVar3;
        this.g = cookieStore;
        this.h = credentialsProvider;
        this.i = cVar;
        this.j = list;
    }

    private void a(org.a.a.c.e.a aVar) {
        if (aVar.getAttribute(org.a.a.c.e.a.i) == null) {
            aVar.setAttribute(org.a.a.c.e.a.i, new org.a.a.b.d());
        }
        if (aVar.getAttribute(org.a.a.c.e.a.j) == null) {
            aVar.setAttribute(org.a.a.c.e.a.j, new org.a.a.b.d());
        }
        if (aVar.getAttribute(org.a.a.c.e.a.l) == null) {
            aVar.setAttribute(org.a.a.c.e.a.l, this.f);
        }
        if (aVar.getAttribute(org.a.a.c.e.a.c) == null) {
            aVar.setAttribute(org.a.a.c.e.a.c, this.e);
        }
        if (aVar.getAttribute(org.a.a.c.e.a.f) == null) {
            aVar.setAttribute(org.a.a.c.e.a.f, this.g);
        }
        if (aVar.getAttribute(org.a.a.c.e.a.g) == null) {
            aVar.setAttribute(org.a.a.c.e.a.g, this.h);
        }
        if (aVar.getAttribute(org.a.a.c.e.a.m) == null) {
            aVar.setAttribute(org.a.a.c.e.a.m, this.i);
        }
    }

    private HttpRoute c(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return this.d.determineRoute(httpHost == null ? (HttpHost) httpRequest.getParams().getParameter("http.default-host") : httpHost, httpRequest, httpContext);
    }

    protected org.a.a.c.c.b a(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        a.a((Object) httpRequest, "HTTP request");
        f fVar = httpRequest instanceof f ? (f) httpRequest : null;
        try {
            Object a = n.a(httpRequest);
            if (httpContext == null) {
                httpContext = new org.a.a.n.a();
            }
            org.a.a.c.e.a a2 = org.a.a.c.e.a.a(httpContext);
            org.a.a.c.a.c v_ = httpRequest instanceof org.a.a.c.c.c ? ((org.a.a.c.c.c) httpRequest).v_() : null;
            if (v_ == null) {
                v_ = org.a.a.c.d.a.a(httpRequest.getParams());
            }
            if (v_ != null) {
                a2.a(v_);
            }
            a(a2);
            return this.b.a(c(httpHost, a, a2), a, a2, fVar);
        } catch (Throwable e) {
            throw new ClientProtocolException(e);
        }
    }

    public void close() {
        this.c.b();
        if (this.j != null) {
            for (Closeable close : this.j) {
                try {
                    close.close();
                } catch (Throwable e) {
                    Log.e(a, e.getMessage(), e);
                }
            }
        }
    }

    public ClientConnectionManager getConnectionManager() {
        return new ClientConnectionManager(this) {
            final /* synthetic */ w a;

            {
                this.a = r1;
            }

            public void closeExpiredConnections() {
                this.a.c.a();
            }

            public void closeIdleConnections(long j, TimeUnit timeUnit) {
                this.a.c.a(j, timeUnit);
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
                this.a.c.b();
            }
        };
    }

    public HttpParams getParams() {
        throw new UnsupportedOperationException();
    }
}
