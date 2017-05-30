package org.a.a.c.e;

import org.a.a.a.b;
import org.a.a.e;
import org.a.a.o.a;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.protocol.HttpContext;

@b
public class g implements HttpRequestInterceptor {
    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        a.a((Object) httpRequest, "HTTP request");
        if (!httpRequest.containsHeader(e.w) && (httpRequest instanceof HttpEntityEnclosingRequest)) {
            ProtocolVersion protocolVersion = httpRequest.getRequestLine().getProtocolVersion();
            HttpEntity entity = ((HttpEntityEnclosingRequest) httpRequest).getEntity();
            if (entity != null && entity.getContentLength() != 0 && !protocolVersion.lessEquals(HttpVersion.HTTP_1_0) && a.a(httpContext).n().a()) {
                httpRequest.addHeader(e.w, "100-continue");
            }
        }
    }
}
