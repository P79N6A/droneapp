package org.a.a.i.b;

import it.a.a.e;
import org.a.a.a.b;
import org.a.a.c.f;
import org.a.a.o.a;
import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;

@b
public class n implements f {
    private final int a;
    private final long b;

    public n() {
        this(1, 1000);
    }

    public n(int i, int i2) {
        a.a(i, "Max retries");
        a.a(i2, "Retry interval");
        this.a = i;
        this.b = (long) i2;
    }

    public long a() {
        return this.b;
    }

    public boolean a(HttpResponse httpResponse, int i, HttpContext httpContext) {
        return i <= this.a && httpResponse.getStatusLine().getStatusCode() == e.d;
    }
}
