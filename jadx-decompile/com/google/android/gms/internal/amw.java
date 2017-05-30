package com.google.android.gms.internal;

import com.facebook.imageutils.JfifUtil;
import com.facebook.imageutils.TiffUtil;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;

public interface amw {

    public static final class a extends rd {
        private static volatile a[] e;
        public Integer a;
        public f b;
        public f c;
        public Boolean d;

        public a() {
            c();
        }

        public static a[] b() {
            if (e == null) {
                synchronized (rb.c) {
                    if (e == null) {
                        e = new a[0];
                    }
                }
            }
            return e;
        }

        protected int a() {
            int a = super.a();
            if (this.a != null) {
                a += qw.c(1, this.a.intValue());
            }
            if (this.b != null) {
                a += qw.c(2, this.b);
            }
            if (this.c != null) {
                a += qw.c(3, this.c);
            }
            return this.d != null ? a + qw.b(4, this.d.booleanValue()) : a;
        }

        public a a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        this.a = Integer.valueOf(qvVar.g());
                        continue;
                    case 18:
                        if (this.b == null) {
                            this.b = new f();
                        }
                        qvVar.a(this.b);
                        continue;
                    case 26:
                        if (this.c == null) {
                            this.c = new f();
                        }
                        qvVar.a(this.c);
                        continue;
                    case 32:
                        this.d = Boolean.valueOf(qvVar.i());
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
            if (this.d != null) {
                qwVar.a(4, this.d.booleanValue());
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
            this.d = null;
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
            if (this.c == null) {
                if (aVar.c != null) {
                    return false;
                }
            } else if (!this.c.equals(aVar.c)) {
                return false;
            }
            return this.d == null ? aVar.d == null : this.d.equals(aVar.d);
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

    public static final class b extends rd {
        private static volatile b[] f;
        public c[] a;
        public String b;
        public Long c;
        public Long d;
        public Integer e;

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
            if (this.a != null && this.a.length > 0) {
                for (rd rdVar : this.a) {
                    if (rdVar != null) {
                        a += qw.c(1, rdVar);
                    }
                }
            }
            if (this.b != null) {
                a += qw.b(2, this.b);
            }
            if (this.c != null) {
                a += qw.f(3, this.c.longValue());
            }
            if (this.d != null) {
                a += qw.f(4, this.d.longValue());
            }
            return this.e != null ? a + qw.c(5, this.e.intValue()) : a;
        }

        public b a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        int b = rg.b(qvVar, 10);
                        a = this.a == null ? 0 : this.a.length;
                        Object obj = new c[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.a, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new c();
                            qvVar.a(obj[a]);
                            qvVar.a();
                            a++;
                        }
                        obj[a] = new c();
                        qvVar.a(obj[a]);
                        this.a = obj;
                        continue;
                    case 18:
                        this.b = qvVar.j();
                        continue;
                    case 24:
                        this.c = Long.valueOf(qvVar.f());
                        continue;
                    case 32:
                        this.d = Long.valueOf(qvVar.f());
                        continue;
                    case 40:
                        this.e = Integer.valueOf(qvVar.g());
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
            if (this.a != null && this.a.length > 0) {
                for (rd rdVar : this.a) {
                    if (rdVar != null) {
                        qwVar.a(1, rdVar);
                    }
                }
            }
            if (this.b != null) {
                qwVar.a(2, this.b);
            }
            if (this.c != null) {
                qwVar.b(3, this.c.longValue());
            }
            if (this.d != null) {
                qwVar.b(4, this.d.longValue());
            }
            if (this.e != null) {
                qwVar.a(5, this.e.intValue());
            }
            super.a(qwVar);
        }

        public /* synthetic */ rd b(qv qvVar) {
            return a(qvVar);
        }

        public b c() {
            this.a = c.b();
            this.b = null;
            this.c = null;
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
            if (!rb.a(this.a, bVar.a)) {
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
            int hashCode = ((this.d == null ? 0 : this.d.hashCode()) + (((this.c == null ? 0 : this.c.hashCode()) + (((this.b == null ? 0 : this.b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + rb.a(this.a)) * 31)) * 31)) * 31)) * 31;
            if (this.e != null) {
                i = this.e.hashCode();
            }
            return hashCode + i;
        }
    }

    public static final class c extends rd {
        private static volatile c[] f;
        public String a;
        public String b;
        public Long c;
        public Float d;
        public Double e;

        public c() {
            c();
        }

        public static c[] b() {
            if (f == null) {
                synchronized (rb.c) {
                    if (f == null) {
                        f = new c[0];
                    }
                }
            }
            return f;
        }

        protected int a() {
            int a = super.a();
            if (this.a != null) {
                a += qw.b(1, this.a);
            }
            if (this.b != null) {
                a += qw.b(2, this.b);
            }
            if (this.c != null) {
                a += qw.f(3, this.c.longValue());
            }
            if (this.d != null) {
                a += qw.b(4, this.d.floatValue());
            }
            return this.e != null ? a + qw.b(5, this.e.doubleValue()) : a;
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
                    case 24:
                        this.c = Long.valueOf(qvVar.f());
                        continue;
                    case 37:
                        this.d = Float.valueOf(qvVar.d());
                        continue;
                    case 41:
                        this.e = Double.valueOf(qvVar.c());
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
                qwVar.b(3, this.c.longValue());
            }
            if (this.d != null) {
                qwVar.a(4, this.d.floatValue());
            }
            if (this.e != null) {
                qwVar.a(5, this.e.doubleValue());
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
            this.e = null;
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
            if (this.d == null) {
                if (cVar.d != null) {
                    return false;
                }
            } else if (!this.d.equals(cVar.d)) {
                return false;
            }
            return this.e == null ? cVar.e == null : this.e.equals(cVar.e);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.d == null ? 0 : this.d.hashCode()) + (((this.c == null ? 0 : this.c.hashCode()) + (((this.b == null ? 0 : this.b.hashCode()) + (((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31;
            if (this.e != null) {
                i = this.e.hashCode();
            }
            return hashCode + i;
        }
    }

    public static final class d extends rd {
        public e[] a;

        public d() {
            b();
        }

        protected int a() {
            int a = super.a();
            if (this.a != null && this.a.length > 0) {
                for (rd rdVar : this.a) {
                    if (rdVar != null) {
                        a += qw.c(1, rdVar);
                    }
                }
            }
            return a;
        }

        public d a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        int b = rg.b(qvVar, 10);
                        a = this.a == null ? 0 : this.a.length;
                        Object obj = new e[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.a, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new e();
                            qvVar.a(obj[a]);
                            qvVar.a();
                            a++;
                        }
                        obj[a] = new e();
                        qvVar.a(obj[a]);
                        this.a = obj;
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
            if (this.a != null && this.a.length > 0) {
                for (rd rdVar : this.a) {
                    if (rdVar != null) {
                        qwVar.a(1, rdVar);
                    }
                }
            }
            super.a(qwVar);
        }

        public d b() {
            this.a = e.b();
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
            return rb.a(this.a, ((d) obj).a);
        }

        public int hashCode() {
            return ((getClass().getName().hashCode() + 527) * 31) + rb.a(this.a);
        }
    }

    public static final class e extends rd {
        private static volatile e[] G;
        public a[] A;
        public String B;
        public Integer C;
        public Integer D;
        public Integer E;
        public String F;
        public Integer a;
        public b[] b;
        public g[] c;
        public Long d;
        public Long e;
        public Long f;
        public Long g;
        public Long h;
        public String i;
        public String j;
        public String k;
        public String l;
        public Integer m;
        public String n;
        public String o;
        public String p;
        public Long q;
        public Long r;
        public String s;
        public Boolean t;
        public String u;
        public Long v;
        public Integer w;
        public String x;
        public String y;
        public Boolean z;

        public e() {
            c();
        }

        public static e[] b() {
            if (G == null) {
                synchronized (rb.c) {
                    if (G == null) {
                        G = new e[0];
                    }
                }
            }
            return G;
        }

        protected int a() {
            int i;
            int i2 = 0;
            int a = super.a();
            if (this.a != null) {
                a += qw.c(1, this.a.intValue());
            }
            if (this.b != null && this.b.length > 0) {
                i = a;
                for (rd rdVar : this.b) {
                    if (rdVar != null) {
                        i += qw.c(2, rdVar);
                    }
                }
                a = i;
            }
            if (this.c != null && this.c.length > 0) {
                i = a;
                for (rd rdVar2 : this.c) {
                    if (rdVar2 != null) {
                        i += qw.c(3, rdVar2);
                    }
                }
                a = i;
            }
            if (this.d != null) {
                a += qw.f(4, this.d.longValue());
            }
            if (this.e != null) {
                a += qw.f(5, this.e.longValue());
            }
            if (this.f != null) {
                a += qw.f(6, this.f.longValue());
            }
            if (this.h != null) {
                a += qw.f(7, this.h.longValue());
            }
            if (this.i != null) {
                a += qw.b(8, this.i);
            }
            if (this.j != null) {
                a += qw.b(9, this.j);
            }
            if (this.k != null) {
                a += qw.b(10, this.k);
            }
            if (this.l != null) {
                a += qw.b(11, this.l);
            }
            if (this.m != null) {
                a += qw.c(12, this.m.intValue());
            }
            if (this.n != null) {
                a += qw.b(13, this.n);
            }
            if (this.o != null) {
                a += qw.b(14, this.o);
            }
            if (this.p != null) {
                a += qw.b(16, this.p);
            }
            if (this.q != null) {
                a += qw.f(17, this.q.longValue());
            }
            if (this.r != null) {
                a += qw.f(18, this.r.longValue());
            }
            if (this.s != null) {
                a += qw.b(19, this.s);
            }
            if (this.t != null) {
                a += qw.b(20, this.t.booleanValue());
            }
            if (this.u != null) {
                a += qw.b(21, this.u);
            }
            if (this.v != null) {
                a += qw.f(22, this.v.longValue());
            }
            if (this.w != null) {
                a += qw.c(23, this.w.intValue());
            }
            if (this.x != null) {
                a += qw.b(24, this.x);
            }
            if (this.y != null) {
                a += qw.b(25, this.y);
            }
            if (this.g != null) {
                a += qw.f(26, this.g.longValue());
            }
            if (this.z != null) {
                a += qw.b(28, this.z.booleanValue());
            }
            if (this.A != null && this.A.length > 0) {
                while (i2 < this.A.length) {
                    rd rdVar3 = this.A[i2];
                    if (rdVar3 != null) {
                        a += qw.c(29, rdVar3);
                    }
                    i2++;
                }
            }
            if (this.B != null) {
                a += qw.b(30, this.B);
            }
            if (this.C != null) {
                a += qw.c(31, this.C.intValue());
            }
            if (this.D != null) {
                a += qw.c(32, this.D.intValue());
            }
            if (this.E != null) {
                a += qw.c(33, this.E.intValue());
            }
            return this.F != null ? a + qw.b(34, this.F) : a;
        }

        public e a(qv qvVar) {
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
                        obj = new b[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.b, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new b();
                            qvVar.a(obj[a]);
                            qvVar.a();
                            a++;
                        }
                        obj[a] = new b();
                        qvVar.a(obj[a]);
                        this.b = obj;
                        continue;
                    case 26:
                        b = rg.b(qvVar, 26);
                        a = this.c == null ? 0 : this.c.length;
                        obj = new g[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.c, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new g();
                            qvVar.a(obj[a]);
                            qvVar.a();
                            a++;
                        }
                        obj[a] = new g();
                        qvVar.a(obj[a]);
                        this.c = obj;
                        continue;
                    case 32:
                        this.d = Long.valueOf(qvVar.f());
                        continue;
                    case 40:
                        this.e = Long.valueOf(qvVar.f());
                        continue;
                    case 48:
                        this.f = Long.valueOf(qvVar.f());
                        continue;
                    case 56:
                        this.h = Long.valueOf(qvVar.f());
                        continue;
                    case 66:
                        this.i = qvVar.j();
                        continue;
                    case 74:
                        this.j = qvVar.j();
                        continue;
                    case 82:
                        this.k = qvVar.j();
                        continue;
                    case 90:
                        this.l = qvVar.j();
                        continue;
                    case 96:
                        this.m = Integer.valueOf(qvVar.g());
                        continue;
                    case 106:
                        this.n = qvVar.j();
                        continue;
                    case 114:
                        this.o = qvVar.j();
                        continue;
                    case 130:
                        this.p = qvVar.j();
                        continue;
                    case 136:
                        this.q = Long.valueOf(qvVar.f());
                        continue;
                    case 144:
                        this.r = Long.valueOf(qvVar.f());
                        continue;
                    case Opcodes.IFNE /*154*/:
                        this.s = qvVar.j();
                        continue;
                    case 160:
                        this.t = Boolean.valueOf(qvVar.i());
                        continue;
                    case 170:
                        this.u = qvVar.j();
                        continue;
                    case 176:
                        this.v = Long.valueOf(qvVar.f());
                        continue;
                    case Opcodes.INVOKESTATIC /*184*/:
                        this.w = Integer.valueOf(qvVar.g());
                        continue;
                    case Opcodes.MONITORENTER /*194*/:
                        this.x = qvVar.j();
                        continue;
                    case 202:
                        this.y = qvVar.j();
                        continue;
                    case JfifUtil.MARKER_RST0 /*208*/:
                        this.g = Long.valueOf(qvVar.f());
                        continue;
                    case 224:
                        this.z = Boolean.valueOf(qvVar.i());
                        continue;
                    case 234:
                        b = rg.b(qvVar, 234);
                        a = this.A == null ? 0 : this.A.length;
                        obj = new a[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.A, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new a();
                            qvVar.a(obj[a]);
                            qvVar.a();
                            a++;
                        }
                        obj[a] = new a();
                        qvVar.a(obj[a]);
                        this.A = obj;
                        continue;
                    case 242:
                        this.B = qvVar.j();
                        continue;
                    case 248:
                        this.C = Integer.valueOf(qvVar.g());
                        continue;
                    case 256:
                        this.D = Integer.valueOf(qvVar.g());
                        continue;
                    case 264:
                        this.E = Integer.valueOf(qvVar.g());
                        continue;
                    case TiffUtil.TIFF_TAG_ORIENTATION /*274*/:
                        this.F = qvVar.j();
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
                for (rd rdVar2 : this.c) {
                    if (rdVar2 != null) {
                        qwVar.a(3, rdVar2);
                    }
                }
            }
            if (this.d != null) {
                qwVar.b(4, this.d.longValue());
            }
            if (this.e != null) {
                qwVar.b(5, this.e.longValue());
            }
            if (this.f != null) {
                qwVar.b(6, this.f.longValue());
            }
            if (this.h != null) {
                qwVar.b(7, this.h.longValue());
            }
            if (this.i != null) {
                qwVar.a(8, this.i);
            }
            if (this.j != null) {
                qwVar.a(9, this.j);
            }
            if (this.k != null) {
                qwVar.a(10, this.k);
            }
            if (this.l != null) {
                qwVar.a(11, this.l);
            }
            if (this.m != null) {
                qwVar.a(12, this.m.intValue());
            }
            if (this.n != null) {
                qwVar.a(13, this.n);
            }
            if (this.o != null) {
                qwVar.a(14, this.o);
            }
            if (this.p != null) {
                qwVar.a(16, this.p);
            }
            if (this.q != null) {
                qwVar.b(17, this.q.longValue());
            }
            if (this.r != null) {
                qwVar.b(18, this.r.longValue());
            }
            if (this.s != null) {
                qwVar.a(19, this.s);
            }
            if (this.t != null) {
                qwVar.a(20, this.t.booleanValue());
            }
            if (this.u != null) {
                qwVar.a(21, this.u);
            }
            if (this.v != null) {
                qwVar.b(22, this.v.longValue());
            }
            if (this.w != null) {
                qwVar.a(23, this.w.intValue());
            }
            if (this.x != null) {
                qwVar.a(24, this.x);
            }
            if (this.y != null) {
                qwVar.a(25, this.y);
            }
            if (this.g != null) {
                qwVar.b(26, this.g.longValue());
            }
            if (this.z != null) {
                qwVar.a(28, this.z.booleanValue());
            }
            if (this.A != null && this.A.length > 0) {
                while (i < this.A.length) {
                    rd rdVar3 = this.A[i];
                    if (rdVar3 != null) {
                        qwVar.a(29, rdVar3);
                    }
                    i++;
                }
            }
            if (this.B != null) {
                qwVar.a(30, this.B);
            }
            if (this.C != null) {
                qwVar.a(31, this.C.intValue());
            }
            if (this.D != null) {
                qwVar.a(32, this.D.intValue());
            }
            if (this.E != null) {
                qwVar.a(33, this.E.intValue());
            }
            if (this.F != null) {
                qwVar.a(34, this.F);
            }
            super.a(qwVar);
        }

        public /* synthetic */ rd b(qv qvVar) {
            return a(qvVar);
        }

        public e c() {
            this.a = null;
            this.b = b.b();
            this.c = g.b();
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
            this.o = null;
            this.p = null;
            this.q = null;
            this.r = null;
            this.s = null;
            this.t = null;
            this.u = null;
            this.v = null;
            this.w = null;
            this.x = null;
            this.y = null;
            this.z = null;
            this.A = a.b();
            this.B = null;
            this.C = null;
            this.D = null;
            this.E = null;
            this.F = null;
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
            if (!rb.a(this.b, eVar.b)) {
                return false;
            }
            if (!rb.a(this.c, eVar.c)) {
                return false;
            }
            if (this.d == null) {
                if (eVar.d != null) {
                    return false;
                }
            } else if (!this.d.equals(eVar.d)) {
                return false;
            }
            if (this.e == null) {
                if (eVar.e != null) {
                    return false;
                }
            } else if (!this.e.equals(eVar.e)) {
                return false;
            }
            if (this.f == null) {
                if (eVar.f != null) {
                    return false;
                }
            } else if (!this.f.equals(eVar.f)) {
                return false;
            }
            if (this.g == null) {
                if (eVar.g != null) {
                    return false;
                }
            } else if (!this.g.equals(eVar.g)) {
                return false;
            }
            if (this.h == null) {
                if (eVar.h != null) {
                    return false;
                }
            } else if (!this.h.equals(eVar.h)) {
                return false;
            }
            if (this.i == null) {
                if (eVar.i != null) {
                    return false;
                }
            } else if (!this.i.equals(eVar.i)) {
                return false;
            }
            if (this.j == null) {
                if (eVar.j != null) {
                    return false;
                }
            } else if (!this.j.equals(eVar.j)) {
                return false;
            }
            if (this.k == null) {
                if (eVar.k != null) {
                    return false;
                }
            } else if (!this.k.equals(eVar.k)) {
                return false;
            }
            if (this.l == null) {
                if (eVar.l != null) {
                    return false;
                }
            } else if (!this.l.equals(eVar.l)) {
                return false;
            }
            if (this.m == null) {
                if (eVar.m != null) {
                    return false;
                }
            } else if (!this.m.equals(eVar.m)) {
                return false;
            }
            if (this.n == null) {
                if (eVar.n != null) {
                    return false;
                }
            } else if (!this.n.equals(eVar.n)) {
                return false;
            }
            if (this.o == null) {
                if (eVar.o != null) {
                    return false;
                }
            } else if (!this.o.equals(eVar.o)) {
                return false;
            }
            if (this.p == null) {
                if (eVar.p != null) {
                    return false;
                }
            } else if (!this.p.equals(eVar.p)) {
                return false;
            }
            if (this.q == null) {
                if (eVar.q != null) {
                    return false;
                }
            } else if (!this.q.equals(eVar.q)) {
                return false;
            }
            if (this.r == null) {
                if (eVar.r != null) {
                    return false;
                }
            } else if (!this.r.equals(eVar.r)) {
                return false;
            }
            if (this.s == null) {
                if (eVar.s != null) {
                    return false;
                }
            } else if (!this.s.equals(eVar.s)) {
                return false;
            }
            if (this.t == null) {
                if (eVar.t != null) {
                    return false;
                }
            } else if (!this.t.equals(eVar.t)) {
                return false;
            }
            if (this.u == null) {
                if (eVar.u != null) {
                    return false;
                }
            } else if (!this.u.equals(eVar.u)) {
                return false;
            }
            if (this.v == null) {
                if (eVar.v != null) {
                    return false;
                }
            } else if (!this.v.equals(eVar.v)) {
                return false;
            }
            if (this.w == null) {
                if (eVar.w != null) {
                    return false;
                }
            } else if (!this.w.equals(eVar.w)) {
                return false;
            }
            if (this.x == null) {
                if (eVar.x != null) {
                    return false;
                }
            } else if (!this.x.equals(eVar.x)) {
                return false;
            }
            if (this.y == null) {
                if (eVar.y != null) {
                    return false;
                }
            } else if (!this.y.equals(eVar.y)) {
                return false;
            }
            if (this.z == null) {
                if (eVar.z != null) {
                    return false;
                }
            } else if (!this.z.equals(eVar.z)) {
                return false;
            }
            if (!rb.a(this.A, eVar.A)) {
                return false;
            }
            if (this.B == null) {
                if (eVar.B != null) {
                    return false;
                }
            } else if (!this.B.equals(eVar.B)) {
                return false;
            }
            if (this.C == null) {
                if (eVar.C != null) {
                    return false;
                }
            } else if (!this.C.equals(eVar.C)) {
                return false;
            }
            if (this.D == null) {
                if (eVar.D != null) {
                    return false;
                }
            } else if (!this.D.equals(eVar.D)) {
                return false;
            }
            if (this.E == null) {
                if (eVar.E != null) {
                    return false;
                }
            } else if (!this.E.equals(eVar.E)) {
                return false;
            }
            return this.F == null ? eVar.F == null : this.F.equals(eVar.F);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.E == null ? 0 : this.E.hashCode()) + (((this.D == null ? 0 : this.D.hashCode()) + (((this.C == null ? 0 : this.C.hashCode()) + (((this.B == null ? 0 : this.B.hashCode()) + (((((this.z == null ? 0 : this.z.hashCode()) + (((this.y == null ? 0 : this.y.hashCode()) + (((this.x == null ? 0 : this.x.hashCode()) + (((this.w == null ? 0 : this.w.hashCode()) + (((this.v == null ? 0 : this.v.hashCode()) + (((this.u == null ? 0 : this.u.hashCode()) + (((this.t == null ? 0 : this.t.hashCode()) + (((this.s == null ? 0 : this.s.hashCode()) + (((this.r == null ? 0 : this.r.hashCode()) + (((this.q == null ? 0 : this.q.hashCode()) + (((this.p == null ? 0 : this.p.hashCode()) + (((this.o == null ? 0 : this.o.hashCode()) + (((this.n == null ? 0 : this.n.hashCode()) + (((this.m == null ? 0 : this.m.hashCode()) + (((this.l == null ? 0 : this.l.hashCode()) + (((this.k == null ? 0 : this.k.hashCode()) + (((this.j == null ? 0 : this.j.hashCode()) + (((this.i == null ? 0 : this.i.hashCode()) + (((this.h == null ? 0 : this.h.hashCode()) + (((this.g == null ? 0 : this.g.hashCode()) + (((this.f == null ? 0 : this.f.hashCode()) + (((this.e == null ? 0 : this.e.hashCode()) + (((this.d == null ? 0 : this.d.hashCode()) + (((((((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + rb.a(this.b)) * 31) + rb.a(this.c)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + rb.a(this.A)) * 31)) * 31)) * 31)) * 31)) * 31;
            if (this.F != null) {
                i = this.F.hashCode();
            }
            return hashCode + i;
        }
    }

    public static final class f extends rd {
        public long[] a;
        public long[] b;

        public f() {
            b();
        }

        protected int a() {
            int i;
            int i2;
            int i3 = 0;
            int a = super.a();
            if (this.a == null || this.a.length <= 0) {
                i = a;
            } else {
                i2 = 0;
                for (long e : this.a) {
                    i2 += qw.e(e);
                }
                i = (a + i2) + (this.a.length * 1);
            }
            if (this.b == null || this.b.length <= 0) {
                return i;
            }
            i2 = 0;
            while (i3 < this.b.length) {
                i2 += qw.e(this.b[i3]);
                i3++;
            }
            return (i + i2) + (this.b.length * 1);
        }

        public f a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                int b;
                Object obj;
                int d;
                Object obj2;
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        b = rg.b(qvVar, 8);
                        a = this.a == null ? 0 : this.a.length;
                        obj = new long[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.a, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = qvVar.e();
                            qvVar.a();
                            a++;
                        }
                        obj[a] = qvVar.e();
                        this.a = obj;
                        continue;
                    case 10:
                        d = qvVar.d(qvVar.n());
                        b = qvVar.t();
                        a = 0;
                        while (qvVar.r() > 0) {
                            qvVar.e();
                            a++;
                        }
                        qvVar.f(b);
                        b = this.a == null ? 0 : this.a.length;
                        obj2 = new long[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.a, 0, obj2, 0, b);
                        }
                        while (b < obj2.length) {
                            obj2[b] = qvVar.e();
                            b++;
                        }
                        this.a = obj2;
                        qvVar.e(d);
                        continue;
                    case 16:
                        b = rg.b(qvVar, 16);
                        a = this.b == null ? 0 : this.b.length;
                        obj = new long[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.b, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = qvVar.e();
                            qvVar.a();
                            a++;
                        }
                        obj[a] = qvVar.e();
                        this.b = obj;
                        continue;
                    case 18:
                        d = qvVar.d(qvVar.n());
                        b = qvVar.t();
                        a = 0;
                        while (qvVar.r() > 0) {
                            qvVar.e();
                            a++;
                        }
                        qvVar.f(b);
                        b = this.b == null ? 0 : this.b.length;
                        obj2 = new long[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.b, 0, obj2, 0, b);
                        }
                        while (b < obj2.length) {
                            obj2[b] = qvVar.e();
                            b++;
                        }
                        this.b = obj2;
                        qvVar.e(d);
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
            if (this.a != null && this.a.length > 0) {
                for (long a : this.a) {
                    qwVar.a(1, a);
                }
            }
            if (this.b != null && this.b.length > 0) {
                while (i < this.b.length) {
                    qwVar.a(2, this.b[i]);
                    i++;
                }
            }
            super.a(qwVar);
        }

        public f b() {
            this.a = rg.b;
            this.b = rg.b;
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
            return !rb.a(this.a, fVar.a) ? false : rb.a(this.b, fVar.b);
        }

        public int hashCode() {
            return ((((getClass().getName().hashCode() + 527) * 31) + rb.a(this.a)) * 31) + rb.a(this.b);
        }
    }

    public static final class g extends rd {
        private static volatile g[] g;
        public Long a;
        public String b;
        public String c;
        public Long d;
        public Float e;
        public Double f;

        public g() {
            c();
        }

        public static g[] b() {
            if (g == null) {
                synchronized (rb.c) {
                    if (g == null) {
                        g = new g[0];
                    }
                }
            }
            return g;
        }

        protected int a() {
            int a = super.a();
            if (this.a != null) {
                a += qw.f(1, this.a.longValue());
            }
            if (this.b != null) {
                a += qw.b(2, this.b);
            }
            if (this.c != null) {
                a += qw.b(3, this.c);
            }
            if (this.d != null) {
                a += qw.f(4, this.d.longValue());
            }
            if (this.e != null) {
                a += qw.b(5, this.e.floatValue());
            }
            return this.f != null ? a + qw.b(6, this.f.doubleValue()) : a;
        }

        public g a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        this.a = Long.valueOf(qvVar.f());
                        continue;
                    case 18:
                        this.b = qvVar.j();
                        continue;
                    case 26:
                        this.c = qvVar.j();
                        continue;
                    case 32:
                        this.d = Long.valueOf(qvVar.f());
                        continue;
                    case 45:
                        this.e = Float.valueOf(qvVar.d());
                        continue;
                    case 49:
                        this.f = Double.valueOf(qvVar.c());
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
                qwVar.b(1, this.a.longValue());
            }
            if (this.b != null) {
                qwVar.a(2, this.b);
            }
            if (this.c != null) {
                qwVar.a(3, this.c);
            }
            if (this.d != null) {
                qwVar.b(4, this.d.longValue());
            }
            if (this.e != null) {
                qwVar.a(5, this.e.floatValue());
            }
            if (this.f != null) {
                qwVar.a(6, this.f.doubleValue());
            }
            super.a(qwVar);
        }

        public /* synthetic */ rd b(qv qvVar) {
            return a(qvVar);
        }

        public g c() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (this.a == null) {
                if (gVar.a != null) {
                    return false;
                }
            } else if (!this.a.equals(gVar.a)) {
                return false;
            }
            if (this.b == null) {
                if (gVar.b != null) {
                    return false;
                }
            } else if (!this.b.equals(gVar.b)) {
                return false;
            }
            if (this.c == null) {
                if (gVar.c != null) {
                    return false;
                }
            } else if (!this.c.equals(gVar.c)) {
                return false;
            }
            if (this.d == null) {
                if (gVar.d != null) {
                    return false;
                }
            } else if (!this.d.equals(gVar.d)) {
                return false;
            }
            if (this.e == null) {
                if (gVar.e != null) {
                    return false;
                }
            } else if (!this.e.equals(gVar.e)) {
                return false;
            }
            return this.f == null ? gVar.f == null : this.f.equals(gVar.f);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.e == null ? 0 : this.e.hashCode()) + (((this.d == null ? 0 : this.d.hashCode()) + (((this.c == null ? 0 : this.c.hashCode()) + (((this.b == null ? 0 : this.b.hashCode()) + (((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
            if (this.f != null) {
                i = this.f.hashCode();
            }
            return hashCode + i;
        }
    }
}
