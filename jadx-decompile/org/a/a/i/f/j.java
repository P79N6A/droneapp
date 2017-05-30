package org.a.a.i.f;

import java.io.InputStream;
import java.io.OutputStream;
import org.a.a.a.c;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;

@c
class j implements HttpEntity {
    private final HttpEntity a;
    private boolean b = false;

    j(HttpEntity httpEntity) {
        this.a = httpEntity;
    }

    static void a(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        HttpEntity entity = httpEntityEnclosingRequest.getEntity();
        if (entity != null && !entity.isRepeatable() && !a(entity)) {
            httpEntityEnclosingRequest.setEntity(new j(entity));
        }
    }

    static boolean a(HttpEntity httpEntity) {
        return httpEntity instanceof j;
    }

    static boolean a(HttpRequest httpRequest) {
        if (httpRequest instanceof HttpEntityEnclosingRequest) {
            HttpEntity entity = ((HttpEntityEnclosingRequest) httpRequest).getEntity();
            if (entity != null) {
                return (!a(entity) || ((j) entity).b()) ? entity.isRepeatable() : true;
            }
        }
        return true;
    }

    public HttpEntity a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }

    @Deprecated
    public void consumeContent() {
        this.b = true;
        this.a.consumeContent();
    }

    public InputStream getContent() {
        return this.a.getContent();
    }

    public Header getContentEncoding() {
        return this.a.getContentEncoding();
    }

    public long getContentLength() {
        return this.a.getContentLength();
    }

    public Header getContentType() {
        return this.a.getContentType();
    }

    public boolean isChunked() {
        return this.a.isChunked();
    }

    public boolean isRepeatable() {
        return this.a.isRepeatable();
    }

    public boolean isStreaming() {
        return this.a.isStreaming();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("RequestEntityProxy{");
        stringBuilder.append(this.a);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public void writeTo(OutputStream outputStream) {
        this.b = true;
        this.a.writeTo(outputStream);
    }
}
