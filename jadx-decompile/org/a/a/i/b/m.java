package org.a.a.i.b;

import android.util.Log;
import java.net.URI;
import java.util.Locale;
import org.a.a.a.b;
import org.a.a.c.a.c;
import org.a.a.c.c.g;
import org.a.a.c.c.h;
import org.a.a.c.c.p;
import org.a.a.c.e;
import org.a.a.c.f.i;
import org.a.a.o.a;
import org.a.a.o.f;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.client.CircularRedirectException;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

@b
public class m implements e {
    @Deprecated
    public static final String a = "http.protocol.redirect-locations";
    public static final m b = new m();
    private static final String c = "HttpClient";
    private static final String[] d = new String[]{"GET", h.a};

    protected URI a(String str) {
        try {
            org.a.a.c.f.h hVar = new org.a.a.c.f.h(new URI(str).normalize());
            String h = hVar.h();
            if (h != null) {
                hVar.c(h.toLowerCase(Locale.ENGLISH));
            }
            if (f.a(hVar.j())) {
                hVar.d("/");
            }
            return hVar.a();
        } catch (Throwable e) {
            throw new ProtocolException("Invalid redirect URI: " + str, e);
        }
    }

    public boolean a(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) {
        a.a(httpRequest, "HTTP request");
        a.a(httpResponse, "HTTP response");
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        String method = httpRequest.getRequestLine().getMethod();
        Header firstHeader = httpResponse.getFirstHeader(com.google.firebase.a.a.b.p);
        switch (statusCode) {
            case 301:
            case 307:
                return b(method);
            case 302:
                return b(method) && firstHeader != null;
            case 303:
                return true;
            default:
                return false;
        }
    }

    public HttpUriRequest b(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) {
        URI c = c(httpRequest, httpResponse, httpContext);
        String method = httpRequest.getRequestLine().getMethod();
        return method.equalsIgnoreCase(h.a) ? new h(c) : method.equalsIgnoreCase("GET") ? new g(c) : httpResponse.getStatusLine().getStatusCode() == 307 ? p.a(httpRequest).a(c).n() : new g(c);
    }

    protected boolean b(String str) {
        for (String equalsIgnoreCase : d) {
            if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public URI c(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) {
        a.a(httpRequest, "HTTP request");
        a.a(httpResponse, "HTTP response");
        a.a(httpContext, "HTTP context");
        org.a.a.c.e.a a = org.a.a.c.e.a.a(httpContext);
        Header firstHeader = httpResponse.getFirstHeader(com.google.firebase.a.a.b.p);
        if (firstHeader == null) {
            throw new ProtocolException("Received redirect response " + httpResponse.getStatusLine() + " but no location header");
        }
        String value = firstHeader.getValue();
        if (Log.isLoggable(c, 3)) {
            Log.d(c, "Redirect requested to location '" + value + "'");
        }
        c n = a.n();
        URI a2 = a(value);
        try {
            URI uri;
            if (a2.isAbsolute()) {
                uri = a2;
            } else if (n.g()) {
                HttpHost t = a.t();
                org.a.a.o.b.a(t, "Target host");
                uri = i.a(i.a(new URI(httpRequest.getRequestLine().getUri()), t, false), a2);
            } else {
                throw new ProtocolException("Relative redirect location '" + a2 + "' not allowed");
            }
            ad adVar = (ad) a.getAttribute("http.protocol.redirect-locations");
            if (adVar == null) {
                adVar = new ad();
                httpContext.setAttribute("http.protocol.redirect-locations", adVar);
            }
            if (n.h() || !adVar.a(uri)) {
                adVar.b(uri);
                return uri;
            }
            throw new CircularRedirectException("Circular redirect to '" + uri + "'");
        } catch (Throwable e) {
            throw new ProtocolException(e.getMessage(), e);
        }
    }
}
