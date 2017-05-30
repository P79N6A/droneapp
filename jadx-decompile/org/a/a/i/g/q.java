package org.a.a.i.g;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import org.a.a.a.c;
import org.a.a.f;
import org.a.a.j.a;
import org.a.a.o.b;
import org.apache.http.impl.io.HttpTransportMetricsImpl;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;

@c
public class q implements a, SessionInputBuffer {
    private final HttpTransportMetricsImpl a;
    private final byte[] b;
    private final ByteArrayBuffer c;
    private final int d;
    private final org.a.a.e.c e;
    private final CharsetDecoder f;
    private InputStream g;
    private int h;
    private int i;
    private CharBuffer j;

    public q(HttpTransportMetricsImpl httpTransportMetricsImpl, int i) {
        this(httpTransportMetricsImpl, i, i, null, null);
    }

    public q(HttpTransportMetricsImpl httpTransportMetricsImpl, int i, int i2, org.a.a.e.c cVar, CharsetDecoder charsetDecoder) {
        org.a.a.o.a.a((Object) httpTransportMetricsImpl, "HTTP transport metrcis");
        org.a.a.o.a.a(i, "Buffer size");
        this.a = httpTransportMetricsImpl;
        this.b = new byte[i];
        this.h = 0;
        this.i = 0;
        if (i2 < 0) {
            i2 = 512;
        }
        this.d = i2;
        if (cVar == null) {
            cVar = org.a.a.e.c.a;
        }
        this.e = cVar;
        this.c = new ByteArrayBuffer(i);
        this.f = charsetDecoder;
    }

    private int a(CoderResult coderResult, CharArrayBuffer charArrayBuffer, ByteBuffer byteBuffer) {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.j.flip();
        int remaining = this.j.remaining();
        while (this.j.hasRemaining()) {
            charArrayBuffer.append(this.j.get());
        }
        this.j.compact();
        return remaining;
    }

    private int a(CharArrayBuffer charArrayBuffer) {
        int length = this.c.length();
        if (length > 0) {
            if (this.c.byteAt(length - 1) == 10) {
                length--;
            }
            if (length > 0 && this.c.byteAt(length - 1) == 13) {
                length--;
            }
        }
        if (this.f == null) {
            charArrayBuffer.append(this.c, 0, length);
        } else {
            length = a(charArrayBuffer, ByteBuffer.wrap(this.c.buffer(), 0, length));
        }
        this.c.clear();
        return length;
    }

    private int a(CharArrayBuffer charArrayBuffer, int i) {
        int i2 = this.h;
        this.h = i + 1;
        if (i > i2 && this.b[i - 1] == (byte) 13) {
            i--;
        }
        int i3 = i - i2;
        if (this.f != null) {
            return a(charArrayBuffer, ByteBuffer.wrap(this.b, i2, i3));
        }
        charArrayBuffer.append(this.b, i2, i3);
        return i3;
    }

    private int a(CharArrayBuffer charArrayBuffer, ByteBuffer byteBuffer) {
        int i = 0;
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (this.j == null) {
            this.j = CharBuffer.allocate(1024);
        }
        this.f.reset();
        while (byteBuffer.hasRemaining()) {
            i += a(this.f.decode(byteBuffer, this.j, true), charArrayBuffer, byteBuffer);
        }
        i += a(this.f.flush(this.j), charArrayBuffer, byteBuffer);
        this.j.clear();
        return i;
    }

    private int a(byte[] bArr, int i, int i2) {
        b.a(this.g, "Input stream");
        return this.g.read(bArr, i, i2);
    }

    private int h() {
        for (int i = this.h; i < this.i; i++) {
            if (this.b[i] == (byte) 10) {
                return i;
            }
        }
        return -1;
    }

    public void a(InputStream inputStream) {
        this.g = inputStream;
    }

    public boolean a() {
        return this.g != null;
    }

    public int b() {
        return this.b.length;
    }

    public int c() {
        return this.i - this.h;
    }

    public int d() {
        return b() - c();
    }

    public int e() {
        int i;
        if (this.h > 0) {
            i = this.i - this.h;
            if (i > 0) {
                System.arraycopy(this.b, this.h, this.b, 0, i);
            }
            this.h = 0;
            this.i = i;
        }
        int i2 = this.i;
        i = a(this.b, i2, this.b.length - i2);
        if (i == -1) {
            return -1;
        }
        this.i = i2 + i;
        this.a.incrementBytesTransferred((long) i);
        return i;
    }

    public boolean f() {
        return this.h < this.i;
    }

    public void g() {
        this.h = 0;
        this.i = 0;
    }

    public HttpTransportMetrics getMetrics() {
        return this.a;
    }

    public boolean isDataAvailable(int i) {
        return f();
    }

    public int read() {
        while (!f()) {
            if (e() == -1) {
                return -1;
            }
        }
        byte[] bArr = this.b;
        int i = this.h;
        this.h = i + 1;
        return bArr[i] & 255;
    }

    public int read(byte[] bArr) {
        return bArr == null ? 0 : read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return 0;
        }
        int min;
        if (f()) {
            min = Math.min(i2, this.i - this.h);
            System.arraycopy(this.b, this.h, bArr, i, min);
            this.h += min;
            return min;
        } else if (i2 > this.d) {
            min = a(bArr, i, i2);
            if (min <= 0) {
                return min;
            }
            this.a.incrementBytesTransferred((long) min);
            return min;
        } else {
            while (!f()) {
                if (e() == -1) {
                    return -1;
                }
            }
            min = Math.min(i2, this.i - this.h);
            System.arraycopy(this.b, this.h, bArr, i, min);
            this.h += min;
            return min;
        }
    }

    public int readLine(CharArrayBuffer charArrayBuffer) {
        org.a.a.o.a.a((Object) charArrayBuffer, "Char array buffer");
        Object obj = 1;
        int i = 0;
        while (obj != null) {
            int h = h();
            if (h == -1) {
                if (f()) {
                    this.c.append(this.b, this.h, this.i - this.h);
                    this.h = this.i;
                }
                i = e();
                if (i == -1) {
                    obj = null;
                }
            } else if (this.c.isEmpty()) {
                return a(charArrayBuffer, h);
            } else {
                this.c.append(this.b, this.h, (h + 1) - this.h);
                this.h = h + 1;
                obj = null;
            }
            h = this.e.a();
            if (h > 0 && this.c.length() >= h) {
                throw new f("Maximum line length limit exceeded");
            }
        }
        return (i == -1 && this.c.isEmpty()) ? -1 : a(charArrayBuffer);
    }

    public String readLine() {
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(64);
        return readLine(charArrayBuffer) != -1 ? charArrayBuffer.toString() : null;
    }
}
