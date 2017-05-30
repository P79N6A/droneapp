package org.a.a.i.f;

import android.util.Log;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.a.a.a.b;
import org.a.a.c.a.c;
import org.a.a.c.c.n;
import org.a.a.f.d;
import org.a.a.n.f;
import org.a.a.n.j;
import org.a.a.o.a;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.client.NonRepeatableRequestException;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.routing.BasicRouteDirector;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRouteDirector;
import org.apache.http.conn.routing.RouteTracker;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;

@b
public class e implements b {
    private static final String a = "HttpClient";
    private final HttpRequestExecutor b;
    private final d c;
    private final ConnectionReuseStrategy d;
    private final ConnectionKeepAliveStrategy e;
    private final HttpProcessor f = new f(new HttpRequestInterceptor[]{new j(), new org.a.a.c.e.e()});
    private final org.a.a.c.b g;
    private final org.a.a.c.b h;
    private final org.a.a.i.a.f i = new org.a.a.i.a.f();
    private final UserTokenHandler j;
    private final HttpRouteDirector k = new BasicRouteDirector();

    public e(HttpRequestExecutor httpRequestExecutor, d dVar, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, org.a.a.c.b bVar, org.a.a.c.b bVar2, UserTokenHandler userTokenHandler) {
        a.a((Object) httpRequestExecutor, "HTTP request executor");
        a.a((Object) dVar, "Client connection manager");
        a.a((Object) connectionReuseStrategy, "Connection reuse strategy");
        a.a((Object) connectionKeepAliveStrategy, "Connection keep alive strategy");
        a.a((Object) bVar, "Target authentication strategy");
        a.a((Object) bVar2, "Proxy authentication strategy");
        a.a((Object) userTokenHandler, "User token handler");
        this.b = httpRequestExecutor;
        this.c = dVar;
        this.d = connectionReuseStrategy;
        this.e = connectionKeepAliveStrategy;
        this.g = bVar;
        this.h = bVar2;
        this.j = userTokenHandler;
    }

    private boolean a(org.a.a.b.d dVar, org.a.a.b.d dVar2, HttpRoute httpRoute, HttpResponse httpResponse, org.a.a.c.e.a aVar) {
        if (aVar.n().j()) {
            HttpHost t = aVar.t();
            if (t == null) {
                t = httpRoute.getTargetHost();
            }
            HttpHost httpHost = t.getPort() < 0 ? new HttpHost(t.getHostName(), httpRoute.getTargetHost().getPort(), t.getSchemeName()) : t;
            boolean a = this.i.a(httpHost, httpResponse, this.g, dVar, aVar);
            HttpHost proxyHost = httpRoute.getProxyHost();
            if (proxyHost == null) {
                proxyHost = httpRoute.getTargetHost();
            }
            boolean a2 = this.i.a(proxyHost, httpResponse, this.h, dVar2, aVar);
            if (a) {
                return this.i.b(httpHost, httpResponse, this.g, dVar, aVar);
            } else if (a2) {
                return this.i.b(proxyHost, httpResponse, this.h, dVar2, aVar);
            }
        }
        return false;
    }

    private boolean a(HttpRoute httpRoute, int i, org.a.a.c.e.a aVar) {
        throw new HttpException("Proxy chains are not supported.");
    }

    private boolean b(org.a.a.b.d dVar, HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpRequest httpRequest, org.a.a.c.e.a aVar) {
        c n = aVar.n();
        int n2 = n.n();
        HttpHost targetHost = httpRoute.getTargetHost();
        HttpHost proxyHost = httpRoute.getProxyHost();
        HttpResponse httpResponse = null;
        HttpRequest basicHttpRequest = new BasicHttpRequest("CONNECT", targetHost.toHostString(), httpRequest.getProtocolVersion());
        this.b.preProcess(basicHttpRequest, this.f, aVar);
        while (httpResponse == null) {
            if (!httpClientConnection.isOpen()) {
                this.c.a(httpClientConnection, httpRoute, n2 > 0 ? n2 : 0, (HttpContext) aVar);
            }
            basicHttpRequest.removeHeaders(org.a.a.e.N);
            this.i.a(basicHttpRequest, dVar, aVar);
            httpResponse = this.b.execute(basicHttpRequest, httpClientConnection, aVar);
            if (httpResponse.getStatusLine().getStatusCode() < 200) {
                throw new HttpException("Unexpected response to CONNECT request: " + httpResponse.getStatusLine());
            } else if (n.j() && this.i.a(proxyHost, httpResponse, this.h, dVar, aVar) && this.i.b(proxyHost, httpResponse, this.h, dVar, aVar)) {
                if (this.d.keepAlive(httpResponse, aVar)) {
                    if (Log.isLoggable(a, 3)) {
                        Log.d(a, "Connection kept alive");
                    }
                    org.a.a.o.d.b(httpResponse.getEntity());
                } else {
                    httpClientConnection.close();
                }
                httpResponse = null;
            }
        }
        if (httpResponse.getStatusLine().getStatusCode() <= 299) {
            return false;
        }
        HttpEntity entity = httpResponse.getEntity();
        if (entity != null) {
            httpResponse.setEntity(new org.a.a.h.c(entity));
        }
        httpClientConnection.close();
        throw new n("CONNECT refused by proxy: " + httpResponse.getStatusLine(), httpResponse);
    }

    public org.a.a.c.c.b a(HttpRoute httpRoute, n nVar, org.a.a.c.e.a aVar, org.a.a.c.c.f fVar) {
        org.a.a.b.d dVar;
        Throwable e;
        a.a((Object) httpRoute, "HTTP route");
        a.a((Object) nVar, "HTTP request");
        a.a((Object) aVar, "HTTP context");
        org.a.a.b.d k = aVar.k();
        if (k == null) {
            k = new org.a.a.b.d();
            aVar.setAttribute(org.a.a.c.e.a.i, k);
            dVar = k;
        } else {
            dVar = k;
        }
        org.a.a.b.d l = aVar.l();
        if (l == null) {
            l = new org.a.a.b.d();
            aVar.setAttribute(org.a.a.c.e.a.j, l);
        }
        if (nVar instanceof HttpEntityEnclosingRequest) {
            j.a((HttpEntityEnclosingRequest) nVar);
        }
        Object m = aVar.m();
        Object a = this.c.a(httpRoute, m);
        if (fVar != null) {
            if (fVar.isAborted()) {
                a.a();
                throw new i("Request aborted");
            }
            fVar.a(a);
        }
        c n = aVar.n();
        try {
            HttpResponse a2;
            HttpEntity entity;
            int m2 = n.m();
            HttpClientConnection a3 = a.a(m2 > 0 ? (long) m2 : 0, TimeUnit.MILLISECONDS);
            aVar.setAttribute(org.a.a.n.c.n, a3);
            if (n.d() && a3.isOpen()) {
                if (Log.isLoggable(a, 3)) {
                    Log.d(a, "Stale connection check");
                }
                if (a3.isStale()) {
                    if (Log.isLoggable(a, 3)) {
                        Log.d(a, "Stale connection detected");
                    }
                    a3.close();
                }
            }
            c cVar = new c(this.c, a3);
            if (fVar != null) {
                try {
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
            int i = 1;
            while (true) {
                if (i <= 1 || j.a(nVar)) {
                    if (fVar != null) {
                        if (fVar.isAborted()) {
                            throw new i("Request aborted");
                        }
                    }
                    if (!a3.isOpen()) {
                        if (Log.isLoggable(a, 3)) {
                            Log.d(a, "Opening connection " + httpRoute);
                        }
                        try {
                            a(l, a3, httpRoute, (HttpRequest) nVar, aVar);
                        } catch (n e6) {
                            if (Log.isLoggable(a, 3)) {
                                Log.d(a, e6.getMessage());
                            }
                            a2 = e6.a();
                        }
                    }
                    int o = n.o();
                    if (o >= 0) {
                        a3.setSocketTimeout(o);
                    }
                    if (fVar == null || !fVar.isAborted()) {
                        if (Log.isLoggable(a, 3)) {
                            Log.d(a, "Executing request " + nVar.getRequestLine());
                        }
                        if (!nVar.containsHeader("Authorization")) {
                            if (Log.isLoggable(a, 3)) {
                                Log.d(a, "Target auth state: " + dVar.b());
                            }
                            this.i.a(nVar, dVar, aVar);
                        }
                        if (!(nVar.containsHeader(org.a.a.e.N) || httpRoute.isTunnelled())) {
                            if (Log.isLoggable(a, 3)) {
                                Log.d(a, "Proxy auth state: " + l.b());
                            }
                            this.i.a(nVar, l, aVar);
                        }
                        a2 = this.b.execute(nVar, a3, aVar);
                        if (this.d.keepAlive(a2, aVar)) {
                            long keepAliveDuration = this.e.getKeepAliveDuration(a2, aVar);
                            if (Log.isLoggable(a, 3)) {
                                Log.d(a, "Connection can be kept alive " + (keepAliveDuration > 0 ? "for " + keepAliveDuration + " " + TimeUnit.MILLISECONDS : "indefinitely"));
                            }
                            cVar.a(keepAliveDuration, TimeUnit.MILLISECONDS);
                            cVar.c();
                        } else {
                            cVar.d();
                        }
                        if (!a(dVar, l, httpRoute, a2, aVar)) {
                            break;
                        }
                        entity = a2.getEntity();
                        if (cVar.b()) {
                            org.a.a.o.d.b(entity);
                        } else {
                            a3.close();
                            if (l.b() == org.a.a.b.b.SUCCESS && l.c() != null && l.c().isConnectionBased()) {
                                if (Log.isLoggable(a, 3)) {
                                    Log.d(a, "Resetting proxy auth state");
                                }
                                l.a();
                            }
                            if (dVar.b() == org.a.a.b.b.SUCCESS && dVar.c() != null && dVar.c().isConnectionBased()) {
                                if (Log.isLoggable(a, 3)) {
                                    Log.d(a, "Resetting target auth state");
                                }
                                dVar.a();
                            }
                        }
                        HttpRequest a4 = nVar.a();
                        if (!a4.containsHeader("Authorization")) {
                            nVar.removeHeaders("Authorization");
                        }
                        if (!a4.containsHeader(org.a.a.e.N)) {
                            nVar.removeHeaders(org.a.a.e.N);
                        }
                        i++;
                    } else {
                        throw new i("Request aborted");
                    }
                }
                throw new NonRepeatableRequestException("Cannot retry request with a non-repeatable request entity.");
            }
            if (m == null) {
                a = this.j.getUserToken(aVar);
                aVar.setAttribute(org.a.a.c.e.a.k, a);
            } else {
                a = m;
            }
            if (a != null) {
                cVar.a(a);
            }
            entity = a2.getEntity();
            if (entity != null && entity.isStreaming()) {
                return new d(a2, cVar);
            }
            cVar.releaseConnection();
            return new d(a2, null);
        } catch (Throwable e22) {
            Thread.currentThread().interrupt();
            throw new i("Request aborted", e22);
        } catch (ExecutionException e7) {
            e22 = e7;
            Throwable cause = e22.getCause();
            if (cause != null) {
                e22 = cause;
            }
            throw new i("Request execution failed", e22);
        }
    }

    void a(org.a.a.b.d dVar, HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpRequest httpRequest, org.a.a.c.e.a aVar) {
        int n = aVar.n().n();
        RouteTracker routeTracker = new RouteTracker(httpRoute);
        int nextStep;
        do {
            Object toRoute = routeTracker.toRoute();
            nextStep = this.k.nextStep(httpRoute, toRoute);
            switch (nextStep) {
                case -1:
                    throw new HttpException("Unable to establish route: planned = " + httpRoute + "; current = " + toRoute);
                case 0:
                    this.c.b(httpClientConnection, httpRoute, aVar);
                    continue;
                case 1:
                    this.c.a(httpClientConnection, httpRoute, n > 0 ? n : 0, (HttpContext) aVar);
                    routeTracker.connectTarget(httpRoute.isSecure());
                    continue;
                case 2:
                    this.c.a(httpClientConnection, httpRoute, n > 0 ? n : 0, (HttpContext) aVar);
                    routeTracker.connectProxy(httpRoute.getProxyHost(), false);
                    continue;
                case 3:
                    boolean b = b(dVar, httpClientConnection, httpRoute, httpRequest, aVar);
                    if (Log.isLoggable(a, 3)) {
                        Log.d(a, "Tunnel to target created.");
                    }
                    routeTracker.tunnelTarget(b);
                    continue;
                case 4:
                    int hopCount = toRoute.getHopCount() - 1;
                    boolean a = a(httpRoute, hopCount, aVar);
                    if (Log.isLoggable(a, 3)) {
                        Log.d(a, "Tunnel to proxy created.");
                    }
                    routeTracker.tunnelProxy(httpRoute.getHopTarget(hopCount), a);
                    continue;
                case 5:
                    this.c.a(httpClientConnection, httpRoute, aVar);
                    routeTracker.layerProtocol(httpRoute.isSecure());
                    continue;
                default:
                    throw new IllegalStateException("Unknown step indicator " + nextStep + " from RouteDirector.");
            }
        } while (nextStep > 0);
    }
}
