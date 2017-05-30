package com.google.android.gms.internal;

public final class qh extends rd {
    public int a;
    public int b;
    public long c;
    public int d;
    public int e;
    public double f;
    public double g;
    public long h;

    public qh() {
        b();
    }

    protected int a() {
        int a = super.a();
        if (this.a != 0) {
            a += qw.c(1, this.a);
        }
        if (this.b != 0) {
            a += qw.c(2, this.b);
        }
        if (this.c != 0) {
            a += qw.f(3, this.c);
        }
        if (this.d != 0) {
            a += qw.c(4, this.d);
        }
        if (this.e != 0) {
            a += qw.c(5, this.e);
        }
        if (Double.doubleToLongBits(this.f) != Double.doubleToLongBits(0.0d)) {
            a += qw.b(6, this.f);
        }
        if (Double.doubleToLongBits(this.g) != Double.doubleToLongBits(0.0d)) {
            a += qw.b(7, this.g);
        }
        return this.h != 0 ? a + qw.f(8, this.h) : a;
    }

    public qh a(qv qvVar) {
        while (true) {
            int a = qvVar.a();
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
                    a = qvVar.g();
                    switch (a) {
                        case 0:
                        case 1:
                            this.b = a;
                            break;
                        default:
                            continue;
                    }
                case 24:
                    this.c = qvVar.f();
                    continue;
                case 32:
                    this.d = qvVar.g();
                    continue;
                case 40:
                    this.e = qvVar.g();
                    continue;
                case 49:
                    this.f = qvVar.c();
                    continue;
                case 57:
                    this.g = qvVar.c();
                    continue;
                case 64:
                    this.h = qvVar.f();
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
            qwVar.a(2, this.b);
        }
        if (this.c != 0) {
            qwVar.b(3, this.c);
        }
        if (this.d != 0) {
            qwVar.a(4, this.d);
        }
        if (this.e != 0) {
            qwVar.a(5, this.e);
        }
        if (Double.doubleToLongBits(this.f) != Double.doubleToLongBits(0.0d)) {
            qwVar.a(6, this.f);
        }
        if (Double.doubleToLongBits(this.g) != Double.doubleToLongBits(0.0d)) {
            qwVar.a(7, this.g);
        }
        if (this.h != 0) {
            qwVar.b(8, this.h);
        }
        super.a(qwVar);
    }

    public qh b() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0.0d;
        this.g = 0.0d;
        this.h = 0;
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
        if (!(obj instanceof qh)) {
            return false;
        }
        qh qhVar = (qh) obj;
        return this.a != qhVar.a ? false : this.b != qhVar.b ? false : this.c != qhVar.c ? false : this.d != qhVar.d ? false : this.e != qhVar.e ? false : Double.doubleToLongBits(this.f) != Double.doubleToLongBits(qhVar.f) ? false : Double.doubleToLongBits(this.g) != Double.doubleToLongBits(qhVar.g) ? false : this.h == qhVar.h;
    }

    public int hashCode() {
        int hashCode = ((((((((((getClass().getName().hashCode() + 527) * 31) + this.a) * 31) + this.b) * 31) + ((int) (this.c ^ (this.c >>> 32)))) * 31) + this.d) * 31) + this.e;
        long doubleToLongBits = Double.doubleToLongBits(this.f);
        hashCode = (hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        doubleToLongBits = Double.doubleToLongBits(this.g);
        return (((hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + ((int) (this.h ^ (this.h >>> 32)));
    }
}
