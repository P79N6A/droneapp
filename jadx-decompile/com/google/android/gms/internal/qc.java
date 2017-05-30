package com.google.android.gms.internal;

public final class qc extends rd {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    public qc() {
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
            a += qw.c(3, this.c);
        }
        if (this.d != 0) {
            a += qw.c(4, this.d);
        }
        if (this.e != 0) {
            a += qw.c(5, this.e);
        }
        return this.f != 0 ? a + qw.c(6, this.f) : a;
    }

    public qc a(qv qvVar) {
        while (true) {
            int a = qvVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = qvVar.g();
                    continue;
                case 16:
                    this.b = qvVar.g();
                    continue;
                case 24:
                    this.c = qvVar.g();
                    continue;
                case 32:
                    this.d = qvVar.g();
                    continue;
                case 40:
                    this.e = qvVar.g();
                    continue;
                case 48:
                    this.f = qvVar.g();
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
        super.a(qwVar);
    }

    public qc b() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
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
        if (!(obj instanceof qc)) {
            return false;
        }
        qc qcVar = (qc) obj;
        return this.a != qcVar.a ? false : this.b != qcVar.b ? false : this.c != qcVar.c ? false : this.d != qcVar.d ? false : this.e != qcVar.e ? false : this.f == qcVar.f;
    }

    public int hashCode() {
        return ((((((((((((getClass().getName().hashCode() + 527) * 31) + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f;
    }
}
