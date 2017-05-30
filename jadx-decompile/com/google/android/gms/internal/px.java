package com.google.android.gms.internal;

import java.util.Arrays;

public final class px extends rd {
    public int a;
    public long b;
    public a[] c;

    public static final class a extends rd {
        private static volatile a[] d;
        public String a;
        public String b;
        public byte[] c;

        public a() {
            c();
        }

        public static a a(byte[] bArr) {
            return (a) rd.a(new a(), bArr);
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
            return !Arrays.equals(this.c, rg.h) ? a + qw.b(3, this.c) : a;
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
                        this.c = qvVar.k();
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
            if (!this.a.equals("")) {
                qwVar.a(1, this.a);
            }
            if (!this.b.equals("")) {
                qwVar.a(2, this.b);
            }
            if (!Arrays.equals(this.c, rg.h)) {
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
            this.c = rg.h;
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
            return Arrays.equals(this.c, aVar.c);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31;
            if (this.b != null) {
                i = this.b.hashCode();
            }
            return ((hashCode + i) * 31) + Arrays.hashCode(this.c);
        }
    }

    public px() {
        b();
    }

    protected int a() {
        int a = super.a();
        if (this.a != 0) {
            a += qw.c(1, this.a);
        }
        if (this.b != 0) {
            a += qw.f(3, this.b);
        }
        if (this.c == null || this.c.length <= 0) {
            return a;
        }
        int i = a;
        for (rd rdVar : this.c) {
            if (rdVar != null) {
                i += qw.c(4, rdVar);
            }
        }
        return i;
    }

    public px a(qv qvVar) {
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
                case 24:
                    this.b = qvVar.f();
                    continue;
                case 34:
                    int b = rg.b(qvVar, 34);
                    a = this.c == null ? 0 : this.c.length;
                    Object obj = new a[(b + a)];
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
        if (this.a != 0) {
            qwVar.a(1, this.a);
        }
        if (this.b != 0) {
            qwVar.b(3, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            for (rd rdVar : this.c) {
                if (rdVar != null) {
                    qwVar.a(4, rdVar);
                }
            }
        }
        super.a(qwVar);
    }

    public px b() {
        this.a = 0;
        this.b = 0;
        this.c = a.b();
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
        if (!(obj instanceof px)) {
            return false;
        }
        px pxVar = (px) obj;
        return this.a != pxVar.a ? false : this.b != pxVar.b ? false : rb.a(this.c, pxVar.c);
    }

    public int hashCode() {
        return ((((((getClass().getName().hashCode() + 527) * 31) + this.a) * 31) + ((int) (this.b ^ (this.b >>> 32)))) * 31) + rb.a(this.c);
    }
}
