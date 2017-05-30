package org.a.a.h;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.a.a.o.a;
import org.a.a.o.d;
import org.apache.http.HttpEntity;

@org.a.a.a.c
public class c extends g {
    private final byte[] b;

    public c(HttpEntity httpEntity) {
        super(httpEntity);
        if (!httpEntity.isRepeatable() || httpEntity.getContentLength() < 0) {
            this.b = d.c(httpEntity);
        } else {
            this.b = null;
        }
    }

    public InputStream getContent() {
        return this.b != null ? new ByteArrayInputStream(this.b) : super.getContent();
    }

    public long getContentLength() {
        return this.b != null ? (long) this.b.length : super.getContentLength();
    }

    public boolean isChunked() {
        return this.b == null && super.isChunked();
    }

    public boolean isRepeatable() {
        return true;
    }

    public boolean isStreaming() {
        return this.b == null && super.isStreaming();
    }

    public void writeTo(OutputStream outputStream) {
        a.a((Object) outputStream, "Output stream");
        if (this.b != null) {
            outputStream.write(this.b);
        } else {
            super.writeTo(outputStream);
        }
    }
}
