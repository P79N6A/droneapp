package com.google.android.gms.internal;

public final class qa extends rd {
    private static volatile qa[] s;
    public int a;
    public qa[] b;
    public qt c;
    public qh d;
    public ql e;
    public pv f;
    public qp g;
    public qm h;
    public qk i;
    public pw j;
    public px k;
    public qi l;
    public qq m;
    public qu n;
    public qd o;
    public qe p;
    public qj q;
    public qn r;

    public qa() {
        c();
    }

    public static qa a(byte[] bArr) {
        return (qa) rd.a(new qa(), bArr);
    }

    public static qa[] b() {
        if (s == null) {
            synchronized (rb.c) {
                if (s == null) {
                    s = new qa[0];
                }
            }
        }
        return s;
    }

    protected int a() {
        int a = super.a();
        if (this.a != 0) {
            a += qw.c(1, this.a);
        }
        if (this.b != null && this.b.length > 0) {
            int i = a;
            for (rd rdVar : this.b) {
                if (rdVar != null) {
                    i += qw.c(2, rdVar);
                }
            }
            a = i;
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
        if (this.g != null) {
            a += qw.c(7, this.g);
        }
        if (this.h != null) {
            a += qw.c(8, this.h);
        }
        if (this.i != null) {
            a += qw.c(9, this.i);
        }
        if (this.j != null) {
            a += qw.c(10, this.j);
        }
        if (this.k != null) {
            a += qw.c(11, this.k);
        }
        if (this.l != null) {
            a += qw.c(12, this.l);
        }
        if (this.m != null) {
            a += qw.c(13, this.m);
        }
        if (this.n != null) {
            a += qw.c(14, this.n);
        }
        if (this.o != null) {
            a += qw.c(15, this.o);
        }
        if (this.p != null) {
            a += qw.c(16, this.p);
        }
        if (this.q != null) {
            a += qw.c(17, this.q);
        }
        return this.r != null ? a + qw.c(18, this.r) : a;
    }

    public qa a(qv qvVar) {
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
                            this.a = a;
                            break;
                        default:
                            continue;
                    }
                case 18:
                    int b = rg.b(qvVar, 18);
                    a = this.b == null ? 0 : this.b.length;
                    Object obj = new qa[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new qa();
                        qvVar.a(obj[a]);
                        qvVar.a();
                        a++;
                    }
                    obj[a] = new qa();
                    qvVar.a(obj[a]);
                    this.b = obj;
                    continue;
                case 26:
                    if (this.c == null) {
                        this.c = new qt();
                    }
                    qvVar.a(this.c);
                    continue;
                case 34:
                    if (this.d == null) {
                        this.d = new qh();
                    }
                    qvVar.a(this.d);
                    continue;
                case 42:
                    if (this.e == null) {
                        this.e = new ql();
                    }
                    qvVar.a(this.e);
                    continue;
                case 50:
                    if (this.f == null) {
                        this.f = new pv();
                    }
                    qvVar.a(this.f);
                    continue;
                case 58:
                    if (this.g == null) {
                        this.g = new qp();
                    }
                    qvVar.a(this.g);
                    continue;
                case 66:
                    if (this.h == null) {
                        this.h = new qm();
                    }
                    qvVar.a(this.h);
                    continue;
                case 74:
                    if (this.i == null) {
                        this.i = new qk();
                    }
                    qvVar.a(this.i);
                    continue;
                case 82:
                    if (this.j == null) {
                        this.j = new pw();
                    }
                    qvVar.a(this.j);
                    continue;
                case 90:
                    if (this.k == null) {
                        this.k = new px();
                    }
                    qvVar.a(this.k);
                    continue;
                case 98:
                    if (this.l == null) {
                        this.l = new qi();
                    }
                    qvVar.a(this.l);
                    continue;
                case 106:
                    if (this.m == null) {
                        this.m = new qq();
                    }
                    qvVar.a(this.m);
                    continue;
                case 114:
                    if (this.n == null) {
                        this.n = new qu();
                    }
                    qvVar.a(this.n);
                    continue;
                case 122:
                    if (this.o == null) {
                        this.o = new qd();
                    }
                    qvVar.a(this.o);
                    continue;
                case 130:
                    if (this.p == null) {
                        this.p = new qe();
                    }
                    qvVar.a(this.p);
                    continue;
                case 138:
                    if (this.q == null) {
                        this.q = new qj();
                    }
                    qvVar.a(this.q);
                    continue;
                case 146:
                    if (this.r == null) {
                        this.r = new qn();
                    }
                    qvVar.a(this.r);
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
        if (this.b != null && this.b.length > 0) {
            for (rd rdVar : this.b) {
                if (rdVar != null) {
                    qwVar.a(2, rdVar);
                }
            }
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
        if (this.h != null) {
            qwVar.a(8, this.h);
        }
        if (this.i != null) {
            qwVar.a(9, this.i);
        }
        if (this.j != null) {
            qwVar.a(10, this.j);
        }
        if (this.k != null) {
            qwVar.a(11, this.k);
        }
        if (this.l != null) {
            qwVar.a(12, this.l);
        }
        if (this.m != null) {
            qwVar.a(13, this.m);
        }
        if (this.n != null) {
            qwVar.a(14, this.n);
        }
        if (this.o != null) {
            qwVar.a(15, this.o);
        }
        if (this.p != null) {
            qwVar.a(16, this.p);
        }
        if (this.q != null) {
            qwVar.a(17, this.q);
        }
        if (this.r != null) {
            qwVar.a(18, this.r);
        }
        super.a(qwVar);
    }

    public /* synthetic */ rd b(qv qvVar) {
        return a(qvVar);
    }

    public qa c() {
        this.a = 0;
        this.b = b();
        this.c = null;
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
        this.ah = -1;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qa)) {
            return false;
        }
        qa qaVar = (qa) obj;
        if (this.a != qaVar.a) {
            return false;
        }
        if (!rb.a(this.b, qaVar.b)) {
            return false;
        }
        if (this.c == null) {
            if (qaVar.c != null) {
                return false;
            }
        } else if (!this.c.equals(qaVar.c)) {
            return false;
        }
        if (this.d == null) {
            if (qaVar.d != null) {
                return false;
            }
        } else if (!this.d.equals(qaVar.d)) {
            return false;
        }
        if (this.e == null) {
            if (qaVar.e != null) {
                return false;
            }
        } else if (!this.e.equals(qaVar.e)) {
            return false;
        }
        if (this.f == null) {
            if (qaVar.f != null) {
                return false;
            }
        } else if (!this.f.equals(qaVar.f)) {
            return false;
        }
        if (this.g == null) {
            if (qaVar.g != null) {
                return false;
            }
        } else if (!this.g.equals(qaVar.g)) {
            return false;
        }
        if (this.h == null) {
            if (qaVar.h != null) {
                return false;
            }
        } else if (!this.h.equals(qaVar.h)) {
            return false;
        }
        if (this.i == null) {
            if (qaVar.i != null) {
                return false;
            }
        } else if (!this.i.equals(qaVar.i)) {
            return false;
        }
        if (this.j == null) {
            if (qaVar.j != null) {
                return false;
            }
        } else if (!this.j.equals(qaVar.j)) {
            return false;
        }
        if (this.k == null) {
            if (qaVar.k != null) {
                return false;
            }
        } else if (!this.k.equals(qaVar.k)) {
            return false;
        }
        if (this.l == null) {
            if (qaVar.l != null) {
                return false;
            }
        } else if (!this.l.equals(qaVar.l)) {
            return false;
        }
        if (this.m == null) {
            if (qaVar.m != null) {
                return false;
            }
        } else if (!this.m.equals(qaVar.m)) {
            return false;
        }
        if (this.n == null) {
            if (qaVar.n != null) {
                return false;
            }
        } else if (!this.n.equals(qaVar.n)) {
            return false;
        }
        if (this.o == null) {
            if (qaVar.o != null) {
                return false;
            }
        } else if (!this.o.equals(qaVar.o)) {
            return false;
        }
        if (this.p == null) {
            if (qaVar.p != null) {
                return false;
            }
        } else if (!this.p.equals(qaVar.p)) {
            return false;
        }
        if (this.q == null) {
            if (qaVar.q != null) {
                return false;
            }
        } else if (!this.q.equals(qaVar.q)) {
            return false;
        }
        return this.r == null ? qaVar.r == null : this.r.equals(qaVar.r);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.q == null ? 0 : this.q.hashCode()) + (((this.p == null ? 0 : this.p.hashCode()) + (((this.o == null ? 0 : this.o.hashCode()) + (((this.n == null ? 0 : this.n.hashCode()) + (((this.m == null ? 0 : this.m.hashCode()) + (((this.l == null ? 0 : this.l.hashCode()) + (((this.k == null ? 0 : this.k.hashCode()) + (((this.j == null ? 0 : this.j.hashCode()) + (((this.i == null ? 0 : this.i.hashCode()) + (((this.h == null ? 0 : this.h.hashCode()) + (((this.g == null ? 0 : this.g.hashCode()) + (((this.f == null ? 0 : this.f.hashCode()) + (((this.e == null ? 0 : this.e.hashCode()) + (((this.d == null ? 0 : this.d.hashCode()) + (((this.c == null ? 0 : this.c.hashCode()) + ((((((getClass().getName().hashCode() + 527) * 31) + this.a) * 31) + rb.a(this.b)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        if (this.r != null) {
            i = this.r.hashCode();
        }
        return hashCode + i;
    }
}
