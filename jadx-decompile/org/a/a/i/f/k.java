package org.a.a.i.f;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;
import org.a.a.a.c;
import org.a.a.h.g;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.conn.EofSensorWatcher;

@c
class k extends g implements EofSensorWatcher {
    private final c b;

    k(HttpEntity httpEntity, c cVar) {
        super(httpEntity);
        this.b = cVar;
    }

    public static void a(HttpResponse httpResponse, c cVar) {
        HttpEntity entity = httpResponse.getEntity();
        if (entity != null && entity.isStreaming() && cVar != null) {
            httpResponse.setEntity(new k(entity, cVar));
        }
    }

    private void b() {
        if (this.b != null) {
            this.b.abortConnection();
        }
    }

    public void a() {
        if (this.b != null) {
            try {
                if (this.b.b()) {
                    this.b.releaseConnection();
                }
                b();
            } catch (Throwable th) {
                b();
            }
        }
    }

    @Deprecated
    public void consumeContent() {
        a();
    }

    public boolean eofDetected(InputStream inputStream) {
        try {
            inputStream.close();
            a();
            return false;
        } finally {
            b();
        }
    }

    public InputStream getContent() {
        return new org.a.a.f.c(this.a.getContent(), this);
    }

    public boolean isRepeatable() {
        return false;
    }

    public boolean streamAbort(InputStream inputStream) {
        b();
        return false;
    }

    public boolean streamClosed(InputStream inputStream) {
        boolean z;
        try {
            z = (this.b == null || this.b.e()) ? false : true;
            inputStream.close();
            a();
        } catch (SocketException e) {
            if (z) {
                throw e;
            }
        } catch (Throwable th) {
            b();
        }
        b();
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ResponseEntityProxy{");
        stringBuilder.append(this.a);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public void writeTo(OutputStream outputStream) {
        try {
            this.a.writeTo(outputStream);
            a();
        } finally {
            b();
        }
    }
}
