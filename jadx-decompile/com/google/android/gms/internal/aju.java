package com.google.android.gms.internal;

public final class aju extends qx<aju> {
    public int a;
    public String b;
    public long c;
    public long d;
    public int e;

    public aju() {
        b();
    }

    public static aju a(byte[] bArr) {
        return (aju) rd.a(new aju(), bArr);
    }

    protected int a() {
        int a = (((super.a() + qw.c(1, this.a)) + qw.b(2, this.b)) + qw.h(3, this.c)) + qw.h(4, this.d);
        return this.e != -1 ? a + qw.c(5, this.e) : a;
    }

    public aju a(qv qvVar) {
        while (true) {
            int a = qvVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = qvVar.g();
                    continue;
                case 18:
                    this.b = qvVar.j();
                    continue;
                case 24:
                    this.c = qvVar.m();
                    continue;
                case 32:
                    this.d = qvVar.m();
                    continue;
                case 40:
                    this.e = qvVar.g();
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
        qwVar.a(2, this.b);
        qwVar.d(3, this.c);
        qwVar.d(4, this.d);
        if (this.e != -1) {
            qwVar.a(5, this.e);
        }
        super.a(qwVar);
    }

    public aju b() {
        this.a = 1;
        this.b = "";
        this.c = -1;
        this.d = -1;
        this.e = -1;
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
        if (!(obj instanceof aju)) {
            return false;
        }
        aju com_google_android_gms_internal_aju = (aju) obj;
        if (this.a != com_google_android_gms_internal_aju.a) {
            return false;
        }
        if (this.b == null) {
            if (com_google_android_gms_internal_aju.b != null) {
                return false;
            }
        } else if (!this.b.equals(com_google_android_gms_internal_aju.b)) {
            return false;
        }
        return (this.c == com_google_android_gms_internal_aju.c && this.d == com_google_android_gms_internal_aju.d && this.e == com_google_android_gms_internal_aju.e) ? (this.ag == null || this.ag.b()) ? com_google_android_gms_internal_aju.ag == null || com_google_android_gms_internal_aju.ag.b() : this.ag.equals(com_google_android_gms_internal_aju.ag) : false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((this.b == null ? 0 : this.b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + this.a) * 31)) * 31) + ((int) (this.c ^ (this.c >>> 32)))) * 31) + ((int) (this.d ^ (this.d >>> 32)))) * 31) + this.e) * 31;
        if (!(this.ag == null || this.ag.b())) {
            i = this.ag.hashCode();
        }
        return hashCode + i;
    }
}
