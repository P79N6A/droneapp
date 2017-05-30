package com.google.android.gms.internal;

public final class qi extends rd {
    public int a;
    public long b;
    public int[] c;
    public int[] d;

    public qi() {
        b();
    }

    protected int a() {
        int i;
        int i2 = 0;
        int a = super.a();
        if (this.a != 0) {
            a += qw.c(1, this.a);
        }
        if (this.b != 0) {
            a += qw.f(2, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            int i3 = 0;
            for (int c : this.c) {
                i3 += qw.c(c);
            }
            a = (a + i3) + (this.c.length * 1);
        }
        if (this.d == null || this.d.length <= 0) {
            return a;
        }
        i = 0;
        while (i2 < this.d.length) {
            i += qw.c(this.d[i2]);
            i2++;
        }
        return (a + i) + (this.d.length * 1);
    }

    public qi a(qv qvVar) {
        while (true) {
            int a = qvVar.a();
            int b;
            Object obj;
            int i;
            int i2;
            int g;
            Object obj2;
            Object obj3;
            int g2;
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
                            this.a = a;
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.b = qvVar.f();
                    continue;
                case 24:
                    b = rg.b(qvVar, 24);
                    obj = new int[b];
                    i = 0;
                    i2 = 0;
                    while (i < b) {
                        if (i != 0) {
                            qvVar.a();
                        }
                        g = qvVar.g();
                        switch (g) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                                a = i2 + 1;
                                obj[i2] = g;
                                break;
                            default:
                                a = i2;
                                break;
                        }
                        i++;
                        i2 = a;
                    }
                    if (i2 != 0) {
                        a = this.c == null ? 0 : this.c.length;
                        if (a != 0 || i2 != b) {
                            obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.c, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.c = obj2;
                            break;
                        }
                        this.c = obj;
                        break;
                    }
                    continue;
                case 26:
                    i = qvVar.d(qvVar.n());
                    i2 = qvVar.t();
                    a = 0;
                    while (qvVar.r() > 0) {
                        switch (qvVar.g()) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        qvVar.f(i2);
                        i2 = this.c == null ? 0 : this.c.length;
                        obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.c, 0, obj3, 0, i2);
                        }
                        while (qvVar.r() > 0) {
                            g2 = qvVar.g();
                            switch (g2) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                    a = i2 + 1;
                                    obj3[i2] = g2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.c = obj3;
                    }
                    qvVar.e(i);
                    continue;
                case 32:
                    b = rg.b(qvVar, 32);
                    obj = new int[b];
                    i = 0;
                    i2 = 0;
                    while (i < b) {
                        if (i != 0) {
                            qvVar.a();
                        }
                        g = qvVar.g();
                        switch (g) {
                            case 0:
                            case 1:
                            case 2:
                                a = i2 + 1;
                                obj[i2] = g;
                                break;
                            default:
                                a = i2;
                                break;
                        }
                        i++;
                        i2 = a;
                    }
                    if (i2 != 0) {
                        a = this.d == null ? 0 : this.d.length;
                        if (a != 0 || i2 != b) {
                            obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.d, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.d = obj2;
                            break;
                        }
                        this.d = obj;
                        break;
                    }
                    continue;
                case 34:
                    i = qvVar.d(qvVar.n());
                    i2 = qvVar.t();
                    a = 0;
                    while (qvVar.r() > 0) {
                        switch (qvVar.g()) {
                            case 0:
                            case 1:
                            case 2:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        qvVar.f(i2);
                        i2 = this.d == null ? 0 : this.d.length;
                        obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.d, 0, obj3, 0, i2);
                        }
                        while (qvVar.r() > 0) {
                            g2 = qvVar.g();
                            switch (g2) {
                                case 0:
                                case 1:
                                case 2:
                                    a = i2 + 1;
                                    obj3[i2] = g2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.d = obj3;
                    }
                    qvVar.e(i);
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
        if (this.a != 0) {
            qwVar.a(1, this.a);
        }
        if (this.b != 0) {
            qwVar.b(2, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            for (int a : this.c) {
                qwVar.a(3, a);
            }
        }
        if (this.d != null && this.d.length > 0) {
            while (i < this.d.length) {
                qwVar.a(4, this.d[i]);
                i++;
            }
        }
        super.a(qwVar);
    }

    public qi b() {
        this.a = 0;
        this.b = 0;
        this.c = rg.a;
        this.d = rg.a;
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
        if (!(obj instanceof qi)) {
            return false;
        }
        qi qiVar = (qi) obj;
        return this.a != qiVar.a ? false : this.b != qiVar.b ? false : !rb.a(this.c, qiVar.c) ? false : rb.a(this.d, qiVar.d);
    }

    public int hashCode() {
        return ((((((((getClass().getName().hashCode() + 527) * 31) + this.a) * 31) + ((int) (this.b ^ (this.b >>> 32)))) * 31) + rb.a(this.c)) * 31) + rb.a(this.d);
    }
}
