package com.google.android.gms.internal;

import java.util.Arrays;

public interface qf {

    public static final class a extends qx<a> {
        public int a;
        public long b;

        public a() {
            b();
        }

        protected int a() {
            int a = super.a();
            if (this.a != 0) {
                a += qw.c(1, this.a);
            }
            return this.b != 0 ? a + qw.f(2, this.b) : a;
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
                            case 0:
                            case 1:
                            case 2:
                                this.a = a;
                                break;
                            default:
                                continue;
                        }
                    case 16:
                        this.b = qvVar.f();
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
                qwVar.b(2, this.b);
            }
            super.a(qwVar);
        }

        public a b() {
            this.a = 0;
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
            return (this.a == aVar.a && this.b == aVar.b) ? (this.ag == null || this.ag.b()) ? aVar.ag == null || aVar.ag.b() : this.ag.equals(aVar.ag) : false;
        }

        public int hashCode() {
            int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + this.a) * 31) + ((int) (this.b ^ (this.b >>> 32)))) * 31;
            int hashCode2 = (this.ag == null || this.ag.b()) ? 0 : this.ag.hashCode();
            return hashCode2 + hashCode;
        }
    }

    public static final class b extends qx<b> {
        public long a;
        public int b;
        public c c;
        public d d;
        public e e;
        public a f;
        public a g;

        public static final class a extends qx<a> {
            public String a;
            public String b;
            public String c;

            public a() {
                b();
            }

            protected int a() {
                int a = super.a();
                if (!this.a.equals("")) {
                    a += qw.b(1, this.a);
                }
                if (!this.b.equals("")) {
                    a += qw.b(2, this.b);
                }
                return !this.c.equals("") ? a + qw.b(3, this.c) : a;
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
                if (!this.a.equals("")) {
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

            public a b() {
                this.a = "";
                this.b = "";
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
                return (this.ag == null || this.ag.b()) ? aVar.ag == null || aVar.ag.b() : this.ag.equals(aVar.ag);
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

        public b() {
            b();
        }

        public static b a(byte[] bArr) {
            return (b) rd.a(new b(), bArr);
        }

        protected int a() {
            int a = super.a();
            if (this.a != 0) {
                a += qw.f(1, this.a);
            }
            if (this.b != 0) {
                a += qw.c(2, this.b);
            }
            if (this.c != null) {
                a += qw.c(3, this.c);
            }
            if (this.d != null) {
                a += qw.c(4, this.d);
            }
            if (this.e != null) {
                a += qw.c(5, this.e);
            }
            if (this.f != null) {
                a += qw.c(6, this.f);
            }
            return this.g != null ? a + qw.c(7, this.g) : a;
        }

        public b a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        this.a = qvVar.f();
                        continue;
                    case 16:
                        a = qvVar.g();
                        switch (a) {
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
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 10000:
                            case 10001:
                            case com.google.android.gms.games.d.b /*10002*/:
                            case com.google.android.gms.games.d.c /*10003*/:
                            case com.google.android.gms.games.d.d /*10004*/:
                            case com.google.android.gms.games.d.e /*10005*/:
                            case com.google.android.gms.games.d.f /*10006*/:
                            case com.google.android.gms.games.d.g /*10007*/:
                            case com.google.android.gms.games.d.h /*10008*/:
                            case 10009:
                            case 99999:
                                this.b = a;
                                break;
                            default:
                                continue;
                        }
                    case 26:
                        if (this.c == null) {
                            this.c = new c();
                        }
                        qvVar.a(this.c);
                        continue;
                    case 34:
                        if (this.d == null) {
                            this.d = new d();
                        }
                        qvVar.a(this.d);
                        continue;
                    case 42:
                        if (this.e == null) {
                            this.e = new e();
                        }
                        qvVar.a(this.e);
                        continue;
                    case 50:
                        if (this.f == null) {
                            this.f = new a();
                        }
                        qvVar.a(this.f);
                        continue;
                    case 58:
                        if (this.g == null) {
                            this.g = new a();
                        }
                        qvVar.a(this.g);
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
                qwVar.b(1, this.a);
            }
            if (this.b != 0) {
                qwVar.a(2, this.b);
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
                qwVar.a(6, this.f);
            }
            if (this.g != null) {
                qwVar.a(7, this.g);
            }
            super.a(qwVar);
        }

        public b b() {
            this.a = 0;
            this.b = 0;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
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
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a != bVar.a || this.b != bVar.b) {
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
            if (this.e == null) {
                if (bVar.e != null) {
                    return false;
                }
            } else if (!this.e.equals(bVar.e)) {
                return false;
            }
            if (this.f == null) {
                if (bVar.f != null) {
                    return false;
                }
            } else if (!this.f.equals(bVar.f)) {
                return false;
            }
            if (this.g == null) {
                if (bVar.g != null) {
                    return false;
                }
            } else if (!this.g.equals(bVar.g)) {
                return false;
            }
            return (this.ag == null || this.ag.b()) ? bVar.ag == null || bVar.ag.b() : this.ag.equals(bVar.ag);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.g == null ? 0 : this.g.hashCode()) + (((this.f == null ? 0 : this.f.hashCode()) + (((this.e == null ? 0 : this.e.hashCode()) + (((this.d == null ? 0 : this.d.hashCode()) + (((this.c == null ? 0 : this.c.hashCode()) + ((((((getClass().getName().hashCode() + 527) * 31) + ((int) (this.a ^ (this.a >>> 32)))) * 31) + this.b) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
            if (!(this.ag == null || this.ag.b())) {
                i = this.ag.hashCode();
            }
            return hashCode + i;
        }
    }

    public static final class c extends qx<c> {
        public int a;
        public long b;

        public c() {
            b();
        }

        protected int a() {
            int a = super.a();
            if (this.a != 0) {
                a += qw.c(1, this.a);
            }
            return this.b != 0 ? a + qw.f(2, this.b) : a;
        }

        public c a(qv qvVar) {
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
                                this.a = a;
                                break;
                            default:
                                continue;
                        }
                    case 16:
                        this.b = qvVar.f();
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
                qwVar.b(2, this.b);
            }
            super.a(qwVar);
        }

        public c b() {
            this.a = 0;
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
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return (this.a == cVar.a && this.b == cVar.b) ? (this.ag == null || this.ag.b()) ? cVar.ag == null || cVar.ag.b() : this.ag.equals(cVar.ag) : false;
        }

        public int hashCode() {
            int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + this.a) * 31) + ((int) (this.b ^ (this.b >>> 32)))) * 31;
            int hashCode2 = (this.ag == null || this.ag.b()) ? 0 : this.ag.hashCode();
            return hashCode2 + hashCode;
        }
    }

    public static final class d extends qx<d> {
        public int a;
        public long b;
        public int c;
        public String d;
        public String e;
        public byte[] f;
        public int[] g;
        public String[] h;
        public long i;
        public int j;
        public String k;

        public d() {
            b();
        }

        protected int a() {
            int i;
            int i2;
            int i3 = 0;
            int a = super.a();
            if (this.a != 0) {
                a += qw.c(1, this.a);
            }
            if (this.b != 0) {
                a += qw.f(2, this.b);
            }
            if (this.c != 0) {
                a += qw.c(3, this.c);
            }
            if (!this.d.equals("")) {
                a += qw.b(4, this.d);
            }
            if (!this.e.equals("")) {
                a += qw.b(5, this.e);
            }
            if (!Arrays.equals(this.f, rg.h)) {
                a += qw.b(6, this.f);
            }
            if (this.g != null && this.g.length > 0) {
                i = 0;
                for (int c : this.g) {
                    i += qw.c(c);
                }
                a = (a + i) + (this.g.length * 1);
            }
            if (this.h != null && this.h.length > 0) {
                i2 = 0;
                i = 0;
                while (i3 < this.h.length) {
                    String str = this.h[i3];
                    if (str != null) {
                        i++;
                        i2 += qw.b(str);
                    }
                    i3++;
                }
                a = (a + i2) + (i * 1);
            }
            if (this.i != -1) {
                a += qw.f(9, this.i);
            }
            if (this.j != 0) {
                a += qw.c(10, this.j);
            }
            return !this.k.equals("") ? a + qw.b(11, this.k) : a;
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
                        a = qvVar.g();
                        switch (a) {
                            case 0:
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
                    case 16:
                        this.b = qvVar.f();
                        continue;
                    case 24:
                        a = qvVar.g();
                        switch (a) {
                            case 0:
                            case 100:
                            case 102:
                            case 104:
                            case 105:
                                this.c = a;
                                break;
                            default:
                                continue;
                        }
                    case 34:
                        this.d = qvVar.j();
                        continue;
                    case 42:
                        this.e = qvVar.j();
                        continue;
                    case 50:
                        this.f = qvVar.k();
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
                        int d = qvVar.d(qvVar.n());
                        b = qvVar.t();
                        a = 0;
                        while (qvVar.r() > 0) {
                            qvVar.g();
                            a++;
                        }
                        qvVar.f(b);
                        b = this.g == null ? 0 : this.g.length;
                        Object obj2 = new int[(a + b)];
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
                    case 66:
                        b = rg.b(qvVar, 66);
                        a = this.h == null ? 0 : this.h.length;
                        obj = new String[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.h, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = qvVar.j();
                            qvVar.a();
                            a++;
                        }
                        obj[a] = qvVar.j();
                        this.h = obj;
                        continue;
                    case 72:
                        this.i = qvVar.f();
                        continue;
                    case 80:
                        this.j = qvVar.g();
                        continue;
                    case 90:
                        this.k = qvVar.j();
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
                qwVar.a(1, this.a);
            }
            if (this.b != 0) {
                qwVar.b(2, this.b);
            }
            if (this.c != 0) {
                qwVar.a(3, this.c);
            }
            if (!this.d.equals("")) {
                qwVar.a(4, this.d);
            }
            if (!this.e.equals("")) {
                qwVar.a(5, this.e);
            }
            if (!Arrays.equals(this.f, rg.h)) {
                qwVar.a(6, this.f);
            }
            if (this.g != null && this.g.length > 0) {
                for (int a : this.g) {
                    qwVar.a(7, a);
                }
            }
            if (this.h != null && this.h.length > 0) {
                while (i < this.h.length) {
                    String str = this.h[i];
                    if (str != null) {
                        qwVar.a(8, str);
                    }
                    i++;
                }
            }
            if (this.i != -1) {
                qwVar.b(9, this.i);
            }
            if (this.j != 0) {
                qwVar.a(10, this.j);
            }
            if (!this.k.equals("")) {
                qwVar.a(11, this.k);
            }
            super.a(qwVar);
        }

        public d b() {
            this.a = 0;
            this.b = 0;
            this.c = 0;
            this.d = "";
            this.e = "";
            this.f = rg.h;
            this.g = rg.a;
            this.h = rg.f;
            this.i = -1;
            this.j = 0;
            this.k = "";
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
            if (this.e == null) {
                if (dVar.e != null) {
                    return false;
                }
            } else if (!this.e.equals(dVar.e)) {
                return false;
            }
            if (!Arrays.equals(this.f, dVar.f) || !rb.a(this.g, dVar.g) || !rb.a(this.h, dVar.h) || this.i != dVar.i || this.j != dVar.j) {
                return false;
            }
            if (this.k == null) {
                if (dVar.k != null) {
                    return false;
                }
            } else if (!this.k.equals(dVar.k)) {
                return false;
            }
            return (this.ag == null || this.ag.b()) ? dVar.ag == null || dVar.ag.b() : this.ag.equals(dVar.ag);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.k == null ? 0 : this.k.hashCode()) + (((((((((((((this.e == null ? 0 : this.e.hashCode()) + (((this.d == null ? 0 : this.d.hashCode()) + ((((((((getClass().getName().hashCode() + 527) * 31) + this.a) * 31) + ((int) (this.b ^ (this.b >>> 32)))) * 31) + this.c) * 31)) * 31)) * 31) + Arrays.hashCode(this.f)) * 31) + rb.a(this.g)) * 31) + rb.a(this.h)) * 31) + ((int) (this.i ^ (this.i >>> 32)))) * 31) + this.j) * 31)) * 31;
            if (!(this.ag == null || this.ag.b())) {
                i = this.ag.hashCode();
            }
            return hashCode + i;
        }
    }

    public static final class e extends qx<e> {
        public int a;
        public long b;
        public int c;

        public e() {
            b();
        }

        protected int a() {
            int a = super.a();
            if (this.a != 0) {
                a += qw.c(1, this.a);
            }
            if (this.b != 0) {
                a += qw.f(2, this.b);
            }
            return this.c != 0 ? a + qw.c(3, this.c) : a;
        }

        public e a(qv qvVar) {
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
                                this.a = a;
                                break;
                            default:
                                continue;
                        }
                    case 16:
                        this.b = qvVar.f();
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
            if (this.a != 0) {
                qwVar.a(1, this.a);
            }
            if (this.b != 0) {
                qwVar.b(2, this.b);
            }
            if (this.c != 0) {
                qwVar.a(3, this.c);
            }
            super.a(qwVar);
        }

        public e b() {
            this.a = 0;
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
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return (this.a == eVar.a && this.b == eVar.b && this.c == eVar.c) ? (this.ag == null || this.ag.b()) ? eVar.ag == null || eVar.ag.b() : this.ag.equals(eVar.ag) : false;
        }

        public int hashCode() {
            int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + this.a) * 31) + ((int) (this.b ^ (this.b >>> 32)))) * 31) + this.c) * 31;
            int hashCode2 = (this.ag == null || this.ag.b()) ? 0 : this.ag.hashCode();
            return hashCode2 + hashCode;
        }
    }
}
