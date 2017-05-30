package org.a.a.i.g;

import java.io.IOException;
import java.io.OutputStream;
import org.a.a.a.c;
import org.a.a.o.a;
import org.apache.http.io.SessionOutputBuffer;

@c
public class f extends OutputStream {
    private final SessionOutputBuffer a;
    private final long b;
    private long c = 0;
    private boolean d = false;

    public f(SessionOutputBuffer sessionOutputBuffer, long j) {
        this.a = (SessionOutputBuffer) a.a((Object) sessionOutputBuffer, "Session output buffer");
        this.b = a.b(j, "Content length");
    }

    public void close() {
        if (!this.d) {
            this.d = true;
            this.a.flush();
        }
    }

    public void flush() {
        this.a.flush();
    }

    public void write(int i) {
        if (this.d) {
            throw new IOException("Attempted write to closed stream.");
        } else if (this.c < this.b) {
            this.a.write(i);
            this.c++;
        }
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        if (this.d) {
            throw new IOException("Attempted write to closed stream.");
        } else if (this.c < this.b) {
            long j = this.b - this.c;
            if (((long) i2) > j) {
                i2 = (int) j;
            }
            this.a.write(bArr, i, i2);
            this.c += (long) i2;
        }
    }
}
