package org.a.a.c.b;

import java.io.InputStream;
import org.a.a.a.c;

@c
class g extends InputStream {
    private final InputStream a;
    private final a b;
    private InputStream c;

    public g(InputStream inputStream, a aVar) {
        this.a = inputStream;
        this.b = aVar;
    }

    private void a() {
        if (this.c == null) {
            this.c = this.b.a(this.a);
        }
    }

    public int available() {
        a();
        return this.c.available();
    }

    public void close() {
        try {
            if (this.c != null) {
                this.c.close();
            }
            this.a.close();
        } catch (Throwable th) {
            this.a.close();
        }
    }

    public boolean markSupported() {
        return false;
    }

    public int read() {
        a();
        return this.c.read();
    }

    public int read(byte[] bArr) {
        a();
        return this.c.read(bArr);
    }

    public int read(byte[] bArr, int i, int i2) {
        a();
        return this.c.read(bArr, i, i2);
    }

    public long skip(long j) {
        a();
        return this.c.skip(j);
    }
}
