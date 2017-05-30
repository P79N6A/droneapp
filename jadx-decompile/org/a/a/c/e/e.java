package org.a.a.c.e;

import android.util.Log;
import org.a.a.a.b;
import org.a.a.o.a;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.conn.routing.RouteInfo;
import org.apache.http.protocol.HttpContext;

@b
public class e implements HttpRequestInterceptor {
    private static final String a = "HttpClient";
    private static final String b = "Proxy-Connection";

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        a.a((Object) httpRequest, "HTTP request");
        if (httpRequest.getRequestLine().getMethod().equalsIgnoreCase("CONNECT")) {
            httpRequest.setHeader(b, "Keep-Alive");
            return;
        }
        RouteInfo b = a.a(httpContext).b();
        if (b != null) {
            if ((b.getHopCount() == 1 || b.isTunnelled()) && !httpRequest.containsHeader(org.a.a.e.j)) {
                httpRequest.addHeader(org.a.a.e.j, "Keep-Alive");
            }
            if (b.getHopCount() == 2 && !b.isTunnelled() && !httpRequest.containsHeader(b)) {
                httpRequest.addHeader(b, "Keep-Alive");
            }
        } else if (Log.isLoggable(a, 3)) {
            Log.d(a, "Connection route not set in the context");
        }
    }
}
