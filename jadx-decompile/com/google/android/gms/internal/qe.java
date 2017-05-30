package com.google.android.gms.internal;

public final class qe extends rd {
    public int a;
    public String b;

    public qe() {
        b();
    }

    protected int a() {
        int a = super.a();
        if (this.a != 0) {
            a += qw.c(1, this.a);
        }
        return !this.b.equals("") ? a + qw.b(2, this.b) : a;
    }

    public qe a(qv qvVar) {
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
                            this.a = a;
                            break;
                        default:
                            continue;
                    }
                case 18:
                    this.b = qvVar.j();
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
        if (!this.b.equals("")) {
            qwVar.a(2, this.b);
        }
        super.a(qwVar);
    }

    public qe b() {
        this.a = 0;
        this.b = "";
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
        if (!(obj instanceof qe)) {
            return false;
        }
        qe qeVar = (qe) obj;
        return this.a != qeVar.a ? false : this.b == null ? qeVar.b == null : this.b.equals(qeVar.b);
    }

    public int hashCode() {
        return (this.b == null ? 0 : this.b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + this.a) * 31);
    }
}
