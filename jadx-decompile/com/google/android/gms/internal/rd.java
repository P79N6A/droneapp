package com.google.android.gms.internal;

import java.io.IOException;

public abstract class rd {
    protected volatile int ah = -1;

    public static final <T extends rd> T a(T t, byte[] bArr) {
        return b(t, bArr, 0, bArr.length);
    }

    public static final void a(rd rdVar, byte[] bArr, int i, int i2) {
        try {
            qw a = qw.a(bArr, i, i2);
            rdVar.a(a);
            a.b();
        } catch (Throwable e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public static final byte[] a(rd rdVar) {
        byte[] bArr = new byte[rdVar.g()];
        a(rdVar, bArr, 0, bArr.length);
        return bArr;
    }

    public static final <T extends rd> T b(T t, byte[] bArr, int i, int i2) {
        try {
            qv a = qv.a(bArr, i, i2);
            t.b(a);
            a.a(0);
            return t;
        } catch (rc e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    protected int a() {
        return 0;
    }

    public void a(qw qwVar) {
    }

    public abstract rd b(qv qvVar);

    public /* synthetic */ Object clone() {
        return e();
    }

    public rd e() {
        return (rd) super.clone();
    }

    public int f() {
        if (this.ah < 0) {
            g();
        }
        return this.ah;
    }

    public int g() {
        int a = a();
        this.ah = a;
        return a;
    }

    public String toString() {
        return re.a(this);
    }
}
