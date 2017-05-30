package com.google.android.gms.internal;

public final class qr extends qx<qr> {
    public int a;
    public long b;
    public long c;

    public qr() {
        b();
    }

    protected int a() {
        int a = super.a();
        if (this.a != 3) {
            a += qw.c(1, this.a);
        }
        if (this.b != 0) {
            a += qw.f(2, this.b);
        }
        return this.c != 0 ? a + qw.f(3, this.c) : a;
    }

    public qr a(qv qvVar) {
        while (true) {
            int a = qvVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = qvVar.g();
                    switch (a) {
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
                    this.c = qvVar.f();
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
        if (this.a != 3) {
            qwVar.a(1, this.a);
        }
        if (this.b != 0) {
            qwVar.b(2, this.b);
        }
        if (this.c != 0) {
            qwVar.b(3, this.c);
        }
        super.a(qwVar);
    }

    public qr b() {
        this.a = 3;
        this.b = 0;
        this.c = 0;
        this.ag = null;
        this.ah = -1;
        return this;
    }

    public /* synthetic */ rd b(qv qvVar) {
        return a(qvVar);
    }
}
