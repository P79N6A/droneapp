package com.google.android.gms.internal;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;

public class hx extends Reader {
    private List<String> a;
    private boolean b;
    private int c;
    private int d;
    private int e;
    private int f;
    private boolean g;

    public hx() {
        this.a = null;
        this.b = false;
        this.e = this.c;
        this.f = this.d;
        this.g = false;
        this.a = new ArrayList();
    }

    private long a(long j) {
        long j2 = 0;
        while (this.d < this.a.size() && j2 < j) {
            int c = c();
            long j3 = j - j2;
            if (j3 < ((long) c)) {
                this.c = (int) (((long) this.c) + j3);
                j2 += j3;
            } else {
                j2 += (long) c;
                this.c = 0;
                this.d++;
            }
        }
        return j2;
    }

    private String b() {
        return this.d < this.a.size() ? (String) this.a.get(this.d) : null;
    }

    private int c() {
        String b = b();
        return b == null ? 0 : b.length() - this.c;
    }

    private void d() {
        if (this.b) {
            throw new IOException("Stream already closed");
        } else if (!this.g) {
            throw new IOException("Reader needs to be frozen before read operations can be called");
        }
    }

    public void a() {
        if (this.g) {
            throw new IllegalStateException("Trying to freeze frozen StringListReader");
        }
        this.g = true;
    }

    public void a(String str) {
        if (this.g) {
            throw new IllegalStateException("Trying to add string after reading");
        } else if (str.length() > 0) {
            this.a.add(str);
        }
    }

    public void close() {
        d();
        this.b = true;
    }

    public void mark(int i) {
        d();
        this.e = this.c;
        this.f = this.d;
    }

    public boolean markSupported() {
        return true;
    }

    public int read() {
        d();
        String b = b();
        if (b == null) {
            return -1;
        }
        char charAt = b.charAt(this.c);
        a(1);
        return charAt;
    }

    public int read(CharBuffer charBuffer) {
        d();
        int remaining = charBuffer.remaining();
        int i = 0;
        String b = b();
        while (remaining > 0 && b != null) {
            int min = Math.min(b.length() - this.c, remaining);
            charBuffer.put((String) this.a.get(this.d), this.c, this.c + min);
            remaining -= min;
            i += min;
            a((long) min);
            b = b();
        }
        return (i > 0 || b != null) ? i : -1;
    }

    public int read(char[] cArr, int i, int i2) {
        d();
        int i3 = 0;
        String b = b();
        while (b != null && i3 < i2) {
            int min = Math.min(c(), i2 - i3);
            b.getChars(this.c, this.c + min, cArr, i + i3);
            int i4 = i3 + min;
            a((long) min);
            i3 = i4;
            b = b();
        }
        return (i3 > 0 || b != null) ? i3 : -1;
    }

    public boolean ready() {
        d();
        return true;
    }

    public void reset() {
        this.c = this.e;
        this.d = this.f;
    }

    public long skip(long j) {
        d();
        return a(j);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String append : this.a) {
            stringBuilder.append(append);
        }
        return stringBuilder.toString();
    }
}
