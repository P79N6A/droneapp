package org.a.a.n;

import org.a.a.a.b;
import org.a.a.e;
import org.a.a.o.a;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;
import org.apache.http.protocol.HttpContext;

@b
public class h implements HttpRequestInterceptor {
    private final boolean a;

    public h() {
        this(false);
    }

    public h(boolean z) {
        this.a = z;
    }

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        a.a((Object) httpRequest, "HTTP request");
        if (httpRequest instanceof HttpEntityEnclosingRequest) {
            if (this.a) {
                httpRequest.removeHeaders(e.W);
                httpRequest.removeHeaders("Content-Length");
            } else if (httpRequest.containsHeader(e.W)) {
                throw new ProtocolException("Transfer-encoding header already present");
            } else if (httpRequest.containsHeader("Content-Length")) {
                throw new ProtocolException("Content-Length header already present");
            }
            ProtocolVersion protocolVersion = httpRequest.getRequestLine().getProtocolVersion();
            HttpEntity entity = ((HttpEntityEnclosingRequest) httpRequest).getEntity();
            if (entity == null) {
                httpRequest.addHeader("Content-Length", "0");
                return;
            }
            if (!entity.isChunked() && entity.getContentLength() >= 0) {
                httpRequest.addHeader("Content-Length", Long.toString(entity.getContentLength()));
            } else if (protocolVersion.lessEquals(HttpVersion.HTTP_1_0)) {
                throw new ProtocolException("Chunked transfer encoding not allowed for " + protocolVersion);
            } else {
                httpRequest.addHeader(e.W, "chunked");
            }
            if (!(entity.getContentType() == null || httpRequest.containsHeader("Content-Type"))) {
                httpRequest.addHeader(entity.getContentType());
            }
            if (entity.getContentEncoding() != null && !httpRequest.containsHeader("Content-Encoding")) {
                httpRequest.addHeader(entity.getContentEncoding());
            }
        }
    }
}
