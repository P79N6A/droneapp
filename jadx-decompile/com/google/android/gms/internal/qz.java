package com.google.android.gms.internal;

public final class qz implements Cloneable {
    private static final ra a = new ra();
    private boolean b;
    private int[] c;
    private ra[] d;
    private int e;

    qz() {
        this(10);
    }

    qz(int i) {
        this.b = false;
        int c = c(i);
        this.c = new int[c];
        this.d = new ra[c];
        this.e = 0;
    }

    private boolean a(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private boolean a(ra[] raVarArr, ra[] raVarArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!raVarArr[i2].equals(raVarArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    private int c(int i) {
        return d(i * 4) / 4;
    }

    private int d(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            if (i <= (1 << i2) - 12) {
                return (1 << i2) - 12;
            }
        }
        return i;
    }

    private int e(int i) {
        int i2 = 0;
        int i3 = this.e - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            int i5 = this.c[i4];
            if (i5 < i) {
                i2 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return i2 ^ -1;
    }

    int a() {
        return this.e;
    }

    ra a(int i) {
        int e = e(i);
        return (e < 0 || this.d[e] == a) ? null : this.d[e];
    }

    void a(int i, ra raVar) {
        int e = e(i);
        if (e >= 0) {
            this.d[e] = raVar;
            return;
        }
        e ^= -1;
        if (e >= this.e || this.d[e] != a) {
            if (this.e >= this.c.length) {
                int c = c(this.e + 1);
                Object obj = new int[c];
                Object obj2 = new ra[c];
                System.arraycopy(this.c, 0, obj, 0, this.c.length);
                System.arraycopy(this.d, 0, obj2, 0, this.d.length);
                this.c = obj;
                this.d = obj2;
            }
            if (this.e - e != 0) {
                System.arraycopy(this.c, e, this.c, e + 1, this.e - e);
                System.arraycopy(this.d, e, this.d, e + 1, this.e - e);
            }
            this.c[e] = i;
            this.d[e] = raVar;
            this.e++;
            return;
        }
        this.c[e] = i;
        this.d[e] = raVar;
    }

    ra b(int i) {
        return this.d[i];
    }

    public boolean b() {
        return a() == 0;
    }

    public final qz c() {
        int a = a();
        qz qzVar = new qz(a);
        System.arraycopy(this.c, 0, qzVar.c, 0, a);
        for (int i = 0; i < a; i++) {
            if (this.d[i] != null) {
                qzVar.d[i] = (ra) this.d[i].clone();
            }
        }
        qzVar.e = a;
        return qzVar;
    }

    public /* synthetic */ Object clone() {
        return c();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qz)) {
            return false;
        }
        qz qzVar = (qz) obj;
        return a() != qzVar.a() ? false : a(this.c, qzVar.c, this.e) && a(this.d, qzVar.d, this.e);
    }

    public int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.e; i2++) {
            i = (((i * 31) + this.c[i2]) * 31) + this.d[i2].hashCode();
        }
        return i;
    }
}
