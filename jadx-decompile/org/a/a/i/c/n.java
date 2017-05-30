package org.a.a.i.c;

import java.io.IOException;
import java.io.InputStream;
import org.a.a.a.c;

@c
class n extends InputStream {
    private final InputStream a;
    private final u b;

    public n(InputStream inputStream, u uVar) {
        this.a = inputStream;
        this.b = uVar;
    }

    public int available() {
        try {
            return this.a.available();
        } catch (IOException e) {
            this.b.b("[available] I/O error : " + e.getMessage());
            throw e;
        }
    }

    public void close() {
        try {
            this.a.close();
        } catch (IOException e) {
            this.b.b("[close] I/O error: " + e.getMessage());
            throw e;
        }
    }

    public void mark(int i) {
        super.mark(i);
    }

    public boolean markSupported() {
        return false;
    }

    public int read() {
        try {
            int read = this.a.read();
            if (read == -1) {
                this.b.b("end of stream");
            } else {
                this.b.b(read);
            }
            return read;
        } catch (IOException e) {
            this.b.b("[read] I/O error: " + e.getMessage());
            throw e;
        }
    }

    public int read(byte[] bArr) {
        try {
            int read = this.a.read(bArr);
            if (read == -1) {
                this.b.b("end of stream");
            } else if (read > 0) {
                this.b.b(bArr, 0, read);
            }
            return read;
        } catch (IOException e) {
            this.b.b("[read] I/O error: " + e.getMessage());
            throw e;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        try {
            int read = this.a.read(bArr, i, i2);
            if (read == -1) {
                this.b.b("end of stream");
            } else if (read > 0) {
                this.b.b(bArr, i, read);
            }
            return read;
        } catch (IOException e) {
            this.b.b("[read] I/O error: " + e.getMessage());
            throw e;
        }
    }

    public void reset() {
        super.reset();
    }

    public long skip(long j) {
        try {
            return super.skip(j);
        } catch (IOException e) {
            this.b.b("[skip] I/O error: " + e.getMessage());
            throw e;
        }
    }
}
