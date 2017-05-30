package org.a.a.h;

import java.io.InputStream;
import java.io.OutputStream;
import org.a.a.a.c;
import org.a.a.o.a;

@c
public class b extends a {
    private InputStream e;
    private long f = -1;

    public void a(long j) {
        this.f = j;
    }

    public void a(InputStream inputStream) {
        this.e = inputStream;
    }

    public InputStream getContent() {
        org.a.a.o.b.a(this.e != null, "Content has not been provided");
        return this.e;
    }

    public long getContentLength() {
        return this.f;
    }

    public boolean isRepeatable() {
        return false;
    }

    public boolean isStreaming() {
        return this.e != null;
    }

    public void writeTo(OutputStream outputStream) {
        a.a((Object) outputStream, "Output stream");
        InputStream content = getContent();
        try {
            byte[] bArr = new byte[4096];
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
