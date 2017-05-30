package com.android.volley.toolbox;

import java.io.ByteArrayOutputStream;

public class q extends ByteArrayOutputStream {
    private static final int a = 256;
    private final d b;

    public q(d dVar) {
        this(dVar, 256);
    }

    public q(d dVar, int i) {
        this.b = dVar;
        this.buf = this.b.a(Math.max(i, 256));
    }

    private void a(int i) {
        if (this.count + i > this.buf.length) {
            Object a = this.b.a((this.count + i) * 2);
            System.arraycopy(this.buf, 0, a, 0, this.count);
            this.b.a(this.buf);
            this.buf = a;
        }
    }

    public void close() {
        this.b.a(this.buf);
        this.buf = null;
        super.close();
    }

    public void finalize() {
        this.b.a(this.buf);
    }

    public synchronized void write(int i) {
        a(1);
        super.write(i);
    }

    public synchronized void write(byte[] bArr, int i, int i2) {
        a(i2);
        super.write(bArr, i, i2);
    }
}
