package org.a.a.i.f;

import android.util.Log;
import java.io.InterruptedIOException;
import org.a.a.a.b;
import org.a.a.c.c.n;
import org.a.a.c.f;
import org.a.a.o.a;
import org.apache.http.Header;
import org.apache.http.conn.routing.HttpRoute;

@b
public class m implements b {
    private static final String a = "HttpClient";
    private final b b;
    private final f c;

    public m(b bVar, f fVar) {
        a.a((Object) bVar, "HTTP request executor");
        a.a((Object) fVar, "Retry strategy");
        this.b = bVar;
        this.c = fVar;
    }

    public org.a.a.c.c.b a(HttpRoute httpRoute, n nVar, org.a.a.c.e.a aVar, org.a.a.c.c.f fVar) {
        Header[] allHeaders = nVar.getAllHeaders();
        int i = 1;
        while (true) {
            org.a.a.c.c.b a = this.b.a(httpRoute, nVar, aVar, fVar);
            if (!this.c.a(a, i, aVar)) {
                return a;
            }
            a.close();
            long a2 = this.c.a();
            if (a2 > 0) {
                try {
                    if (Log.isLoggable(a, 3)) {
                        Log.d(a, "Wait for " + a2);
                    }
                    Thread.sleep(a2);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                } catch (RuntimeException e2) {
                    a.close();
                    throw e2;
                }
            }
            nVar.setHeaders(allHeaders);
            i++;
        }
    }
}
