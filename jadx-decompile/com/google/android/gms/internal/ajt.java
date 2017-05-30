package com.google.android.gms.internal;

public final class ajt extends qx<ajt> {
    public int a;
    public long b;
    public long c;
    public long d;

    public ajt() {
        b();
    }

    protected int a() {
        return (((super.a() + qw.c(1, this.a)) + qw.h(2, this.b)) + qw.h(3, this.c)) + qw.h(4, this.d);
    }

    public ajt a(qv qvVar) {
        while (true) {
            int a = qvVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = qvVar.g();
                    continue;
                case 16:
                    this.b = qvVar.m();
                    continue;
                case 24:
                    this.c = qvVar.m();
                    continue;
                case 32:
                    this.d = qvVar.m();
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
        qwVar.a(1, this.a);
        qwVar.d(2, this.b);
        qwVar.d(3, this.c);
        qwVar.d(4, this.d);
        super.a(qwVar);
    }

    public ajt b() {
        this.a = 1;
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.ag = null;
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
        if (!(obj instanceof ajt)) {
            return false;
        }
        ajt com_google_android_gms_internal_ajt = (ajt) obj;
        return (this.a == com_google_android_gms_internal_ajt.a && this.b == com_google_android_gms_internal_ajt.b && this.c == com_google_android_gms_internal_ajt.c && this.d == com_google_android_gms_internal_ajt.d) ? (this.ag == null || this.ag.b()) ? com_google_android_gms_internal_ajt.ag == null || com_google_android_gms_internal_ajt.ag.b() : this.ag.equals(com_google_android_gms_internal_ajt.ag) : false;
    }

    public int hashCode() {
        int hashCode = (((((((((getClass().getName().hashCode() + 527) * 31) + this.a) * 31) + ((int) (this.b ^ (this.b >>> 32)))) * 31) + ((int) (this.c ^ (this.c >>> 32)))) * 31) + ((int) (this.d ^ (this.d >>> 32)))) * 31;
        int hashCode2 = (this.ag == null || this.ag.b()) ? 0 : this.ag.hashCode();
        return hashCode2 + hashCode;
    }
}
