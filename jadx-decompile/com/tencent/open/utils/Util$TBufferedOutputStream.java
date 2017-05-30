package com.tencent.open.utils;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

class Util$TBufferedOutputStream extends BufferedOutputStream {
    private int a = 0;

    public Util$TBufferedOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    public int getLength() {
        return this.a;
    }

    public void write(byte[] bArr) {
        super.write(bArr);
        this.a += bArr.length;
    }
}
