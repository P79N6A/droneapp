package com.google.android.gms.internal;

public final class qg extends qx<qg> {
    public String a;
    public String b;
    public String c;

    public qg() {
        b();
    }

    protected int a() {
        int a = super.a();
        if (!this.a.equals("")) {
            a += qw.b(1, this.a);
        }
        if (!this.b.equals("")) {
            a += qw.b(2, this.b);
        }
        return !this.c.equals("") ? a + qw.b(3, this.c) : a;
    }

    public qg a(qv qvVar) {
        while (true) {
            int a = qvVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = qvVar.j();
                    continue;
                case 18:
                    this.b = qvVar.j();
                    continue;
                case 26:
                    this.c = qvVar.j();
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
        if (!this.a.equals("")) {
            qwVar.a(1, this.a);
        }
        if (!this.b.equals("")) {
            qwVar.a(2, this.b);
        }
        if (!this.c.equals("")) {
            qwVar.a(3, this.c);
        }
        super.a(qwVar);
    }

    public qg b() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.ag = null;
        this.ah = -1;
        return this;
    }

    public /* synthetic */ rd b(qv qvVar) {
        return a(qvVar);
    }
}
