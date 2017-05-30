package org.a.a.i.f;

import android.util.Log;
import java.io.IOException;
import java.net.URI;
import java.util.List;
import org.a.a.a.d;
import org.a.a.c.a.c;
import org.a.a.c.c.b;
import org.a.a.c.c.f;
import org.a.a.c.c.n;
import org.a.a.c.e;
import org.a.a.c.f.i;
import org.a.a.o.a;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.ProtocolException;
import org.apache.http.auth.AuthScheme;
import org.apache.http.client.RedirectException;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;

@d
public class h implements b {
    private static final String a = "HttpClient";
    private final b b;
    private final e c;
    private final HttpRoutePlanner d;

    public h(b bVar, HttpRoutePlanner httpRoutePlanner, e eVar) {
        a.a((Object) bVar, "HTTP client request executor");
        a.a((Object) httpRoutePlanner, "HTTP route planner");
        a.a((Object) eVar, "HTTP redirect strategy");
        this.b = bVar;
        this.d = httpRoutePlanner;
        this.c = eVar;
    }

    public b a(HttpRoute httpRoute, n nVar, org.a.a.c.e.a aVar, f fVar) {
        b a;
        a.a((Object) httpRoute, "HTTP route");
        a.a((Object) nVar, "HTTP request");
        a.a((Object) aVar, "HTTP context");
        List c = aVar.c();
        if (c != null) {
            c.clear();
        }
        c n = aVar.n();
        int i = n.i() > 0 ? n.i() : 50;
        int i2 = 0;
        HttpRequest httpRequest = nVar;
        while (true) {
            a = this.b.a(httpRoute, httpRequest, aVar, fVar);
            try {
                if (!n.f() || !this.c.a(httpRequest, a, aVar)) {
                    return a;
                }
                if (i2 >= i) {
                    throw new RedirectException("Maximum redirects (" + i + ") exceeded");
                }
                int i3 = i2 + 1;
                HttpRequest b = this.c.b(httpRequest, a, aVar);
                if (!b.headerIterator().hasNext()) {
                    b.setHeaders(nVar.a().getAllHeaders());
                }
                httpRequest = n.a(b);
                if (httpRequest instanceof HttpEntityEnclosingRequest) {
                    j.a((HttpEntityEnclosingRequest) httpRequest);
                }
                URI uri = httpRequest.getURI();
                HttpHost b2 = i.b(uri);
                if (b2 == null) {
                    throw new ProtocolException("Redirect URI does not specify a valid host name: " + uri);
                }
                if (!httpRoute.getTargetHost().equals(b2)) {
                    org.a.a.b.d k = aVar.k();
                    if (k != null) {
                        if (Log.isLoggable(a, 3)) {
                            Log.d(a, "Resetting target auth state");
                        }
                        k.a();
                    }
                    k = aVar.l();
                    if (k != null) {
                        AuthScheme c2 = k.c();
                        if (c2 != null && c2.isConnectionBased()) {
                            if (Log.isLoggable(a, 3)) {
                                Log.d(a, "Resetting proxy auth state");
                            }
                            k.a();
                        }
                    }
                }
                httpRoute = this.d.determineRoute(b2, httpRequest, aVar);
                if (Log.isLoggable(a, 3)) {
                    Log.d(a, "Redirecting to '" + uri + "' via " + httpRoute);
                }
                org.a.a.o.d.b(a.getEntity());
                a.close();
                i2 = i3;
            } catch (RuntimeException e) {
                a.close();
                throw e;
            } catch (IOException e2) {
                a.close();
                throw e2;
            } catch (HttpException e3) {
                try {
                    org.a.a.o.d.b(a.getEntity());
                    a.close();
                } catch (Throwable e4) {
                    if (Log.isLoggable(a, 3)) {
                        Log.d(a, "I/O error while releasing connection", e4);
                    }
                    a.close();
                } catch (Throwable th) {
                    a.close();
                }
                throw e3;
            }
        }
        return a;
    }
}
