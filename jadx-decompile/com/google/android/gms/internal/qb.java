package com.google.android.gms.internal;

public final class qb extends qx<qb> {
    public long a;
    public long b;
    public int c;
    public String d;
    public String e;

    public qb() {
        b();
    }

    protected int a() {
        int a = super.a();
        if (this.a != 0) {
            a += qw.f(1, this.a);
        }
        if (this.b != 0) {
            a += qw.f(2, this.b);
        }
        if (this.c != 0) {
            a += qw.c(3, this.c);
        }
        if (!this.d.equals("")) {
            a += qw.b(4, this.d);
        }
        return !this.e.equals("") ? a + qw.b(5, this.e) : a;
    }

    public qb a(qv qvVar) {
        while (true) {
            int a = qvVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = qvVar.f();
                    continue;
                case 16:
                    this.b = qvVar.f();
                    continue;
                case 24:
                    this.c = qvVar.g();
                    continue;
                case 34:
                    this.d = qvVar.j();
                    continue;
                case 42:
                    this.e = qvVar.j();
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
        if (this.a != 0) {
            qwVar.b(1, this.a);
        }
        if (this.b != 0) {
            qwVar.b(2, this.b);
        }
        if (this.c != 0) {
            qwVar.a(3, this.c);
        }
        if (!this.d.equals("")) {
            qwVar.a(4, this.d);
        }
        if (!this.e.equals("")) {
            qwVar.a(5, this.e);
        }
        super.a(qwVar);
    }

    public qb b() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = "";
        this.e = "";
        this.ag = null;
        this.ah = -1;
        return this;
    }

    public /* synthetic */ rd b(qv qvVar) {
        return a(qvVar);
    }
}
