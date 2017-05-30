package com.google.android.gms.internal;

public final class qt extends rd {
    public int a;
    public String b;
    public long c;
    public long d;
    public qc e;

    public qt() {
        b();
    }

    protected int a() {
        int a = super.a();
        if (this.a != 0) {
            a += qw.c(1, this.a);
        }
        if (!this.b.equals("")) {
            a += qw.b(2, this.b);
        }
        if (this.c != 0) {
            a += qw.f(3, this.c);
        }
        if (this.d != 0) {
            a += qw.f(4, this.d);
        }
        return this.e != null ? a + qw.c(5, this.e) : a;
    }

    public qt a(qv qvVar) {
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
                            this.a = a;
                            break;
                        default:
                            continue;
                    }
                case 18:
                    this.b = qvVar.j();
                    continue;
                case 24:
                    this.c = qvVar.f();
                    continue;
                case 32:
                    this.d = qvVar.f();
                    continue;
                case 42:
                    if (this.e == null) {
                        this.e = new qc();
                    }
                    qvVar.a(this.e);
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
        if (this.c != 0) {
            qwVar.b(3, this.c);
        }
        if (this.d != 0) {
            qwVar.b(4, this.d);
        }
        if (this.e != null) {
            qwVar.a(5, this.e);
        }
        super.a(qwVar);
    }

    public qt b() {
        this.a = 0;
        this.b = "";
        this.c = 0;
        this.d = 0;
        this.e = null;
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
        if (!(obj instanceof qt)) {
            return false;
        }
        qt qtVar = (qt) obj;
        if (this.a != qtVar.a) {
            return false;
        }
        if (this.b == null) {
            if (qtVar.b != null) {
                return false;
            }
        } else if (!this.b.equals(qtVar.b)) {
            return false;
        }
        return this.c != qtVar.c ? false : this.d != qtVar.d ? false : this.e == null ? qtVar.e == null : this.e.equals(qtVar.e);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((this.b == null ? 0 : this.b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + this.a) * 31)) * 31) + ((int) (this.c ^ (this.c >>> 32)))) * 31) + ((int) (this.d ^ (this.d >>> 32)))) * 31;
        if (this.e != null) {
            i = this.e.hashCode();
        }
        return hashCode + i;
    }
}
