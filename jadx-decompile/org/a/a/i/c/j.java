package org.a.a.i.c;

import com.facebook.common.util.UriUtil;
import java.net.InetAddress;
import org.a.a.a.b;
import org.a.a.c.a.c;
import org.a.a.f.i;
import org.a.a.o.a;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.ProtocolException;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.protocol.HttpContext;

@b
public class j implements HttpRoutePlanner {
    private final i a;

    public j(i iVar) {
        if (iVar == null) {
            iVar = k.a;
        }
        this.a = iVar;
    }

    protected HttpHost a(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return null;
    }

    public HttpRoute determineRoute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        a.a((Object) httpRequest, "Request");
        if (httpHost == null) {
            throw new ProtocolException("Target host is not specified");
        }
        c n = org.a.a.c.e.a.a(httpContext).n();
        InetAddress c = n.c();
        HttpHost b = n.b();
        if (b == null) {
            b = a(httpHost, httpRequest, httpContext);
        }
        if (httpHost.getPort() <= 0) {
            try {
                httpHost = new HttpHost(httpHost.getHostName(), this.a.a(httpHost), httpHost.getSchemeName());
            } catch (org.a.a.f.j e) {
                throw new HttpException(e.getMessage());
            }
        }
        boolean equalsIgnoreCase = httpHost.getSchemeName().equalsIgnoreCase(UriUtil.HTTPS_SCHEME);
        return b == null ? new HttpRoute(httpHost, c, equalsIgnoreCase) : new HttpRoute(httpHost, c, b, equalsIgnoreCase);
    }
}
