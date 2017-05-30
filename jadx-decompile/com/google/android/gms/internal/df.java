package com.google.android.gms.internal;

import com.facebook.imagepipeline.memory.BitmapCounterProvider;
import com.facebook.imageutils.JfifUtil;
import com.facebook.imageutils.TiffUtil;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;

public interface df {

    public static final class a extends qx<a> {
        public Long A;
        public String B;
        public Long C;
        public Long D;
        public Long E;
        public b F;
        public Long G;
        public Long H;
        public Long I;
        public Long J;
        public Long K;
        public Long L;
        public String M;
        public String N;
        public Integer O;
        public Integer P;
        public Long Q;
        public Long R;
        public Long S;
        public Long T;
        public Long U;
        public Integer V;
        public a W;
        public a[] X;
        public b Y;
        public Long Z;
        public String a;
        public String aa;
        public Integer ab;
        public Boolean ac;
        public String ad;
        public Long ae;
        public e af;
        public String b;
        public Long c;
        public Long d;
        public Long e;
        public Long f;
        public Long g;
        public Long h;
        public Long i;
        public Long j;
        public Long k;
        public Long l;
        public String m;
        public Long n;
        public Long o;
        public Long p;
        public Long q;
        public Long r;
        public Long s;
        public Long t;
        public Long u;
        public Long v;
        public String w;
        public String x;
        public Long y;
        public Long z;

        public static final class a extends qx<a> {
            private static volatile a[] m;
            public Long a;
            public Long b;
            public Long c;
            public Long d;
            public Long e;
            public Long f;
            public Integer g;
            public Long h;
            public Long i;
            public Long j;
            public Integer k;
            public Long l;

            public a() {
                this.a = null;
                this.b = null;
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
                this.ah = -1;
            }

            public static a[] b() {
                if (m == null) {
                    synchronized (rb.c) {
                        if (m == null) {
                            m = new a[0];
                        }
                    }
                }
                return m;
            }

            protected int a() {
                int a = super.a();
                if (this.a != null) {
                    a += qw.f(1, this.a.longValue());
                }
                if (this.b != null) {
                    a += qw.f(2, this.b.longValue());
                }
                if (this.c != null) {
                    a += qw.f(3, this.c.longValue());
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
                if (this.g != null) {
                    a += qw.c(7, this.g.intValue());
                }
                if (this.h != null) {
                    a += qw.f(8, this.h.longValue());
                }
                if (this.i != null) {
                    a += qw.f(9, this.i.longValue());
                }
                if (this.j != null) {
                    a += qw.f(10, this.j.longValue());
                }
                if (this.k != null) {
                    a += qw.c(11, this.k.intValue());
                }
                return this.l != null ? a + qw.f(12, this.l.longValue()) : a;
            }

            public a a(qv qvVar) {
                while (true) {
                    int a = qvVar.a();
                    switch (a) {
                        case 0:
                            break;
                        case 8:
                            this.a = Long.valueOf(qvVar.f());
                            continue;
                        case 16:
                            this.b = Long.valueOf(qvVar.f());
                            continue;
                        case 24:
                            this.c = Long.valueOf(qvVar.f());
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
                            a = qvVar.g();
                            switch (a) {
                                case 0:
                                case 1:
                                case 2:
                                case 1000:
                                    this.g = Integer.valueOf(a);
                                    break;
                                default:
                                    continue;
                            }
                        case 64:
                            this.h = Long.valueOf(qvVar.f());
                            continue;
                        case 72:
                            this.i = Long.valueOf(qvVar.f());
                            continue;
                        case 80:
                            this.j = Long.valueOf(qvVar.f());
                            continue;
                        case 88:
                            a = qvVar.g();
                            switch (a) {
                                case 0:
                                case 1:
                                case 2:
                                case 1000:
                                    this.k = Integer.valueOf(a);
                                    break;
                                default:
                                    continue;
                            }
                        case 96:
                            this.l = Long.valueOf(qvVar.f());
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
                    qwVar.b(1, this.a.longValue());
                }
                if (this.b != null) {
                    qwVar.b(2, this.b.longValue());
                }
                if (this.c != null) {
                    qwVar.b(3, this.c.longValue());
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
                if (this.g != null) {
                    qwVar.a(7, this.g.intValue());
                }
                if (this.h != null) {
                    qwVar.b(8, this.h.longValue());
                }
                if (this.i != null) {
                    qwVar.b(9, this.i.longValue());
                }
                if (this.j != null) {
                    qwVar.b(10, this.j.longValue());
                }
                if (this.k != null) {
                    qwVar.a(11, this.k.intValue());
                }
                if (this.l != null) {
                    qwVar.b(12, this.l.longValue());
                }
                super.a(qwVar);
            }

            public /* synthetic */ rd b(qv qvVar) {
                return a(qvVar);
            }
        }

        public static final class b extends qx<b> {
            public Long a;
            public Long b;
            public Long c;

            public b() {
                this.a = null;
                this.b = null;
                this.c = null;
                this.ah = -1;
            }

            protected int a() {
                int a = super.a();
                if (this.a != null) {
                    a += qw.f(1, this.a.longValue());
                }
                if (this.b != null) {
                    a += qw.f(2, this.b.longValue());
                }
                return this.c != null ? a + qw.f(3, this.c.longValue()) : a;
            }

            public b a(qv qvVar) {
                while (true) {
                    int a = qvVar.a();
                    switch (a) {
                        case 0:
                            break;
                        case 8:
                            this.a = Long.valueOf(qvVar.f());
                            continue;
                        case 16:
                            this.b = Long.valueOf(qvVar.f());
                            continue;
                        case 24:
                            this.c = Long.valueOf(qvVar.f());
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
                    qwVar.b(1, this.a.longValue());
                }
                if (this.b != null) {
                    qwVar.b(2, this.b.longValue());
                }
                if (this.c != null) {
                    qwVar.b(3, this.c.longValue());
                }
                super.a(qwVar);
            }

            public /* synthetic */ rd b(qv qvVar) {
                return a(qvVar);
            }
        }

        public a() {
            this.a = null;
            this.b = null;
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
            this.s = null;
            this.t = null;
            this.u = null;
            this.v = null;
            this.w = null;
            this.x = null;
            this.y = null;
            this.z = null;
            this.A = null;
            this.B = null;
            this.C = null;
            this.D = null;
            this.E = null;
            this.G = null;
            this.H = null;
            this.I = null;
            this.J = null;
            this.K = null;
            this.L = null;
            this.M = null;
            this.N = null;
            this.O = null;
            this.P = null;
            this.Q = null;
            this.R = null;
            this.S = null;
            this.T = null;
            this.U = null;
            this.V = null;
            this.X = a.b();
            this.Z = null;
            this.aa = null;
            this.ab = null;
            this.ac = null;
            this.ad = null;
            this.ae = null;
            this.ah = -1;
        }

        public static a a(byte[] bArr) {
            return (a) rd.a(new a(), bArr);
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
                a += qw.f(4, this.d.longValue());
            }
            if (this.e != null) {
                a += qw.f(5, this.e.longValue());
            }
            if (this.f != null) {
                a += qw.f(6, this.f.longValue());
            }
            if (this.g != null) {
                a += qw.f(7, this.g.longValue());
            }
            if (this.h != null) {
                a += qw.f(8, this.h.longValue());
            }
            if (this.i != null) {
                a += qw.f(9, this.i.longValue());
            }
            if (this.j != null) {
                a += qw.f(10, this.j.longValue());
            }
            if (this.k != null) {
                a += qw.f(11, this.k.longValue());
            }
            if (this.l != null) {
                a += qw.f(12, this.l.longValue());
            }
            if (this.m != null) {
                a += qw.b(13, this.m);
            }
            if (this.n != null) {
                a += qw.f(14, this.n.longValue());
            }
            if (this.o != null) {
                a += qw.f(15, this.o.longValue());
            }
            if (this.p != null) {
                a += qw.f(16, this.p.longValue());
            }
            if (this.q != null) {
                a += qw.f(17, this.q.longValue());
            }
            if (this.r != null) {
                a += qw.f(18, this.r.longValue());
            }
            if (this.s != null) {
                a += qw.f(19, this.s.longValue());
            }
            if (this.t != null) {
                a += qw.f(20, this.t.longValue());
            }
            if (this.Z != null) {
                a += qw.f(21, this.Z.longValue());
            }
            if (this.u != null) {
                a += qw.f(22, this.u.longValue());
            }
            if (this.v != null) {
                a += qw.f(23, this.v.longValue());
            }
            if (this.aa != null) {
                a += qw.b(24, this.aa);
            }
            if (this.ae != null) {
                a += qw.f(25, this.ae.longValue());
            }
            if (this.ab != null) {
                a += qw.c(26, this.ab.intValue());
            }
            if (this.w != null) {
                a += qw.b(27, this.w);
            }
            if (this.ac != null) {
                a += qw.b(28, this.ac.booleanValue());
            }
            if (this.x != null) {
                a += qw.b(29, this.x);
            }
            if (this.ad != null) {
                a += qw.b(30, this.ad);
            }
            if (this.y != null) {
                a += qw.f(31, this.y.longValue());
            }
            if (this.z != null) {
                a += qw.f(32, this.z.longValue());
            }
            if (this.A != null) {
                a += qw.f(33, this.A.longValue());
            }
            if (this.B != null) {
                a += qw.b(34, this.B);
            }
            if (this.C != null) {
                a += qw.f(35, this.C.longValue());
            }
            if (this.D != null) {
                a += qw.f(36, this.D.longValue());
            }
            if (this.E != null) {
                a += qw.f(37, this.E.longValue());
            }
            if (this.F != null) {
                a += qw.c(38, this.F);
            }
            if (this.G != null) {
                a += qw.f(39, this.G.longValue());
            }
            if (this.H != null) {
                a += qw.f(40, this.H.longValue());
            }
            if (this.I != null) {
                a += qw.f(41, this.I.longValue());
            }
            if (this.J != null) {
                a += qw.f(42, this.J.longValue());
            }
            if (this.X != null && this.X.length > 0) {
                int i = a;
                for (rd rdVar : this.X) {
                    if (rdVar != null) {
                        i += qw.c(43, rdVar);
                    }
                }
                a = i;
            }
            if (this.K != null) {
                a += qw.f(44, this.K.longValue());
            }
            if (this.L != null) {
                a += qw.f(45, this.L.longValue());
            }
            if (this.M != null) {
                a += qw.b(46, this.M);
            }
            if (this.N != null) {
                a += qw.b(47, this.N);
            }
            if (this.O != null) {
                a += qw.c(48, this.O.intValue());
            }
            if (this.P != null) {
                a += qw.c(49, this.P.intValue());
            }
            if (this.W != null) {
                a += qw.c(50, this.W);
            }
            if (this.Q != null) {
                a += qw.f(51, this.Q.longValue());
            }
            if (this.R != null) {
                a += qw.f(52, this.R.longValue());
            }
            if (this.S != null) {
                a += qw.f(53, this.S.longValue());
            }
            if (this.T != null) {
                a += qw.f(54, this.T.longValue());
            }
            if (this.U != null) {
                a += qw.f(55, this.U.longValue());
            }
            if (this.V != null) {
                a += qw.c(56, this.V.intValue());
            }
            if (this.Y != null) {
                a += qw.c(57, this.Y);
            }
            return this.af != null ? a + qw.c(201, this.af) : a;
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
                        this.c = Long.valueOf(qvVar.f());
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
                        this.g = Long.valueOf(qvVar.f());
                        continue;
                    case 64:
                        this.h = Long.valueOf(qvVar.f());
                        continue;
                    case 72:
                        this.i = Long.valueOf(qvVar.f());
                        continue;
                    case 80:
                        this.j = Long.valueOf(qvVar.f());
                        continue;
                    case 88:
                        this.k = Long.valueOf(qvVar.f());
                        continue;
                    case 96:
                        this.l = Long.valueOf(qvVar.f());
                        continue;
                    case 106:
                        this.m = qvVar.j();
                        continue;
                    case 112:
                        this.n = Long.valueOf(qvVar.f());
                        continue;
                    case 120:
                        this.o = Long.valueOf(qvVar.f());
                        continue;
                    case 128:
                        this.p = Long.valueOf(qvVar.f());
                        continue;
                    case 136:
                        this.q = Long.valueOf(qvVar.f());
                        continue;
                    case 144:
                        this.r = Long.valueOf(qvVar.f());
                        continue;
                    case 152:
                        this.s = Long.valueOf(qvVar.f());
                        continue;
                    case 160:
                        this.t = Long.valueOf(qvVar.f());
                        continue;
                    case Opcodes.JSR /*168*/:
                        this.Z = Long.valueOf(qvVar.f());
                        continue;
                    case 176:
                        this.u = Long.valueOf(qvVar.f());
                        continue;
                    case Opcodes.INVOKESTATIC /*184*/:
                        this.v = Long.valueOf(qvVar.f());
                        continue;
                    case Opcodes.MONITORENTER /*194*/:
                        this.aa = qvVar.j();
                        continue;
                    case 200:
                        this.ae = Long.valueOf(qvVar.f());
                        continue;
                    case JfifUtil.MARKER_RST0 /*208*/:
                        a = qvVar.g();
                        switch (a) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                this.ab = Integer.valueOf(a);
                                break;
                            default:
                                continue;
                        }
                    case JfifUtil.MARKER_SOS /*218*/:
                        this.w = qvVar.j();
                        continue;
                    case 224:
                        this.ac = Boolean.valueOf(qvVar.i());
                        continue;
                    case 234:
                        this.x = qvVar.j();
                        continue;
                    case 242:
                        this.ad = qvVar.j();
                        continue;
                    case 248:
                        this.y = Long.valueOf(qvVar.f());
                        continue;
                    case 256:
                        this.z = Long.valueOf(qvVar.f());
                        continue;
                    case 264:
                        this.A = Long.valueOf(qvVar.f());
                        continue;
                    case TiffUtil.TIFF_TAG_ORIENTATION /*274*/:
                        this.B = qvVar.j();
                        continue;
                    case 280:
                        this.C = Long.valueOf(qvVar.f());
                        continue;
                    case 288:
                        this.D = Long.valueOf(qvVar.f());
                        continue;
                    case 296:
                        this.E = Long.valueOf(qvVar.f());
                        continue;
                    case 306:
                        if (this.F == null) {
                            this.F = new b();
                        }
                        qvVar.a(this.F);
                        continue;
                    case 312:
                        this.G = Long.valueOf(qvVar.f());
                        continue;
                    case 320:
                        this.H = Long.valueOf(qvVar.f());
                        continue;
                    case 328:
                        this.I = Long.valueOf(qvVar.f());
                        continue;
                    case 336:
                        this.J = Long.valueOf(qvVar.f());
                        continue;
                    case 346:
                        int b = rg.b(qvVar, 346);
                        a = this.X == null ? 0 : this.X.length;
                        Object obj = new a[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.X, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new a();
                            qvVar.a(obj[a]);
                            qvVar.a();
                            a++;
                        }
                        obj[a] = new a();
                        qvVar.a(obj[a]);
                        this.X = obj;
                        continue;
                    case 352:
                        this.K = Long.valueOf(qvVar.f());
                        continue;
                    case 360:
                        this.L = Long.valueOf(qvVar.f());
                        continue;
                    case 370:
                        this.M = qvVar.j();
                        continue;
                    case 378:
                        this.N = qvVar.j();
                        continue;
                    case BitmapCounterProvider.MAX_BITMAP_COUNT /*384*/:
                        a = qvVar.g();
                        switch (a) {
                            case 0:
                            case 1:
                            case 2:
                            case 1000:
                                this.O = Integer.valueOf(a);
                                break;
                            default:
                                continue;
                        }
                    case 392:
                        a = qvVar.g();
                        switch (a) {
                            case 0:
                            case 1:
                            case 2:
                            case 1000:
                                this.P = Integer.valueOf(a);
                                break;
                            default:
                                continue;
                        }
                    case com.google.android.gms.wallet.e.i /*402*/:
                        if (this.W == null) {
                            this.W = new a();
                        }
                        qvVar.a(this.W);
                        continue;
                    case 408:
                        this.Q = Long.valueOf(qvVar.f());
                        continue;
                    case 416:
                        this.R = Long.valueOf(qvVar.f());
                        continue;
                    case 424:
                        this.S = Long.valueOf(qvVar.f());
                        continue;
                    case 432:
                        this.T = Long.valueOf(qvVar.f());
                        continue;
                    case 440:
                        this.U = Long.valueOf(qvVar.f());
                        continue;
                    case 448:
                        a = qvVar.g();
                        switch (a) {
                            case 0:
                            case 1:
                            case 2:
                            case 1000:
                                this.V = Integer.valueOf(a);
                                break;
                            default:
                                continue;
                        }
                    case 458:
                        if (this.Y == null) {
                            this.Y = new b();
                        }
                        qvVar.a(this.Y);
                        continue;
                    case 1610:
                        if (this.af == null) {
                            this.af = new e();
                        }
                        qvVar.a(this.af);
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
                qwVar.b(3, this.c.longValue());
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
            if (this.g != null) {
                qwVar.b(7, this.g.longValue());
            }
            if (this.h != null) {
                qwVar.b(8, this.h.longValue());
            }
            if (this.i != null) {
                qwVar.b(9, this.i.longValue());
            }
            if (this.j != null) {
                qwVar.b(10, this.j.longValue());
            }
            if (this.k != null) {
                qwVar.b(11, this.k.longValue());
            }
            if (this.l != null) {
                qwVar.b(12, this.l.longValue());
            }
            if (this.m != null) {
                qwVar.a(13, this.m);
            }
            if (this.n != null) {
                qwVar.b(14, this.n.longValue());
            }
            if (this.o != null) {
                qwVar.b(15, this.o.longValue());
            }
            if (this.p != null) {
                qwVar.b(16, this.p.longValue());
            }
            if (this.q != null) {
                qwVar.b(17, this.q.longValue());
            }
            if (this.r != null) {
                qwVar.b(18, this.r.longValue());
            }
            if (this.s != null) {
                qwVar.b(19, this.s.longValue());
            }
            if (this.t != null) {
                qwVar.b(20, this.t.longValue());
            }
            if (this.Z != null) {
                qwVar.b(21, this.Z.longValue());
            }
            if (this.u != null) {
                qwVar.b(22, this.u.longValue());
            }
            if (this.v != null) {
                qwVar.b(23, this.v.longValue());
            }
            if (this.aa != null) {
                qwVar.a(24, this.aa);
            }
            if (this.ae != null) {
                qwVar.b(25, this.ae.longValue());
            }
            if (this.ab != null) {
                qwVar.a(26, this.ab.intValue());
            }
            if (this.w != null) {
                qwVar.a(27, this.w);
            }
            if (this.ac != null) {
                qwVar.a(28, this.ac.booleanValue());
            }
            if (this.x != null) {
                qwVar.a(29, this.x);
            }
            if (this.ad != null) {
                qwVar.a(30, this.ad);
            }
            if (this.y != null) {
                qwVar.b(31, this.y.longValue());
            }
            if (this.z != null) {
                qwVar.b(32, this.z.longValue());
            }
            if (this.A != null) {
                qwVar.b(33, this.A.longValue());
            }
            if (this.B != null) {
                qwVar.a(34, this.B);
            }
            if (this.C != null) {
                qwVar.b(35, this.C.longValue());
            }
            if (this.D != null) {
                qwVar.b(36, this.D.longValue());
            }
            if (this.E != null) {
                qwVar.b(37, this.E.longValue());
            }
            if (this.F != null) {
                qwVar.a(38, this.F);
            }
            if (this.G != null) {
                qwVar.b(39, this.G.longValue());
            }
            if (this.H != null) {
                qwVar.b(40, this.H.longValue());
            }
            if (this.I != null) {
                qwVar.b(41, this.I.longValue());
            }
            if (this.J != null) {
                qwVar.b(42, this.J.longValue());
            }
            if (this.X != null && this.X.length > 0) {
                for (rd rdVar : this.X) {
                    if (rdVar != null) {
                        qwVar.a(43, rdVar);
                    }
                }
            }
            if (this.K != null) {
                qwVar.b(44, this.K.longValue());
            }
            if (this.L != null) {
                qwVar.b(45, this.L.longValue());
            }
            if (this.M != null) {
                qwVar.a(46, this.M);
            }
            if (this.N != null) {
                qwVar.a(47, this.N);
            }
            if (this.O != null) {
                qwVar.a(48, this.O.intValue());
            }
            if (this.P != null) {
                qwVar.a(49, this.P.intValue());
            }
            if (this.W != null) {
                qwVar.a(50, this.W);
            }
            if (this.Q != null) {
                qwVar.b(51, this.Q.longValue());
            }
            if (this.R != null) {
                qwVar.b(52, this.R.longValue());
            }
            if (this.S != null) {
                qwVar.b(53, this.S.longValue());
            }
            if (this.T != null) {
                qwVar.b(54, this.T.longValue());
            }
            if (this.U != null) {
                qwVar.b(55, this.U.longValue());
            }
            if (this.V != null) {
                qwVar.a(56, this.V.intValue());
            }
            if (this.Y != null) {
                qwVar.a(57, this.Y);
            }
            if (this.af != null) {
                qwVar.a(201, this.af);
            }
            super.a(qwVar);
        }

        public /* synthetic */ rd b(qv qvVar) {
            return a(qvVar);
        }
    }

    public static final class b extends qx<b> {
        public Long a;
        public Integer b;
        public Boolean c;
        public int[] d;
        public Long e;

        public b() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = rg.a;
            this.e = null;
            this.ah = -1;
        }

        protected int a() {
            int i = 0;
            int a = super.a();
            if (this.a != null) {
                a += qw.f(1, this.a.longValue());
            }
            if (this.b != null) {
                a += qw.c(2, this.b.intValue());
            }
            if (this.c != null) {
                a += qw.b(3, this.c.booleanValue());
            }
            if (this.d != null && this.d.length > 0) {
                int i2 = 0;
                while (i < this.d.length) {
                    i2 += qw.c(this.d[i]);
                    i++;
                }
                a = (a + i2) + (this.d.length * 1);
            }
            return this.e != null ? a + qw.e(5, this.e.longValue()) : a;
        }

        public b a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                int b;
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        this.a = Long.valueOf(qvVar.f());
                        continue;
                    case 16:
                        this.b = Integer.valueOf(qvVar.g());
                        continue;
                    case 24:
                        this.c = Boolean.valueOf(qvVar.i());
                        continue;
                    case 32:
                        b = rg.b(qvVar, 32);
                        a = this.d == null ? 0 : this.d.length;
                        Object obj = new int[(b + a)];
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
                        int d = qvVar.d(qvVar.n());
                        b = qvVar.t();
                        a = 0;
                        while (qvVar.r() > 0) {
                            qvVar.g();
                            a++;
                        }
                        qvVar.f(b);
                        b = this.d == null ? 0 : this.d.length;
                        Object obj2 = new int[(a + b)];
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
                        this.e = Long.valueOf(qvVar.e());
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
                qwVar.b(1, this.a.longValue());
            }
            if (this.b != null) {
                qwVar.a(2, this.b.intValue());
            }
            if (this.c != null) {
                qwVar.a(3, this.c.booleanValue());
            }
            if (this.d != null && this.d.length > 0) {
                for (int a : this.d) {
                    qwVar.a(4, a);
                }
            }
            if (this.e != null) {
                qwVar.a(5, this.e.longValue());
            }
            super.a(qwVar);
        }

        public /* synthetic */ rd b(qv qvVar) {
            return a(qvVar);
        }
    }

    public static final class c extends qx<c> {
        public byte[] a;
        public byte[] b;

        public c() {
            this.a = null;
            this.b = null;
            this.ah = -1;
        }

        protected int a() {
            int a = super.a();
            if (this.a != null) {
                a += qw.b(1, this.a);
            }
            return this.b != null ? a + qw.b(2, this.b) : a;
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
            if (this.a != null) {
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
    }

    public static final class d extends qx<d> {
        public byte[] a;
        public byte[] b;
        public byte[] c;
        public byte[] d;

        public d() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.ah = -1;
        }

        public static d a(byte[] bArr) {
            return (d) rd.a(new d(), bArr);
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
                a += qw.b(3, this.c);
            }
            return this.d != null ? a + qw.b(4, this.d) : a;
        }

        public d a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        this.a = qvVar.k();
                        continue;
                    case 18:
                        this.b = qvVar.k();
                        continue;
                    case 26:
                        this.c = qvVar.k();
                        continue;
                    case 34:
                        this.d = qvVar.k();
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
            super.a(qwVar);
        }

        public /* synthetic */ rd b(qv qvVar) {
            return a(qvVar);
        }
    }

    public static final class e extends qx<e> {
        public Long a;
        public String b;
        public byte[] c;

        public e() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.ah = -1;
        }

        protected int a() {
            int a = super.a();
            if (this.a != null) {
                a += qw.f(1, this.a.longValue());
            }
            if (this.b != null) {
                a += qw.b(3, this.b);
            }
            return this.c != null ? a + qw.b(4, this.c) : a;
        }

        public e a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 8:
                        this.a = Long.valueOf(qvVar.f());
                        continue;
                    case 26:
                        this.b = qvVar.j();
                        continue;
                    case 34:
                        this.c = qvVar.k();
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
                qwVar.b(1, this.a.longValue());
            }
            if (this.b != null) {
                qwVar.a(3, this.b);
            }
            if (this.c != null) {
                qwVar.a(4, this.c);
            }
            super.a(qwVar);
        }

        public /* synthetic */ rd b(qv qvVar) {
            return a(qvVar);
        }
    }

    public static final class f extends qx<f> {
        public byte[][] a;
        public byte[] b;
        public Integer c;
        public Integer d;

        public f() {
            this.a = rg.g;
            this.b = null;
            this.c = null;
            this.d = null;
            this.ah = -1;
        }

        protected int a() {
            int i = 0;
            int a = super.a();
            if (this.a == null || this.a.length <= 0) {
                i = a;
            } else {
                int i2 = 0;
                int i3 = 0;
                while (i < this.a.length) {
                    byte[] bArr = this.a[i];
                    if (bArr != null) {
                        i3++;
                        i2 += qw.c(bArr);
                    }
                    i++;
                }
                i = (a + i2) + (i3 * 1);
            }
            if (this.b != null) {
                i += qw.b(2, this.b);
            }
            if (this.c != null) {
                i += qw.c(3, this.c.intValue());
            }
            return this.d != null ? i + qw.c(4, this.d.intValue()) : i;
        }

        public f a(qv qvVar) {
            while (true) {
                int a = qvVar.a();
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        int b = rg.b(qvVar, 10);
                        a = this.a == null ? 0 : this.a.length;
                        Object obj = new byte[(b + a)][];
                        if (a != 0) {
                            System.arraycopy(this.a, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = qvVar.k();
                            qvVar.a();
                            a++;
                        }
                        obj[a] = qvVar.k();
                        this.a = obj;
                        continue;
                    case 18:
                        this.b = qvVar.k();
                        continue;
                    case 24:
                        a = qvVar.g();
                        switch (a) {
                            case 0:
                            case 1:
                                this.c = Integer.valueOf(a);
                                break;
                            default:
                                continue;
                        }
                    case 32:
                        a = qvVar.g();
                        switch (a) {
                            case 0:
                            case 1:
                                this.d = Integer.valueOf(a);
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
            if (this.a != null && this.a.length > 0) {
                for (byte[] bArr : this.a) {
                    if (bArr != null) {
                        qwVar.a(1, bArr);
                    }
                }
            }
            if (this.b != null) {
                qwVar.a(2, this.b);
            }
            if (this.c != null) {
                qwVar.a(3, this.c.intValue());
            }
            if (this.d != null) {
                qwVar.a(4, this.d.intValue());
            }
            super.a(qwVar);
        }

        public /* synthetic */ rd b(qv qvVar) {
            return a(qvVar);
        }
    }
}
