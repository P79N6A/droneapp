package com.google.android.gms.internal;

public interface ce {

    public static final class a extends qx<a> {
        public String a;
        public Long b;
        public String c;
        public String d;
        public String e;
        public Long f;
        public Long g;
        public String h;
        public Long i;
        public String j;

        public a() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.ah = -1;
        }

        protected int a() {
            int a = super.a();
            if (this.a != null) {
                a += qw.b(1, this.a);
            }
            if (this.b != null) {
                a += qw.f(2, this.b.longValue());
            }
            if (this.c != null) {
                a += qw.b(3, this.c);
            }
            if (this.d != null) {
                a += qw.b(4, this.d);
            }
            if (this.e != null) {
                a += qw.b(5, this.e);
            }
            if (this.f != null) {
                a += qw.f(6, this.f.longValue());
            }
            if (this.g != null) {
                a += qw.f(7, this.g.longValue());
            }
            if (this.h != null) {
                a += qw.b(8, this.h);
            }
            if (this.i != null) {
                a += qw.f(9, this.i.longValue());
            }
            return this.j != null ? a + qw.b(10, this.j) : a;
        }

        public a a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        this.a = qvVar.j();
                        continue;
                    case 16:
                        this.b = Long.valueOf(qvVar.f());
                        continue;
                    case 26:
                        this.c = qvVar.j();
                        continue;
                    case 34:
                        this.d = qvVar.j();
                        continue;
                    case 42:
                        this.e = qvVar.j();
                        continue;
                    case 48:
                        this.f = Long.valueOf(qvVar.f());
                        continue;
                    case 56:
                        this.g = Long.valueOf(qvVar.f());
                        continue;
                    case 66:
                        this.h = qvVar.j();
                        continue;
                    case 72:
                        this.i = Long.valueOf(qvVar.f());
                        continue;
                    case 82:
                        this.j = qvVar.j();
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
            if (this.a != null) {
                qwVar.a(1, this.a);
            }
            if (this.b != null) {
                qwVar.b(2, this.b.longValue());
            }
            if (this.c != null) {
                qwVar.a(3, this.c);
            }
            if (this.d != null) {
                qwVar.a(4, this.d);
            }
            if (this.e != null) {
                qwVar.a(5, this.e);
            }
            if (this.f != null) {
                qwVar.b(6, this.f.longValue());
            }
            if (this.g != null) {
                qwVar.b(7, this.g.longValue());
            }
            if (this.h != null) {
                qwVar.a(8, this.h);
            }
            if (this.i != null) {
                qwVar.b(9, this.i.longValue());
            }
            if (this.j != null) {
                qwVar.a(10, this.j);
            }
            super.a(qwVar);
        }

        public /* synthetic */ rd b(qv qvVar) {
            return a(qvVar);
        }
    }
}
