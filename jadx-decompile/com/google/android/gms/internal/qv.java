package com.google.android.gms.internal;

public final class qv {
    private final byte[] a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g = Integer.MAX_VALUE;
    private int h;
    private int i = 64;
    private int j = 67108864;

    private qv(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i + i2;
        this.e = i;
    }

    public static long a(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static qv a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static qv a(byte[] bArr, int i, int i2) {
        return new qv(bArr, i, i2);
    }

    public static int c(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    private void v() {
        this.c += this.d;
        int i = this.c;
        if (i > this.g) {
            this.d = i - this.g;
            this.c -= this.d;
            return;
        }
        this.d = 0;
    }

    public int a() {
        if (s()) {
            this.f = 0;
            return 0;
        }
        this.f = n();
        if (this.f != 0) {
            return this.f;
        }
        throw rc.d();
    }

    public void a(int i) {
        if (this.f != i) {
            throw rc.e();
        }
    }

    public void a(rd rdVar) {
        int n = n();
        if (this.h >= this.i) {
            throw rc.g();
        }
        n = d(n);
        this.h++;
        rdVar.b(this);
        a(0);
        this.h--;
        e(n);
    }

    public void a(rd rdVar, int i) {
        if (this.h >= this.i) {
            throw rc.g();
        }
        this.h++;
        rdVar.b(this);
        a(rg.a(i, 4));
        this.h--;
    }

    public byte[] a(int i, int i2) {
        if (i2 == 0) {
            return rg.h;
        }
        Object obj = new byte[i2];
        System.arraycopy(this.a, this.b + i, obj, 0, i2);
        return obj;
    }

    public void b() {
        int a;
        do {
            a = a();
            if (a == 0) {
                return;
            }
        } while (b(a));
    }

    public boolean b(int i) {
        switch (rg.a(i)) {
            case 0:
                g();
                return true;
            case 1:
                q();
                return true;
            case 2:
                g(n());
                return true;
            case 3:
                b();
                a(rg.a(rg.b(i), 4));
                return true;
            case 4:
                return false;
            case 5:
                p();
                return true;
            default:
                throw rc.f();
        }
    }

    public double c() {
        return Double.longBitsToDouble(q());
    }

    public float d() {
        return Float.intBitsToFloat(p());
    }

    public int d(int i) {
        if (i < 0) {
            throw rc.b();
        }
        int i2 = this.e + i;
        int i3 = this.g;
        if (i2 > i3) {
            throw rc.a();
        }
        this.g = i2;
        v();
        return i3;
    }

    public long e() {
        return o();
    }

    public void e(int i) {
        this.g = i;
        v();
    }

    public long f() {
        return o();
    }

    public void f(int i) {
        if (i > this.e - this.b) {
            throw new IllegalArgumentException("Position " + i + " is beyond current " + (this.e - this.b));
        } else if (i < 0) {
            throw new IllegalArgumentException("Bad position " + i);
        } else {
            this.e = this.b + i;
        }
    }

    public int g() {
        return n();
    }

    public void g(int i) {
        if (i < 0) {
            throw rc.b();
        } else if (this.e + i > this.g) {
            g(this.g - this.e);
            throw rc.a();
        } else if (i <= this.c - this.e) {
            this.e += i;
        } else {
            throw rc.a();
        }
    }

    public long h() {
        return q();
    }

    public boolean i() {
        return n() != 0;
    }

    public String j() {
        int n = n();
        if (n < 0) {
            throw rc.b();
        } else if (n > this.c - this.e) {
            throw rc.a();
        } else {
            String str = new String(this.a, this.e, n, rb.a);
            this.e = n + this.e;
            return str;
        }
    }

    public byte[] k() {
        int n = n();
        if (n < 0) {
            throw rc.b();
        } else if (n == 0) {
            return rg.h;
        } else {
            if (n > this.c - this.e) {
                throw rc.a();
            }
            Object obj = new byte[n];
            System.arraycopy(this.a, this.e, obj, 0, n);
            this.e = n + this.e;
            return obj;
        }
    }

    public int l() {
        return c(n());
    }

    public long m() {
        return a(o());
    }

    public int n() {
        byte u = u();
        if (u >= (byte) 0) {
            return u;
        }
        int i = u & 127;
        byte u2 = u();
        if (u2 >= (byte) 0) {
            return i | (u2 << 7);
        }
        i |= (u2 & 127) << 7;
        u2 = u();
        if (u2 >= (byte) 0) {
            return i | (u2 << 14);
        }
        i |= (u2 & 127) << 14;
        u2 = u();
        if (u2 >= (byte) 0) {
            return i | (u2 << 21);
        }
        i |= (u2 & 127) << 21;
        u2 = u();
        i |= u2 << 28;
        if (u2 >= (byte) 0) {
            return i;
        }
        for (int i2 = 0; i2 < 5; i2++) {
            if (u() >= (byte) 0) {
                return i;
            }
        }
        throw rc.c();
    }

    public long o() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte u = u();
            j |= ((long) (u & 127)) << i;
            if ((u & 128) == 0) {
                return j;
            }
        }
        throw rc.c();
    }

    public int p() {
        return (((u() & 255) | ((u() & 255) << 8)) | ((u() & 255) << 16)) | ((u() & 255) << 24);
    }

    public long q() {
        byte u = u();
        byte u2 = u();
        return ((((((((((long) u2) & 255) << 8) | (((long) u) & 255)) | ((((long) u()) & 255) << 16)) | ((((long) u()) & 255) << 24)) | ((((long) u()) & 255) << 32)) | ((((long) u()) & 255) << 40)) | ((((long) u()) & 255) << 48)) | ((((long) u()) & 255) << 56);
    }

    public int r() {
        if (this.g == Integer.MAX_VALUE) {
            return -1;
        }
        return this.g - this.e;
    }

    public boolean s() {
        return this.e == this.c;
    }

    public int t() {
        return this.e - this.b;
    }

    public byte u() {
        if (this.e == this.c) {
            throw rc.a();
        }
        byte[] bArr = this.a;
        int i = this.e;
        this.e = i + 1;
        return bArr[i];
    }
}
