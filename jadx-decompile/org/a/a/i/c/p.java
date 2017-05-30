package org.a.a.i.c;

import java.io.IOException;
import java.io.OutputStream;
import org.a.a.a.c;

@c
class p extends OutputStream {
    private final OutputStream a;
    private final u b;

    public p(OutputStream outputStream, u uVar) {
        this.a = outputStream;
        this.b = uVar;
    }

    public void close() {
        try {
            this.a.close();
        } catch (IOException e) {
            this.b.a("[close] I/O error: " + e.getMessage());
            throw e;
        }
    }

    public void flush() {
        try {
            this.a.flush();
        } catch (IOException e) {
            this.b.a("[flush] I/O error: " + e.getMessage());
            throw e;
        }
    }

    public void write(int i) {
        try {
            this.b.a(i);
        } catch (IOException e) {
            this.b.a("[write] I/O error: " + e.getMessage());
            throw e;
        }
    }

    public void write(byte[] bArr) {
        try {
            this.b.a(bArr);
            this.a.write(bArr);
        } catch (IOException e) {
            this.b.a("[write] I/O error: " + e.getMessage());
            throw e;
        }
    }

    public void write(byte[] bArr, int i, int i2) {
        try {
            this.b.a(bArr, i, i2);
            this.a.write(bArr, i, i2);
        } catch (IOException e) {
            this.b.a("[write] I/O error: " + e.getMessage());
            throw e;
        }
    }
}
