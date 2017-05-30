package com.google.android.gms.internal;

public final class ajv extends qx<ajv> {
    public long a;
    public long b;

    public ajv() {
        b();
    }

    protected int a() {
        return (super.a() + qw.h(1, this.a)) + qw.h(2, this.b);
    }

    public ajv a(qv qvVar) {
        while (true) {
            int a = qvVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = qvVar.m();
                    continue;
                case 16:
                    this.b = qvVar.m();
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
        qwVar.d(1, this.a);
        qwVar.d(2, this.b);
        super.a(qwVar);
    }

    public ajv b() {
        this.a = -1;
        this.b = -1;
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
        if (!(obj instanceof ajv)) {
            return false;
        }
        ajv com_google_android_gms_internal_ajv = (ajv) obj;
        return (this.a == com_google_android_gms_internal_ajv.a && this.b == com_google_android_gms_internal_ajv.b) ? (this.ag == null || this.ag.b()) ? com_google_android_gms_internal_ajv.ag == null || com_google_android_gms_internal_ajv.ag.b() : this.ag.equals(com_google_android_gms_internal_ajv.ag) : false;
    }

    public int hashCode() {
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + ((int) (this.a ^ (this.a >>> 32)))) * 31) + ((int) (this.b ^ (this.b >>> 32)))) * 31;
        int hashCode2 = (this.ag == null || this.ag.b()) ? 0 : this.ag.hashCode();
        return hashCode2 + hashCode;
    }
}
