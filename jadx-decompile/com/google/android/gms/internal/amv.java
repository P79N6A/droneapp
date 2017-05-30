package com.google.android.gms.internal;

public interface amv {

    public static final class a extends rd {
        private static volatile a[] d;
        public String a;
        public Boolean b;
        public Boolean c;

        public a() {
            c();
        }

        public static a[] b() {
            if (d == null) {
                synchronized (rb.c) {
                    if (d == null) {
                        d = new a[0];
                    }
                }
            }
            return d;
        }

        protected int a() {
            int a = super.a();
            if (this.a != null) {
                a += qw.b(1, this.a);
            }
            if (this.b != null) {
                a += qw.b(2, this.b.booleanValue());
            }
            return this.c != null ? a + qw.b(3, this.c.booleanValue()) : a;
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
                        this.b = Boolean.valueOf(qvVar.i());
                        continue;
                    case 24:
                        this.c = Boolean.valueOf(qvVar.i());
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
            if (this.a != null) {
                qwVar.a(1, this.a);
            }
            if (this.b != null) {
                qwVar.a(2, this.b.booleanValue());
            }
            if (this.c != null) {
                qwVar.a(3, this.c.booleanValue());
            }
            super.a(qwVar);
        }

        public /* synthetic */ rd b(qv qvVar) {
            return a(qvVar);
        }

        public a c() {
            this.a = null;
            this.b = null;
            this.c = null;
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
            if (this.a == null) {
                if (aVar.a != null) {
                    return false;
                }
            } else if (!this.a.equals(aVar.a)) {
                return false;
            }
            if (this.b == null) {
                if (aVar.b != null) {
                    return false;
                }
            } else if (!this.b.equals(aVar.b)) {
                return false;
            }
            return this.c == null ? aVar.c == null : this.c.equals(aVar.c);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.b == null ? 0 : this.b.hashCode()) + (((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
            if (this.c != null) {
                i = this.c.hashCode();
            }
            return hashCode + i;
        }
    }

    public static final class b extends rd {
        public Long a;
        public String b;
        public Integer c;
        public c[] d;
        public a[] e;
        public com.google.android.gms.internal.amu.a[] f;

        public b() {
            b();
        }

        protected int a() {
            int i;
            int i2 = 0;
            int a = super.a();
            if (this.a != null) {
                a += qw.f(1, this.a.longValue());
            }
            if (this.b != null) {
                a += qw.b(2, this.b);
            }
            if (this.c != null) {
                a += qw.c(3, this.c.intValue());
            }
            if (this.d != null && this.d.length > 0) {
                i = a;
                for (rd rdVar : this.d) {
                    if (rdVar != null) {
                        i += qw.c(4, rdVar);
                    }
                }
                a = i;
            }
            if (this.e != null && this.e.length > 0) {
                i = a;
                for (rd rdVar2 : this.e) {
                    if (rdVar2 != null) {
                        i += qw.c(5, rdVar2);
                    }
                }
                a = i;
            }
            if (this.f != null && this.f.length > 0) {
                while (i2 < this.f.length) {
                    rd rdVar3 = this.f[i2];
                    if (rdVar3 != null) {
                        a += qw.c(6, rdVar3);
                    }
                    i2++;
                }
            }
            return a;
        }

        public b a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                int b;
                Object obj;
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        this.a = Long.valueOf(qvVar.f());
                        continue;
                    case 18:
                        this.b = qvVar.j();
                        continue;
                    case 24:
                        this.c = Integer.valueOf(qvVar.g());
                        continue;
                    case 34:
                        b = rg.b(qvVar, 34);
                        a = this.d == null ? 0 : this.d.length;
                        obj = new c[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.d, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new c();
                            qvVar.a(obj[a]);
                            qvVar.a();
                            a++;
                        }
                        obj[a] = new c();
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
                        b = rg.b(qvVar, 50);
                        a = this.f == null ? 0 : this.f.length;
                        obj = new com.google.android.gms.internal.amu.a[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.f, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new com.google.android.gms.internal.amu.a();
                            qvVar.a(obj[a]);
                            qvVar.a();
                            a++;
                        }
                        obj[a] = new com.google.android.gms.internal.amu.a();
                        qvVar.a(obj[a]);
                        this.f = obj;
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
            int i = 0;
            if (this.a != null) {
                qwVar.b(1, this.a.longValue());
            }
            if (this.b != null) {
                qwVar.a(2, this.b);
            }
            if (this.c != null) {
                qwVar.a(3, this.c.intValue());
            }
            if (this.d != null && this.d.length > 0) {
                for (rd rdVar : this.d) {
                    if (rdVar != null) {
                        qwVar.a(4, rdVar);
                    }
                }
            }
            if (this.e != null && this.e.length > 0) {
                for (rd rdVar2 : this.e) {
                    if (rdVar2 != null) {
                        qwVar.a(5, rdVar2);
                    }
                }
            }
            if (this.f != null && this.f.length > 0) {
                while (i < this.f.length) {
                    rd rdVar3 = this.f[i];
                    if (rdVar3 != null) {
                        qwVar.a(6, rdVar3);
                    }
                    i++;
                }
            }
            super.a(qwVar);
        }

        public b b() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = c.b();
            this.e = a.b();
            this.f = com.google.android.gms.internal.amu.a.b();
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
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a == null) {
                if (bVar.a != null) {
                    return false;
                }
            } else if (!this.a.equals(bVar.a)) {
                return false;
            }
            if (this.b == null) {
                if (bVar.b != null) {
                    return false;
                }
            } else if (!this.b.equals(bVar.b)) {
                return false;
            }
            if (this.c == null) {
                if (bVar.c != null) {
                    return false;
                }
            } else if (!this.c.equals(bVar.c)) {
                return false;
            }
            return !rb.a(this.d, bVar.d) ? false : !rb.a(this.e, bVar.e) ? false : rb.a(this.f, bVar.f);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.b == null ? 0 : this.b.hashCode()) + (((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
            if (this.c != null) {
                i = this.c.hashCode();
            }
            return ((((((hashCode + i) * 31) + rb.a(this.d)) * 31) + rb.a(this.e)) * 31) + rb.a(this.f);
        }
    }

    public static final class c extends rd {
        private static volatile c[] c;
        public String a;
        public String b;

        public c() {
            c();
        }

        public static c[] b() {
            if (c == null) {
                synchronized (rb.c) {
                    if (c == null) {
                        c = new c[0];
                    }
                }
            }
            return c;
        }

        protected int a() {
            int a = super.a();
            if (this.a != null) {
                a += qw.b(1, this.a);
            }
            return this.b != null ? a + qw.b(2, this.b) : a;
        }

        public c a(qv qvVar) {
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
            if (this.a != null) {
                qwVar.a(1, this.a);
            }
            if (this.b != null) {
                qwVar.a(2, this.b);
            }
            super.a(qwVar);
        }

        public /* synthetic */ rd b(qv qvVar) {
            return a(qvVar);
        }

        public c c() {
            this.a = null;
            this.b = null;
            this.ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.a == null) {
                if (cVar.a != null) {
                    return false;
                }
            } else if (!this.a.equals(cVar.a)) {
                return false;
            }
            return this.b == null ? cVar.b == null : this.b.equals(cVar.b);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31;
            if (this.b != null) {
                i = this.b.hashCode();
            }
            return hashCode + i;
        }
    }
}
