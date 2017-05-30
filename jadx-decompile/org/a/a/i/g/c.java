package org.a.a.i.g;

import java.io.IOException;
import java.io.InputStream;
import org.a.a.g;
import org.a.a.o.a;
import org.apache.http.Header;
import org.apache.http.MalformedChunkCodingException;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.util.CharArrayBuffer;

@org.a.a.a.c
public class c extends InputStream {
    private static final int a = 1;
    private static final int b = 2;
    private static final int c = 3;
    private static final int d = 2048;
    private final SessionInputBuffer e;
    private final CharArrayBuffer f;
    private int g;
    private int h;
    private int i;
    private boolean j = false;
    private boolean k = false;
    private Header[] l = new Header[0];

    public c(SessionInputBuffer sessionInputBuffer) {
        this.e = (SessionInputBuffer) a.a((Object) sessionInputBuffer, "Session input buffer");
        this.i = 0;
        this.f = new CharArrayBuffer(16);
        this.g = 1;
    }

    private void b() {
        this.h = c();
        if (this.h < 0) {
            throw new MalformedChunkCodingException("Negative chunk size");
        }
        this.g = 2;
        this.i = 0;
        if (this.h == 0) {
            this.j = true;
            d();
        }
    }

    private int c() {
        int i = 0;
        switch (this.g) {
            case 3:
                this.f.clear();
                if (this.e.readLine(this.f) != -1) {
                    if (this.f.isEmpty()) {
                        this.g = 1;
                    } else {
                        throw new MalformedChunkCodingException("Unexpected content at the end of chunk");
                    }
                }
                break;
            case 1:
                this.f.clear();
                if (this.e.readLine(this.f) != -1) {
                    i = this.f.indexOf(59);
                    if (i < 0) {
                        i = this.f.length();
                    }
                    try {
                        i = Integer.parseInt(this.f.substringTrimmed(0, i), 16);
                        break;
                    } catch (NumberFormatException e) {
                        throw new MalformedChunkCodingException("Bad chunk header");
                    }
                }
                break;
            default:
                throw new IllegalStateException("Inconsistent codec state");
        }
        return i;
    }

    private void d() {
        try {
            this.l = a.a(this.e, -1, -1, null);
        } catch (Throwable e) {
            IOException malformedChunkCodingException = new MalformedChunkCodingException("Invalid footer: " + e.getMessage());
            malformedChunkCodingException.initCause(e);
            throw malformedChunkCodingException;
        }
    }

    public Header[] a() {
        return (Header[]) this.l.clone();
    }

    public int available() {
        return this.e instanceof org.a.a.j.a ? Math.min(((org.a.a.j.a) this.e).c(), this.h - this.i) : 0;
    }

    public void close() {
        if (!this.k) {
            try {
                if (!this.j) {
                    do {
                    } while (read(new byte[2048]) >= 0);
                }
                this.j = true;
                this.k = true;
            } catch (Throwable th) {
                this.j = true;
                this.k = true;
            }
        }
    }

    public int read() {
        if (this.k) {
            throw new IOException("Attempted read from closed stream.");
        } else if (this.j) {
            return -1;
        } else {
            if (this.g != 2) {
                b();
                if (this.j) {
                    return -1;
                }
            }
            int read = this.e.read();
            if (read != -1) {
                this.i++;
                if (this.i >= this.h) {
                    this.g = 3;
                }
            }
            return read;
        }
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        if (this.k) {
            throw new IOException("Attempted read from closed stream.");
        } else if (this.j) {
            return -1;
        } else {
            if (this.g != 2) {
                b();
                if (this.j) {
                    return -1;
                }
            }
            int read = this.e.read(bArr, i, Math.min(i2, this.h - this.i));
            if (read != -1) {
                this.i += read;
                if (this.i >= this.h) {
                    this.g = 3;
                }
                return read;
            }
            this.j = true;
            throw new g("Truncated chunk ( expected size: " + this.h + "; actual size: " + this.i + ")");
        }
    }
}
