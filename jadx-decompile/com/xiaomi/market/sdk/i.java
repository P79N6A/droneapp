package com.xiaomi.market.sdk;

import java.io.OutputStream;

public abstract class i extends OutputStream {
    final /* synthetic */ c G;
    protected OutputStream S;

    public i(c cVar, OutputStream outputStream) {
        this.G = cVar;
        if (outputStream == null) {
            throw new IllegalArgumentException("outputstream is null");
        }
        this.S = outputStream;
    }

    public void close() {
        this.S.close();
    }

    public void flush() {
        this.S.flush();
    }

    public abstract void reset();

    public void write(int i) {
        this.S.write(i);
    }

    public void write(byte[] bArr) {
        this.S.write(bArr);
    }

    public void write(byte[] bArr, int i, int i2) {
        this.S.write(bArr, i, i2);
    }
}
