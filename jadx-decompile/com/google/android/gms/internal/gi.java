package com.google.android.gms.internal;

import org.codehaus.jackson.org.objectweb.asm.Opcodes;

public interface gi {

    public static final class a extends qx<a> {
        public int a;
        public int b;
        public int c;

        public a() {
            b();
        }

        protected int a() {
            int a = super.a();
            if (this.a != 1) {
                a += qw.c(1, this.a);
            }
            if (this.b != 0) {
                a += qw.c(2, this.b);
            }
            return this.c != 0 ? a + qw.c(3, this.c) : a;
        }

        public a a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        a = qvVar.g();
                        switch (a) {
                            case 1:
                            case 2:
                            case 3:
                                this.a = a;
                                break;
                            default:
                                continue;
                        }
                    case 16:
                        this.b = qvVar.g();
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
            if (this.a != 1) {
                qwVar.a(1, this.a);
            }
            if (this.b != 0) {
                qwVar.a(2, this.b);
            }
            if (this.c != 0) {
                qwVar.a(3, this.c);
            }
            super.a(qwVar);
        }

        public a b() {
            this.a = 1;
            this.b = 0;
            this.c = 0;
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
            return (this.a == aVar.a && this.b == aVar.b && this.c == aVar.c) ? (this.ag == null || this.ag.b()) ? aVar.ag == null || aVar.ag.b() : this.ag.equals(aVar.ag) : false;
        }

        public int hashCode() {
            int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + this.a) * 31) + this.b) * 31) + this.c) * 31;
            int hashCode2 = (this.ag == null || this.ag.b()) ? 0 : this.ag.hashCode();
            return hashCode2 + hashCode;
        }
    }

    public static final class b extends qx<b> {
        private static volatile b[] f;
        public int[] a;
        public int b;
        public int c;
        public boolean d;
        public boolean e;

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
            int i = 0;
            int a = super.a();
            if (this.e) {
                a += qw.b(1, this.e);
            }
            int c = qw.c(2, this.b) + a;
            if (this.a == null || this.a.length <= 0) {
                a = c;
            } else {
                for (int c2 : this.a) {
                    i += qw.c(c2);
                }
                a = (c + i) + (this.a.length * 1);
            }
            if (this.c != 0) {
                a += qw.c(4, this.c);
            }
            return this.d ? a + qw.b(6, this.d) : a;
        }

        public b a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                int b;
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        this.e = qvVar.i();
                        continue;
                    case 16:
                        this.b = qvVar.g();
                        continue;
                    case 24:
                        b = rg.b(qvVar, 24);
                        a = this.a == null ? 0 : this.a.length;
                        Object obj = new int[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.a, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = qvVar.g();
                            qvVar.a();
                            a++;
                        }
                        obj[a] = qvVar.g();
                        this.a = obj;
                        continue;
                    case 26:
                        int d = qvVar.d(qvVar.n());
                        b = qvVar.t();
                        a = 0;
                        while (qvVar.r() > 0) {
                            qvVar.g();
                            a++;
                        }
                        qvVar.f(b);
                        b = this.a == null ? 0 : this.a.length;
                        Object obj2 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.a, 0, obj2, 0, b);
                        }
                        while (b < obj2.length) {
                            obj2[b] = qvVar.g();
                            b++;
                        }
                        this.a = obj2;
                        qvVar.e(d);
                        continue;
                    case 32:
                        this.c = qvVar.g();
                        continue;
                    case 48:
                        this.d = qvVar.i();
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
            if (this.e) {
                qwVar.a(1, this.e);
            }
            qwVar.a(2, this.b);
            if (this.a != null && this.a.length > 0) {
                for (int a : this.a) {
                    qwVar.a(3, a);
                }
            }
            if (this.c != 0) {
                qwVar.a(4, this.c);
            }
            if (this.d) {
                qwVar.a(6, this.d);
            }
            super.a(qwVar);
        }

        public /* synthetic */ rd b(qv qvVar) {
            return a(qvVar);
        }

        public b c() {
            this.a = rg.a;
            this.b = 0;
            this.c = 0;
            this.d = false;
            this.e = false;
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
            return (rb.a(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e) ? (this.ag == null || this.ag.b()) ? bVar.ag == null || bVar.ag.b() : this.ag.equals(bVar.ag) : false;
        }

        public int hashCode() {
            int i = 1231;
            int hashCode = ((this.d ? 1231 : 1237) + ((((((((getClass().getName().hashCode() + 527) * 31) + rb.a(this.a)) * 31) + this.b) * 31) + this.c) * 31)) * 31;
            if (!this.e) {
                i = 1237;
            }
            i = (hashCode + i) * 31;
            hashCode = (this.ag == null || this.ag.b()) ? 0 : this.ag.hashCode();
            return hashCode + i;
        }
    }

    public static final class c extends qx<c> {
        private static volatile c[] f;
        public String a;
        public long b;
        public long c;
        public boolean d;
        public long e;

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
            if (!this.a.equals("")) {
                a += qw.b(1, this.a);
            }
            if (this.b != 0) {
                a += qw.f(2, this.b);
            }
            if (this.c != 2147483647L) {
                a += qw.f(3, this.c);
            }
            if (this.d) {
                a += qw.b(4, this.d);
            }
            return this.e != 0 ? a + qw.f(5, this.e) : a;
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
                    case 16:
                        this.b = qvVar.f();
                        continue;
                    case 24:
                        this.c = qvVar.f();
                        continue;
                    case 32:
                        this.d = qvVar.i();
                        continue;
                    case 40:
                        this.e = qvVar.f();
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
            if (this.b != 0) {
                qwVar.b(2, this.b);
            }
            if (this.c != 2147483647L) {
                qwVar.b(3, this.c);
            }
            if (this.d) {
                qwVar.a(4, this.d);
            }
            if (this.e != 0) {
                qwVar.b(5, this.e);
            }
            super.a(qwVar);
        }

        public /* synthetic */ rd b(qv qvVar) {
            return a(qvVar);
        }

        public c c() {
            this.a = "";
            this.b = 0;
            this.c = 2147483647L;
            this.d = false;
            this.e = 0;
            this.ag = null;
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
            return (this.b == cVar.b && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e) ? (this.ag == null || this.ag.b()) ? cVar.ag == null || cVar.ag.b() : this.ag.equals(cVar.ag) : false;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((((this.d ? 1231 : 1237) + (((((((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + ((int) (this.b ^ (this.b >>> 32)))) * 31) + ((int) (this.c ^ (this.c >>> 32)))) * 31)) * 31) + ((int) (this.e ^ (this.e >>> 32)))) * 31;
            if (!(this.ag == null || this.ag.b())) {
                i = this.ag.hashCode();
            }
            return hashCode + i;
        }
    }

    public static final class d extends qx<d> {
        public com.google.android.gms.internal.hj.a[] a;
        public com.google.android.gms.internal.hj.a[] b;
        public c[] c;

        public d() {
            b();
        }

        protected int a() {
            int i;
            int i2 = 0;
            int a = super.a();
            if (this.a != null && this.a.length > 0) {
                i = a;
                for (rd rdVar : this.a) {
                    if (rdVar != null) {
                        i += qw.c(1, rdVar);
                    }
                }
                a = i;
            }
            if (this.b != null && this.b.length > 0) {
                i = a;
                for (rd rdVar2 : this.b) {
                    if (rdVar2 != null) {
                        i += qw.c(2, rdVar2);
                    }
                }
                a = i;
            }
            if (this.c != null && this.c.length > 0) {
                while (i2 < this.c.length) {
                    rd rdVar3 = this.c[i2];
                    if (rdVar3 != null) {
                        a += qw.c(3, rdVar3);
                    }
                    i2++;
                }
            }
            return a;
        }

        public d a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                int b;
                Object obj;
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        b = rg.b(qvVar, 10);
                        a = this.a == null ? 0 : this.a.length;
                        obj = new com.google.android.gms.internal.hj.a[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.a, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new com.google.android.gms.internal.hj.a();
                            qvVar.a(obj[a]);
                            qvVar.a();
                            a++;
                        }
                        obj[a] = new com.google.android.gms.internal.hj.a();
                        qvVar.a(obj[a]);
                        this.a = obj;
                        continue;
                    case 18:
                        b = rg.b(qvVar, 18);
                        a = this.b == null ? 0 : this.b.length;
                        obj = new com.google.android.gms.internal.hj.a[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.b, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new com.google.android.gms.internal.hj.a();
                            qvVar.a(obj[a]);
                            qvVar.a();
                            a++;
                        }
                        obj[a] = new com.google.android.gms.internal.hj.a();
                        qvVar.a(obj[a]);
                        this.b = obj;
                        continue;
                    case 26:
                        b = rg.b(qvVar, 26);
                        a = this.c == null ? 0 : this.c.length;
                        obj = new c[(b + a)];
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
            if (this.a != null && this.a.length > 0) {
                for (rd rdVar : this.a) {
                    if (rdVar != null) {
                        qwVar.a(1, rdVar);
                    }
                }
            }
            if (this.b != null && this.b.length > 0) {
                for (rd rdVar2 : this.b) {
                    if (rdVar2 != null) {
                        qwVar.a(2, rdVar2);
                    }
                }
            }
            if (this.c != null && this.c.length > 0) {
                while (i < this.c.length) {
                    rd rdVar3 = this.c[i];
                    if (rdVar3 != null) {
                        qwVar.a(3, rdVar3);
                    }
                    i++;
                }
            }
            super.a(qwVar);
        }

        public d b() {
            this.a = com.google.android.gms.internal.hj.a.b();
            this.b = com.google.android.gms.internal.hj.a.b();
            this.c = c.b();
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
            return (rb.a(this.a, dVar.a) && rb.a(this.b, dVar.b) && rb.a(this.c, dVar.c)) ? (this.ag == null || this.ag.b()) ? dVar.ag == null || dVar.ag.b() : this.ag.equals(dVar.ag) : false;
        }

        public int hashCode() {
            int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + rb.a(this.a)) * 31) + rb.a(this.b)) * 31) + rb.a(this.c)) * 31;
            int hashCode2 = (this.ag == null || this.ag.b()) ? 0 : this.ag.hashCode();
            return hashCode2 + hashCode;
        }
    }

    public static final class e extends qx<e> {
        private static volatile e[] c;
        public int a;
        public int b;

        public e() {
            c();
        }

        public static e[] b() {
            if (c == null) {
                synchronized (rb.c) {
                    if (c == null) {
                        c = new e[0];
                    }
                }
            }
            return c;
        }

        protected int a() {
            return (super.a() + qw.c(1, this.a)) + qw.c(2, this.b);
        }

        public e a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        this.a = qvVar.g();
                        continue;
                    case 16:
                        this.b = qvVar.g();
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
            super.a(qwVar);
        }

        public /* synthetic */ rd b(qv qvVar) {
            return a(qvVar);
        }

        public e c() {
            this.a = 0;
            this.b = 0;
            this.ag = null;
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
            return (this.a == eVar.a && this.b == eVar.b) ? (this.ag == null || this.ag.b()) ? eVar.ag == null || eVar.ag.b() : this.ag.equals(eVar.ag) : false;
        }

        public int hashCode() {
            int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + this.a) * 31) + this.b) * 31;
            int hashCode2 = (this.ag == null || this.ag.b()) ? 0 : this.ag.hashCode();
            return hashCode2 + hashCode;
        }
    }

    public static final class f extends qx<f> {
        public String[] a;
        public String[] b;
        public com.google.android.gms.internal.hj.a[] c;
        public e[] d;
        public b[] e;
        public b[] f;
        public b[] g;
        public g[] h;
        public String i;
        public String j;
        public String k;
        public String l;
        public a m;
        public float n;
        public boolean o;
        public String[] p;
        public int q;

        public f() {
            b();
        }

        public static f a(byte[] bArr) {
            return (f) rd.a(new f(), bArr);
        }

        protected int a() {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            int a = super.a();
            if (this.b == null || this.b.length <= 0) {
                i = a;
            } else {
                i2 = 0;
                i3 = 0;
                for (String str : this.b) {
                    if (str != null) {
                        i3++;
                        i2 += qw.b(str);
                    }
                }
                i = (a + i2) + (i3 * 1);
            }
            if (this.c != null && this.c.length > 0) {
                i2 = i;
                for (rd rdVar : this.c) {
                    if (rdVar != null) {
                        i2 += qw.c(2, rdVar);
                    }
                }
                i = i2;
            }
            if (this.d != null && this.d.length > 0) {
                i2 = i;
                for (rd rdVar2 : this.d) {
                    if (rdVar2 != null) {
                        i2 += qw.c(3, rdVar2);
                    }
                }
                i = i2;
            }
            if (this.e != null && this.e.length > 0) {
                i2 = i;
                for (rd rdVar22 : this.e) {
                    if (rdVar22 != null) {
                        i2 += qw.c(4, rdVar22);
                    }
                }
                i = i2;
            }
            if (this.f != null && this.f.length > 0) {
                i2 = i;
                for (rd rdVar222 : this.f) {
                    if (rdVar222 != null) {
                        i2 += qw.c(5, rdVar222);
                    }
                }
                i = i2;
            }
            if (this.g != null && this.g.length > 0) {
                i2 = i;
                for (rd rdVar2222 : this.g) {
                    if (rdVar2222 != null) {
                        i2 += qw.c(6, rdVar2222);
                    }
                }
                i = i2;
            }
            if (this.h != null && this.h.length > 0) {
                i2 = i;
                for (rd rdVar22222 : this.h) {
                    if (rdVar22222 != null) {
                        i2 += qw.c(7, rdVar22222);
                    }
                }
                i = i2;
            }
            if (!this.i.equals("")) {
                i += qw.b(9, this.i);
            }
            if (!this.j.equals("")) {
                i += qw.b(10, this.j);
            }
            if (!this.k.equals("0")) {
                i += qw.b(12, this.k);
            }
            if (!this.l.equals("")) {
                i += qw.b(13, this.l);
            }
            if (this.m != null) {
                i += qw.c(14, this.m);
            }
            if (Float.floatToIntBits(this.n) != Float.floatToIntBits(0.0f)) {
                i += qw.b(15, this.n);
            }
            if (this.p != null && this.p.length > 0) {
                i3 = 0;
                a = 0;
                for (String str2 : this.p) {
                    if (str2 != null) {
                        a++;
                        i3 += qw.b(str2);
                    }
                }
                i = (i + i3) + (a * 2);
            }
            if (this.q != 0) {
                i += qw.c(17, this.q);
            }
            if (this.o) {
                i += qw.b(18, this.o);
            }
            if (this.a == null || this.a.length <= 0) {
                return i;
            }
            i2 = 0;
            i3 = 0;
            while (i4 < this.a.length) {
                String str3 = this.a[i4];
                if (str3 != null) {
                    i3++;
                    i2 += qw.b(str3);
                }
                i4++;
            }
            return (i + i2) + (i3 * 2);
        }

        public f a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                int b;
                Object obj;
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        b = rg.b(qvVar, 10);
                        a = this.b == null ? 0 : this.b.length;
                        obj = new String[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.b, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = qvVar.j();
                            qvVar.a();
                            a++;
                        }
                        obj[a] = qvVar.j();
                        this.b = obj;
                        continue;
                    case 18:
                        b = rg.b(qvVar, 18);
                        a = this.c == null ? 0 : this.c.length;
                        obj = new com.google.android.gms.internal.hj.a[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.c, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new com.google.android.gms.internal.hj.a();
                            qvVar.a(obj[a]);
                            qvVar.a();
                            a++;
                        }
                        obj[a] = new com.google.android.gms.internal.hj.a();
                        qvVar.a(obj[a]);
                        this.c = obj;
                        continue;
                    case 26:
                        b = rg.b(qvVar, 26);
                        a = this.d == null ? 0 : this.d.length;
                        obj = new e[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.d, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new e();
                            qvVar.a(obj[a]);
                            qvVar.a();
                            a++;
                        }
                        obj[a] = new e();
                        qvVar.a(obj[a]);
                        this.d = obj;
                        continue;
                    case 34:
                        b = rg.b(qvVar, 34);
                        a = this.e == null ? 0 : this.e.length;
                        obj = new b[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.e, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new b();
                            qvVar.a(obj[a]);
                            qvVar.a();
                            a++;
                        }
                        obj[a] = new b();
                        qvVar.a(obj[a]);
                        this.e = obj;
                        continue;
                    case 42:
                        b = rg.b(qvVar, 42);
                        a = this.f == null ? 0 : this.f.length;
                        obj = new b[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.f, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new b();
                            qvVar.a(obj[a]);
                            qvVar.a();
                            a++;
                        }
                        obj[a] = new b();
                        qvVar.a(obj[a]);
                        this.f = obj;
                        continue;
                    case 50:
                        b = rg.b(qvVar, 50);
                        a = this.g == null ? 0 : this.g.length;
                        obj = new b[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.g, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new b();
                            qvVar.a(obj[a]);
                            qvVar.a();
                            a++;
                        }
                        obj[a] = new b();
                        qvVar.a(obj[a]);
                        this.g = obj;
                        continue;
                    case 58:
                        b = rg.b(qvVar, 58);
                        a = this.h == null ? 0 : this.h.length;
                        obj = new g[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.h, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new g();
                            qvVar.a(obj[a]);
                            qvVar.a();
                            a++;
                        }
                        obj[a] = new g();
                        qvVar.a(obj[a]);
                        this.h = obj;
                        continue;
                    case 74:
                        this.i = qvVar.j();
                        continue;
                    case 82:
                        this.j = qvVar.j();
                        continue;
                    case 98:
                        this.k = qvVar.j();
                        continue;
                    case 106:
                        this.l = qvVar.j();
                        continue;
                    case 114:
                        if (this.m == null) {
                            this.m = new a();
                        }
                        qvVar.a(this.m);
                        continue;
                    case 125:
                        this.n = qvVar.d();
                        continue;
                    case 130:
                        b = rg.b(qvVar, 130);
                        a = this.p == null ? 0 : this.p.length;
                        obj = new String[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.p, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = qvVar.j();
                            qvVar.a();
                            a++;
                        }
                        obj[a] = qvVar.j();
                        this.p = obj;
                        continue;
                    case 136:
                        this.q = qvVar.g();
                        continue;
                    case 144:
                        this.o = qvVar.i();
                        continue;
                    case Opcodes.IFNE /*154*/:
                        b = rg.b(qvVar, Opcodes.IFNE);
                        a = this.a == null ? 0 : this.a.length;
                        obj = new String[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.a, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = qvVar.j();
                            qvVar.a();
                            a++;
                        }
                        obj[a] = qvVar.j();
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
            int i = 0;
            if (this.b != null && this.b.length > 0) {
                for (String str : this.b) {
                    if (str != null) {
                        qwVar.a(1, str);
                    }
                }
            }
            if (this.c != null && this.c.length > 0) {
                for (rd rdVar : this.c) {
                    if (rdVar != null) {
                        qwVar.a(2, rdVar);
                    }
                }
            }
            if (this.d != null && this.d.length > 0) {
                for (rd rdVar2 : this.d) {
                    if (rdVar2 != null) {
                        qwVar.a(3, rdVar2);
                    }
                }
            }
            if (this.e != null && this.e.length > 0) {
                for (rd rdVar22 : this.e) {
                    if (rdVar22 != null) {
                        qwVar.a(4, rdVar22);
                    }
                }
            }
            if (this.f != null && this.f.length > 0) {
                for (rd rdVar222 : this.f) {
                    if (rdVar222 != null) {
                        qwVar.a(5, rdVar222);
                    }
                }
            }
            if (this.g != null && this.g.length > 0) {
                for (rd rdVar2222 : this.g) {
                    if (rdVar2222 != null) {
                        qwVar.a(6, rdVar2222);
                    }
                }
            }
            if (this.h != null && this.h.length > 0) {
                for (rd rdVar22222 : this.h) {
                    if (rdVar22222 != null) {
                        qwVar.a(7, rdVar22222);
                    }
                }
            }
            if (!this.i.equals("")) {
                qwVar.a(9, this.i);
            }
            if (!this.j.equals("")) {
                qwVar.a(10, this.j);
            }
            if (!this.k.equals("0")) {
                qwVar.a(12, this.k);
            }
            if (!this.l.equals("")) {
                qwVar.a(13, this.l);
            }
            if (this.m != null) {
                qwVar.a(14, this.m);
            }
            if (Float.floatToIntBits(this.n) != Float.floatToIntBits(0.0f)) {
                qwVar.a(15, this.n);
            }
            if (this.p != null && this.p.length > 0) {
                for (String str2 : this.p) {
                    if (str2 != null) {
                        qwVar.a(16, str2);
                    }
                }
            }
            if (this.q != 0) {
                qwVar.a(17, this.q);
            }
            if (this.o) {
                qwVar.a(18, this.o);
            }
            if (this.a != null && this.a.length > 0) {
                while (i < this.a.length) {
                    String str3 = this.a[i];
                    if (str3 != null) {
                        qwVar.a(19, str3);
                    }
                    i++;
                }
            }
            super.a(qwVar);
        }

        public f b() {
            this.a = rg.f;
            this.b = rg.f;
            this.c = com.google.android.gms.internal.hj.a.b();
            this.d = e.b();
            this.e = b.b();
            this.f = b.b();
            this.g = b.b();
            this.h = g.b();
            this.i = "";
            this.j = "";
            this.k = "0";
            this.l = "";
            this.m = null;
            this.n = 0.0f;
            this.o = false;
            this.p = rg.f;
            this.q = 0;
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
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (!rb.a(this.a, fVar.a) || !rb.a(this.b, fVar.b) || !rb.a(this.c, fVar.c) || !rb.a(this.d, fVar.d) || !rb.a(this.e, fVar.e) || !rb.a(this.f, fVar.f) || !rb.a(this.g, fVar.g) || !rb.a(this.h, fVar.h)) {
                return false;
            }
            if (this.i == null) {
                if (fVar.i != null) {
                    return false;
                }
            } else if (!this.i.equals(fVar.i)) {
                return false;
            }
            if (this.j == null) {
                if (fVar.j != null) {
                    return false;
                }
            } else if (!this.j.equals(fVar.j)) {
                return false;
            }
            if (this.k == null) {
                if (fVar.k != null) {
                    return false;
                }
            } else if (!this.k.equals(fVar.k)) {
                return false;
            }
            if (this.l == null) {
                if (fVar.l != null) {
                    return false;
                }
            } else if (!this.l.equals(fVar.l)) {
                return false;
            }
            if (this.m == null) {
                if (fVar.m != null) {
                    return false;
                }
            } else if (!this.m.equals(fVar.m)) {
                return false;
            }
            return (Float.floatToIntBits(this.n) == Float.floatToIntBits(fVar.n) && this.o == fVar.o && rb.a(this.p, fVar.p) && this.q == fVar.q) ? (this.ag == null || this.ag.b()) ? fVar.ag == null || fVar.ag.b() : this.ag.equals(fVar.ag) : false;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((((((this.o ? 1231 : 1237) + (((((this.m == null ? 0 : this.m.hashCode()) + (((this.l == null ? 0 : this.l.hashCode()) + (((this.k == null ? 0 : this.k.hashCode()) + (((this.j == null ? 0 : this.j.hashCode()) + (((this.i == null ? 0 : this.i.hashCode()) + ((((((((((((((((((getClass().getName().hashCode() + 527) * 31) + rb.a(this.a)) * 31) + rb.a(this.b)) * 31) + rb.a(this.c)) * 31) + rb.a(this.d)) * 31) + rb.a(this.e)) * 31) + rb.a(this.f)) * 31) + rb.a(this.g)) * 31) + rb.a(this.h)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + Float.floatToIntBits(this.n)) * 31)) * 31) + rb.a(this.p)) * 31) + this.q) * 31;
            if (!(this.ag == null || this.ag.b())) {
                i = this.ag.hashCode();
            }
            return hashCode + i;
        }
    }

    public static final class g extends qx<g> {
        private static volatile g[] k;
        public int[] a;
        public int[] b;
        public int[] c;
        public int[] d;
        public int[] e;
        public int[] f;
        public int[] g;
        public int[] h;
        public int[] i;
        public int[] j;

        public g() {
            c();
        }

        public static g[] b() {
            if (k == null) {
                synchronized (rb.c) {
                    if (k == null) {
                        k = new g[0];
                    }
                }
            }
            return k;
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
                for (int c : this.a) {
                    i2 += qw.c(c);
                }
                i = (a + i2) + (this.a.length * 1);
            }
            if (this.b != null && this.b.length > 0) {
                a = 0;
                for (int c2 : this.b) {
                    a += qw.c(c2);
                }
                i = (i + a) + (this.b.length * 1);
            }
            if (this.c != null && this.c.length > 0) {
                a = 0;
                for (int c22 : this.c) {
                    a += qw.c(c22);
                }
                i = (i + a) + (this.c.length * 1);
            }
            if (this.d != null && this.d.length > 0) {
                a = 0;
                for (int c222 : this.d) {
                    a += qw.c(c222);
                }
                i = (i + a) + (this.d.length * 1);
            }
            if (this.e != null && this.e.length > 0) {
                a = 0;
                for (int c2222 : this.e) {
                    a += qw.c(c2222);
                }
                i = (i + a) + (this.e.length * 1);
            }
            if (this.f != null && this.f.length > 0) {
                a = 0;
                for (int c22222 : this.f) {
                    a += qw.c(c22222);
                }
                i = (i + a) + (this.f.length * 1);
            }
            if (this.g != null && this.g.length > 0) {
                a = 0;
                for (int c222222 : this.g) {
                    a += qw.c(c222222);
                }
                i = (i + a) + (this.g.length * 1);
            }
            if (this.h != null && this.h.length > 0) {
                a = 0;
                for (int c2222222 : this.h) {
                    a += qw.c(c2222222);
                }
                i = (i + a) + (this.h.length * 1);
            }
            if (this.i != null && this.i.length > 0) {
                a = 0;
                for (int c22222222 : this.i) {
                    a += qw.c(c22222222);
                }
                i = (i + a) + (this.i.length * 1);
            }
            if (this.j == null || this.j.length <= 0) {
                return i;
            }
            i2 = 0;
            while (i3 < this.j.length) {
                i2 += qw.c(this.j[i3]);
                i3++;
            }
            return (i + i2) + (this.j.length * 1);
        }

        public g a(qv qvVar) {
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
                        obj = new int[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.a, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = qvVar.g();
                            qvVar.a();
                            a++;
                        }
                        obj[a] = qvVar.g();
                        this.a = obj;
                        continue;
                    case 10:
                        d = qvVar.d(qvVar.n());
                        b = qvVar.t();
                        a = 0;
                        while (qvVar.r() > 0) {
                            qvVar.g();
                            a++;
                        }
                        qvVar.f(b);
                        b = this.a == null ? 0 : this.a.length;
                        obj2 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.a, 0, obj2, 0, b);
                        }
                        while (b < obj2.length) {
                            obj2[b] = qvVar.g();
                            b++;
                        }
                        this.a = obj2;
                        qvVar.e(d);
                        continue;
                    case 16:
                        b = rg.b(qvVar, 16);
                        a = this.b == null ? 0 : this.b.length;
                        obj = new int[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.b, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = qvVar.g();
                            qvVar.a();
                            a++;
                        }
                        obj[a] = qvVar.g();
                        this.b = obj;
                        continue;
                    case 18:
                        d = qvVar.d(qvVar.n());
                        b = qvVar.t();
                        a = 0;
                        while (qvVar.r() > 0) {
                            qvVar.g();
                            a++;
                        }
                        qvVar.f(b);
                        b = this.b == null ? 0 : this.b.length;
                        obj2 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.b, 0, obj2, 0, b);
                        }
                        while (b < obj2.length) {
                            obj2[b] = qvVar.g();
                            b++;
                        }
                        this.b = obj2;
                        qvVar.e(d);
                        continue;
                    case 24:
                        b = rg.b(qvVar, 24);
                        a = this.c == null ? 0 : this.c.length;
                        obj = new int[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.c, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = qvVar.g();
                            qvVar.a();
                            a++;
                        }
                        obj[a] = qvVar.g();
                        this.c = obj;
                        continue;
                    case 26:
                        d = qvVar.d(qvVar.n());
                        b = qvVar.t();
                        a = 0;
                        while (qvVar.r() > 0) {
                            qvVar.g();
                            a++;
                        }
                        qvVar.f(b);
                        b = this.c == null ? 0 : this.c.length;
                        obj2 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.c, 0, obj2, 0, b);
                        }
                        while (b < obj2.length) {
                            obj2[b] = qvVar.g();
                            b++;
                        }
                        this.c = obj2;
                        qvVar.e(d);
                        continue;
                    case 32:
                        b = rg.b(qvVar, 32);
                        a = this.d == null ? 0 : this.d.length;
                        obj = new int[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.d, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = qvVar.g();
                            qvVar.a();
                            a++;
                        }
                        obj[a] = qvVar.g();
                        this.d = obj;
                        continue;
                    case 34:
                        d = qvVar.d(qvVar.n());
                        b = qvVar.t();
                        a = 0;
                        while (qvVar.r() > 0) {
                            qvVar.g();
                            a++;
                        }
                        qvVar.f(b);
                        b = this.d == null ? 0 : this.d.length;
                        obj2 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.d, 0, obj2, 0, b);
                        }
                        while (b < obj2.length) {
                            obj2[b] = qvVar.g();
                            b++;
                        }
                        this.d = obj2;
                        qvVar.e(d);
                        continue;
                    case 40:
                        b = rg.b(qvVar, 40);
                        a = this.e == null ? 0 : this.e.length;
                        obj = new int[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.e, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = qvVar.g();
                            qvVar.a();
                            a++;
                        }
                        obj[a] = qvVar.g();
                        this.e = obj;
                        continue;
                    case 42:
                        d = qvVar.d(qvVar.n());
                        b = qvVar.t();
                        a = 0;
                        while (qvVar.r() > 0) {
                            qvVar.g();
                            a++;
                        }
                        qvVar.f(b);
                        b = this.e == null ? 0 : this.e.length;
                        obj2 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.e, 0, obj2, 0, b);
                        }
                        while (b < obj2.length) {
                            obj2[b] = qvVar.g();
                            b++;
                        }
                        this.e = obj2;
                        qvVar.e(d);
                        continue;
                    case 48:
                        b = rg.b(qvVar, 48);
                        a = this.f == null ? 0 : this.f.length;
                        obj = new int[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.f, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = qvVar.g();
                            qvVar.a();
                            a++;
                        }
                        obj[a] = qvVar.g();
                        this.f = obj;
                        continue;
                    case 50:
                        d = qvVar.d(qvVar.n());
                        b = qvVar.t();
                        a = 0;
                        while (qvVar.r() > 0) {
                            qvVar.g();
                            a++;
                        }
                        qvVar.f(b);
                        b = this.f == null ? 0 : this.f.length;
                        obj2 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.f, 0, obj2, 0, b);
                        }
                        while (b < obj2.length) {
                            obj2[b] = qvVar.g();
                            b++;
                        }
                        this.f = obj2;
                        qvVar.e(d);
                        continue;
                    case 56:
                        b = rg.b(qvVar, 56);
                        a = this.g == null ? 0 : this.g.length;
                        obj = new int[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.g, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = qvVar.g();
                            qvVar.a();
                            a++;
                        }
                        obj[a] = qvVar.g();
                        this.g = obj;
                        continue;
                    case 58:
                        d = qvVar.d(qvVar.n());
                        b = qvVar.t();
                        a = 0;
                        while (qvVar.r() > 0) {
                            qvVar.g();
                            a++;
                        }
                        qvVar.f(b);
                        b = this.g == null ? 0 : this.g.length;
                        obj2 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.g, 0, obj2, 0, b);
                        }
                        while (b < obj2.length) {
                            obj2[b] = qvVar.g();
                            b++;
                        }
                        this.g = obj2;
                        qvVar.e(d);
                        continue;
                    case 64:
                        b = rg.b(qvVar, 64);
                        a = this.h == null ? 0 : this.h.length;
                        obj = new int[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.h, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = qvVar.g();
                            qvVar.a();
                            a++;
                        }
                        obj[a] = qvVar.g();
                        this.h = obj;
                        continue;
                    case 66:
                        d = qvVar.d(qvVar.n());
                        b = qvVar.t();
                        a = 0;
                        while (qvVar.r() > 0) {
                            qvVar.g();
                            a++;
                        }
                        qvVar.f(b);
                        b = this.h == null ? 0 : this.h.length;
                        obj2 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.h, 0, obj2, 0, b);
                        }
                        while (b < obj2.length) {
                            obj2[b] = qvVar.g();
                            b++;
                        }
                        this.h = obj2;
                        qvVar.e(d);
                        continue;
                    case 72:
                        b = rg.b(qvVar, 72);
                        a = this.i == null ? 0 : this.i.length;
                        obj = new int[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.i, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = qvVar.g();
                            qvVar.a();
                            a++;
                        }
                        obj[a] = qvVar.g();
                        this.i = obj;
                        continue;
                    case 74:
                        d = qvVar.d(qvVar.n());
                        b = qvVar.t();
                        a = 0;
                        while (qvVar.r() > 0) {
                            qvVar.g();
                            a++;
                        }
                        qvVar.f(b);
                        b = this.i == null ? 0 : this.i.length;
                        obj2 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.i, 0, obj2, 0, b);
                        }
                        while (b < obj2.length) {
                            obj2[b] = qvVar.g();
                            b++;
                        }
                        this.i = obj2;
                        qvVar.e(d);
                        continue;
                    case 80:
                        b = rg.b(qvVar, 80);
                        a = this.j == null ? 0 : this.j.length;
                        obj = new int[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.j, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = qvVar.g();
                            qvVar.a();
                            a++;
                        }
                        obj[a] = qvVar.g();
                        this.j = obj;
                        continue;
                    case 82:
                        d = qvVar.d(qvVar.n());
                        b = qvVar.t();
                        a = 0;
                        while (qvVar.r() > 0) {
                            qvVar.g();
                            a++;
                        }
                        qvVar.f(b);
                        b = this.j == null ? 0 : this.j.length;
                        obj2 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.j, 0, obj2, 0, b);
                        }
                        while (b < obj2.length) {
                            obj2[b] = qvVar.g();
                            b++;
                        }
                        this.j = obj2;
                        qvVar.e(d);
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
            if (this.a != null && this.a.length > 0) {
                for (int a : this.a) {
                    qwVar.a(1, a);
                }
            }
            if (this.b != null && this.b.length > 0) {
                for (int a2 : this.b) {
                    qwVar.a(2, a2);
                }
            }
            if (this.c != null && this.c.length > 0) {
                for (int a22 : this.c) {
                    qwVar.a(3, a22);
                }
            }
            if (this.d != null && this.d.length > 0) {
                for (int a222 : this.d) {
                    qwVar.a(4, a222);
                }
            }
            if (this.e != null && this.e.length > 0) {
                for (int a2222 : this.e) {
                    qwVar.a(5, a2222);
                }
            }
            if (this.f != null && this.f.length > 0) {
                for (int a22222 : this.f) {
                    qwVar.a(6, a22222);
                }
            }
            if (this.g != null && this.g.length > 0) {
                for (int a222222 : this.g) {
                    qwVar.a(7, a222222);
                }
            }
            if (this.h != null && this.h.length > 0) {
                for (int a2222222 : this.h) {
                    qwVar.a(8, a2222222);
                }
            }
            if (this.i != null && this.i.length > 0) {
                for (int a22222222 : this.i) {
                    qwVar.a(9, a22222222);
                }
            }
            if (this.j != null && this.j.length > 0) {
                while (i < this.j.length) {
                    qwVar.a(10, this.j[i]);
                    i++;
                }
            }
            super.a(qwVar);
        }

        public /* synthetic */ rd b(qv qvVar) {
            return a(qvVar);
        }

        public g c() {
            this.a = rg.a;
            this.b = rg.a;
            this.c = rg.a;
            this.d = rg.a;
            this.e = rg.a;
            this.f = rg.a;
            this.g = rg.a;
            this.h = rg.a;
            this.i = rg.a;
            this.j = rg.a;
            this.ag = null;
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
            return (rb.a(this.a, gVar.a) && rb.a(this.b, gVar.b) && rb.a(this.c, gVar.c) && rb.a(this.d, gVar.d) && rb.a(this.e, gVar.e) && rb.a(this.f, gVar.f) && rb.a(this.g, gVar.g) && rb.a(this.h, gVar.h) && rb.a(this.i, gVar.i) && rb.a(this.j, gVar.j)) ? (this.ag == null || this.ag.b()) ? gVar.ag == null || gVar.ag.b() : this.ag.equals(gVar.ag) : false;
        }

        public int hashCode() {
            int hashCode = (((((((((((((((((((((getClass().getName().hashCode() + 527) * 31) + rb.a(this.a)) * 31) + rb.a(this.b)) * 31) + rb.a(this.c)) * 31) + rb.a(this.d)) * 31) + rb.a(this.e)) * 31) + rb.a(this.f)) * 31) + rb.a(this.g)) * 31) + rb.a(this.h)) * 31) + rb.a(this.i)) * 31) + rb.a(this.j)) * 31;
            int hashCode2 = (this.ag == null || this.ag.b()) ? 0 : this.ag.hashCode();
            return hashCode2 + hashCode;
        }
    }

    public static final class h extends qx<h> {
        public static final qy<com.google.android.gms.internal.hj.a, h> a = qy.a(11, h.class, 810);
        private static final h[] i = new h[0];
        public int[] b;
        public int[] c;
        public int[] d;
        public int e;
        public int[] f;
        public int g;
        public int h;

        public h() {
            b();
        }

        protected int a() {
            int i;
            int i2;
            int i3 = 0;
            int a = super.a();
            if (this.b == null || this.b.length <= 0) {
                i = a;
            } else {
                i2 = 0;
                for (int c : this.b) {
                    i2 += qw.c(c);
                }
                i = (a + i2) + (this.b.length * 1);
            }
            if (this.c != null && this.c.length > 0) {
                a = 0;
                for (int c2 : this.c) {
                    a += qw.c(c2);
                }
                i = (i + a) + (this.c.length * 1);
            }
            if (this.d != null && this.d.length > 0) {
                a = 0;
                for (int c22 : this.d) {
                    a += qw.c(c22);
                }
                i = (i + a) + (this.d.length * 1);
            }
            if (this.e != 0) {
                i += qw.c(4, this.e);
            }
            if (this.f != null && this.f.length > 0) {
                i2 = 0;
                while (i3 < this.f.length) {
                    i2 += qw.c(this.f[i3]);
                    i3++;
                }
                i = (i + i2) + (this.f.length * 1);
            }
            if (this.g != 0) {
                i += qw.c(6, this.g);
            }
            return this.h != 0 ? i + qw.c(7, this.h) : i;
        }

        public h a(qv qvVar) {
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
                        a = this.b == null ? 0 : this.b.length;
                        obj = new int[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.b, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = qvVar.g();
                            qvVar.a();
                            a++;
                        }
                        obj[a] = qvVar.g();
                        this.b = obj;
                        continue;
                    case 10:
                        d = qvVar.d(qvVar.n());
                        b = qvVar.t();
                        a = 0;
                        while (qvVar.r() > 0) {
                            qvVar.g();
                            a++;
                        }
                        qvVar.f(b);
                        b = this.b == null ? 0 : this.b.length;
                        obj2 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.b, 0, obj2, 0, b);
                        }
                        while (b < obj2.length) {
                            obj2[b] = qvVar.g();
                            b++;
                        }
                        this.b = obj2;
                        qvVar.e(d);
                        continue;
                    case 16:
                        b = rg.b(qvVar, 16);
                        a = this.c == null ? 0 : this.c.length;
                        obj = new int[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.c, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = qvVar.g();
                            qvVar.a();
                            a++;
                        }
                        obj[a] = qvVar.g();
                        this.c = obj;
                        continue;
                    case 18:
                        d = qvVar.d(qvVar.n());
                        b = qvVar.t();
                        a = 0;
                        while (qvVar.r() > 0) {
                            qvVar.g();
                            a++;
                        }
                        qvVar.f(b);
                        b = this.c == null ? 0 : this.c.length;
                        obj2 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.c, 0, obj2, 0, b);
                        }
                        while (b < obj2.length) {
                            obj2[b] = qvVar.g();
                            b++;
                        }
                        this.c = obj2;
                        qvVar.e(d);
                        continue;
                    case 24:
                        b = rg.b(qvVar, 24);
                        a = this.d == null ? 0 : this.d.length;
                        obj = new int[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.d, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = qvVar.g();
                            qvVar.a();
                            a++;
                        }
                        obj[a] = qvVar.g();
                        this.d = obj;
                        continue;
                    case 26:
                        d = qvVar.d(qvVar.n());
                        b = qvVar.t();
                        a = 0;
                        while (qvVar.r() > 0) {
                            qvVar.g();
                            a++;
                        }
                        qvVar.f(b);
                        b = this.d == null ? 0 : this.d.length;
                        obj2 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.d, 0, obj2, 0, b);
                        }
                        while (b < obj2.length) {
                            obj2[b] = qvVar.g();
                            b++;
                        }
                        this.d = obj2;
                        qvVar.e(d);
                        continue;
                    case 32:
                        this.e = qvVar.g();
                        continue;
                    case 40:
                        b = rg.b(qvVar, 40);
                        a = this.f == null ? 0 : this.f.length;
                        obj = new int[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.f, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = qvVar.g();
                            qvVar.a();
                            a++;
                        }
                        obj[a] = qvVar.g();
                        this.f = obj;
                        continue;
                    case 42:
                        d = qvVar.d(qvVar.n());
                        b = qvVar.t();
                        a = 0;
                        while (qvVar.r() > 0) {
                            qvVar.g();
                            a++;
                        }
                        qvVar.f(b);
                        b = this.f == null ? 0 : this.f.length;
                        obj2 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.f, 0, obj2, 0, b);
                        }
                        while (b < obj2.length) {
                            obj2[b] = qvVar.g();
                            b++;
                        }
                        this.f = obj2;
                        qvVar.e(d);
                        continue;
                    case 48:
                        this.g = qvVar.g();
                        continue;
                    case 56:
                        this.h = qvVar.g();
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
            if (this.b != null && this.b.length > 0) {
                for (int a : this.b) {
                    qwVar.a(1, a);
                }
            }
            if (this.c != null && this.c.length > 0) {
                for (int a2 : this.c) {
                    qwVar.a(2, a2);
                }
            }
            if (this.d != null && this.d.length > 0) {
                for (int a22 : this.d) {
                    qwVar.a(3, a22);
                }
            }
            if (this.e != 0) {
                qwVar.a(4, this.e);
            }
            if (this.f != null && this.f.length > 0) {
                while (i < this.f.length) {
                    qwVar.a(5, this.f[i]);
                    i++;
                }
            }
            if (this.g != 0) {
                qwVar.a(6, this.g);
            }
            if (this.h != 0) {
                qwVar.a(7, this.h);
            }
            super.a(qwVar);
        }

        public h b() {
            this.b = rg.a;
            this.c = rg.a;
            this.d = rg.a;
            this.e = 0;
            this.f = rg.a;
            this.g = 0;
            this.h = 0;
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
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return (rb.a(this.b, hVar.b) && rb.a(this.c, hVar.c) && rb.a(this.d, hVar.d) && this.e == hVar.e && rb.a(this.f, hVar.f) && this.g == hVar.g && this.h == hVar.h) ? (this.ag == null || this.ag.b()) ? hVar.ag == null || hVar.ag.b() : this.ag.equals(hVar.ag) : false;
        }

        public int hashCode() {
            int hashCode = (((((((((((((((getClass().getName().hashCode() + 527) * 31) + rb.a(this.b)) * 31) + rb.a(this.c)) * 31) + rb.a(this.d)) * 31) + this.e) * 31) + rb.a(this.f)) * 31) + this.g) * 31) + this.h) * 31;
            int hashCode2 = (this.ag == null || this.ag.b()) ? 0 : this.ag.hashCode();
            return hashCode2 + hashCode;
        }
    }

    public static final class i extends qx<i> {
        private static volatile i[] d;
        public String a;
        public com.google.android.gms.internal.hj.a b;
        public d c;

        public i() {
            c();
        }

        public static i[] b() {
            if (d == null) {
                synchronized (rb.c) {
                    if (d == null) {
                        d = new i[0];
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
            if (this.b != null) {
                a += qw.c(2, this.b);
            }
            return this.c != null ? a + qw.c(3, this.c) : a;
        }

        public i a(qv qvVar) {
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
                            this.b = new com.google.android.gms.internal.hj.a();
                        }
                        qvVar.a(this.b);
                        continue;
                    case 26:
                        if (this.c == null) {
                            this.c = new d();
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
            if (!this.a.equals("")) {
                qwVar.a(1, this.a);
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

        public i c() {
            this.a = "";
            this.b = null;
            this.c = null;
            this.ag = null;
            this.ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (this.a == null) {
                if (iVar.a != null) {
                    return false;
                }
            } else if (!this.a.equals(iVar.a)) {
                return false;
            }
            if (this.b == null) {
                if (iVar.b != null) {
                    return false;
                }
            } else if (!this.b.equals(iVar.b)) {
                return false;
            }
            if (this.c == null) {
                if (iVar.c != null) {
                    return false;
                }
            } else if (!this.c.equals(iVar.c)) {
                return false;
            }
            return (this.ag == null || this.ag.b()) ? iVar.ag == null || iVar.ag.b() : this.ag.equals(iVar.ag);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.c == null ? 0 : this.c.hashCode()) + (((this.b == null ? 0 : this.b.hashCode()) + (((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31;
            if (!(this.ag == null || this.ag.b())) {
                i = this.ag.hashCode();
            }
            return hashCode + i;
        }
    }

    public static final class j extends qx<j> {
        public i[] a;
        public f b;
        public String c;

        public j() {
            b();
        }

        public static j a(byte[] bArr) {
            return (j) rd.a(new j(), bArr);
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
                a += qw.c(2, this.b);
            }
            return !this.c.equals("") ? a + qw.b(3, this.c) : a;
        }

        public j a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        int b = rg.b(qvVar, 10);
                        a = this.a == null ? 0 : this.a.length;
                        Object obj = new i[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.a, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new i();
                            qvVar.a(obj[a]);
                            qvVar.a();
                            a++;
                        }
                        obj[a] = new i();
                        qvVar.a(obj[a]);
                        this.a = obj;
                        continue;
                    case 18:
                        if (this.b == null) {
                            this.b = new f();
                        }
                        qvVar.a(this.b);
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
            if (!this.c.equals("")) {
                qwVar.a(3, this.c);
            }
            super.a(qwVar);
        }

        public j b() {
            this.a = i.b();
            this.b = null;
            this.c = "";
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
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            if (!rb.a(this.a, jVar.a)) {
                return false;
            }
            if (this.b == null) {
                if (jVar.b != null) {
                    return false;
                }
            } else if (!this.b.equals(jVar.b)) {
                return false;
            }
            if (this.c == null) {
                if (jVar.c != null) {
                    return false;
                }
            } else if (!this.c.equals(jVar.c)) {
                return false;
            }
            return (this.ag == null || this.ag.b()) ? jVar.ag == null || jVar.ag.b() : this.ag.equals(jVar.ag);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.c == null ? 0 : this.c.hashCode()) + (((this.b == null ? 0 : this.b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + rb.a(this.a)) * 31)) * 31)) * 31;
            if (!(this.ag == null || this.ag.b())) {
                i = this.ag.hashCode();
            }
            return hashCode + i;
        }
    }
}
