package com.google.android.gms.internal;

public final class fr extends qx<fr> {
    public String[] a;
    public int[] b;
    public byte[][] c;

    public fr() {
        b();
    }

    public static fr a(byte[] bArr) {
        return (fr) rd.a(new fr(), bArr);
    }

    protected int a() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int a = super.a();
        if (this.a == null || this.a.length <= 0) {
            i = a;
        } else {
            i2 = 0;
            i3 = 0;
            for (String str : this.a) {
                if (str != null) {
                    i3++;
                    i2 += qw.b(str);
                }
            }
            i = (a + i2) + (i3 * 1);
        }
        if (this.b != null && this.b.length > 0) {
            i3 = 0;
            for (int a2 : this.b) {
                i3 += qw.c(a2);
            }
            i = (i + i3) + (this.b.length * 1);
        }
        if (this.c == null || this.c.length <= 0) {
            return i;
        }
        i2 = 0;
        i3 = 0;
        while (i4 < this.c.length) {
            byte[] bArr = this.c[i4];
            if (bArr != null) {
                i3++;
                i2 += qw.c(bArr);
            }
            i4++;
        }
        return (i + i2) + (i3 * 1);
    }

    public fr a(qv qvVar) {
        while (true) {
            int a = qvVar.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = rg.b(qvVar, 10);
                    a = this.a == null ? 0 : this.a.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = qvVar.j();
                        qvVar.a();
                        a++;
                    }
                    obj[a] = qvVar.j();
                    this.a = obj;
                    continue;
                case 16:
                    b = rg.b(qvVar, 16);
                    a = this.b == null ? 0 : this.b.length;
                    obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = qvVar.g();
                        qvVar.a();
                        a++;
                    }
                    obj[a] = qvVar.g();
                    this.b = obj;
                    continue;
                case 18:
                    int d = qvVar.d(qvVar.n());
                    b = qvVar.t();
                    a = 0;
                    while (qvVar.r() > 0) {
                        qvVar.g();
                        a++;
                    }
                    qvVar.f(b);
                    b = this.b == null ? 0 : this.b.length;
                    Object obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.b, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = qvVar.g();
                        b++;
                    }
                    this.b = obj2;
                    qvVar.e(d);
                    continue;
                case 26:
                    b = rg.b(qvVar, 26);
                    a = this.c == null ? 0 : this.c.length;
                    obj = new byte[(b + a)][];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = qvVar.k();
                        qvVar.a();
                        a++;
                    }
                    obj[a] = qvVar.k();
                    this.c = obj;
                    continue;
                default:
                    if (!super.a(qvVar, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public void a(qw qwVar) {
        int i = 0;
        if (this.a != null && this.a.length > 0) {
            for (String str : this.a) {
                if (str != null) {
                    qwVar.a(1, str);
                }
            }
        }
        if (this.b != null && this.b.length > 0) {
            for (int a : this.b) {
                qwVar.a(2, a);
            }
        }
        if (this.c != null && this.c.length > 0) {
            while (i < this.c.length) {
                byte[] bArr = this.c[i];
                if (bArr != null) {
                    qwVar.a(3, bArr);
                }
                i++;
            }
        }
        super.a(qwVar);
    }

    public fr b() {
        this.a = rg.f;
        this.b = rg.a;
        this.c = rg.g;
        this.ag = null;
        this.ah = -1;
        return this;
    }

    public /* synthetic */ rd b(qv qvVar) {
        return a(qvVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fr)) {
            return false;
        }
        fr frVar = (fr) obj;
        return (rb.a(this.a, frVar.a) && rb.a(this.b, frVar.b) && rb.a(this.c, frVar.c)) ? (this.ag == null || this.ag.b()) ? frVar.ag == null || frVar.ag.b() : this.ag.equals(frVar.ag) : false;
    }

    public int hashCode() {
        int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + rb.a(this.a)) * 31) + rb.a(this.b)) * 31) + rb.a(this.c)) * 31;
        int hashCode2 = (this.ag == null || this.ag.b()) ? 0 : this.ag.hashCode();
        return hashCode2 + hashCode;
    }
}
