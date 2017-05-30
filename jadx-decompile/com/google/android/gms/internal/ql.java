package com.google.android.gms.internal;

public final class ql extends rd {
    public int a;
    public long b;
    public int[] c;
    public String[] d;
    public long e;
    public String[] f;
    public String g;

    public ql() {
        b();
    }

    protected int a() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int a = super.a();
        if (this.a != 0) {
            a += qw.c(1, this.a);
        }
        if (this.b != 0) {
            a += qw.f(2, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            i = 0;
            for (int i32 : this.c) {
                i += qw.c(i32);
            }
            a = (a + i) + (this.c.length * 1);
        }
        if (this.d != null && this.d.length > 0) {
            i = 0;
            i32 = 0;
            for (String str : this.d) {
                if (str != null) {
                    i32++;
                    i += qw.b(str);
                }
            }
            a = (a + i) + (i32 * 1);
        }
        if (this.e != 0) {
            a += qw.f(5, this.e);
        }
        if (this.f != null && this.f.length > 0) {
            i2 = 0;
            i = 0;
            while (i4 < this.f.length) {
                String str2 = this.f[i4];
                if (str2 != null) {
                    i++;
                    i2 += qw.b(str2);
                }
                i4++;
            }
            a = (a + i2) + (i * 1);
        }
        return !this.g.equals("") ? a + qw.b(7, this.g) : a;
    }

    public ql a(qv qvVar) {
        while (true) {
            int a = qvVar.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = qvVar.g();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.a = a;
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.b = qvVar.f();
                    continue;
                case 24:
                    b = rg.b(qvVar, 24);
                    a = this.c == null ? 0 : this.c.length;
                    obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = qvVar.g();
                        qvVar.a();
                        a++;
                    }
                    obj[a] = qvVar.g();
                    this.c = obj;
                    continue;
                case 26:
                    int d = qvVar.d(qvVar.n());
                    b = qvVar.t();
                    a = 0;
                    while (qvVar.r() > 0) {
                        qvVar.g();
                        a++;
                    }
                    qvVar.f(b);
                    b = this.c == null ? 0 : this.c.length;
                    Object obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.c, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = qvVar.g();
                        b++;
                    }
                    this.c = obj2;
                    qvVar.e(d);
                    continue;
                case 34:
                    b = rg.b(qvVar, 34);
                    a = this.d == null ? 0 : this.d.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = qvVar.j();
                        qvVar.a();
                        a++;
                    }
                    obj[a] = qvVar.j();
                    this.d = obj;
                    continue;
                case 40:
                    this.e = qvVar.f();
                    continue;
                case 50:
                    b = rg.b(qvVar, 50);
                    a = this.f == null ? 0 : this.f.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = qvVar.j();
                        qvVar.a();
                        a++;
                    }
                    obj[a] = qvVar.j();
                    this.f = obj;
                    continue;
                case 58:
                    this.g = qvVar.j();
                    continue;
                default:
                    if (!rg.a(qvVar, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public void a(qw qwVar) {
        int i = 0;
        if (this.a != 0) {
            qwVar.a(1, this.a);
        }
        if (this.b != 0) {
            qwVar.b(2, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            for (int a : this.c) {
                qwVar.a(3, a);
            }
        }
        if (this.d != null && this.d.length > 0) {
            for (String str : this.d) {
                if (str != null) {
                    qwVar.a(4, str);
                }
            }
        }
        if (this.e != 0) {
            qwVar.b(5, this.e);
        }
        if (this.f != null && this.f.length > 0) {
            while (i < this.f.length) {
                String str2 = this.f[i];
                if (str2 != null) {
                    qwVar.a(6, str2);
                }
                i++;
            }
        }
        if (!this.g.equals("")) {
            qwVar.a(7, this.g);
        }
        super.a(qwVar);
    }

    public ql b() {
        this.a = 0;
        this.b = 0;
        this.c = rg.a;
        this.d = rg.f;
        this.e = 0;
        this.f = rg.f;
        this.g = "";
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
        if (!(obj instanceof ql)) {
            return false;
        }
        ql qlVar = (ql) obj;
        return this.a != qlVar.a ? false : this.b != qlVar.b ? false : !rb.a(this.c, qlVar.c) ? false : !rb.a(this.d, qlVar.d) ? false : this.e != qlVar.e ? false : !rb.a(this.f, qlVar.f) ? false : this.g == null ? qlVar.g == null : this.g.equals(qlVar.g);
    }

    public int hashCode() {
        return (this.g == null ? 0 : this.g.hashCode()) + ((((((((((((((getClass().getName().hashCode() + 527) * 31) + this.a) * 31) + ((int) (this.b ^ (this.b >>> 32)))) * 31) + rb.a(this.c)) * 31) + rb.a(this.d)) * 31) + ((int) (this.e ^ (this.e >>> 32)))) * 31) + rb.a(this.f)) * 31);
    }
}
