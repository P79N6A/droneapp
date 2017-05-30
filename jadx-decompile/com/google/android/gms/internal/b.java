package com.google.android.gms.internal;

import java.io.ByteArrayOutputStream;

public class b extends ByteArrayOutputStream {
    private final ali a;

    public b(ali com_google_android_gms_internal_ali, int i) {
        this.a = com_google_android_gms_internal_ali;
        this.buf = this.a.a(Math.max(i, 256));
    }

    private void a(int i) {
        if (this.count + i > this.buf.length) {
            Object a = this.a.a((this.count + i) * 2);
            System.arraycopy(this.buf, 0, a, 0, this.count);
            this.a.a(this.buf);
            this.buf = a;
        }
    }

    public void close() {
        this.a.a(this.buf);
        this.buf = null;
        super.close();
    }

    public void finalize() {
        this.a.a(this.buf);
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
