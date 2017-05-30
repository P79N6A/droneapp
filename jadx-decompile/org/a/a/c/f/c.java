package org.a.a.c.f;

import java.io.Closeable;
import java.io.IOException;
import org.a.a.c.c.b;
import org.a.a.o.d;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;

public class c {
    private c() {
    }

    public static void a(b bVar) {
        if (bVar != null) {
            try {
                d.b(bVar.getEntity());
                bVar.close();
            } catch (IOException e) {
            } catch (Throwable th) {
                bVar.close();
            }
        }
    }

    public static void a(HttpResponse httpResponse) {
        if (httpResponse != null) {
            HttpEntity entity = httpResponse.getEntity();
            if (entity != null) {
                try {
                    d.b(entity);
                } catch (IOException e) {
                }
            }
        }
    }

    public static void a(HttpClient httpClient) {
        if (httpClient != null && (httpClient instanceof Closeable)) {
            try {
                ((Closeable) httpClient).close();
            } catch (IOException e) {
            }
        }
    }
}
