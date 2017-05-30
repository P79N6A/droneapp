package com.google.android.gms.internal;

public final class qm extends rd {
    public int a;
    public double b;
    public double c;
    public long d;
    public int[] e;

    public qm() {
        b();
    }

    protected int a() {
        int i = 0;
        int a = super.a();
        if (this.a != 0) {
            a += qw.c(1, this.a);
        }
        if (Double.doubleToLongBits(this.b) != Double.doubleToLongBits(0.0d)) {
            a += qw.b(2, this.b);
        }
        if (Double.doubleToLongBits(this.c) != Double.doubleToLongBits(0.0d)) {
            a += qw.b(3, this.c);
        }
        if (this.d != 0) {
            a += qw.f(4, this.d);
        }
        if (this.e == null || this.e.length <= 0) {
            return a;
        }
        int i2 = 0;
        while (i < this.e.length) {
            i2 += qw.c(this.e[i]);
            i++;
        }
        return (a + i2) + (this.e.length * 1);
    }

    public qm a(qv qvVar) {
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
                        case 4:
                        case 5:
                        case 6:
                            this.a = a;
                            break;
                        default:
                            continue;
                    }
                case 17:
                    this.b = qvVar.c();
                    continue;
                case 25:
                    this.c = qvVar.c();
                    continue;
                case 32:
                    this.d = qvVar.f();
                    continue;
                case 40:
                    int b = rg.b(qvVar, 40);
                    Object obj = new int[b];
                    i = 0;
                    i2 = 0;
                    while (i < b) {
                        if (i != 0) {
                            qvVar.a();
                        }
                        int g = qvVar.g();
                        switch (g) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
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
                        a = this.e == null ? 0 : this.e.length;
                        if (a != 0 || i2 != b) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.e, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.e = obj2;
                            break;
                        }
                        this.e = obj;
                        break;
                    }
                    continue;
                case 42:
                    i = qvVar.d(qvVar.n());
                    i2 = qvVar.t();
                    a = 0;
                    while (qvVar.r() > 0) {
                        switch (qvVar.g()) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        qvVar.f(i2);
                        i2 = this.e == null ? 0 : this.e.length;
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.e, 0, obj3, 0, i2);
                        }
                        while (qvVar.r() > 0) {
                            int g2 = qvVar.g();
                            switch (g2) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                    a = i2 + 1;
                                    obj3[i2] = g2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.e = obj3;
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
        if (Double.doubleToLongBits(this.b) != Double.doubleToLongBits(0.0d)) {
            qwVar.a(2, this.b);
        }
        if (Double.doubleToLongBits(this.c) != Double.doubleToLongBits(0.0d)) {
            qwVar.a(3, this.c);
        }
        if (this.d != 0) {
            qwVar.b(4, this.d);
        }
        if (this.e != null && this.e.length > 0) {
            for (int a : this.e) {
                qwVar.a(5, a);
            }
        }
        super.a(qwVar);
    }

    public qm b() {
        this.a = 0;
        this.b = 0.0d;
        this.c = 0.0d;
        this.d = 0;
        this.e = rg.a;
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
        if (!(obj instanceof qm)) {
            return false;
        }
        qm qmVar = (qm) obj;
        return this.a != qmVar.a ? false : Double.doubleToLongBits(this.b) != Double.doubleToLongBits(qmVar.b) ? false : Double.doubleToLongBits(this.c) != Double.doubleToLongBits(qmVar.c) ? false : this.d != qmVar.d ? false : rb.a(this.e, qmVar.e);
    }

    public int hashCode() {
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + this.a;
        long doubleToLongBits = Double.doubleToLongBits(this.b);
        hashCode = (hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        doubleToLongBits = Double.doubleToLongBits(this.c);
        return (((((hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + ((int) (this.d ^ (this.d >>> 32)))) * 31) + rb.a(this.e);
    }
}
