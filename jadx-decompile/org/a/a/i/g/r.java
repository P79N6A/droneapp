package org.a.a.i.g;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import org.a.a.a.c;
import org.a.a.j.a;
import org.a.a.o.b;
import org.apache.http.impl.io.HttpTransportMetricsImpl;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;

@c
public class r implements a, SessionOutputBuffer {
    private static final byte[] a = new byte[]{(byte) 13, (byte) 10};
    private final HttpTransportMetricsImpl b;
    private final ByteArrayBuffer c;
    private final int d;
    private final CharsetEncoder e;
    private OutputStream f;
    private ByteBuffer g;

    public r(HttpTransportMetricsImpl httpTransportMetricsImpl, int i) {
        this(httpTransportMetricsImpl, i, i, null);
    }

    public r(HttpTransportMetricsImpl httpTransportMetricsImpl, int i, int i2, CharsetEncoder charsetEncoder) {
        org.a.a.o.a.a(i, "Buffer size");
        org.a.a.o.a.a((Object) httpTransportMetricsImpl, "HTTP transport metrcis");
        this.b = httpTransportMetricsImpl;
        this.c = new ByteArrayBuffer(i);
        if (i2 < 0) {
            i2 = 0;
        }
        this.d = i2;
        this.e = charsetEncoder;
    }

    private void a(CharBuffer charBuffer) {
        if (charBuffer.hasRemaining()) {
            if (this.g == null) {
                this.g = ByteBuffer.allocate(1024);
            }
            this.e.reset();
            while (charBuffer.hasRemaining()) {
                a(this.e.encode(charBuffer, this.g, true));
            }
            a(this.e.flush(this.g));
            this.g.clear();
        }
    }

    private void a(CoderResult coderResult) {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.g.flip();
        while (this.g.hasRemaining()) {
            write(this.g.get());
        }
        this.g.compact();
    }

    private void a(byte[] bArr, int i, int i2) {
        b.a(this.f, "Output stream");
        this.f.write(bArr, i, i2);
    }

    private void e() {
        if (this.f != null) {
            this.f.flush();
        }
    }

    private void f() {
        int length = this.c.length();
        if (length > 0) {
            a(this.c.buffer(), 0, length);
            this.c.clear();
            this.b.incrementBytesTransferred((long) length);
        }
    }

    public void a(OutputStream outputStream) {
        this.f = outputStream;
    }

    public boolean a() {
        return this.f != null;
    }

    public int b() {
        return this.c.capacity();
    }

    public int c() {
        return this.c.length();
    }

    public int d() {
        return b() - c();
    }

    public void flush() {
        f();
        e();
    }

    public HttpTransportMetrics getMetrics() {
        return this.b;
    }

    public void write(int i) {
        if (this.d > 0) {
            if (this.c.isFull()) {
                f();
            }
            this.c.append(i);
            return;
        }
        f();
        this.f.write(i);
    }

    public void write(byte[] bArr) {
        if (bArr != null) {
            write(bArr, 0, bArr.length);
        }
    }

    public void write(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            if (i2 > this.d || i2 > this.c.capacity()) {
                f();
                a(bArr, i, i2);
                this.b.incrementBytesTransferred((long) i2);
                return;
            }
            if (i2 > this.c.capacity() - this.c.length()) {
                f();
            }
            this.c.append(bArr, i, i2);
        }
    }

    public void writeLine(String str) {
        if (str != null) {
            if (str.length() > 0) {
                if (this.e == null) {
                    for (int i = 0; i < str.length(); i++) {
                        write(str.charAt(i));
                    }
                } else {
                    a(CharBuffer.wrap(str));
                }
            }
            write(a);
        }
    }

    public void writeLine(CharArrayBuffer charArrayBuffer) {
        int i = 0;
        if (charArrayBuffer != null) {
            if (this.e == null) {
                int length = charArrayBuffer.length();
                while (length > 0) {
                    int min = Math.min(this.c.capacity() - this.c.length(), length);
                    if (min > 0) {
                        this.c.append(charArrayBuffer, i, min);
                    }
                    if (this.c.isFull()) {
                        f();
                    }
                    i += min;
                    length -= min;
                }
            } else {
                a(CharBuffer.wrap(charArrayBuffer.buffer(), 0, charArrayBuffer.length()));
            }
            write(a);
        }
    }
}
