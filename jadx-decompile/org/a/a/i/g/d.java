package org.a.a.i.g;

import java.io.IOException;
import java.io.OutputStream;
import org.a.a.a.c;
import org.apache.http.io.SessionOutputBuffer;

@c
public class d extends OutputStream {
    private final SessionOutputBuffer a;
    private final byte[] b;
    private int c;
    private boolean d;
    private boolean e;

    public d(int i, SessionOutputBuffer sessionOutputBuffer) {
        this.c = 0;
        this.d = false;
        this.e = false;
        this.b = new byte[i];
        this.a = sessionOutputBuffer;
    }

    @Deprecated
    public d(SessionOutputBuffer sessionOutputBuffer) {
        this(2048, sessionOutputBuffer);
    }

    @Deprecated
    public d(SessionOutputBuffer sessionOutputBuffer, int i) {
        this(i, sessionOutputBuffer);
    }

    protected void a() {
        if (this.c > 0) {
            this.a.writeLine(Integer.toHexString(this.c));
            this.a.write(this.b, 0, this.c);
            this.a.writeLine("");
            this.c = 0;
        }
    }

    protected void a(byte[] bArr, int i, int i2) {
        this.a.writeLine(Integer.toHexString(this.c + i2));
        this.a.write(this.b, 0, this.c);
        this.a.write(bArr, i, i2);
        this.a.writeLine("");
        this.c = 0;
    }

    protected void b() {
        this.a.writeLine("0");
        this.a.writeLine("");
    }

    public void c() {
        if (!this.d) {
            a();
            b();
            this.d = true;
        }
    }

    public void close() {
        if (!this.e) {
            this.e = true;
            c();
            this.a.flush();
        }
    }

    public void flush() {
        a();
        this.a.flush();
    }

    public void write(int i) {
        if (this.e) {
            throw new IOException("Attempted write to closed stream.");
        }
        this.b[this.c] = (byte) i;
        this.c++;
        if (this.c == this.b.length) {
            a();
        }
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        if (this.e) {
            throw new IOException("Attempted write to closed stream.");
        } else if (i2 >= this.b.length - this.c) {
            a(bArr, i, i2);
        } else {
            System.arraycopy(bArr, i, this.b, this.c, i2);
            this.c += i2;
        }
    }
}
