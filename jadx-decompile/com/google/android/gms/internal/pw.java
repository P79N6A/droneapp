package com.google.android.gms.internal;

public final class pw extends rd {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public pw() {
        b();
    }

    protected int a() {
        int a = super.a();
        if (this.a != 0) {
            a += qw.c(1, this.a);
        }
        if (this.b != 0) {
            a += qw.f(2, this.b);
        }
        if (this.c != 0) {
            a += qw.c(3, this.c);
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
        if (this.g != 0) {
            a += qw.c(7, this.g);
        }
        return this.h != 0 ? a + qw.c(8, this.h) : a;
    }

    public pw a(qv qvVar) {
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
                            this.a = a;
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.b = qvVar.f();
                    continue;
                case 24:
                    a = qvVar.g();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.c = a;
                            break;
                        default:
                            continue;
                    }
                case 32:
                    a = qvVar.g();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
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
                            this.f = a;
                            break;
                        default:
                            continue;
                    }
                case 56:
                    a = qvVar.g();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.g = a;
                            break;
                        default:
                            continue;
                    }
                case 64:
                    a = qvVar.g();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.h = a;
                            break;
                        default:
                            continue;
                    }
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
        if (this.c != 0) {
            qwVar.a(3, this.c);
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
        if (this.g != 0) {
            qwVar.a(7, this.g);
        }
        if (this.h != 0) {
            qwVar.a(8, this.h);
        }
        super.a(qwVar);
    }

    public pw b() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
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
        if (!(obj instanceof pw)) {
            return false;
        }
        pw pwVar = (pw) obj;
        return this.a != pwVar.a ? false : this.b != pwVar.b ? false : this.c != pwVar.c ? false : this.d != pwVar.d ? false : this.e != pwVar.e ? false : this.f != pwVar.f ? false : this.g != pwVar.g ? false : this.h == pwVar.h;
    }

    public int hashCode() {
        return ((((((((((((((((getClass().getName().hashCode() + 527) * 31) + this.a) * 31) + ((int) (this.b ^ (this.b >>> 32)))) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h;
    }
}
