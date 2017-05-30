package com.google.android.gms.internal;

import com.google.android.gms.games.d;

public final class py extends qx<py> {
    public static final qy<Object, py> a = qy.a(11, py.class, 855033290);
    private static final py[] k = new py[0];
    public String b;
    public qb c;
    public int d;
    public int e;
    public int f;
    public qr g;
    public pz h;
    public String[] i;
    public qg j;

    public py() {
        b();
    }

    public static py a(byte[] bArr) {
        return (py) rd.a(new py(), bArr);
    }

    protected int a() {
        int i = 0;
        int a = super.a();
        if (!this.b.equals("")) {
            a += qw.b(1, this.b);
        }
        if (this.c != null) {
            a += qw.c(2, this.c);
        }
        if (this.d != 0) {
            a += qw.c(4, this.d);
        }
        if (this.e != 0) {
            a += qw.c(5, this.e);
        }
        if (this.f != 0) {
            a += qw.c(6, this.f);
        }
        if (this.g != null) {
            a += qw.c(7, this.g);
        }
        if (this.h != null) {
            a += qw.c(8, this.h);
        }
        if (this.i != null && this.i.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.i.length) {
                String str = this.i[i];
                if (str != null) {
                    i3++;
                    i2 += qw.b(str);
                }
                i++;
            }
            a = (a + i2) + (i3 * 1);
        }
        return this.j != null ? a + qw.c(10, this.j) : a;
    }

    public py a(qv qvVar) {
        while (true) {
            int a = qvVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.b = qvVar.j();
                    continue;
                case 18:
                    if (this.c == null) {
                        this.c = new qb();
                    }
                    qvVar.a(this.c);
                    continue;
                case 32:
                    a = qvVar.g();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            this.d = a;
                            break;
                        default:
                            continue;
                    }
                case 40:
                    a = qvVar.g();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 10000:
                        case 10001:
                        case d.b /*10002*/:
                        case d.c /*10003*/:
                        case d.d /*10004*/:
                        case d.e /*10005*/:
                        case d.f /*10006*/:
                        case d.g /*10007*/:
                        case d.h /*10008*/:
                        case 10009:
                        case 99999:
                            this.e = a;
                            break;
                        default:
                            continue;
                    }
                case 48:
                    a = qvVar.g();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f = a;
                            break;
                        default:
                            continue;
                    }
                case 58:
                    if (this.g == null) {
                        this.g = new qr();
                    }
                    qvVar.a(this.g);
                    continue;
                case 66:
                    if (this.h == null) {
                        this.h = new pz();
                    }
                    qvVar.a(this.h);
                    continue;
                case 74:
                    int b = rg.b(qvVar, 74);
                    a = this.i == null ? 0 : this.i.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = qvVar.j();
                        qvVar.a();
                        a++;
                    }
                    obj[a] = qvVar.j();
                    this.i = obj;
                    continue;
                case 82:
                    if (this.j == null) {
                        this.j = new qg();
                    }
                    qvVar.a(this.j);
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
        if (!this.b.equals("")) {
            qwVar.a(1, this.b);
        }
        if (this.c != null) {
            qwVar.a(2, this.c);
        }
        if (this.d != 0) {
            qwVar.a(4, this.d);
        }
        if (this.e != 0) {
            qwVar.a(5, this.e);
        }
        if (this.f != 0) {
            qwVar.a(6, this.f);
        }
        if (this.g != null) {
            qwVar.a(7, this.g);
        }
        if (this.h != null) {
            qwVar.a(8, this.h);
        }
        if (this.i != null && this.i.length > 0) {
            for (String str : this.i) {
                if (str != null) {
                    qwVar.a(9, str);
                }
            }
        }
        if (this.j != null) {
            qwVar.a(10, this.j);
        }
        super.a(qwVar);
    }

    public py b() {
        this.b = "";
        this.c = null;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = null;
        this.i = rg.f;
        this.j = null;
        this.ag = null;
        this.ah = -1;
        return this;
    }

    public /* synthetic */ rd b(qv qvVar) {
        return a(qvVar);
    }
}
