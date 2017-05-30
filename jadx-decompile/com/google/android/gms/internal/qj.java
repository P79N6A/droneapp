package com.google.android.gms.internal;

public final class qj extends rd {
    public int a;

    public qj() {
        b();
    }

    protected int a() {
        int a = super.a();
        return this.a != 0 ? a + qw.c(1, this.a) : a;
    }

    public qj a(qv qvVar) {
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
        super.a(qwVar);
    }

    public qj b() {
        this.a = 0;
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
        if (!(obj instanceof qj)) {
            return false;
        }
        return this.a == ((qj) obj).a;
    }

    public int hashCode() {
        return ((getClass().getName().hashCode() + 527) * 31) + this.a;
    }
}
