package org.a.a.n;

import org.a.a.a.d;
import org.a.a.o.a;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpDateGenerator;

@d
public class i implements HttpRequestInterceptor {
    private static final HttpDateGenerator a = new HttpDateGenerator();

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        a.a((Object) httpRequest, "HTTP request");
        if ((httpRequest instanceof HttpEntityEnclosingRequest) && !httpRequest.containsHeader("Date")) {
            httpRequest.setHeader("Date", a.getCurrentDate());
        }
    }
}
