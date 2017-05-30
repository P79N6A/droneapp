package org.a.a.n;

import org.a.a.a.b;
import org.a.a.e;
import org.a.a.o.a;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

@b
public class k implements HttpRequestInterceptor {
    private final String a;

    public k() {
        this(null);
    }

    public k(String str) {
        this.a = str;
    }

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        a.a((Object) httpRequest, "HTTP request");
        if (!httpRequest.containsHeader(e.Y)) {
            String str = null;
            HttpParams params = httpRequest.getParams();
            if (params != null) {
                str = (String) params.getParameter("http.useragent");
            }
            if (str == null) {
                str = this.a;
            }
            if (str != null) {
                httpRequest.addHeader(e.Y, str);
            }
        }
    }
}
