package com.google.android.gms.internal;

public final class qq extends rd {
    public String a;

    public qq() {
        b();
    }

    protected int a() {
        int a = super.a();
        return !this.a.equals("") ? a + qw.b(1, this.a) : a;
    }

    public qq a(qv qvVar) {
        while (true) {
            int a = qvVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = qvVar.j();
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
        if (!this.a.equals("")) {
            qwVar.a(1, this.a);
        }
        super.a(qwVar);
    }

    public qq b() {
        this.a = "";
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
        if (!(obj instanceof qq)) {
            return false;
        }
        qq qqVar = (qq) obj;
        return this.a == null ? qqVar.a == null : this.a.equals(qqVar.a);
    }

    public int hashCode() {
        return (this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31);
    }
}
