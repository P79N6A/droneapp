package com.google.android.gms.internal;

public abstract class qx<M extends qx<M>> extends rd {
    protected qz ag;

    protected int a() {
        int i = 0;
        if (this.ag == null) {
            return 0;
        }
        int i2 = 0;
        while (i < this.ag.a()) {
            i2 += this.ag.b(i).a();
            i++;
        }
        return i2;
    }

    public final <T> T a(qy<M, T> qyVar) {
        if (this.ag == null) {
            return null;
        }
        ra a = this.ag.a(rg.b(qyVar.c));
        return a != null ? a.a((qy) qyVar) : null;
    }

    public void a(qw qwVar) {
        if (this.ag != null) {
            for (int i = 0; i < this.ag.a(); i++) {
                this.ag.b(i).a(qwVar);
            }
        }
    }

    protected final boolean a(qv qvVar, int i) {
        int t = qvVar.t();
        if (!qvVar.b(i)) {
            return false;
        }
        int b = rg.b(i);
        rf rfVar = new rf(i, qvVar.a(t, qvVar.t() - t));
        ra raVar = null;
        if (this.ag == null) {
            this.ag = new qz();
        } else {
            raVar = this.ag.a(b);
        }
        if (raVar == null) {
            raVar = new ra();
            this.ag.a(b, raVar);
        }
        raVar.a(rfVar);
        return true;
    }

    public /* synthetic */ Object clone() {
        return d();
    }

    public M d() {
        qx qxVar = (qx) super.e();
        rb.a(this, qxVar);
        return qxVar;
    }

    public /* synthetic */ rd e() {
        return (qx) clone();
    }
}
