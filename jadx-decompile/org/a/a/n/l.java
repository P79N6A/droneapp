package org.a.a.n;

import com.google.android.gms.wallet.e;
import org.a.a.a.b;
import org.a.a.o.a;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.protocol.HttpContext;

@b
public class l implements HttpResponseInterceptor {
    public void process(HttpResponse httpResponse, HttpContext httpContext) {
        a.a((Object) httpResponse, "HTTP response");
        c b = c.b(httpContext);
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        if (statusCode == 400 || statusCode == 408 || statusCode == e.o || statusCode == e.q || statusCode == 414 || statusCode == it.a.a.e.d || statusCode == it.a.a.e.b) {
            httpResponse.setHeader(org.a.a.e.j, "Close");
            return;
        }
        Header firstHeader = httpResponse.getFirstHeader(org.a.a.e.j);
        if (firstHeader == null || !"Close".equalsIgnoreCase(firstHeader.getValue())) {
            HttpEntity entity = httpResponse.getEntity();
            if (entity != null) {
                ProtocolVersion protocolVersion = httpResponse.getStatusLine().getProtocolVersion();
                if (entity.getContentLength() < 0 && (!entity.isChunked() || protocolVersion.lessEquals(HttpVersion.HTTP_1_0))) {
                    httpResponse.setHeader(org.a.a.e.j, "Close");
                    return;
                }
            }
            HttpRequest q = b.q();
            if (q != null) {
                firstHeader = q.getFirstHeader(org.a.a.e.j);
                if (firstHeader != null) {
                    httpResponse.setHeader(org.a.a.e.j, firstHeader.getValue());
                } else if (q.getProtocolVersion().lessEquals(HttpVersion.HTTP_1_0)) {
                    httpResponse.setHeader(org.a.a.e.j, "Close");
                }
            }
        }
    }
}
