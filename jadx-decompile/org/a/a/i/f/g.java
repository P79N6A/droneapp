package org.a.a.i.f;

import android.util.Log;
import java.io.IOException;
import java.net.URI;
import org.a.a.a.b;
import org.a.a.c.c.f;
import org.a.a.c.c.n;
import org.a.a.c.f.i;
import org.a.a.i.b.e;
import org.a.a.n.c;
import org.a.a.o.a;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.ProtocolException;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.protocol.HttpProcessor;

@b
public class g implements b {
    private static final String a = "HttpClient";
    private final b b;
    private final HttpProcessor c;

    public g(b bVar, HttpProcessor httpProcessor) {
        a.a((Object) bVar, "HTTP client request executor");
        a.a((Object) httpProcessor, "HTTP protocol processor");
        this.b = bVar;
        this.c = httpProcessor;
    }

    public org.a.a.c.c.b a(HttpRoute httpRoute, n nVar, org.a.a.c.e.a aVar, f fVar) {
        URI uri;
        a.a((Object) httpRoute, "HTTP route");
        a.a((Object) nVar, "HTTP request");
        a.a((Object) aVar, "HTTP context");
        HttpRequest a = nVar.a();
        if (a instanceof HttpUriRequest) {
            uri = ((HttpUriRequest) a).getURI();
        } else {
            String uri2 = a.getRequestLine().getUri();
            try {
                uri = URI.create(uri2);
            } catch (Throwable e) {
                if (Log.isLoggable(a, 3)) {
                    Log.d(a, "Unable to parse '" + uri2 + "' as a valid URI; " + "request URI and Host header may be inconsistent", e);
                }
                uri = null;
            }
        }
        nVar.a(uri);
        a(nVar, httpRoute);
        HttpHost httpHost = (HttpHost) nVar.getParams().getParameter("http.virtual-host");
        if (httpHost != null && httpHost.getPort() == -1) {
            int port = httpRoute.getTargetHost().getPort();
            if (port != -1) {
                httpHost = new HttpHost(httpHost.getHostName(), port, httpHost.getSchemeName());
            }
            if (Log.isLoggable(a, 3)) {
                Log.d(a, "Using virtual host" + httpHost);
            }
        }
        if (httpHost == null) {
            httpHost = (uri == null || !uri.isAbsolute() || uri.getHost() == null) ? null : new HttpHost(uri.getHost(), uri.getPort(), uri.getScheme());
        }
        HttpHost targetHost = httpHost == null ? httpRoute.getTargetHost() : httpHost;
        if (uri != null) {
            String userInfo = uri.getUserInfo();
            if (userInfo != null) {
                CredentialsProvider i = aVar.i();
                if (i == null) {
                    i = new e();
                    aVar.a(i);
                }
                i.setCredentials(new AuthScope(targetHost.getHostName(), targetHost.getPort()), new UsernamePasswordCredentials(userInfo));
            }
        }
        aVar.setAttribute(c.q, targetHost);
        aVar.setAttribute(org.a.a.c.e.a.a, httpRoute);
        aVar.setAttribute(c.o, nVar);
        this.c.process(nVar, aVar);
        org.a.a.c.c.b a2 = this.b.a(httpRoute, nVar, aVar, fVar);
        try {
            aVar.setAttribute(c.p, a2);
            this.c.process(a2, aVar);
            return a2;
        } catch (RuntimeException e2) {
            a2.close();
            throw e2;
        } catch (IOException e3) {
            a2.close();
            throw e3;
        } catch (HttpException e4) {
            a2.close();
            throw e4;
        }
    }

    void a(n nVar, HttpRoute httpRoute) {
        try {
            URI uri = nVar.getURI();
            if (uri != null) {
                uri = (httpRoute.getProxyHost() == null || httpRoute.isTunnelled()) ? uri.isAbsolute() ? i.a(uri, null, true) : i.a(uri) : !uri.isAbsolute() ? i.a(uri, httpRoute.getTargetHost(), true) : i.a(uri);
                nVar.a(uri);
            }
        } catch (Throwable e) {
            throw new ProtocolException("Invalid URI: " + nVar.getRequestLine().getUri(), e);
        }
    }
}
