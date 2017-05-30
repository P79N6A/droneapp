package org.a.a.i.g;

import java.io.IOException;
import java.io.OutputStream;
import org.a.a.a.c;
import org.a.a.o.a;
import org.apache.http.io.SessionOutputBuffer;

@c
public class p extends OutputStream {
    private final SessionOutputBuffer a;
    private boolean b = false;

    public p(SessionOutputBuffer sessionOutputBuffer) {
        this.a = (SessionOutputBuffer) a.a((Object) sessionOutputBuffer, "Session output buffer");
    }

    public void close() {
        if (!this.b) {
            this.b = true;
            this.a.flush();
        }
    }

    public void flush() {
        this.a.flush();
    }

    public void write(int i) {
        if (this.b) {
            throw new IOException("Attempted write to closed stream.");
        }
        this.a.write(i);
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        if (this.b) {
            throw new IOException("Attempted write to closed stream.");
        }
        this.a.write(bArr, i, i2);
    }
}
