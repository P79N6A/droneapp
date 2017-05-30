package org.a.a.c.e;

import java.util.Collection;
import org.a.a.a.b;
import org.a.a.o.a;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.protocol.HttpContext;

@b
public class f implements HttpRequestInterceptor {
    private final Collection<? extends Header> a;

    public f() {
        this(null);
    }

    public f(Collection<? extends Header> collection) {
        this.a = collection;
    }

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        a.a((Object) httpRequest, "HTTP request");
        if (!httpRequest.getRequestLine().getMethod().equalsIgnoreCase("CONNECT")) {
            Collection collection = (Collection) httpRequest.getParams().getParameter("http.default-headers");
            if (collection == null) {
                collection = this.a;
            }
            if (r0 != null) {
                for (Header addHeader : r0) {
                    httpRequest.addHeader(addHeader);
                }
            }
        }
    }
}
