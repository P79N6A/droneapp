package com.google.android.gms.internal;

import java.util.Arrays;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;

public interface ri {

    public static final class a extends qx<a> implements Cloneable {
        public String[] a;
        public String[] b;
        public int[] c;
        public long[] d;
        public long[] e;

        public a() {
            b();
        }

        protected int a() {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            int a = super.a();
            if (this.a == null || this.a.length <= 0) {
                i = a;
            } else {
                i2 = 0;
                i3 = 0;
                for (String str : this.a) {
                    if (str != null) {
                        i3++;
                        i2 += qw.b(str);
                    }
                }
                i = (a + i2) + (i3 * 1);
            }
            if (this.b != null && this.b.length > 0) {
                i3 = 0;
                a = 0;
                for (String str2 : this.b) {
                    if (str2 != null) {
                        a++;
                        i3 += qw.b(str2);
                    }
                }
                i = (i + i3) + (a * 1);
            }
            if (this.c != null && this.c.length > 0) {
                i3 = 0;
                for (int a2 : this.c) {
                    i3 += qw.c(a2);
                }
                i = (i + i3) + (this.c.length * 1);
            }
            if (this.d != null && this.d.length > 0) {
                i3 = 0;
                for (long f : this.d) {
                    i3 += qw.f(f);
                }
                i = (i + i3) + (this.d.length * 1);
            }
            if (this.e == null || this.e.length <= 0) {
                return i;
            }
            i2 = 0;
            while (i4 < this.e.length) {
                i2 += qw.f(this.e[i4]);
                i4++;
            }
            return (i + i2) + (this.e.length * 1);
        }

        public a a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                int b;
                Object obj;
                int d;
                Object obj2;
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        b = rg.b(qvVar, 10);
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
                    case 18:
                        b = rg.b(qvVar, 18);
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
                        obj = new long[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.d, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = qvVar.f();
                            qvVar.a();
                            a++;
                        }
                        obj[a] = qvVar.f();
                        this.d = obj;
                        continue;
                    case 34:
                        d = qvVar.d(qvVar.n());
                        b = qvVar.t();
                        a = 0;
                        while (qvVar.r() > 0) {
                            qvVar.f();
                            a++;
                        }
                        qvVar.f(b);
                        b = this.d == null ? 0 : this.d.length;
                        obj2 = new long[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.d, 0, obj2, 0, b);
                        }
                        while (b < obj2.length) {
                            obj2[b] = qvVar.f();
                            b++;
                        }
                        this.d = obj2;
                        qvVar.e(d);
                        continue;
                    case 40:
                        b = rg.b(qvVar, 40);
                        a = this.e == null ? 0 : this.e.length;
                        obj = new long[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.e, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = qvVar.f();
                            qvVar.a();
                            a++;
                        }
                        obj[a] = qvVar.f();
                        this.e = obj;
                        continue;
                    case 42:
                        d = qvVar.d(qvVar.n());
                        b = qvVar.t();
                        a = 0;
                        while (qvVar.r() > 0) {
                            qvVar.f();
                            a++;
                        }
                        qvVar.f(b);
                        b = this.e == null ? 0 : this.e.length;
                        obj2 = new long[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.e, 0, obj2, 0, b);
                        }
                        while (b < obj2.length) {
                            obj2[b] = qvVar.f();
                            b++;
                        }
                        this.e = obj2;
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
                for (String str : this.a) {
                    if (str != null) {
                        qwVar.a(1, str);
                    }
                }
            }
            if (this.b != null && this.b.length > 0) {
                for (String str2 : this.b) {
                    if (str2 != null) {
                        qwVar.a(2, str2);
                    }
                }
            }
            if (this.c != null && this.c.length > 0) {
                for (int a : this.c) {
                    qwVar.a(3, a);
                }
            }
            if (this.d != null && this.d.length > 0) {
                for (long b : this.d) {
                    qwVar.b(4, b);
                }
            }
            if (this.e != null && this.e.length > 0) {
                while (i < this.e.length) {
                    qwVar.b(5, this.e[i]);
                    i++;
                }
            }
            super.a(qwVar);
        }

        public /* synthetic */ rd b(qv qvVar) {
            return a(qvVar);
        }

        public a b() {
            this.a = rg.f;
            this.b = rg.f;
            this.c = rg.a;
            this.d = rg.b;
            this.e = rg.b;
            this.ag = null;
            this.ah = -1;
            return this;
        }

        public a c() {
            try {
                a aVar = (a) super.d();
                if (this.a != null && this.a.length > 0) {
                    aVar.a = (String[]) this.a.clone();
                }
                if (this.b != null && this.b.length > 0) {
                    aVar.b = (String[]) this.b.clone();
                }
                if (this.c != null && this.c.length > 0) {
                    aVar.c = (int[]) this.c.clone();
                }
                if (this.d != null && this.d.length > 0) {
                    aVar.d = (long[]) this.d.clone();
                }
                if (this.e != null && this.e.length > 0) {
                    aVar.e = (long[]) this.e.clone();
                }
                return aVar;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        public /* synthetic */ Object clone() {
            return c();
        }

        public /* synthetic */ qx d() {
            return (a) clone();
        }

        public /* synthetic */ rd e() {
            return (a) clone();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return (rb.a(this.a, aVar.a) && rb.a(this.b, aVar.b) && rb.a(this.c, aVar.c) && rb.a(this.d, aVar.d) && rb.a(this.e, aVar.e)) ? (this.ag == null || this.ag.b()) ? aVar.ag == null || aVar.ag.b() : this.ag.equals(aVar.ag) : false;
        }

        public int hashCode() {
            int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + rb.a(this.a)) * 31) + rb.a(this.b)) * 31) + rb.a(this.c)) * 31) + rb.a(this.d)) * 31) + rb.a(this.e)) * 31;
            int hashCode2 = (this.ag == null || this.ag.b()) ? 0 : this.ag.hashCode();
            return hashCode2 + hashCode;
        }
    }

    public static final class b extends qx<b> implements Cloneable {
        public int a;
        public String b;
        public String c;

        public b() {
            b();
        }

        protected int a() {
            int a = super.a();
            if (this.a != 0) {
                a += qw.c(1, this.a);
            }
            if (!this.b.equals("")) {
                a += qw.b(2, this.b);
            }
            return !this.c.equals("") ? a + qw.b(3, this.c) : a;
        }

        public b a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        this.a = qvVar.g();
                        continue;
                    case 18:
                        this.b = qvVar.j();
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
            if (!this.b.equals("")) {
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

        public b b() {
            this.a = 0;
            this.b = "";
            this.c = "";
            this.ag = null;
            this.ah = -1;
            return this;
        }

        public b c() {
            try {
                return (b) super.d();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        public /* synthetic */ Object clone() {
            return c();
        }

        public /* synthetic */ qx d() {
            return (b) clone();
        }

        public /* synthetic */ rd e() {
            return (b) clone();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a != bVar.a) {
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
            return (this.ag == null || this.ag.b()) ? bVar.ag == null || bVar.ag.b() : this.ag.equals(bVar.ag);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.c == null ? 0 : this.c.hashCode()) + (((this.b == null ? 0 : this.b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + this.a) * 31)) * 31)) * 31;
            if (!(this.ag == null || this.ag.b())) {
                i = this.ag.hashCode();
            }
            return hashCode + i;
        }
    }

    public static final class c extends qx<c> implements Cloneable {
        public byte[] a;
        public String b;
        public byte[][] c;
        public boolean d;

        public c() {
            b();
        }

        protected int a() {
            int i = 0;
            int a = super.a();
            if (!Arrays.equals(this.a, rg.h)) {
                a += qw.b(1, this.a);
            }
            if (this.c != null && this.c.length > 0) {
                int i2 = 0;
                int i3 = 0;
                while (i < this.c.length) {
                    byte[] bArr = this.c[i];
                    if (bArr != null) {
                        i3++;
                        i2 += qw.c(bArr);
                    }
                    i++;
                }
                a = (a + i2) + (i3 * 1);
            }
            if (this.d) {
                a += qw.b(3, this.d);
            }
            return !this.b.equals("") ? a + qw.b(4, this.b) : a;
        }

        public c a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        this.a = qvVar.k();
                        continue;
                    case 18:
                        int b = rg.b(qvVar, 18);
                        a = this.c == null ? 0 : this.c.length;
                        Object obj = new byte[(b + a)][];
                        if (a != 0) {
                            System.arraycopy(this.c, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = qvVar.k();
                            qvVar.a();
                            a++;
                        }
                        obj[a] = qvVar.k();
                        this.c = obj;
                        continue;
                    case 24:
                        this.d = qvVar.i();
                        continue;
                    case 34:
                        this.b = qvVar.j();
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
            if (!Arrays.equals(this.a, rg.h)) {
                qwVar.a(1, this.a);
            }
            if (this.c != null && this.c.length > 0) {
                for (byte[] bArr : this.c) {
                    if (bArr != null) {
                        qwVar.a(2, bArr);
                    }
                }
            }
            if (this.d) {
                qwVar.a(3, this.d);
            }
            if (!this.b.equals("")) {
                qwVar.a(4, this.b);
            }
            super.a(qwVar);
        }

        public /* synthetic */ rd b(qv qvVar) {
            return a(qvVar);
        }

        public c b() {
            this.a = rg.h;
            this.b = "";
            this.c = rg.g;
            this.d = false;
            this.ag = null;
            this.ah = -1;
            return this;
        }

        public c c() {
            try {
                c cVar = (c) super.d();
                if (this.c != null && this.c.length > 0) {
                    cVar.c = (byte[][]) this.c.clone();
                }
                return cVar;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        public /* synthetic */ Object clone() {
            return c();
        }

        public /* synthetic */ qx d() {
            return (c) clone();
        }

        public /* synthetic */ rd e() {
            return (c) clone();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!Arrays.equals(this.a, cVar.a)) {
                return false;
            }
            if (this.b == null) {
                if (cVar.b != null) {
                    return false;
                }
            } else if (!this.b.equals(cVar.b)) {
                return false;
            }
            return (rb.a(this.c, cVar.c) && this.d == cVar.d) ? (this.ag == null || this.ag.b()) ? cVar.ag == null || cVar.ag.b() : this.ag.equals(cVar.ag) : false;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.d ? 1231 : 1237) + (((((this.b == null ? 0 : this.b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + Arrays.hashCode(this.a)) * 31)) * 31) + rb.a(this.c)) * 31)) * 31;
            if (!(this.ag == null || this.ag.b())) {
                i = this.ag.hashCode();
            }
            return hashCode + i;
        }
    }

    public static final class d extends qx<d> implements Cloneable {
        public long a;
        public long b;
        public long c;
        public String d;
        public int e;
        public int f;
        public boolean g;
        public e[] h;
        public byte[] i;
        public b j;
        public byte[] k;
        public String l;
        public String m;
        public a n;
        public String o;
        public long p;
        public c q;
        public byte[] r;
        public String s;
        public int t;
        public int[] u;
        public long v;
        public f w;

        public d() {
            b();
        }

        protected int a() {
            int i;
            int i2 = 0;
            int a = super.a();
            if (this.a != 0) {
                a += qw.f(1, this.a);
            }
            if (!this.d.equals("")) {
                a += qw.b(2, this.d);
            }
            if (this.h != null && this.h.length > 0) {
                i = a;
                for (rd rdVar : this.h) {
                    if (rdVar != null) {
                        i += qw.c(3, rdVar);
                    }
                }
                a = i;
            }
            if (!Arrays.equals(this.i, rg.h)) {
                a += qw.b(4, this.i);
            }
            if (!Arrays.equals(this.k, rg.h)) {
                a += qw.b(6, this.k);
            }
            if (this.n != null) {
                a += qw.c(7, this.n);
            }
            if (!this.l.equals("")) {
                a += qw.b(8, this.l);
            }
            if (this.j != null) {
                a += qw.c(9, this.j);
            }
            if (this.g) {
                a += qw.b(10, this.g);
            }
            if (this.e != 0) {
                a += qw.c(11, this.e);
            }
            if (this.f != 0) {
                a += qw.c(12, this.f);
            }
            if (!this.m.equals("")) {
                a += qw.b(13, this.m);
            }
            if (!this.o.equals("")) {
                a += qw.b(14, this.o);
            }
            if (this.p != 180000) {
                a += qw.h(15, this.p);
            }
            if (this.q != null) {
                a += qw.c(16, this.q);
            }
            if (this.b != 0) {
                a += qw.f(17, this.b);
            }
            if (!Arrays.equals(this.r, rg.h)) {
                a += qw.b(18, this.r);
            }
            if (this.t != 0) {
                a += qw.c(19, this.t);
            }
            if (this.u != null && this.u.length > 0) {
                i = 0;
                while (i2 < this.u.length) {
                    i += qw.c(this.u[i2]);
                    i2++;
                }
                a = (a + i) + (this.u.length * 2);
            }
            if (this.c != 0) {
                a += qw.f(21, this.c);
            }
            if (this.v != 0) {
                a += qw.f(22, this.v);
            }
            if (this.w != null) {
                a += qw.c(23, this.w);
            }
            return !this.s.equals("") ? a + qw.b(24, this.s) : a;
        }

        public d a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                int b;
                Object obj;
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        this.a = qvVar.f();
                        continue;
                    case 18:
                        this.d = qvVar.j();
                        continue;
                    case 26:
                        b = rg.b(qvVar, 26);
                        a = this.h == null ? 0 : this.h.length;
                        obj = new e[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.h, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new e();
                            qvVar.a(obj[a]);
                            qvVar.a();
                            a++;
                        }
                        obj[a] = new e();
                        qvVar.a(obj[a]);
                        this.h = obj;
                        continue;
                    case 34:
                        this.i = qvVar.k();
                        continue;
                    case 50:
                        this.k = qvVar.k();
                        continue;
                    case 58:
                        if (this.n == null) {
                            this.n = new a();
                        }
                        qvVar.a(this.n);
                        continue;
                    case 66:
                        this.l = qvVar.j();
                        continue;
                    case 74:
                        if (this.j == null) {
                            this.j = new b();
                        }
                        qvVar.a(this.j);
                        continue;
                    case 80:
                        this.g = qvVar.i();
                        continue;
                    case 88:
                        this.e = qvVar.g();
                        continue;
                    case 96:
                        this.f = qvVar.g();
                        continue;
                    case 106:
                        this.m = qvVar.j();
                        continue;
                    case 114:
                        this.o = qvVar.j();
                        continue;
                    case 120:
                        this.p = qvVar.m();
                        continue;
                    case 130:
                        if (this.q == null) {
                            this.q = new c();
                        }
                        qvVar.a(this.q);
                        continue;
                    case 136:
                        this.b = qvVar.f();
                        continue;
                    case 146:
                        this.r = qvVar.k();
                        continue;
                    case 152:
                        a = qvVar.g();
                        switch (a) {
                            case 0:
                            case 1:
                            case 2:
                                this.t = a;
                                break;
                            default:
                                continue;
                        }
                    case 160:
                        b = rg.b(qvVar, 160);
                        a = this.u == null ? 0 : this.u.length;
                        obj = new int[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.u, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = qvVar.g();
                            qvVar.a();
                            a++;
                        }
                        obj[a] = qvVar.g();
                        this.u = obj;
                        continue;
                    case Opcodes.IF_ICMPGE /*162*/:
                        int d = qvVar.d(qvVar.n());
                        b = qvVar.t();
                        a = 0;
                        while (qvVar.r() > 0) {
                            qvVar.g();
                            a++;
                        }
                        qvVar.f(b);
                        b = this.u == null ? 0 : this.u.length;
                        Object obj2 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.u, 0, obj2, 0, b);
                        }
                        while (b < obj2.length) {
                            obj2[b] = qvVar.g();
                            b++;
                        }
                        this.u = obj2;
                        qvVar.e(d);
                        continue;
                    case Opcodes.JSR /*168*/:
                        this.c = qvVar.f();
                        continue;
                    case 176:
                        this.v = qvVar.f();
                        continue;
                    case Opcodes.INVOKEDYNAMIC /*186*/:
                        if (this.w == null) {
                            this.w = new f();
                        }
                        qvVar.a(this.w);
                        continue;
                    case Opcodes.MONITORENTER /*194*/:
                        this.s = qvVar.j();
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
            if (this.a != 0) {
                qwVar.b(1, this.a);
            }
            if (!this.d.equals("")) {
                qwVar.a(2, this.d);
            }
            if (this.h != null && this.h.length > 0) {
                for (rd rdVar : this.h) {
                    if (rdVar != null) {
                        qwVar.a(3, rdVar);
                    }
                }
            }
            if (!Arrays.equals(this.i, rg.h)) {
                qwVar.a(4, this.i);
            }
            if (!Arrays.equals(this.k, rg.h)) {
                qwVar.a(6, this.k);
            }
            if (this.n != null) {
                qwVar.a(7, this.n);
            }
            if (!this.l.equals("")) {
                qwVar.a(8, this.l);
            }
            if (this.j != null) {
                qwVar.a(9, this.j);
            }
            if (this.g) {
                qwVar.a(10, this.g);
            }
            if (this.e != 0) {
                qwVar.a(11, this.e);
            }
            if (this.f != 0) {
                qwVar.a(12, this.f);
            }
            if (!this.m.equals("")) {
                qwVar.a(13, this.m);
            }
            if (!this.o.equals("")) {
                qwVar.a(14, this.o);
            }
            if (this.p != 180000) {
                qwVar.d(15, this.p);
            }
            if (this.q != null) {
                qwVar.a(16, this.q);
            }
            if (this.b != 0) {
                qwVar.b(17, this.b);
            }
            if (!Arrays.equals(this.r, rg.h)) {
                qwVar.a(18, this.r);
            }
            if (this.t != 0) {
                qwVar.a(19, this.t);
            }
            if (this.u != null && this.u.length > 0) {
                while (i < this.u.length) {
                    qwVar.a(20, this.u[i]);
                    i++;
                }
            }
            if (this.c != 0) {
                qwVar.b(21, this.c);
            }
            if (this.v != 0) {
                qwVar.b(22, this.v);
            }
            if (this.w != null) {
                qwVar.a(23, this.w);
            }
            if (!this.s.equals("")) {
                qwVar.a(24, this.s);
            }
            super.a(qwVar);
        }

        public /* synthetic */ rd b(qv qvVar) {
            return a(qvVar);
        }

        public d b() {
            this.a = 0;
            this.b = 0;
            this.c = 0;
            this.d = "";
            this.e = 0;
            this.f = 0;
            this.g = false;
            this.h = e.b();
            this.i = rg.h;
            this.j = null;
            this.k = rg.h;
            this.l = "";
            this.m = "";
            this.n = null;
            this.o = "";
            this.p = 180000;
            this.q = null;
            this.r = rg.h;
            this.s = "";
            this.t = 0;
            this.u = rg.a;
            this.v = 0;
            this.w = null;
            this.ag = null;
            this.ah = -1;
            return this;
        }

        public d c() {
            try {
                d dVar = (d) super.d();
                if (this.h != null && this.h.length > 0) {
                    dVar.h = new e[this.h.length];
                    for (int i = 0; i < this.h.length; i++) {
                        if (this.h[i] != null) {
                            dVar.h[i] = (e) this.h[i].clone();
                        }
                    }
                }
                if (this.j != null) {
                    dVar.j = (b) this.j.clone();
                }
                if (this.n != null) {
                    dVar.n = (a) this.n.clone();
                }
                if (this.q != null) {
                    dVar.q = (c) this.q.clone();
                }
                if (this.u != null && this.u.length > 0) {
                    dVar.u = (int[]) this.u.clone();
                }
                if (this.w != null) {
                    dVar.w = (f) this.w.clone();
                }
                return dVar;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        public /* synthetic */ Object clone() {
            return c();
        }

        public /* synthetic */ qx d() {
            return (d) clone();
        }

        public /* synthetic */ rd e() {
            return (d) clone();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.a != dVar.a || this.b != dVar.b || this.c != dVar.c) {
                return false;
            }
            if (this.d == null) {
                if (dVar.d != null) {
                    return false;
                }
            } else if (!this.d.equals(dVar.d)) {
                return false;
            }
            if (this.e != dVar.e || this.f != dVar.f || this.g != dVar.g || !rb.a(this.h, dVar.h) || !Arrays.equals(this.i, dVar.i)) {
                return false;
            }
            if (this.j == null) {
                if (dVar.j != null) {
                    return false;
                }
            } else if (!this.j.equals(dVar.j)) {
                return false;
            }
            if (!Arrays.equals(this.k, dVar.k)) {
                return false;
            }
            if (this.l == null) {
                if (dVar.l != null) {
                    return false;
                }
            } else if (!this.l.equals(dVar.l)) {
                return false;
            }
            if (this.m == null) {
                if (dVar.m != null) {
                    return false;
                }
            } else if (!this.m.equals(dVar.m)) {
                return false;
            }
            if (this.n == null) {
                if (dVar.n != null) {
                    return false;
                }
            } else if (!this.n.equals(dVar.n)) {
                return false;
            }
            if (this.o == null) {
                if (dVar.o != null) {
                    return false;
                }
            } else if (!this.o.equals(dVar.o)) {
                return false;
            }
            if (this.p != dVar.p) {
                return false;
            }
            if (this.q == null) {
                if (dVar.q != null) {
                    return false;
                }
            } else if (!this.q.equals(dVar.q)) {
                return false;
            }
            if (!Arrays.equals(this.r, dVar.r)) {
                return false;
            }
            if (this.s == null) {
                if (dVar.s != null) {
                    return false;
                }
            } else if (!this.s.equals(dVar.s)) {
                return false;
            }
            if (this.t != dVar.t || !rb.a(this.u, dVar.u) || this.v != dVar.v) {
                return false;
            }
            if (this.w == null) {
                if (dVar.w != null) {
                    return false;
                }
            } else if (!this.w.equals(dVar.w)) {
                return false;
            }
            return (this.ag == null || this.ag.b()) ? dVar.ag == null || dVar.ag.b() : this.ag.equals(dVar.ag);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.w == null ? 0 : this.w.hashCode()) + (((((((((this.s == null ? 0 : this.s.hashCode()) + (((((this.q == null ? 0 : this.q.hashCode()) + (((((this.o == null ? 0 : this.o.hashCode()) + (((this.n == null ? 0 : this.n.hashCode()) + (((this.m == null ? 0 : this.m.hashCode()) + (((this.l == null ? 0 : this.l.hashCode()) + (((((this.j == null ? 0 : this.j.hashCode()) + (((((((this.g ? 1231 : 1237) + (((((((this.d == null ? 0 : this.d.hashCode()) + ((((((((getClass().getName().hashCode() + 527) * 31) + ((int) (this.a ^ (this.a >>> 32)))) * 31) + ((int) (this.b ^ (this.b >>> 32)))) * 31) + ((int) (this.c ^ (this.c >>> 32)))) * 31)) * 31) + this.e) * 31) + this.f) * 31)) * 31) + rb.a(this.h)) * 31) + Arrays.hashCode(this.i)) * 31)) * 31) + Arrays.hashCode(this.k)) * 31)) * 31)) * 31)) * 31)) * 31) + ((int) (this.p ^ (this.p >>> 32)))) * 31)) * 31) + Arrays.hashCode(this.r)) * 31)) * 31) + this.t) * 31) + rb.a(this.u)) * 31) + ((int) (this.v ^ (this.v >>> 32)))) * 31)) * 31;
            if (!(this.ag == null || this.ag.b())) {
                i = this.ag.hashCode();
            }
            return hashCode + i;
        }
    }

    public static final class e extends qx<e> implements Cloneable {
        private static volatile e[] c;
        public String a;
        public String b;

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
            int a = super.a();
            if (!this.a.equals("")) {
                a += qw.b(1, this.a);
            }
            return !this.b.equals("") ? a + qw.b(2, this.b) : a;
        }

        public e a(qv qvVar) {
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
            super.a(qwVar);
        }

        public /* synthetic */ rd b(qv qvVar) {
            return a(qvVar);
        }

        public e c() {
            this.a = "";
            this.b = "";
            this.ag = null;
            this.ah = -1;
            return this;
        }

        public /* synthetic */ Object clone() {
            return h();
        }

        public /* synthetic */ qx d() {
            return (e) clone();
        }

        public /* synthetic */ rd e() {
            return (e) clone();
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
            return (this.ag == null || this.ag.b()) ? eVar.ag == null || eVar.ag.b() : this.ag.equals(eVar.ag);
        }

        public e h() {
            try {
                return (e) super.d();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
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

    public static final class f extends qx<f> implements Cloneable {
        public int a;

        public f() {
            b();
        }

        protected int a() {
            int a = super.a();
            return this.a != -1 ? a + qw.c(1, this.a) : a;
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
                            case -1:
                            case 0:
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
                                this.a = a;
                                break;
                            default:
                                continue;
                        }
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
            if (this.a != -1) {
                qwVar.a(1, this.a);
            }
            super.a(qwVar);
        }

        public /* synthetic */ rd b(qv qvVar) {
            return a(qvVar);
        }

        public f b() {
            this.a = -1;
            this.ag = null;
            this.ah = -1;
            return this;
        }

        public f c() {
            try {
                return (f) super.d();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        public /* synthetic */ Object clone() {
            return c();
        }

        public /* synthetic */ qx d() {
            return (f) clone();
        }

        public /* synthetic */ rd e() {
            return (f) clone();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a == fVar.a ? (this.ag == null || this.ag.b()) ? fVar.ag == null || fVar.ag.b() : this.ag.equals(fVar.ag) : false;
        }

        public int hashCode() {
            int hashCode = (((getClass().getName().hashCode() + 527) * 31) + this.a) * 31;
            int hashCode2 = (this.ag == null || this.ag.b()) ? 0 : this.ag.hashCode();
            return hashCode2 + hashCode;
        }
    }
}
