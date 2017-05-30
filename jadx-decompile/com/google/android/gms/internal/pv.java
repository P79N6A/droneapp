package com.google.android.gms.internal;

public final class pv extends rd {
    public int a;
    public long b;
    public int[] c;

    public pv() {
        b();
    }

    protected int a() {
        int i = 0;
        int a = super.a();
        if (this.a != 0) {
            a += qw.c(1, this.a);
        }
        if (this.b != 0) {
            a += qw.f(2, this.b);
        }
        if (this.c == null || this.c.length <= 0) {
            return a;
        }
        int i2 = 0;
        while (i < this.c.length) {
            i2 += qw.c(this.c[i]);
            i++;
        }
        return (a + i2) + (this.c.length * 1);
    }

    public pv a(qv qvVar) {
        while (true) {
            int a = qvVar.a();
            int i;
            int i2;
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
                            this.a = a;
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.b = qvVar.f();
                    continue;
                case 24:
                    int b = rg.b(qvVar, 24);
                    Object obj = new int[b];
                    i = 0;
                    i2 = 0;
                    while (i < b) {
                        if (i != 0) {
                            qvVar.a();
                        }
                        int g = qvVar.g();
                        switch (g) {
                            case -1000:
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
                                a = i2 + 1;
                                obj[i2] = g;
                                break;
                            default:
                                a = i2;
                                break;
                        }
                        i++;
                        i2 = a;
                    }
                    if (i2 != 0) {
                        a = this.c == null ? 0 : this.c.length;
                        if (a != 0 || i2 != b) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.c, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.c = obj2;
                            break;
                        }
                        this.c = obj;
                        break;
                    }
                    continue;
                case 26:
                    i = qvVar.d(qvVar.n());
                    i2 = qvVar.t();
                    a = 0;
                    while (qvVar.r() > 0) {
                        switch (qvVar.g()) {
                            case -1000:
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
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        qvVar.f(i2);
                        i2 = this.c == null ? 0 : this.c.length;
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.c, 0, obj3, 0, i2);
                        }
                        while (qvVar.r() > 0) {
                            int g2 = qvVar.g();
                            switch (g2) {
                                case -1000:
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
                                    a = i2 + 1;
                                    obj3[i2] = g2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.c = obj3;
                    }
                    qvVar.e(i);
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
        super.a(qwVar);
    }

    public pv b() {
        this.a = 0;
        this.b = 0;
        this.c = rg.a;
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
        if (!(obj instanceof pv)) {
            return false;
        }
        pv pvVar = (pv) obj;
        return this.a != pvVar.a ? false : this.b != pvVar.b ? false : rb.a(this.c, pvVar.c);
    }

    public int hashCode() {
        return ((((((getClass().getName().hashCode() + 527) * 31) + this.a) * 31) + ((int) (this.b ^ (this.b >>> 32)))) * 31) + rb.a(this.c);
    }
}
