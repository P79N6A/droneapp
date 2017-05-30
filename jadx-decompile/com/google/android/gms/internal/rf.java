package com.google.android.gms.internal;

import java.util.Arrays;

final class rf {
    final int a;
    final byte[] b;

    rf(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    int a() {
        return (qw.h(this.a) + 0) + this.b.length;
    }

    void a(qw qwVar) {
        qwVar.g(this.a);
        qwVar.d(this.b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rf)) {
            return false;
        }
        rf rfVar = (rf) obj;
        return this.a == rfVar.a && Arrays.equals(this.b, rfVar.b);
    }

    public int hashCode() {
        return ((this.a + 527) * 31) + Arrays.hashCode(this.b);
    }
}
