package org.a.a.i.c;

import android.util.Log;
import com.facebook.common.util.UriUtil;
import java.io.Closeable;
import java.net.InetSocketAddress;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.a.a.a.d;
import org.a.a.e.f;
import org.a.a.f.b.c;
import org.a.a.f.c.g;
import org.a.a.f.e;
import org.a.a.f.h;
import org.a.a.f.i;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpHost;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.protocol.HttpContext;

@d
public class r implements Closeable, org.a.a.f.d, org.a.a.m.d<HttpRoute> {
    private static final String a = "HttpClient";
    private final a b;
    private final b c;
    private final l d;
    private final AtomicBoolean e;

    static class a {
        private final Map<HttpHost, f> a = new ConcurrentHashMap();
        private final Map<HttpHost, org.a.a.e.a> b = new ConcurrentHashMap();
        private volatile f c;
        private volatile org.a.a.e.a d;

        a() {
        }

        public f a() {
            return this.c;
        }

        public f a(HttpHost httpHost) {
            return (f) this.a.get(httpHost);
        }

        public void a(org.a.a.e.a aVar) {
            this.d = aVar;
        }

        public void a(f fVar) {
            this.c = fVar;
        }

        public void a(HttpHost httpHost, org.a.a.e.a aVar) {
            this.b.put(httpHost, aVar);
        }

        public void a(HttpHost httpHost, f fVar) {
            this.a.put(httpHost, fVar);
        }

        public org.a.a.e.a b() {
            return this.d;
        }

        public org.a.a.e.a b(HttpHost httpHost) {
            return (org.a.a.e.a) this.b.get(httpHost);
        }
    }

    static class b implements org.a.a.m.b<HttpRoute, h> {
        private final a a;
        private final e<HttpRoute, h> b;

        b(a aVar, e<HttpRoute, h> eVar) {
            e eVar2;
            if (aVar == null) {
                aVar = new a();
            }
            this.a = aVar;
            if (eVar == null) {
                eVar2 = q.a;
            }
            this.b = eVar2;
        }

        public h a(HttpRoute httpRoute) {
            org.a.a.e.a aVar = null;
            if (httpRoute.getProxyHost() != null) {
                aVar = this.a.b(httpRoute.getProxyHost());
            }
            if (aVar == null) {
                aVar = this.a.b(httpRoute.getTargetHost());
            }
            if (aVar == null) {
                aVar = this.a.b();
            }
            if (aVar == null) {
                aVar = org.a.a.e.a.a;
            }
            return (h) this.b.a(httpRoute, aVar);
        }
    }

    public r() {
        this(h());
    }

    public r(long j, TimeUnit timeUnit) {
        this(h(), null, null, null, j, timeUnit);
    }

    public r(org.a.a.e.d<org.a.a.f.b.a> dVar) {
        this(dVar, null, null);
    }

    public r(org.a.a.e.d<org.a.a.f.b.a> dVar, org.a.a.f.b bVar) {
        this(dVar, null, bVar);
    }

    public r(org.a.a.e.d<org.a.a.f.b.a> dVar, e<HttpRoute, h> eVar) {
        this(dVar, eVar, null);
    }

    public r(org.a.a.e.d<org.a.a.f.b.a> dVar, e<HttpRoute, h> eVar, org.a.a.f.b bVar) {
        this(dVar, eVar, null, bVar, -1, TimeUnit.MILLISECONDS);
    }

    public r(org.a.a.e.d<org.a.a.f.b.a> dVar, e<HttpRoute, h> eVar, i iVar, org.a.a.f.b bVar, long j, TimeUnit timeUnit) {
        this.b = new a();
        this.c = new b(new b(this.b, eVar), 2, 20, j, timeUnit);
        this.d = new l(dVar, iVar, bVar);
        this.e = new AtomicBoolean(false);
    }

    public r(e<HttpRoute, h> eVar) {
        this(h(), eVar, null);
    }

    r(b bVar, org.a.a.e.b<org.a.a.f.b.a> bVar2, i iVar, org.a.a.f.b bVar3) {
        this.b = new a();
        this.c = bVar;
        this.d = new l(bVar2, iVar, bVar3);
        this.e = new AtomicBoolean(false);
    }

    private String a(c cVar) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[id: ").append(cVar.g()).append("]");
        stringBuilder.append("[route: ").append(cVar.h()).append("]");
        Object l = cVar.l();
        if (l != null) {
            stringBuilder.append("[state: ").append(l).append("]");
        }
        return stringBuilder.toString();
    }

    private String b(HttpRoute httpRoute, Object obj) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[route: ").append(httpRoute).append("]");
        if (obj != null) {
            stringBuilder.append("[state: ").append(obj).append("]");
        }
        return stringBuilder.toString();
    }

    private String c(HttpRoute httpRoute) {
        StringBuilder stringBuilder = new StringBuilder();
        org.a.a.m.h e = this.c.e();
        org.a.a.m.h a = this.c.a((Object) httpRoute);
        stringBuilder.append("[total kept alive: ").append(e.c()).append("; ");
        stringBuilder.append("route allocated: ").append(a.a() + a.c());
        stringBuilder.append(" of ").append(a.d()).append("; ");
        stringBuilder.append("total allocated: ").append(e.a() + e.c());
        stringBuilder.append(" of ").append(e.d()).append("]");
        return stringBuilder.toString();
    }

    private static org.a.a.e.d<org.a.a.f.b.a> h() {
        return org.a.a.e.e.a().a(UriUtil.HTTP_SCHEME, c.a()).a(UriUtil.HTTPS_SCHEME, g.a()).b();
    }

    public int a(HttpRoute httpRoute) {
        return this.c.b((Object) httpRoute);
    }

    public f a(HttpHost httpHost) {
        return this.b.a(httpHost);
    }

    public org.a.a.f.a a(HttpRoute httpRoute, Object obj) {
        org.a.a.o.a.a((Object) httpRoute, "HTTP route");
        if (Log.isLoggable(a, 3)) {
            Log.d(a, "Connection request: " + b(httpRoute, obj) + c(httpRoute));
        }
        final Future a = this.c.a(httpRoute, obj, null);
        return new org.a.a.f.a(this) {
            final /* synthetic */ r b;

            public HttpClientConnection a(long j, TimeUnit timeUnit) {
                return this.b.a(a, j, timeUnit);
            }

            public boolean a() {
                return a.cancel(true);
            }
        };
    }

    public /* synthetic */ org.a.a.m.h a(Object obj) {
        return b((HttpRoute) obj);
    }

    protected HttpClientConnection a(Future<c> future, long j, TimeUnit timeUnit) {
        try {
            c cVar = (c) future.get(j, timeUnit);
            if (cVar == null || future.isCancelled()) {
                throw new InterruptedException();
            }
            org.a.a.o.b.a(cVar.i() != null, "Pool entry with no connection");
            if (Log.isLoggable(a, 3)) {
                Log.d(a, "Connection leased: " + a(cVar) + c((HttpRoute) cVar.h()));
            }
            return d.a(cVar);
        } catch (TimeoutException e) {
            throw new ConnectionPoolTimeoutException("Timeout waiting for connection from pool");
        }
    }

    public void a() {
        if (Log.isLoggable(a, 3)) {
            Log.d(a, "Closing expired connections");
        }
        this.c.f();
    }

    public void a(int i) {
        this.c.a(i);
    }

    public void a(long j, TimeUnit timeUnit) {
        if (Log.isLoggable(a, 3)) {
            Log.d(a, "Closing connections idle longer than " + j + " " + timeUnit);
        }
        this.c.a(j, timeUnit);
    }

    public void a(org.a.a.e.a aVar) {
        this.b.a(aVar);
    }

    public void a(f fVar) {
        this.b.a(fVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(org.apache.http.HttpClientConnection r16, java.lang.Object r17, long r18, java.util.concurrent.TimeUnit r20) {
        /*
        r15 = this;
        r6 = 1;
        r7 = 0;
        r4 = "Managed connection";
        r0 = r16;
        org.a.a.o.a.a(r0, r4);
        monitor-enter(r16);
        r8 = org.a.a.i.c.d.b(r16);	 Catch:{ all -> 0x00ca }
        if (r8 != 0) goto L_0x0012;
    L_0x0010:
        monitor-exit(r16);	 Catch:{ all -> 0x00ca }
    L_0x0011:
        return;
    L_0x0012:
        r4 = r8.i();	 Catch:{ all -> 0x00ca }
        r4 = (org.a.a.f.h) r4;	 Catch:{ all -> 0x00ca }
        r5 = r4.isOpen();	 Catch:{ all -> 0x00d6 }
        if (r5 == 0) goto L_0x0083;
    L_0x001e:
        r0 = r17;
        r8.a(r0);	 Catch:{ all -> 0x00d6 }
        if (r20 == 0) goto L_0x00cd;
    L_0x0025:
        r0 = r18;
        r2 = r20;
        r8.a(r0, r2);	 Catch:{ all -> 0x00d6 }
        r5 = "HttpClient";
        r9 = 3;
        r5 = android.util.Log.isLoggable(r5, r9);	 Catch:{ all -> 0x00d6 }
        if (r5 == 0) goto L_0x0083;
    L_0x0035:
        r10 = 0;
        r5 = (r18 > r10 ? 1 : (r18 == r10 ? 0 : -1));
        if (r5 <= 0) goto L_0x00d1;
    L_0x003b:
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00d6 }
        r5.<init>();	 Catch:{ all -> 0x00d6 }
        r9 = "for ";
        r5 = r5.append(r9);	 Catch:{ all -> 0x00d6 }
        r0 = r18;
        r10 = (double) r0;	 Catch:{ all -> 0x00d6 }
        r12 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        r10 = r10 / r12;
        r5 = r5.append(r10);	 Catch:{ all -> 0x00d6 }
        r9 = " seconds";
        r5 = r5.append(r9);	 Catch:{ all -> 0x00d6 }
        r5 = r5.toString();	 Catch:{ all -> 0x00d6 }
    L_0x005d:
        r9 = "HttpClient";
        r10 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00d6 }
        r10.<init>();	 Catch:{ all -> 0x00d6 }
        r11 = "Connection ";
        r10 = r10.append(r11);	 Catch:{ all -> 0x00d6 }
        r11 = r15.a(r8);	 Catch:{ all -> 0x00d6 }
        r10 = r10.append(r11);	 Catch:{ all -> 0x00d6 }
        r11 = " can be kept alive ";
        r10 = r10.append(r11);	 Catch:{ all -> 0x00d6 }
        r5 = r10.append(r5);	 Catch:{ all -> 0x00d6 }
        r5 = r5.toString();	 Catch:{ all -> 0x00d6 }
        android.util.Log.d(r9, r5);	 Catch:{ all -> 0x00d6 }
    L_0x0083:
        r5 = r15.c;	 Catch:{ all -> 0x00ca }
        r4 = r4.isOpen();	 Catch:{ all -> 0x00ca }
        if (r4 == 0) goto L_0x00d4;
    L_0x008b:
        r4 = r8.b();	 Catch:{ all -> 0x00ca }
        if (r4 == 0) goto L_0x00d4;
    L_0x0091:
        r5.a(r8, r6);	 Catch:{ all -> 0x00ca }
        r4 = "HttpClient";
        r5 = 3;
        r4 = android.util.Log.isLoggable(r4, r5);	 Catch:{ all -> 0x00ca }
        if (r4 == 0) goto L_0x00c7;
    L_0x009d:
        r5 = "HttpClient";
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ca }
        r4.<init>();	 Catch:{ all -> 0x00ca }
        r6 = "Connection released: ";
        r4 = r4.append(r6);	 Catch:{ all -> 0x00ca }
        r6 = r15.a(r8);	 Catch:{ all -> 0x00ca }
        r6 = r4.append(r6);	 Catch:{ all -> 0x00ca }
        r4 = r8.h();	 Catch:{ all -> 0x00ca }
        r4 = (org.apache.http.conn.routing.HttpRoute) r4;	 Catch:{ all -> 0x00ca }
        r4 = r15.c(r4);	 Catch:{ all -> 0x00ca }
        r4 = r6.append(r4);	 Catch:{ all -> 0x00ca }
        r4 = r4.toString();	 Catch:{ all -> 0x00ca }
        android.util.Log.d(r5, r4);	 Catch:{ all -> 0x00ca }
    L_0x00c7:
        monitor-exit(r16);	 Catch:{ all -> 0x00ca }
        goto L_0x0011;
    L_0x00ca:
        r4 = move-exception;
        monitor-exit(r16);	 Catch:{ all -> 0x00ca }
        throw r4;
    L_0x00cd:
        r20 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x00d6 }
        goto L_0x0025;
    L_0x00d1:
        r5 = "indefinitely";
        goto L_0x005d;
    L_0x00d4:
        r6 = r7;
        goto L_0x0091;
    L_0x00d6:
        r5 = move-exception;
        r9 = r15.c;	 Catch:{ all -> 0x00ca }
        r4 = r4.isOpen();	 Catch:{ all -> 0x00ca }
        if (r4 == 0) goto L_0x011d;
    L_0x00df:
        r4 = r8.b();	 Catch:{ all -> 0x00ca }
        if (r4 == 0) goto L_0x011d;
    L_0x00e5:
        r4 = r6;
    L_0x00e6:
        r9.a(r8, r4);	 Catch:{ all -> 0x00ca }
        r4 = "HttpClient";
        r6 = 3;
        r4 = android.util.Log.isLoggable(r4, r6);	 Catch:{ all -> 0x00ca }
        if (r4 == 0) goto L_0x011c;
    L_0x00f2:
        r6 = "HttpClient";
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ca }
        r4.<init>();	 Catch:{ all -> 0x00ca }
        r7 = "Connection released: ";
        r4 = r4.append(r7);	 Catch:{ all -> 0x00ca }
        r7 = r15.a(r8);	 Catch:{ all -> 0x00ca }
        r7 = r4.append(r7);	 Catch:{ all -> 0x00ca }
        r4 = r8.h();	 Catch:{ all -> 0x00ca }
        r4 = (org.apache.http.conn.routing.HttpRoute) r4;	 Catch:{ all -> 0x00ca }
        r4 = r15.c(r4);	 Catch:{ all -> 0x00ca }
        r4 = r7.append(r4);	 Catch:{ all -> 0x00ca }
        r4 = r4.toString();	 Catch:{ all -> 0x00ca }
        android.util.Log.d(r6, r4);	 Catch:{ all -> 0x00ca }
    L_0x011c:
        throw r5;	 Catch:{ all -> 0x00ca }
    L_0x011d:
        r4 = r7;
        goto L_0x00e6;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.a.a.i.c.r.a(org.apache.http.HttpClientConnection, java.lang.Object, long, java.util.concurrent.TimeUnit):void");
    }

    public void a(HttpClientConnection httpClientConnection, HttpRoute httpRoute, int i, HttpContext httpContext) {
        h hVar;
        org.a.a.o.a.a((Object) httpClientConnection, "Managed Connection");
        org.a.a.o.a.a((Object) httpRoute, "HTTP route");
        synchronized (httpClientConnection) {
            hVar = (h) d.a(httpClientConnection).i();
        }
        HttpHost proxyHost = httpRoute.getProxyHost() != null ? httpRoute.getProxyHost() : httpRoute.getTargetHost();
        InetSocketAddress inetSocketAddress = httpRoute.getLocalAddress() != null ? new InetSocketAddress(httpRoute.getLocalAddress(), 0) : null;
        f a = this.b.a(proxyHost);
        if (a == null) {
            a = this.b.a();
        }
        if (a == null) {
            a = f.a;
        }
        this.d.a(hVar, proxyHost, inetSocketAddress, i, a, httpContext);
    }

    public void a(HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpContext httpContext) {
        h hVar;
        org.a.a.o.a.a((Object) httpClientConnection, "Managed Connection");
        org.a.a.o.a.a((Object) httpRoute, "HTTP route");
        synchronized (httpClientConnection) {
            hVar = (h) d.a(httpClientConnection).i();
        }
        this.d.a(hVar, httpRoute.getTargetHost(), httpContext);
    }

    public void a(HttpHost httpHost, org.a.a.e.a aVar) {
        this.b.a(httpHost, aVar);
    }

    public void a(HttpHost httpHost, f fVar) {
        this.b.a(httpHost, fVar);
    }

    public void a(HttpRoute httpRoute, int i) {
        this.c.a((Object) httpRoute, i);
    }

    public /* synthetic */ int b(Object obj) {
        return a((HttpRoute) obj);
    }

    public org.a.a.e.a b(HttpHost httpHost) {
        return this.b.b(httpHost);
    }

    public org.a.a.m.h b(HttpRoute httpRoute) {
        return this.c.a((Object) httpRoute);
    }

    public void b() {
        if (this.e.compareAndSet(false, true)) {
            if (Log.isLoggable(a, 3)) {
                Log.d(a, "Connection manager is shutting down");
            }
            try {
                this.c.b();
            } catch (Throwable e) {
                Log.d(a, "I/O exception shutting down connection manager", e);
            }
            if (Log.isLoggable(a, 3)) {
                Log.d(a, "Connection manager shut down");
            }
        }
    }

    public void b(int i) {
        this.c.b(i);
    }

    public void b(HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpContext httpContext) {
        org.a.a.o.a.a((Object) httpClientConnection, "Managed Connection");
        org.a.a.o.a.a((Object) httpRoute, "HTTP route");
        synchronized (httpClientConnection) {
            d.a(httpClientConnection).a();
        }
    }

    public int c() {
        return this.c.c();
    }

    public void close() {
        b();
    }

    public int d() {
        return this.c.d();
    }

    public org.a.a.m.h e() {
        return this.c.e();
    }

    public f f() {
        return this.b.a();
    }

    protected void finalize() {
        try {
            b();
        } finally {
            super.finalize();
        }
    }

    public org.a.a.e.a g() {
        return this.b.b();
    }
}
