package com.google.android.gms.internal;

import com.google.android.gms.internal.gi.f;
import com.google.android.gms.internal.gi.j;

public interface el {

    public static final class a extends qx<a> {
        public long a;
        public f b;
        public j c;

        public a() {
            b();
        }

        public static a a(byte[] bArr) {
            return (a) rd.a(new a(), bArr);
        }

        protected int a() {
            int a = super.a() + qw.f(1, this.a);
            if (this.b != null) {
                a += qw.c(2, this.b);
            }
            return this.c != null ? a + qw.c(3, this.c) : a;
        }

        public a a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        this.a = qvVar.f();
                        continue;
                    case 18:
                        if (this.b == null) {
                            this.b = new f();
                        }
                        qvVar.a(this.b);
                        continue;
                    case 26:
                        if (this.c == null) {
                            this.c = new j();
                        }
                        qvVar.a(this.c);
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
            qwVar.b(1, this.a);
            if (this.b != null) {
                qwVar.a(2, this.b);
            }
            if (this.c != null) {
                qwVar.a(3, this.c);
            }
            super.a(qwVar);
        }

        public a b() {
            this.a = 0;
            this.b = null;
            this.c = null;
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
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a != aVar.a) {
                return false;
            }
            if (this.b == null) {
                if (aVar.b != null) {
                    return false;
                }
            } else if (!this.b.equals(aVar.b)) {
                return false;
            }
            if (this.c == null) {
                if (aVar.c != null) {
                    return false;
                }
            } else if (!this.c.equals(aVar.c)) {
                return false;
            }
            return (this.ag == null || this.ag.b()) ? aVar.ag == null || aVar.ag.b() : this.ag.equals(aVar.ag);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.c == null ? 0 : this.c.hashCode()) + (((this.b == null ? 0 : this.b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + ((int) (this.a ^ (this.a >>> 32)))) * 31)) * 31)) * 31;
            if (!(this.ag == null || this.ag.b())) {
                i = this.ag.hashCode();
            }
            return hashCode + i;
        }
    }
}
