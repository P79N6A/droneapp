package org.a.a.i.c;

import android.util.Log;
import com.facebook.common.util.UriUtil;
import java.io.Closeable;
import java.net.InetSocketAddress;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.a.a.a.d;
import org.a.a.e.b;
import org.a.a.e.f;
import org.a.a.f.b.c;
import org.a.a.f.c.g;
import org.a.a.f.e;
import org.a.a.f.h;
import org.a.a.f.i;
import org.apache.http.HttpClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.LangUtils;

@d
public class a implements Closeable, org.a.a.f.d {
    private static final String a = "HttpClient";
    private final l b;
    private final e<HttpRoute, h> c;
    @org.a.a.a.a(a = "this")
    private h d;
    @org.a.a.a.a(a = "this")
    private HttpRoute e;
    @org.a.a.a.a(a = "this")
    private Object f;
    @org.a.a.a.a(a = "this")
    private long g;
    @org.a.a.a.a(a = "this")
    private long h;
    @org.a.a.a.a(a = "this")
    private boolean i;
    @org.a.a.a.a(a = "this")
    private f j;
    @org.a.a.a.a(a = "this")
    private org.a.a.e.a k;
    private final AtomicBoolean l;

    public a() {
        this(g(), null, null, null);
    }

    public a(b<org.a.a.f.b.a> bVar) {
        this(bVar, null, null, null);
    }

    public a(b<org.a.a.f.b.a> bVar, e<HttpRoute, h> eVar) {
        this(bVar, eVar, null, null);
    }

    public a(b<org.a.a.f.b.a> bVar, e<HttpRoute, h> eVar, i iVar, org.a.a.f.b bVar2) {
        e eVar2;
        this.b = new l(bVar, iVar, bVar2);
        if (eVar == null) {
            eVar2 = q.a;
        }
        this.c = eVar2;
        this.h = Long.MAX_VALUE;
        this.j = f.a;
        this.k = org.a.a.e.a.a;
        this.l = new AtomicBoolean(false);
    }

    private static org.a.a.e.d<org.a.a.f.b.a> g() {
        return org.a.a.e.e.a().a(UriUtil.HTTP_SCHEME, c.a()).a(UriUtil.HTTPS_SCHEME, g.a()).b();
    }

    private void h() {
        if (this.d != null) {
            if (Log.isLoggable(a, 3)) {
                Log.d(a, "Closing connection");
            }
            try {
                this.d.close();
            } catch (Throwable e) {
                if (Log.isLoggable(a, 3)) {
                    Log.d(a, "I/O exception closing connection", e);
                }
            }
            this.d = null;
        }
    }

    private void i() {
        if (this.d != null) {
            if (Log.isLoggable(a, 3)) {
                Log.d(a, "Shutting down connection");
            }
            try {
                this.d.shutdown();
            } catch (Throwable e) {
                if (Log.isLoggable(a, 3)) {
                    Log.d(a, "I/O exception shutting down connection", e);
                }
            }
            this.d = null;
        }
    }

    private void j() {
        if (this.d != null && System.currentTimeMillis() >= this.h) {
            if (Log.isLoggable(a, 3)) {
                Log.d(a, "Connection expired @ " + new Date(this.h));
            }
            h();
        }
    }

    public final org.a.a.f.a a(final HttpRoute httpRoute, final Object obj) {
        org.a.a.o.a.a((Object) httpRoute, "Route");
        return new org.a.a.f.a(this) {
            final /* synthetic */ a c;

            public HttpClientConnection a(long j, TimeUnit timeUnit) {
                return this.c.b(httpRoute, obj);
            }

            public boolean a() {
                return false;
            }
        };
    }

    public synchronized void a() {
        if (!this.l.get()) {
            if (!this.i) {
                j();
            }
        }
    }

    public synchronized void a(long j, TimeUnit timeUnit) {
        long j2 = 0;
        synchronized (this) {
            org.a.a.o.a.a((Object) timeUnit, "Time unit");
            if (!this.l.get()) {
                if (!this.i) {
                    long toMillis = timeUnit.toMillis(j);
                    if (toMillis >= 0) {
                        j2 = toMillis;
                    }
                    if (this.g <= System.currentTimeMillis() - j2) {
                        h();
                    }
                }
            }
        }
    }

    public synchronized void a(org.a.a.e.a aVar) {
        if (aVar == null) {
            aVar = org.a.a.e.a.a;
        }
        this.k = aVar;
    }

    public synchronized void a(f fVar) {
        if (fVar == null) {
            fVar = f.a;
        }
        this.j = fVar;
    }

    public synchronized void a(HttpClientConnection httpClientConnection, Object obj, long j, TimeUnit timeUnit) {
        boolean z = false;
        synchronized (this) {
            org.a.a.o.a.a((Object) httpClientConnection, org.a.a.e.j);
            if (httpClientConnection == this.d) {
                z = true;
            }
            org.a.a.o.b.a(z, "Connection not obtained from this manager");
            if (Log.isLoggable(a, 3)) {
                Log.d(a, "Releasing connection " + httpClientConnection);
            }
            if (!this.l.get()) {
                try {
                    this.g = System.currentTimeMillis();
                    h isOpen = this.d.isOpen();
                    if (isOpen == null) {
                        this.d = isOpen;
                        this.e = null;
                        this.d = null;
                        this.h = Long.MAX_VALUE;
                        this.i = false;
                    } else {
                        this.f = obj;
                        if (Log.isLoggable(a, 3)) {
                            Log.d(a, "Connection can be kept alive " + (j > 0 ? "for " + j + " " + timeUnit : "indefinitely"));
                        }
                        if (j > 0) {
                            this.h = this.g + timeUnit.toMillis(j);
                        } else {
                            this.h = Long.MAX_VALUE;
                        }
                        this.i = false;
                    }
                } finally {
                    this.i = false;
                }
            }
        }
    }

    public void a(HttpClientConnection httpClientConnection, HttpRoute httpRoute, int i, HttpContext httpContext) {
        org.a.a.o.a.a((Object) httpClientConnection, org.a.a.e.j);
        org.a.a.o.a.a((Object) httpRoute, "HTTP route");
        org.a.a.o.b.a(httpClientConnection == this.d, "Connection not obtained from this manager");
        this.b.a(this.d, httpRoute.getProxyHost() != null ? httpRoute.getProxyHost() : httpRoute.getTargetHost(), httpRoute.getLocalAddress() != null ? new InetSocketAddress(httpRoute.getLocalAddress(), 0) : null, i, this.j, httpContext);
    }

    public void a(HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpContext httpContext) {
        org.a.a.o.a.a((Object) httpClientConnection, org.a.a.e.j);
        org.a.a.o.a.a((Object) httpRoute, "HTTP route");
        org.a.a.o.b.a(httpClientConnection == this.d, "Connection not obtained from this manager");
        this.b.a(this.d, httpRoute.getTargetHost(), httpContext);
    }

    synchronized HttpClientConnection b(HttpRoute httpRoute, Object obj) {
        HttpClientConnection httpClientConnection;
        boolean z = true;
        synchronized (this) {
            org.a.a.o.b.a(!this.l.get(), "Connection manager has been shut down");
            if (Log.isLoggable(a, 3)) {
                Log.d(a, "Get connection for route " + httpRoute);
            }
            if (this.i) {
                z = false;
            }
            org.a.a.o.b.a(z, "Connection is still allocated");
            if (!(LangUtils.equals(this.e, httpRoute) && LangUtils.equals(this.f, obj))) {
                h();
            }
            this.e = httpRoute;
            this.f = obj;
            j();
            if (this.d == null) {
                this.d = (h) this.c.a(httpRoute, this.k);
            }
            this.i = true;
            httpClientConnection = this.d;
        }
        return httpClientConnection;
    }

    public synchronized void b() {
        if (this.l.compareAndSet(false, true)) {
            i();
        }
    }

    public void b(HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpContext httpContext) {
    }

    HttpRoute c() {
        return this.e;
    }

    public void close() {
        b();
    }

    Object d() {
        return this.f;
    }

    public synchronized f e() {
        return this.j;
    }

    public synchronized org.a.a.e.a f() {
        return this.k;
    }

    protected void finalize() {
        try {
            b();
        } finally {
            super.finalize();
        }
    }
}
