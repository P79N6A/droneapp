package org.a.a.n;

import org.a.a.a.b;
import org.a.a.e;
import org.a.a.o.a;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.protocol.HttpContext;

@b
public class g implements HttpRequestInterceptor {
    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        a.a((Object) httpRequest, "HTTP request");
        if (!httpRequest.getRequestLine().getMethod().equalsIgnoreCase("CONNECT") && !httpRequest.containsHeader(e.j)) {
            httpRequest.addHeader(e.j, "Keep-Alive");
        }
    }
}
