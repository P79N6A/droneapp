package org.a.a.c.e;

import android.util.Log;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.a.a.a.b;
import org.a.a.o.a;
import org.a.a.o.f;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.routing.RouteInfo;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.SetCookie2;
import org.apache.http.protocol.HttpContext;

@b
public class c implements HttpRequestInterceptor {
    private static final String a = "HttpClient";

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        Object obj = null;
        a.a((Object) httpRequest, "HTTP request");
        a.a((Object) httpContext, "HTTP context");
        if (!httpRequest.getRequestLine().getMethod().equalsIgnoreCase("CONNECT")) {
            HttpContext a = a.a(httpContext);
            CookieStore d = a.d();
            if (d != null) {
                org.a.a.e.b g = a.g();
                if (g != null) {
                    HttpHost t = a.t();
                    if (t != null) {
                        RouteInfo b = a.b();
                        if (b != null) {
                            URI uri;
                            String e = a.n().e();
                            String str = e == null ? org.a.a.c.a.b.d : e;
                            if (Log.isLoggable(a, 3)) {
                                Log.d(a, "CookieSpec selected: " + str);
                            }
                            if (httpRequest instanceof HttpUriRequest) {
                                uri = ((HttpUriRequest) httpRequest).getURI();
                            } else {
                                try {
                                    uri = new URI(httpRequest.getRequestLine().getUri());
                                } catch (URISyntaxException e2) {
                                    uri = null;
                                }
                            }
                            e = uri != null ? uri.getPath() : null;
                            String hostName = t.getHostName();
                            int port = t.getPort();
                            if (port < 0) {
                                port = b.getTargetHost().getPort();
                            }
                            if (port < 0) {
                                port = 0;
                            }
                            if (f.a(e)) {
                                e = "/";
                            }
                            CookieOrigin cookieOrigin = new CookieOrigin(hostName, port, e, b.isSecure());
                            org.a.a.g.b bVar = (org.a.a.g.b) g.a(str);
                            if (bVar == null) {
                                throw new HttpException("Unsupported cookie policy: " + str);
                            }
                            Header versionHeader;
                            CookieSpec a2 = bVar.a(a);
                            List<Cookie> arrayList = new ArrayList(d.getCookies());
                            List<Cookie> arrayList2 = new ArrayList();
                            Date date = new Date();
                            for (Cookie cookie : arrayList) {
                                if (cookie.isExpired(date)) {
                                    if (Log.isLoggable(a, 3)) {
                                        Log.d(a, "Cookie " + cookie + " expired");
                                    }
                                } else if (a2.match(cookie, cookieOrigin)) {
                                    if (Log.isLoggable(a, 3)) {
                                        Log.d(a, "Cookie " + cookie + " match " + cookieOrigin);
                                    }
                                    arrayList2.add(cookie);
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                for (Header versionHeader2 : a2.formatCookies(arrayList2)) {
                                    httpRequest.addHeader(versionHeader2);
                                }
                            }
                            int version = a2.getVersion();
                            if (version > 0) {
                                for (Cookie cookie2 : arrayList2) {
                                    if (version != cookie2.getVersion() || !(cookie2 instanceof SetCookie2)) {
                                        obj = 1;
                                    }
                                }
                                if (obj != null) {
                                    versionHeader2 = a2.getVersionHeader();
                                    if (versionHeader2 != null) {
                                        httpRequest.addHeader(versionHeader2);
                                    }
                                }
                            }
                            httpContext.setAttribute(a.d, a2);
                            httpContext.setAttribute(a.e, cookieOrigin);
                        } else if (Log.isLoggable(a, 3)) {
                            Log.d(a, "Connection route not set in the context");
                        }
                    } else if (Log.isLoggable(a, 3)) {
                        Log.d(a, "Target host not set in the context");
                    }
                } else if (Log.isLoggable(a, 3)) {
                    Log.d(a, "CookieSpec registry not specified in HTTP context");
                }
            } else if (Log.isLoggable(a, 3)) {
                Log.d(a, "Cookie store not specified in HTTP context");
            }
        }
    }
}
