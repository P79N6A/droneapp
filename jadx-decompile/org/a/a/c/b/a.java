package org.a.a.c.b;

import java.io.InputStream;
import java.io.OutputStream;
import org.a.a.h.g;
import org.apache.http.HttpEntity;

abstract class a extends g {
    private static final int b = 2048;
    private InputStream c;

    public a(HttpEntity httpEntity) {
        super(httpEntity);
    }

    private InputStream a() {
        return new g(this.a.getContent(), this);
    }

    abstract InputStream a(InputStream inputStream);

    public InputStream getContent() {
        if (!this.a.isStreaming()) {
            return a();
        }
        if (this.c == null) {
            this.c = a();
        }
        return this.c;
    }

    public void writeTo(OutputStream outputStream) {
        org.a.a.o.a.a((Object) outputStream, "Output stream");
        InputStream content = getContent();
        try {
            byte[] bArr = new byte[2048];
            while (true) {
                int read = content.read(bArr);
                if (read == -1) {
                    break;
                }
                outputStream.write(bArr, 0, read);
            }
        } finally {
            content.close();
        }
    }
}
