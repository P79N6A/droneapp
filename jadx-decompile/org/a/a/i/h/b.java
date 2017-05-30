package org.a.a.i.h;

import java.util.concurrent.atomic.AtomicLong;
import org.a.a.a.d;
import org.a.a.e.f;
import org.a.a.m.a;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpHost;
import org.apache.http.params.HttpParams;

@d
public class b extends a<HttpHost, HttpClientConnection, c> {
    private static final AtomicLong a = new AtomicLong();

    public b() {
        super(new a(f.a, org.a.a.e.a.a), 2, 20);
    }

    public b(f fVar, org.a.a.e.a aVar) {
        super(new a(fVar, aVar), 2, 20);
    }

    public b(org.a.a.m.b<HttpHost, HttpClientConnection> bVar) {
        super(bVar, 2, 20);
    }

    @Deprecated
    public b(HttpParams httpParams) {
        super(new a(httpParams), 2, 20);
    }

    protected c a(HttpHost httpHost, HttpClientConnection httpClientConnection) {
        return new c(Long.toString(a.getAndIncrement()), httpHost, httpClientConnection);
    }
}
