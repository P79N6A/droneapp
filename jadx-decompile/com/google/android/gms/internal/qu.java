package com.google.android.gms.internal;

public final class qu extends rd {
    public int a;
    public long b;
    public float c;
    public int d;

    public qu() {
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
        if (Float.floatToIntBits(this.c) != Float.floatToIntBits(0.0f)) {
            a += qw.b(3, this.c);
        }
        return this.d != 0 ? a + qw.c(4, this.d) : a;
    }

    public qu a(qv qvVar) {
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
                    this.b = qvVar.f();
                    continue;
                case 29:
                    this.c = qvVar.d();
                    continue;
                case 32:
                    this.d = qvVar.g();
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
        if (Float.floatToIntBits(this.c) != Float.floatToIntBits(0.0f)) {
            qwVar.a(3, this.c);
        }
        if (this.d != 0) {
            qwVar.a(4, this.d);
        }
        super.a(qwVar);
    }

    public qu b() {
        this.a = 0;
        this.b = 0;
        this.c = 0.0f;
        this.d = 0;
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
        if (!(obj instanceof qu)) {
            return false;
        }
        qu quVar = (qu) obj;
        return this.a != quVar.a ? false : this.b != quVar.b ? false : Float.floatToIntBits(this.c) != Float.floatToIntBits(quVar.c) ? false : this.d == quVar.d;
    }

    public int hashCode() {
        return ((((((((getClass().getName().hashCode() + 527) * 31) + this.a) * 31) + ((int) (this.b ^ (this.b >>> 32)))) * 31) + Float.floatToIntBits(this.c)) * 31) + this.d;
    }
}
