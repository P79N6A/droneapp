package com.google.android.gms.internal;

public interface rh {

    public static final class a extends qx<a> {
        public boolean a;
        public int b;
        public String c;

        public a() {
            b();
        }

        protected int a() {
            int a = super.a();
            if (this.a) {
                a += qw.b(1, this.a);
            }
            if (this.b != 0) {
                a += qw.c(2, this.b);
            }
            return !this.c.equals("") ? a + qw.b(3, this.c) : a;
        }

        public a a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        this.a = qvVar.i();
                        continue;
                    case 16:
                        this.b = qvVar.g();
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
            if (this.a) {
                qwVar.a(1, this.a);
            }
            if (this.b != 0) {
                qwVar.a(2, this.b);
            }
            if (!this.c.equals("")) {
                qwVar.a(3, this.c);
            }
            super.a(qwVar);
        }

        public /* synthetic */ rd b(qv qvVar) {
            return a(qvVar);
        }

        public a b() {
            this.a = false;
            this.b = 0;
            this.c = "";
            this.ag = null;
            this.ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a != aVar.a || this.b != aVar.b) {
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
            int hashCode = ((this.c == null ? 0 : this.c.hashCode()) + (((((this.a ? 1231 : 1237) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + this.b) * 31)) * 31;
            if (!(this.ag == null || this.ag.b())) {
                i = this.ag.hashCode();
            }
            return hashCode + i;
        }
    }
}
