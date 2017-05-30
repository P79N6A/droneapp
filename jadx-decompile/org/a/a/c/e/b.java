package org.a.a.c.e;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.protocol.HttpContext;

@org.a.a.a.b
public class b implements HttpRequestInterceptor {
    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        if (!httpRequest.containsHeader("Accept-Encoding")) {
            httpRequest.addHeader("Accept-Encoding", "gzip,deflate");
        }
    }
}
