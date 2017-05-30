package com.google.android.gms.internal;

public interface amu {

    public static final class a extends rd {
        private static volatile a[] d;
        public Integer a;
        public e[] b;
        public b[] c;

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
            int i = 0;
            int a = super.a();
            if (this.a != null) {
                a += qw.c(1, this.a.intValue());
            }
            if (this.b != null && this.b.length > 0) {
                int i2 = a;
                for (rd rdVar : this.b) {
                    if (rdVar != null) {
                        i2 += qw.c(2, rdVar);
                    }
                }
                a = i2;
            }
            if (this.c != null && this.c.length > 0) {
                while (i < this.c.length) {
                    rd rdVar2 = this.c[i];
                    if (rdVar2 != null) {
                        a += qw.c(3, rdVar2);
                    }
                    i++;
                }
            }
            return a;
        }

        public a a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                int b;
                Object obj;
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        this.a = Integer.valueOf(qvVar.g());
                        continue;
                    case 18:
                        b = rg.b(qvVar, 18);
                        a = this.b == null ? 0 : this.b.length;
                        obj = new e[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.b, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new e();
                            qvVar.a(obj[a]);
                            qvVar.a();
                            a++;
                        }
                        obj[a] = new e();
                        qvVar.a(obj[a]);
                        this.b = obj;
                        continue;
                    case 26:
                        b = rg.b(qvVar, 26);
                        a = this.c == null ? 0 : this.c.length;
                        obj = new b[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.c, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new b();
                            qvVar.a(obj[a]);
                            qvVar.a();
                            a++;
                        }
                        obj[a] = new b();
                        qvVar.a(obj[a]);
                        this.c = obj;
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
                qwVar.a(1, this.a.intValue());
            }
            if (this.b != null && this.b.length > 0) {
                for (rd rdVar : this.b) {
                    if (rdVar != null) {
                        qwVar.a(2, rdVar);
                    }
                }
            }
            if (this.c != null && this.c.length > 0) {
                while (i < this.c.length) {
                    rd rdVar2 = this.c[i];
                    if (rdVar2 != null) {
                        qwVar.a(3, rdVar2);
                    }
                    i++;
                }
            }
            super.a(qwVar);
        }

        public /* synthetic */ rd b(qv qvVar) {
            return a(qvVar);
        }

        public a c() {
            this.a = null;
            this.b = e.b();
            this.c = b.b();
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
            return !rb.a(this.b, aVar.b) ? false : rb.a(this.c, aVar.c);
        }

        public int hashCode() {
            return (((((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + rb.a(this.b)) * 31) + rb.a(this.c);
        }
    }

    public static final class b extends rd {
        private static volatile b[] f;
        public Integer a;
        public String b;
        public c[] c;
        public Boolean d;
        public d e;

        public b() {
            c();
        }

        public static b[] b() {
            if (f == null) {
                synchronized (rb.c) {
                    if (f == null) {
                        f = new b[0];
                    }
                }
            }
            return f;
        }

        protected int a() {
            int a = super.a();
            if (this.a != null) {
                a += qw.c(1, this.a.intValue());
            }
            if (this.b != null) {
                a += qw.b(2, this.b);
            }
            if (this.c != null && this.c.length > 0) {
                int i = a;
                for (rd rdVar : this.c) {
                    if (rdVar != null) {
                        i += qw.c(3, rdVar);
                    }
                }
                a = i;
            }
            if (this.d != null) {
                a += qw.b(4, this.d.booleanValue());
            }
            return this.e != null ? a + qw.c(5, this.e) : a;
        }

        public b a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        this.a = Integer.valueOf(qvVar.g());
                        continue;
                    case 18:
                        this.b = qvVar.j();
                        continue;
                    case 26:
                        int b = rg.b(qvVar, 26);
                        a = this.c == null ? 0 : this.c.length;
                        Object obj = new c[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.c, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new c();
                            qvVar.a(obj[a]);
                            qvVar.a();
                            a++;
                        }
                        obj[a] = new c();
                        qvVar.a(obj[a]);
                        this.c = obj;
                        continue;
                    case 32:
                        this.d = Boolean.valueOf(qvVar.i());
                        continue;
                    case 42:
                        if (this.e == null) {
                            this.e = new d();
                        }
                        qvVar.a(this.e);
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
                qwVar.a(1, this.a.intValue());
            }
            if (this.b != null) {
                qwVar.a(2, this.b);
            }
            if (this.c != null && this.c.length > 0) {
                for (rd rdVar : this.c) {
                    if (rdVar != null) {
                        qwVar.a(3, rdVar);
                    }
                }
            }
            if (this.d != null) {
                qwVar.a(4, this.d.booleanValue());
            }
            if (this.e != null) {
                qwVar.a(5, this.e);
            }
            super.a(qwVar);
        }

        public /* synthetic */ rd b(qv qvVar) {
            return a(qvVar);
        }

        public b c() {
            this.a = null;
            this.b = null;
            this.c = c.b();
            this.d = null;
            this.e = null;
            this.ah = -1;
            return this;
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
            if (!rb.a(this.c, bVar.c)) {
                return false;
            }
            if (this.d == null) {
                if (bVar.d != null) {
                    return false;
                }
            } else if (!this.d.equals(bVar.d)) {
                return false;
            }
            return this.e == null ? bVar.e == null : this.e.equals(bVar.e);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.d == null ? 0 : this.d.hashCode()) + (((((this.b == null ? 0 : this.b.hashCode()) + (((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31) + rb.a(this.c)) * 31)) * 31;
            if (this.e != null) {
                i = this.e.hashCode();
            }
            return hashCode + i;
        }
    }

    public static final class c extends rd {
        private static volatile c[] e;
        public f a;
        public d b;
        public Boolean c;
        public String d;

        public c() {
            c();
        }

        public static c[] b() {
            if (e == null) {
                synchronized (rb.c) {
                    if (e == null) {
                        e = new c[0];
                    }
                }
            }
            return e;
        }

        protected int a() {
            int a = super.a();
            if (this.a != null) {
                a += qw.c(1, this.a);
            }
            if (this.b != null) {
                a += qw.c(2, this.b);
            }
            if (this.c != null) {
                a += qw.b(3, this.c.booleanValue());
            }
            return this.d != null ? a + qw.b(4, this.d) : a;
        }

        public c a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        if (this.a == null) {
                            this.a = new f();
                        }
                        qvVar.a(this.a);
                        continue;
                    case 18:
                        if (this.b == null) {
                            this.b = new d();
                        }
                        qvVar.a(this.b);
                        continue;
                    case 24:
                        this.c = Boolean.valueOf(qvVar.i());
                        continue;
                    case 34:
                        this.d = qvVar.j();
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
            if (this.c != null) {
                qwVar.a(3, this.c.booleanValue());
            }
            if (this.d != null) {
                qwVar.a(4, this.d);
            }
            super.a(qwVar);
        }

        public /* synthetic */ rd b(qv qvVar) {
            return a(qvVar);
        }

        public c c() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
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
            if (this.b == null) {
                if (cVar.b != null) {
                    return false;
                }
            } else if (!this.b.equals(cVar.b)) {
                return false;
            }
            if (this.c == null) {
                if (cVar.c != null) {
                    return false;
                }
            } else if (!this.c.equals(cVar.c)) {
                return false;
            }
            return this.d == null ? cVar.d == null : this.d.equals(cVar.d);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.c == null ? 0 : this.c.hashCode()) + (((this.b == null ? 0 : this.b.hashCode()) + (((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31;
            if (this.d != null) {
                i = this.d.hashCode();
            }
            return hashCode + i;
        }
    }

    public static final class d extends rd {
        public Integer a;
        public Boolean b;
        public String c;
        public String d;
        public String e;

        public d() {
            b();
        }

        protected int a() {
            int a = super.a();
            if (this.a != null) {
                a += qw.c(1, this.a.intValue());
            }
            if (this.b != null) {
                a += qw.b(2, this.b.booleanValue());
            }
            if (this.c != null) {
                a += qw.b(3, this.c);
            }
            if (this.d != null) {
                a += qw.b(4, this.d);
            }
            return this.e != null ? a + qw.b(5, this.e) : a;
        }

        public d a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        a = qvVar.g();
                        switch (a) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                this.a = Integer.valueOf(a);
                                break;
                            default:
                                continue;
                        }
                    case 16:
                        this.b = Boolean.valueOf(qvVar.i());
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
                qwVar.a(1, this.a.intValue());
            }
            if (this.b != null) {
                qwVar.a(2, this.b.booleanValue());
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
            super.a(qwVar);
        }

        public d b() {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
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
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.a == null) {
                if (dVar.a != null) {
                    return false;
                }
            } else if (!this.a.equals(dVar.a)) {
                return false;
            }
            if (this.b == null) {
                if (dVar.b != null) {
                    return false;
                }
            } else if (!this.b.equals(dVar.b)) {
                return false;
            }
            if (this.c == null) {
                if (dVar.c != null) {
                    return false;
                }
            } else if (!this.c.equals(dVar.c)) {
                return false;
            }
            if (this.d == null) {
                if (dVar.d != null) {
                    return false;
                }
            } else if (!this.d.equals(dVar.d)) {
                return false;
            }
            return this.e == null ? dVar.e == null : this.e.equals(dVar.e);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.d == null ? 0 : this.d.hashCode()) + (((this.c == null ? 0 : this.c.hashCode()) + (((this.b == null ? 0 : this.b.hashCode()) + (((this.a == null ? 0 : this.a.intValue()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31;
            if (this.e != null) {
                i = this.e.hashCode();
            }
            return hashCode + i;
        }
    }

    public static final class e extends rd {
        private static volatile e[] d;
        public Integer a;
        public String b;
        public c c;

        public e() {
            c();
        }

        public static e[] b() {
            if (d == null) {
                synchronized (rb.c) {
                    if (d == null) {
                        d = new e[0];
                    }
                }
            }
            return d;
        }

        protected int a() {
            int a = super.a();
            if (this.a != null) {
                a += qw.c(1, this.a.intValue());
            }
            if (this.b != null) {
                a += qw.b(2, this.b);
            }
            return this.c != null ? a + qw.c(3, this.c) : a;
        }

        public e a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        this.a = Integer.valueOf(qvVar.g());
                        continue;
                    case 18:
                        this.b = qvVar.j();
                        continue;
                    case 26:
                        if (this.c == null) {
                            this.c = new c();
                        }
                        qvVar.a(this.c);
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
                qwVar.a(1, this.a.intValue());
            }
            if (this.b != null) {
                qwVar.a(2, this.b);
            }
            if (this.c != null) {
                qwVar.a(3, this.c);
            }
            super.a(qwVar);
        }

        public /* synthetic */ rd b(qv qvVar) {
            return a(qvVar);
        }

        public e c() {
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
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.a == null) {
                if (eVar.a != null) {
                    return false;
                }
            } else if (!this.a.equals(eVar.a)) {
                return false;
            }
            if (this.b == null) {
                if (eVar.b != null) {
                    return false;
                }
            } else if (!this.b.equals(eVar.b)) {
                return false;
            }
            return this.c == null ? eVar.c == null : this.c.equals(eVar.c);
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

    public static final class f extends rd {
        public Integer a;
        public String b;
        public Boolean c;
        public String[] d;

        public f() {
            b();
        }

        protected int a() {
            int i = 0;
            int a = super.a();
            if (this.a != null) {
                a += qw.c(1, this.a.intValue());
            }
            if (this.b != null) {
                a += qw.b(2, this.b);
            }
            if (this.c != null) {
                a += qw.b(3, this.c.booleanValue());
            }
            if (this.d == null || this.d.length <= 0) {
                return a;
            }
            int i2 = 0;
            int i3 = 0;
            while (i < this.d.length) {
                String str = this.d[i];
                if (str != null) {
                    i3++;
                    i2 += qw.b(str);
                }
                i++;
            }
            return (a + i2) + (i3 * 1);
        }

        public f a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        a = qvVar.g();
                        switch (a) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                this.a = Integer.valueOf(a);
                                break;
                            default:
                                continue;
                        }
                    case 18:
                        this.b = qvVar.j();
                        continue;
                    case 24:
                        this.c = Boolean.valueOf(qvVar.i());
                        continue;
                    case 34:
                        int b = rg.b(qvVar, 34);
                        a = this.d == null ? 0 : this.d.length;
                        Object obj = new String[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.d, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = qvVar.j();
                            qvVar.a();
                            a++;
                        }
                        obj[a] = qvVar.j();
                        this.d = obj;
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
                qwVar.a(1, this.a.intValue());
            }
            if (this.b != null) {
                qwVar.a(2, this.b);
            }
            if (this.c != null) {
                qwVar.a(3, this.c.booleanValue());
            }
            if (this.d != null && this.d.length > 0) {
                for (String str : this.d) {
                    if (str != null) {
                        qwVar.a(4, str);
                    }
                }
            }
            super.a(qwVar);
        }

        public f b() {
            this.b = null;
            this.c = null;
            this.d = rg.f;
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
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (this.a == null) {
                if (fVar.a != null) {
                    return false;
                }
            } else if (!this.a.equals(fVar.a)) {
                return false;
            }
            if (this.b == null) {
                if (fVar.b != null) {
                    return false;
                }
            } else if (!this.b.equals(fVar.b)) {
                return false;
            }
            if (this.c == null) {
                if (fVar.c != null) {
                    return false;
                }
            } else if (!this.c.equals(fVar.c)) {
                return false;
            }
            return rb.a(this.d, fVar.d);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.b == null ? 0 : this.b.hashCode()) + (((this.a == null ? 0 : this.a.intValue()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
            if (this.c != null) {
                i = this.c.hashCode();
            }
            return ((hashCode + i) * 31) + rb.a(this.d);
        }
    }
}
