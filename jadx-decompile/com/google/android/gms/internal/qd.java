package com.google.android.gms.internal;

public final class qd extends rd {
    public int a;
    public int b;

    public qd() {
        b();
    }

    protected int a() {
        int a = super.a();
        if (this.a != 0) {
            a += qw.c(1, this.a);
        }
        return this.b != 0 ? a + qw.c(2, this.b) : a;
    }

    public qd a(qv qvVar) {
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
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.b = a;
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
            qwVar.a(2, this.b);
        }
        super.a(qwVar);
    }

    public qd b() {
        this.a = 0;
        this.b = 0;
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
        if (!(obj instanceof qd)) {
            return false;
        }
        qd qdVar = (qd) obj;
        return this.a != qdVar.a ? false : this.b == qdVar.b;
    }

    public int hashCode() {
        return ((((getClass().getName().hashCode() + 527) * 31) + this.a) * 31) + this.b;
    }
}
