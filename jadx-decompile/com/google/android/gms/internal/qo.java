package com.google.android.gms.internal;

public final class qo extends qx<qo> {
    public String a;
    public int b;
    public qb c;
    public String[] d;
    public String[] e;
    public qr f;
    public qg g;

    public qo() {
        b();
    }

    public static qo a(byte[] bArr) {
        return (qo) rd.a(new qo(), bArr);
    }

    protected int a() {
        int i;
        int i2;
        int i3 = 0;
        int a = super.a();
        if (!this.a.equals("")) {
            a += qw.b(1, this.a);
        }
        if (this.b != 1) {
            a += qw.c(2, this.b);
        }
        if (this.c != null) {
            a += qw.c(3, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            i = 0;
            int i4 = 0;
            for (String str : this.d) {
                if (str != null) {
                    i4++;
                    i += qw.b(str);
                }
            }
            a = (a + i) + (i4 * 1);
        }
        if (this.e != null && this.e.length > 0) {
            i2 = 0;
            i = 0;
            while (i3 < this.e.length) {
                String str2 = this.e[i3];
                if (str2 != null) {
                    i++;
                    i2 += qw.b(str2);
                }
                i3++;
            }
            a = (a + i2) + (i * 1);
        }
        if (this.f != null) {
            a += qw.c(6, this.f);
        }
        return this.g != null ? a + qw.c(8, this.g) : a;
    }

    public qo a(qv qvVar) {
        while (true) {
            int a = qvVar.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = qvVar.j();
                    continue;
                case 16:
                    a = qvVar.g();
                    switch (a) {
                        case 1:
                        case 2:
                            this.b = a;
                            break;
                        default:
                            continue;
                    }
                case 26:
                    if (this.c == null) {
                        this.c = new qb();
                    }
                    qvVar.a(this.c);
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
                case 42:
                    b = rg.b(qvVar, 42);
                    a = this.e == null ? 0 : this.e.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = qvVar.j();
                        qvVar.a();
                        a++;
                    }
                    obj[a] = qvVar.j();
                    this.e = obj;
                    continue;
                case 50:
                    if (this.f == null) {
                        this.f = new qr();
                    }
                    qvVar.a(this.f);
                    continue;
                case 66:
                    if (this.g == null) {
                        this.g = new qg();
                    }
                    qvVar.a(this.g);
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
        if (!this.a.equals("")) {
            qwVar.a(1, this.a);
        }
        if (this.b != 1) {
            qwVar.a(2, this.b);
        }
        if (this.c != null) {
            qwVar.a(3, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            for (String str : this.d) {
                if (str != null) {
                    qwVar.a(4, str);
                }
            }
        }
        if (this.e != null && this.e.length > 0) {
            while (i < this.e.length) {
                String str2 = this.e[i];
                if (str2 != null) {
                    qwVar.a(5, str2);
                }
                i++;
            }
        }
        if (this.f != null) {
            qwVar.a(6, this.f);
        }
        if (this.g != null) {
            qwVar.a(8, this.g);
        }
        super.a(qwVar);
    }

    public qo b() {
        this.a = "";
        this.b = 1;
        this.c = null;
        this.d = rg.f;
        this.e = rg.f;
        this.f = null;
        this.g = null;
        this.ag = null;
        this.ah = -1;
        return this;
    }

    public /* synthetic */ rd b(qv qvVar) {
        return a(qvVar);
    }
}
