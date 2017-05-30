package org.a.a.i.f;

import java.io.IOException;
import java.lang.reflect.UndeclaredThrowableException;
import org.a.a.a.b;
import org.a.a.c.c;
import org.a.a.c.c.f;
import org.a.a.c.c.n;
import org.a.a.c.d;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.conn.routing.HttpRoute;

@b
public class a implements b {
    private final b a;
    private final d b;
    private final c c;

    public a(b bVar, d dVar, c cVar) {
        org.a.a.o.a.a((Object) bVar, "HTTP client request executor");
        org.a.a.o.a.a((Object) dVar, "Connection backoff strategy");
        org.a.a.o.a.a((Object) cVar, "Backoff manager");
        this.a = bVar;
        this.b = dVar;
        this.c = cVar;
    }

    public org.a.a.c.c.b a(HttpRoute httpRoute, n nVar, org.a.a.c.e.a aVar, f fVar) {
        org.a.a.o.a.a((Object) httpRoute, "HTTP route");
        org.a.a.o.a.a((Object) nVar, "HTTP request");
        org.a.a.o.a.a((Object) aVar, "HTTP context");
        org.a.a.c.c.b bVar = null;
        try {
            HttpResponse a = this.a.a(httpRoute, nVar, aVar, fVar);
            if (this.b.a(a)) {
                this.c.a(httpRoute);
            } else {
                this.c.b(httpRoute);
            }
            return a;
        } catch (Throwable e) {
            if (bVar != null) {
                bVar.close();
            }
            if (this.b.a(e)) {
                this.c.a(httpRoute);
            }
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            } else if (e instanceof HttpException) {
                throw ((HttpException) e);
            } else if (e instanceof IOException) {
                throw ((IOException) e);
            } else {
                throw new UndeclaredThrowableException(e);
            }
        }
    }
}
