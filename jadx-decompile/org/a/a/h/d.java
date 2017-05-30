package org.a.a.h;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.a.a.a.c;
import org.a.a.o.a;

@c
public class d extends a implements Cloneable {
    @Deprecated
    protected final byte[] e;
    private final byte[] f;
    private final int g;
    private final int h;

    public d(byte[] bArr) {
        this(bArr, null);
    }

    public d(byte[] bArr, int i, int i2) {
        this(bArr, i, i2, null);
    }

    public d(byte[] bArr, int i, int i2, e eVar) {
        a.a(bArr, "Source byte array");
        if (i < 0 || i > bArr.length || i2 < 0 || i + i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException("off: " + i + " len: " + i2 + " b.length: " + bArr.length);
        }
        this.e = bArr;
        this.f = bArr;
        this.g = i;
        this.h = i2;
        if (eVar != null) {
            a(eVar.toString());
        }
    }

    public d(byte[] bArr, e eVar) {
        a.a(bArr, "Source byte array");
        this.e = bArr;
        this.f = bArr;
        this.g = 0;
        this.h = this.f.length;
        if (eVar != null) {
            a(eVar.toString());
        }
    }

    public Object clone() {
        return super.clone();
    }

    public InputStream getContent() {
        return new ByteArrayInputStream(this.f, this.g, this.h);
    }

    public long getContentLength() {
        return (long) this.h;
    }

    public boolean isRepeatable() {
        return true;
    }

    public boolean isStreaming() {
        return false;
    }

    public void writeTo(OutputStream outputStream) {
        a.a(outputStream, "Output stream");
        outputStream.write(this.f, this.g, this.h);
        outputStream.flush();
    }
}
