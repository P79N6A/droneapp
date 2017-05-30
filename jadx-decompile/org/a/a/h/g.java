package org.a.a.h;

import java.io.InputStream;
import java.io.OutputStream;
import org.a.a.a.c;
import org.a.a.o.a;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

@c
public class g implements HttpEntity {
    protected HttpEntity a;

    public g(HttpEntity httpEntity) {
        this.a = (HttpEntity) a.a(httpEntity, "Wrapped entity");
    }

    @Deprecated
    public void consumeContent() {
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

    public void writeTo(OutputStream outputStream) {
        this.a.writeTo(outputStream);
    }
}
