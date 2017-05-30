package org.a.a.i.c;

import org.a.a.a.b;
import org.a.a.o.a;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.protocol.HttpContext;

@b
public class i extends j {
    private final HttpHost a;

    public i(HttpHost httpHost) {
        this(httpHost, null);
    }

    public i(HttpHost httpHost, org.a.a.f.i iVar) {
        super(iVar);
        this.a = (HttpHost) a.a((Object) httpHost, "Proxy host");
    }

    protected HttpHost a(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return this.a;
    }
}
