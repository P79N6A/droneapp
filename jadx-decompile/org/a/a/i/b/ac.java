package org.a.a.i.b;

import java.net.Socket;
import org.a.a.b.d;
import org.a.a.c.a.c;
import org.a.a.e.a;
import org.a.a.f.e;
import org.a.a.f.h;
import org.a.a.i.a.b;
import org.a.a.i.a.f;
import org.a.a.i.a.i;
import org.a.a.i.c.q;
import org.a.a.i.f.n;
import org.a.a.i.g;
import org.a.a.n.j;
import org.a.a.n.k;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.auth.AuthSchemeRegistry;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.RouteInfo.LayerType;
import org.apache.http.conn.routing.RouteInfo.TunnelType;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;

public class ac {
    private final e<HttpRoute, h> a;
    private final a b;
    private final c c;
    private final HttpProcessor d;
    private final HttpRequestExecutor e;
    private final ab f;
    private final f g;
    private final d h;
    private final AuthSchemeRegistry i;
    private final ConnectionReuseStrategy j;

    public ac() {
        this(null, null, null);
    }

    public ac(c cVar) {
        this(null, null, cVar);
    }

    public ac(e<HttpRoute, h> eVar, a aVar, c cVar) {
        e eVar2;
        if (eVar == null) {
            eVar2 = q.a;
        }
        this.a = eVar2;
        if (aVar == null) {
            aVar = a.a;
        }
        this.b = aVar;
        if (cVar == null) {
            cVar = c.a;
        }
        this.c = cVar;
        this.d = new org.a.a.n.f(new j(), new org.a.a.c.e.e(), new k());
        this.e = new HttpRequestExecutor();
        this.f = new ab();
        this.g = new f();
        this.h = new d();
        this.i = new AuthSchemeRegistry();
        this.i.register(org.a.a.c.a.a.a, new b());
        this.i.register(org.a.a.c.a.a.b, new org.a.a.i.a.d());
        this.i.register(org.a.a.c.a.a.c, new i());
        this.j = new g();
    }

    @Deprecated
    public ac(HttpParams httpParams) {
        this(null, org.a.a.l.a.c(httpParams), org.a.a.c.d.a.a(httpParams));
    }

    public Socket a(HttpHost httpHost, HttpHost httpHost2, Credentials credentials) {
        org.a.a.o.a.a(httpHost, "Proxy host");
        org.a.a.o.a.a(httpHost2, "Target host");
        org.a.a.o.a.a(credentials, "Credentials");
        HttpHost httpHost3 = httpHost2.getPort() <= 0 ? new HttpHost(httpHost2.getHostName(), 80, httpHost2.getSchemeName()) : httpHost2;
        HttpRoute httpRoute = new HttpRoute(httpHost3, this.c.c(), httpHost, false, TunnelType.TUNNELLED, LayerType.PLAIN);
        h hVar = (h) this.a.a(httpRoute, this.b);
        HttpContext aVar = new org.a.a.n.a();
        HttpRequest basicHttpRequest = new BasicHttpRequest("CONNECT", httpHost3.toHostString(), HttpVersion.HTTP_1_1);
        e eVar = new e();
        eVar.setCredentials(new AuthScope(httpHost.getHostName(), httpHost.getPort()), credentials);
        aVar.setAttribute(org.a.a.n.c.q, httpHost2);
        aVar.setAttribute(org.a.a.n.c.n, hVar);
        aVar.setAttribute(org.a.a.n.c.o, basicHttpRequest);
        aVar.setAttribute(org.a.a.c.e.a.a, httpRoute);
        aVar.setAttribute(org.a.a.c.e.a.j, this.h);
        aVar.setAttribute(org.a.a.c.e.a.g, eVar);
        aVar.setAttribute(org.a.a.c.e.a.l, this.i);
        aVar.setAttribute(org.a.a.c.e.a.m, this.c);
        this.e.preProcess(basicHttpRequest, this.d, aVar);
        while (true) {
            if (!hVar.isOpen()) {
                hVar.a(new Socket(httpHost.getHostName(), httpHost.getPort()));
            }
            this.g.a(basicHttpRequest, this.h, aVar);
            HttpResponse execute = this.e.execute(basicHttpRequest, hVar, aVar);
            if (execute.getStatusLine().getStatusCode() >= 200) {
                if (!this.g.a(httpHost, execute, this.f, this.h, aVar)) {
                    break;
                }
                if (!this.g.b(httpHost, execute, this.f, this.h, aVar)) {
                    break;
                }
                if (this.j.keepAlive(execute, aVar)) {
                    org.a.a.o.d.b(execute.getEntity());
                } else {
                    hVar.close();
                }
                basicHttpRequest.removeHeaders(org.a.a.e.N);
            } else {
                throw new HttpException("Unexpected response to CONNECT request: " + execute.getStatusLine());
            }
        }
        if (execute.getStatusLine().getStatusCode() <= 299) {
            return hVar.b();
        }
        HttpEntity entity = execute.getEntity();
        if (entity != null) {
            execute.setEntity(new org.a.a.h.c(entity));
        }
        hVar.close();
        throw new n("CONNECT refused by proxy: " + execute.getStatusLine(), execute);
    }

    @Deprecated
    public HttpParams a() {
        return new BasicHttpParams();
    }

    @Deprecated
    public AuthSchemeRegistry b() {
        return this.i;
    }
}
