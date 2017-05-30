package com.google.android.gms.internal;

public interface hj {

    public static final class a extends qx<a> {
        private static volatile a[] m;
        public int a;
        public String b;
        public a[] c;
        public a[] d;
        public a[] e;
        public String f;
        public String g;
        public long h;
        public boolean i;
        public a[] j;
        public int[] k;
        public boolean l;

        public a() {
            c();
        }

        public static a[] b() {
            if (m == null) {
                synchronized (rb.c) {
                    if (m == null) {
                        m = new a[0];
                    }
                }
            }
            return m;
        }

        protected int a() {
            int i;
            int i2 = 0;
            int a = super.a() + qw.c(1, this.a);
            if (!this.b.equals("")) {
                a += qw.b(2, this.b);
            }
            if (this.c != null && this.c.length > 0) {
                i = a;
                for (rd rdVar : this.c) {
                    if (rdVar != null) {
                        i += qw.c(3, rdVar);
                    }
                }
                a = i;
            }
            if (this.d != null && this.d.length > 0) {
                i = a;
                for (rd rdVar2 : this.d) {
                    if (rdVar2 != null) {
                        i += qw.c(4, rdVar2);
                    }
                }
                a = i;
            }
            if (this.e != null && this.e.length > 0) {
                i = a;
                for (rd rdVar22 : this.e) {
                    if (rdVar22 != null) {
                        i += qw.c(5, rdVar22);
                    }
                }
                a = i;
            }
            if (!this.f.equals("")) {
                a += qw.b(6, this.f);
            }
            if (!this.g.equals("")) {
                a += qw.b(7, this.g);
            }
            if (this.h != 0) {
                a += qw.f(8, this.h);
            }
            if (this.l) {
                a += qw.b(9, this.l);
            }
            if (this.k != null && this.k.length > 0) {
                int i3 = 0;
                for (int c : this.k) {
                    i3 += qw.c(c);
                }
                a = (a + i3) + (this.k.length * 1);
            }
            if (this.j != null && this.j.length > 0) {
                while (i2 < this.j.length) {
                    rd rdVar3 = this.j[i2];
                    if (rdVar3 != null) {
                        a += qw.c(11, rdVar3);
                    }
                    i2++;
                }
            }
            return this.i ? a + qw.b(12, this.i) : a;
        }

        public a a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                int b;
                Object obj;
                int i;
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        a = qvVar.g();
                        switch (a) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                this.a = a;
                                break;
                            default:
                                continue;
                        }
                    case 18:
                        this.b = qvVar.j();
                        continue;
                    case 26:
                        b = rg.b(qvVar, 26);
                        a = this.c == null ? 0 : this.c.length;
                        obj = new a[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.c, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new a();
                            qvVar.a(obj[a]);
                            qvVar.a();
                            a++;
                        }
                        obj[a] = new a();
                        qvVar.a(obj[a]);
                        this.c = obj;
                        continue;
                    case 34:
                        b = rg.b(qvVar, 34);
                        a = this.d == null ? 0 : this.d.length;
                        obj = new a[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.d, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new a();
                            qvVar.a(obj[a]);
                            qvVar.a();
                            a++;
                        }
                        obj[a] = new a();
                        qvVar.a(obj[a]);
                        this.d = obj;
                        continue;
                    case 42:
                        b = rg.b(qvVar, 42);
                        a = this.e == null ? 0 : this.e.length;
                        obj = new a[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.e, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new a();
                            qvVar.a(obj[a]);
                            qvVar.a();
                            a++;
                        }
                        obj[a] = new a();
                        qvVar.a(obj[a]);
                        this.e = obj;
                        continue;
                    case 50:
                        this.f = qvVar.j();
                        continue;
                    case 58:
                        this.g = qvVar.j();
                        continue;
                    case 64:
                        this.h = qvVar.f();
                        continue;
                    case 72:
                        this.l = qvVar.i();
                        continue;
                    case 80:
                        int b2 = rg.b(qvVar, 80);
                        Object obj2 = new int[b2];
                        i = 0;
                        b = 0;
                        while (i < b2) {
                            if (i != 0) {
                                qvVar.a();
                            }
                            int g = qvVar.g();
                            switch (g) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                    a = b + 1;
                                    obj2[b] = g;
                                    break;
                                default:
                                    a = b;
                                    break;
                            }
                            i++;
                            b = a;
                        }
                        if (b != 0) {
                            a = this.k == null ? 0 : this.k.length;
                            if (a != 0 || b != b2) {
                                Object obj3 = new int[(a + b)];
                                if (a != 0) {
                                    System.arraycopy(this.k, 0, obj3, 0, a);
                                }
                                System.arraycopy(obj2, 0, obj3, a, b);
                                this.k = obj3;
                                break;
                            }
                            this.k = obj2;
                            break;
                        }
                        continue;
                    case 82:
                        i = qvVar.d(qvVar.n());
                        b = qvVar.t();
                        a = 0;
                        while (qvVar.r() > 0) {
                            switch (qvVar.g()) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                    a++;
                                    break;
                                default:
                                    break;
                            }
                        }
                        if (a != 0) {
                            qvVar.f(b);
                            b = this.k == null ? 0 : this.k.length;
                            Object obj4 = new int[(a + b)];
                            if (b != 0) {
                                System.arraycopy(this.k, 0, obj4, 0, b);
                            }
                            while (qvVar.r() > 0) {
                                int g2 = qvVar.g();
                                switch (g2) {
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                        a = b + 1;
                                        obj4[b] = g2;
                                        b = a;
                                        break;
                                    default:
                                        break;
                                }
                            }
                            this.k = obj4;
                        }
                        qvVar.e(i);
                        continue;
                    case 90:
                        b = rg.b(qvVar, 90);
                        a = this.j == null ? 0 : this.j.length;
                        obj = new a[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.j, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new a();
                            qvVar.a(obj[a]);
                            qvVar.a();
                            a++;
                        }
                        obj[a] = new a();
                        qvVar.a(obj[a]);
                        this.j = obj;
                        continue;
                    case 96:
                        this.i = qvVar.i();
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
            int i = 0;
            qwVar.a(1, this.a);
            if (!this.b.equals("")) {
                qwVar.a(2, this.b);
            }
            if (this.c != null && this.c.length > 0) {
                for (rd rdVar : this.c) {
                    if (rdVar != null) {
                        qwVar.a(3, rdVar);
                    }
                }
            }
            if (this.d != null && this.d.length > 0) {
                for (rd rdVar2 : this.d) {
                    if (rdVar2 != null) {
                        qwVar.a(4, rdVar2);
                    }
                }
            }
            if (this.e != null && this.e.length > 0) {
                for (rd rdVar22 : this.e) {
                    if (rdVar22 != null) {
                        qwVar.a(5, rdVar22);
                    }
                }
            }
            if (!this.f.equals("")) {
                qwVar.a(6, this.f);
            }
            if (!this.g.equals("")) {
                qwVar.a(7, this.g);
            }
            if (this.h != 0) {
                qwVar.b(8, this.h);
            }
            if (this.l) {
                qwVar.a(9, this.l);
            }
            if (this.k != null && this.k.length > 0) {
                for (int a : this.k) {
                    qwVar.a(10, a);
                }
            }
            if (this.j != null && this.j.length > 0) {
                while (i < this.j.length) {
                    rd rdVar3 = this.j[i];
                    if (rdVar3 != null) {
                        qwVar.a(11, rdVar3);
                    }
                    i++;
                }
            }
            if (this.i) {
                qwVar.a(12, this.i);
            }
            super.a(qwVar);
        }

        public /* synthetic */ rd b(qv qvVar) {
            return a(qvVar);
        }

        public a c() {
            this.a = 1;
            this.b = "";
            this.c = b();
            this.d = b();
            this.e = b();
            this.f = "";
            this.g = "";
            this.h = 0;
            this.i = false;
            this.j = b();
            this.k = rg.a;
            this.l = false;
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
            if (!rb.a(this.c, aVar.c) || !rb.a(this.d, aVar.d) || !rb.a(this.e, aVar.e)) {
                return false;
            }
            if (this.f == null) {
                if (aVar.f != null) {
                    return false;
                }
            } else if (!this.f.equals(aVar.f)) {
                return false;
            }
            if (this.g == null) {
                if (aVar.g != null) {
                    return false;
                }
            } else if (!this.g.equals(aVar.g)) {
                return false;
            }
            return (this.h == aVar.h && this.i == aVar.i && rb.a(this.j, aVar.j) && rb.a(this.k, aVar.k) && this.l == aVar.l) ? (this.ag == null || this.ag.b()) ? aVar.ag == null || aVar.ag.b() : this.ag.equals(aVar.ag) : false;
        }

        public int hashCode() {
            int i = 1231;
            int i2 = 0;
            int hashCode = ((((((this.i ? 1231 : 1237) + (((((this.g == null ? 0 : this.g.hashCode()) + (((this.f == null ? 0 : this.f.hashCode()) + (((((((((this.b == null ? 0 : this.b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + this.a) * 31)) * 31) + rb.a(this.c)) * 31) + rb.a(this.d)) * 31) + rb.a(this.e)) * 31)) * 31)) * 31) + ((int) (this.h ^ (this.h >>> 32)))) * 31)) * 31) + rb.a(this.j)) * 31) + rb.a(this.k)) * 31;
            if (!this.l) {
                i = 1237;
            }
            hashCode = (hashCode + i) * 31;
            if (!(this.ag == null || this.ag.b())) {
                i2 = this.ag.hashCode();
            }
            return hashCode + i2;
        }
    }
}
