package com.google.android.gms.internal;

public interface amm {

    public static final class a extends qx<a> {
        public a[] a;

        public static final class a extends qx<a> {
            private static volatile a[] d;
            public String a;
            public String b;
            public int c;

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
                if (!this.a.equals("")) {
                    a += qw.b(1, this.a);
                }
                if (!this.b.equals("")) {
                    a += qw.b(2, this.b);
                }
                return this.c != 0 ? a + qw.c(3, this.c) : a;
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
                        case 18:
                            this.b = qvVar.j();
                            continue;
                        case 24:
                            this.c = qvVar.g();
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
                if (!this.b.equals("")) {
                    qwVar.a(2, this.b);
                }
                if (this.c != 0) {
                    qwVar.a(3, this.c);
                }
                super.a(qwVar);
            }

            public /* synthetic */ rd b(qv qvVar) {
                return a(qvVar);
            }

            public a c() {
                this.a = "";
                this.b = "";
                this.c = 0;
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
                return this.c == aVar.c ? (this.ag == null || this.ag.b()) ? aVar.ag == null || aVar.ag.b() : this.ag.equals(aVar.ag) : false;
            }

            public int hashCode() {
                int i = 0;
                int hashCode = ((((this.b == null ? 0 : this.b.hashCode()) + (((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31) + this.c) * 31;
                if (!(this.ag == null || this.ag.b())) {
                    i = this.ag.hashCode();
                }
                return hashCode + i;
            }
        }

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
            return a;
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
                        Object obj = new a[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.a, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new a();
                            qvVar.a(obj[a]);
                            qvVar.a();
                            a++;
                        }
                        obj[a] = new a();
                        qvVar.a(obj[a]);
                        this.a = obj;
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
            super.a(qwVar);
        }

        public a b() {
            this.a = a.b();
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
            return rb.a(this.a, aVar.a) ? (this.ag == null || this.ag.b()) ? aVar.ag == null || aVar.ag.b() : this.ag.equals(aVar.ag) : false;
        }

        public int hashCode() {
            int hashCode = (((getClass().getName().hashCode() + 527) * 31) + rb.a(this.a)) * 31;
            int hashCode2 = (this.ag == null || this.ag.b()) ? 0 : this.ag.hashCode();
            return hashCode2 + hashCode;
        }
    }

    public static final class b extends qx<b> {
        private static volatile b[] c;
        public String a;
        public d b;

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
            return this.b != null ? a + qw.c(2, this.b) : a;
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
                        if (this.b == null) {
                            this.b = new d();
                        }
                        qvVar.a(this.b);
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
            if (this.b != null) {
                qwVar.a(2, this.b);
            }
            super.a(qwVar);
        }

        public /* synthetic */ rd b(qv qvVar) {
            return a(qvVar);
        }

        public b c() {
            this.a = "";
            this.b = null;
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
            if (this.b == null) {
                if (bVar.b != null) {
                    return false;
                }
            } else if (!this.b.equals(bVar.b)) {
                return false;
            }
            return (this.ag == null || this.ag.b()) ? bVar.ag == null || bVar.ag.b() : this.ag.equals(bVar.ag);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.b == null ? 0 : this.b.hashCode()) + (((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
            if (!(this.ag == null || this.ag.b())) {
                i = this.ag.hashCode();
            }
            return hashCode + i;
        }
    }

    public static final class c extends qx<c> {
        public String a;
        public b[] b;

        public c() {
            b();
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

        public c b() {
            this.a = "";
            this.b = b.b();
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
            if (this.a == null) {
                if (cVar.a != null) {
                    return false;
                }
            } else if (!this.a.equals(cVar.a)) {
                return false;
            }
            return rb.a(this.b, cVar.b) ? (this.ag == null || this.ag.b()) ? cVar.ag == null || cVar.ag.b() : this.ag.equals(cVar.ag) : false;
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

    public static final class d extends qx<d> {
        public boolean a;
        public String b;
        public long c;
        public double d;
        public c e;

        public d() {
            b();
        }

        protected int a() {
            int a = super.a();
            if (this.a) {
                a += qw.b(1, this.a);
            }
            if (!this.b.equals("")) {
                a += qw.b(2, this.b);
            }
            if (this.c != 0) {
                a += qw.f(3, this.c);
            }
            if (Double.doubleToLongBits(this.d) != Double.doubleToLongBits(0.0d)) {
                a += qw.b(4, this.d);
            }
            return this.e != null ? a + qw.c(5, this.e) : a;
        }

        public d a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        this.a = qvVar.i();
                        continue;
                    case 18:
                        this.b = qvVar.j();
                        continue;
                    case 24:
                        this.c = qvVar.f();
                        continue;
                    case 33:
                        this.d = qvVar.c();
                        continue;
                    case 42:
                        if (this.e == null) {
                            this.e = new c();
                        }
                        qvVar.a(this.e);
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
            if (!this.b.equals("")) {
                qwVar.a(2, this.b);
            }
            if (this.c != 0) {
                qwVar.b(3, this.c);
            }
            if (Double.doubleToLongBits(this.d) != Double.doubleToLongBits(0.0d)) {
                qwVar.a(4, this.d);
            }
            if (this.e != null) {
                qwVar.a(5, this.e);
            }
            super.a(qwVar);
        }

        public d b() {
            this.a = false;
            this.b = "";
            this.c = 0;
            this.d = 0.0d;
            this.e = null;
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
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.a != dVar.a) {
                return false;
            }
            if (this.b == null) {
                if (dVar.b != null) {
                    return false;
                }
            } else if (!this.b.equals(dVar.b)) {
                return false;
            }
            if (this.c != dVar.c || Double.doubleToLongBits(this.d) != Double.doubleToLongBits(dVar.d)) {
                return false;
            }
            if (this.e == null) {
                if (dVar.e != null) {
                    return false;
                }
            } else if (!this.e.equals(dVar.e)) {
                return false;
            }
            return (this.ag == null || this.ag.b()) ? dVar.ag == null || dVar.ag.b() : this.ag.equals(dVar.ag);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = (((this.b == null ? 0 : this.b.hashCode()) + (((this.a ? 1231 : 1237) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31) + ((int) (this.c ^ (this.c >>> 32)));
            long doubleToLongBits = Double.doubleToLongBits(this.d);
            hashCode = ((this.e == null ? 0 : this.e.hashCode()) + (((hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31)) * 31;
            if (!(this.ag == null || this.ag.b())) {
                i = this.ag.hashCode();
            }
            return hashCode + i;
        }
    }
}
