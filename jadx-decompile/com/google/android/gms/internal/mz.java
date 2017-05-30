package com.google.android.gms.internal;

import java.util.Arrays;

public interface mz {

    public static final class a extends qx<a> {
        public d[] a;
        public long b;

        public a() {
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
            return this.b != 0 ? a + qw.g(2, this.b) : a;
        }

        public a a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        int b = rg.b(qvVar, 10);
                        a = this.a == null ? 0 : this.a.length;
                        Object obj = new d[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.a, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new d();
                            qvVar.a(obj[a]);
                            qvVar.a();
                            a++;
                        }
                        obj[a] = new d();
                        qvVar.a(obj[a]);
                        this.a = obj;
                        continue;
                    case 17:
                        this.b = qvVar.h();
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
            if (this.a != null && this.a.length > 0) {
                for (rd rdVar : this.a) {
                    if (rdVar != null) {
                        qwVar.a(1, rdVar);
                    }
                }
            }
            if (this.b != 0) {
                qwVar.c(2, this.b);
            }
            super.a(qwVar);
        }

        public a b() {
            this.a = d.b();
            this.b = 0;
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
            return (rb.a(this.a, aVar.a) && this.b == aVar.b) ? (this.ag == null || this.ag.b()) ? aVar.ag == null || aVar.ag.b() : this.ag.equals(aVar.ag) : false;
        }

        public int hashCode() {
            int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + rb.a(this.a)) * 31) + ((int) (this.b ^ (this.b >>> 32)))) * 31;
            int hashCode2 = (this.ag == null || this.ag.b()) ? 0 : this.ag.hashCode();
            return hashCode2 + hashCode;
        }
    }

    public static final class b extends qx<b> {
        private static volatile b[] c;
        public String a;
        public byte[] b;

        public b() {
            c();
        }

        public static b[] b() {
            if (c == null) {
                synchronized (rb.c) {
                    if (c == null) {
                        c = new b[0];
                    }
                }
            }
            return c;
        }

        protected int a() {
            int a = super.a();
            if (!this.a.equals("")) {
                a += qw.b(1, this.a);
            }
            return !Arrays.equals(this.b, rg.h) ? a + qw.b(2, this.b) : a;
        }

        public b a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        this.a = qvVar.j();
                        continue;
                    case 18:
                        this.b = qvVar.k();
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
            if (!this.a.equals("")) {
                qwVar.a(1, this.a);
            }
            if (!Arrays.equals(this.b, rg.h)) {
                qwVar.a(2, this.b);
            }
            super.a(qwVar);
        }

        public /* synthetic */ rd b(qv qvVar) {
            return a(qvVar);
        }

        public b c() {
            this.a = "";
            this.b = rg.h;
            this.ag = null;
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
            return Arrays.equals(this.b, bVar.b) ? (this.ag == null || this.ag.b()) ? bVar.ag == null || bVar.ag.b() : this.ag.equals(bVar.ag) : false;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + Arrays.hashCode(this.b)) * 31;
            if (!(this.ag == null || this.ag.b())) {
                i = this.ag.hashCode();
            }
            return hashCode + i;
        }
    }

    public static final class c extends qx<c> {
        public int a;
        public boolean b;

        public c() {
            b();
        }

        protected int a() {
            int a = super.a();
            if (this.a != 0) {
                a += qw.c(1, this.a);
            }
            return this.b ? a + qw.b(2, this.b) : a;
        }

        public c a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        this.a = qvVar.g();
                        continue;
                    case 16:
                        this.b = qvVar.i();
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
            if (this.a != 0) {
                qwVar.a(1, this.a);
            }
            if (this.b) {
                qwVar.a(2, this.b);
            }
            super.a(qwVar);
        }

        public c b() {
            this.a = 0;
            this.b = false;
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
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return (this.a == cVar.a && this.b == cVar.b) ? (this.ag == null || this.ag.b()) ? cVar.ag == null || cVar.ag.b() : this.ag.equals(cVar.ag) : false;
        }

        public int hashCode() {
            int hashCode = ((this.b ? 1231 : 1237) + ((((getClass().getName().hashCode() + 527) * 31) + this.a) * 31)) * 31;
            int hashCode2 = (this.ag == null || this.ag.b()) ? 0 : this.ag.hashCode();
            return hashCode2 + hashCode;
        }
    }

    public static final class d extends qx<d> {
        private static volatile d[] c;
        public String a;
        public b[] b;

        public d() {
            c();
        }

        public static d[] b() {
            if (c == null) {
                synchronized (rb.c) {
                    if (c == null) {
                        c = new d[0];
                    }
                }
            }
            return c;
        }

        protected int a() {
            int a = super.a();
            if (!this.a.equals("")) {
                a += qw.b(1, this.a);
            }
            if (this.b == null || this.b.length <= 0) {
                return a;
            }
            int i = a;
            for (rd rdVar : this.b) {
                if (rdVar != null) {
                    i += qw.c(2, rdVar);
                }
            }
            return i;
        }

        public d a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        this.a = qvVar.j();
                        continue;
                    case 18:
                        int b = rg.b(qvVar, 18);
                        a = this.b == null ? 0 : this.b.length;
                        Object obj = new b[(b + a)];
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
            if (!this.a.equals("")) {
                qwVar.a(1, this.a);
            }
            if (this.b != null && this.b.length > 0) {
                for (rd rdVar : this.b) {
                    if (rdVar != null) {
                        qwVar.a(2, rdVar);
                    }
                }
            }
            super.a(qwVar);
        }

        public /* synthetic */ rd b(qv qvVar) {
            return a(qvVar);
        }

        public d c() {
            this.a = "";
            this.b = b.b();
            this.ag = null;
            this.ah = -1;
            return this;
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
            return rb.a(this.b, dVar.b) ? (this.ag == null || this.ag.b()) ? dVar.ag == null || dVar.ag.b() : this.ag.equals(dVar.ag) : false;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + rb.a(this.b)) * 31;
            if (!(this.ag == null || this.ag.b())) {
                i = this.ag.hashCode();
            }
            return hashCode + i;
        }
    }

    public static final class e extends qx<e> {
        public a a;
        public a b;
        public a c;
        public c d;
        public f[] e;

        public e() {
            b();
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
                a += qw.c(3, this.c);
            }
            if (this.d != null) {
                a += qw.c(4, this.d);
            }
            if (this.e == null || this.e.length <= 0) {
                return a;
            }
            int i = a;
            for (rd rdVar : this.e) {
                if (rdVar != null) {
                    i += qw.c(5, rdVar);
                }
            }
            return i;
        }

        public e a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        if (this.a == null) {
                            this.a = new a();
                        }
                        qvVar.a(this.a);
                        continue;
                    case 18:
                        if (this.b == null) {
                            this.b = new a();
                        }
                        qvVar.a(this.b);
                        continue;
                    case 26:
                        if (this.c == null) {
                            this.c = new a();
                        }
                        qvVar.a(this.c);
                        continue;
                    case 34:
                        if (this.d == null) {
                            this.d = new c();
                        }
                        qvVar.a(this.d);
                        continue;
                    case 42:
                        int b = rg.b(qvVar, 42);
                        a = this.e == null ? 0 : this.e.length;
                        Object obj = new f[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.e, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new f();
                            qvVar.a(obj[a]);
                            qvVar.a();
                            a++;
                        }
                        obj[a] = new f();
                        qvVar.a(obj[a]);
                        this.e = obj;
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
                qwVar.a(2, this.b);
            }
            if (this.c != null) {
                qwVar.a(3, this.c);
            }
            if (this.d != null) {
                qwVar.a(4, this.d);
            }
            if (this.e != null && this.e.length > 0) {
                for (rd rdVar : this.e) {
                    if (rdVar != null) {
                        qwVar.a(5, rdVar);
                    }
                }
            }
            super.a(qwVar);
        }

        public e b() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = f.b();
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
            if (this.c == null) {
                if (eVar.c != null) {
                    return false;
                }
            } else if (!this.c.equals(eVar.c)) {
                return false;
            }
            if (this.d == null) {
                if (eVar.d != null) {
                    return false;
                }
            } else if (!this.d.equals(eVar.d)) {
                return false;
            }
            return rb.a(this.e, eVar.e) ? (this.ag == null || this.ag.b()) ? eVar.ag == null || eVar.ag.b() : this.ag.equals(eVar.ag) : false;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((((this.d == null ? 0 : this.d.hashCode()) + (((this.c == null ? 0 : this.c.hashCode()) + (((this.b == null ? 0 : this.b.hashCode()) + (((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31) + rb.a(this.e)) * 31;
            if (!(this.ag == null || this.ag.b())) {
                i = this.ag.hashCode();
            }
            return hashCode + i;
        }
    }

    public static final class f extends qx<f> {
        private static volatile f[] d;
        public int a;
        public long b;
        public String c;

        public f() {
            c();
        }

        public static f[] b() {
            if (d == null) {
                synchronized (rb.c) {
                    if (d == null) {
                        d = new f[0];
                    }
                }
            }
            return d;
        }

        protected int a() {
            int a = super.a();
            if (this.a != 0) {
                a += qw.c(1, this.a);
            }
            if (this.b != 0) {
                a += qw.g(2, this.b);
            }
            return !this.c.equals("") ? a + qw.b(3, this.c) : a;
        }

        public f a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        this.a = qvVar.g();
                        continue;
                    case 17:
                        this.b = qvVar.h();
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
            if (this.a != 0) {
                qwVar.a(1, this.a);
            }
            if (this.b != 0) {
                qwVar.c(2, this.b);
            }
            if (!this.c.equals("")) {
                qwVar.a(3, this.c);
            }
            super.a(qwVar);
        }

        public /* synthetic */ rd b(qv qvVar) {
            return a(qvVar);
        }

        public f c() {
            this.a = 0;
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
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (this.a != fVar.a || this.b != fVar.b) {
                return false;
            }
            if (this.c == null) {
                if (fVar.c != null) {
                    return false;
                }
            } else if (!this.c.equals(fVar.c)) {
                return false;
            }
            return (this.ag == null || this.ag.b()) ? fVar.ag == null || fVar.ag.b() : this.ag.equals(fVar.ag);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.c == null ? 0 : this.c.hashCode()) + ((((((getClass().getName().hashCode() + 527) * 31) + this.a) * 31) + ((int) (this.b ^ (this.b >>> 32)))) * 31)) * 31;
            if (!(this.ag == null || this.ag.b())) {
                i = this.ag.hashCode();
            }
            return hashCode + i;
        }
    }
}
