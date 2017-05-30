package org.a.a.i.c;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.a.a.a.d;
import org.a.a.f.h;
import org.a.a.m.a;
import org.apache.http.conn.routing.HttpRoute;

@d
class b extends a<HttpRoute, h, c> {
    private static final AtomicLong a = new AtomicLong();
    private final long b;
    private final TimeUnit c;

    public b(org.a.a.m.b<HttpRoute, h> bVar, int i, int i2, long j, TimeUnit timeUnit) {
        super(bVar, i, i2);
        this.b = j;
        this.c = timeUnit;
    }

    protected c a(HttpRoute httpRoute, h hVar) {
        return new c(Long.toString(a.getAndIncrement()), httpRoute, hVar, this.b, this.c);
    }
}
