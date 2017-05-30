package com.fimi.soul.drone;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.Handler;
import com.fimi.soul.drone.h.a.b;
import com.fimi.soul.drone.h.a.e;
import com.fimi.soul.drone.h.aa;
import com.fimi.soul.drone.h.ab;
import com.fimi.soul.drone.h.ac;
import com.fimi.soul.drone.h.ad;
import com.fimi.soul.drone.h.ae;
import com.fimi.soul.drone.h.af;
import com.fimi.soul.drone.h.ag;
import com.fimi.soul.drone.h.ah;
import com.fimi.soul.drone.h.ai;
import com.fimi.soul.drone.h.aj;
import com.fimi.soul.drone.h.ak;
import com.fimi.soul.drone.h.al;
import com.fimi.soul.drone.h.am;
import com.fimi.soul.drone.h.an;
import com.fimi.soul.drone.h.ao;
import com.fimi.soul.drone.h.ap;
import com.fimi.soul.drone.h.aq;
import com.fimi.soul.drone.h.ar;
import com.fimi.soul.drone.h.as;
import com.fimi.soul.drone.h.at;
import com.fimi.soul.drone.h.au;
import com.fimi.soul.drone.h.av;
import com.fimi.soul.drone.h.aw;
import com.fimi.soul.drone.h.ax;
import com.fimi.soul.drone.h.ay;
import com.fimi.soul.drone.h.az;
import com.fimi.soul.drone.h.c;
import com.fimi.soul.drone.h.d;
import com.fimi.soul.drone.h.f;
import com.fimi.soul.drone.h.g;
import com.fimi.soul.drone.h.j;
import com.fimi.soul.drone.h.k;
import com.fimi.soul.drone.h.l;
import com.fimi.soul.drone.h.m;
import com.fimi.soul.drone.h.n;
import com.fimi.soul.drone.h.o;
import com.fimi.soul.drone.h.p;
import com.fimi.soul.drone.h.q;
import com.fimi.soul.drone.h.r;
import com.fimi.soul.drone.h.s;
import com.fimi.soul.drone.h.t;
import com.fimi.soul.drone.h.u;
import com.fimi.soul.drone.h.v;
import com.fimi.soul.drone.h.w;
import com.fimi.soul.drone.h.x;
import com.fimi.soul.drone.h.y;
import com.fimi.soul.drone.h.z;
import com.fimi.soul.utils.FlyLogTools;
import com.fimi.soul.utils.NetUtil;
import com.fimi.soul.view.MapWrapperLayout;
import com.google.android.gms.maps.model.LatLng;

public class a implements c {
    private final r A;
    private final af B;
    private final aq C;
    private final s D;
    private final ar E;
    private final ao F;
    private final c G;
    private final at H;
    private final az I;
    private final ay J;
    private final ax K;
    private final av L;
    private final aw M;
    private final an N;
    private final ap O;
    private final x P;
    private final w Q;
    private final ac R;
    private final ah S;
    private final com.fimi.soul.drone.droneconnection.connection.f.a T;
    private f U;
    private q V;
    private boolean W;
    private double X = 0.0d;
    private long Y = 0;
    private long Z = 0;
    SharedPreferences a = null;
    private com.google.android.gms.maps.c aa;
    private boolean ab;
    private boolean ac = true;
    private double ad = 0.0d;
    private boolean ae;
    private m af;
    private final e ag;
    private boolean ah;
    private g ai;
    private LatLng aj;
    private float ak;
    private boolean al;
    private int am;
    private Location an;
    private boolean ao;
    private j ap;
    private b aq;
    private ad ar;
    private ae as;
    private o at;
    private p au;
    private n av;
    private com.fimi.soul.drone.h.a.a aw;
    private volatile a ax = a.onLand;
    private MapWrapperLayout ay;
    FlyLogTools b;
    public com.fimi.soul.drone.c.a c;
    public Context d;
    private final b e;
    private final u f;
    private final l g;
    private final al h;
    private final am i;
    private final aj j;
    private final as k;
    private final ak l;
    private final y m;
    private final v n;
    private final ai o;
    private final ag p;
    private final z q;
    private final d r;
    private final aa s;
    private final ab t;
    private final k u;
    private final com.fimi.soul.drone.h.a.c v;
    private final t w;
    private final com.fimi.soul.drone.h.a.g x;
    private final com.fimi.soul.drone.h.e y;
    private final au z;

    private enum a {
        inSky,
        onLand,
        disCon
    }

    public a(com.fimi.soul.drone.droneconnection.connection.f.a aVar, Context context, Handler handler) {
        this.d = context;
        this.T = aVar;
        this.f = new u(this);
        this.g = new l(this);
        this.h = new al(this);
        this.i = new am(this);
        this.j = new aj(this);
        this.k = new as(this);
        this.l = new ak(this);
        this.m = new y(this);
        this.n = new v(this);
        this.o = new ai(this);
        this.p = new ag(this);
        this.q = new z(this);
        this.r = new d(this);
        this.s = new aa(this);
        this.t = new ab(this);
        this.u = new k(this);
        this.v = new com.fimi.soul.drone.h.a.c(this);
        this.w = new t(this);
        this.x = new com.fimi.soul.drone.h.a.g(this);
        this.y = new com.fimi.soul.drone.h.e(this);
        this.z = new au(this);
        this.A = new r(this);
        this.B = new af(this);
        this.C = new aq(this);
        this.D = new s(this);
        this.E = new ar(this);
        this.F = new ao(this);
        this.G = new c(this);
        this.H = new at(this);
        this.I = new az(this);
        this.J = new ay(this);
        this.K = new ax(this);
        this.L = new av(this);
        this.M = new aw(this);
        this.P = new x(this);
        this.e = new b(this, handler);
        this.U = new f(this);
        this.N = new an(this);
        this.O = new ap(this);
        this.V = new q(this);
        this.af = new m(this);
        this.aq = new b(this);
        this.ap = new j(this);
        this.ag = new e(this);
        this.Q = new w(this);
        this.R = new ac(this);
        this.ar = new ad(this);
        this.as = new ae(this);
        this.av = new n(this);
        this.aw = new com.fimi.soul.drone.h.a.a(this);
        this.au = new p(this);
        this.at = new o(this);
        this.b = FlyLogTools.a(context);
        this.S = new ah(this);
    }

    private void a(long j, double d) {
        boolean a = NetUtil.a(this.d);
        com.fimi.soul.utils.t a2 = com.fimi.soul.utils.t.a(this.d);
        com.fimi.soul.utils.u uVar = new com.fimi.soul.utils.u();
        uVar.a(d);
        uVar.a(j / 1000);
        uVar.a(com.fimi.soul.base.a.b(this.d).getUserID());
        uVar.b(com.fimi.soul.module.update.a.a.a().a(0).i());
        a2.a(uVar);
        if (a) {
            this.b.a();
        }
    }

    private void a(long j, long j2) {
        if (j <= 1800000) {
            a(j, this.ad);
        }
    }

    public com.fimi.soul.drone.h.a.c A() {
        return this.v;
    }

    public t B() {
        return this.w;
    }

    public com.fimi.soul.drone.h.a.g C() {
        return this.x;
    }

    public com.fimi.soul.drone.h.e D() {
        return this.y;
    }

    public au E() {
        return this.z;
    }

    public r F() {
        return this.A;
    }

    public af G() {
        return this.B;
    }

    public aq H() {
        return this.C;
    }

    public s I() {
        return this.D;
    }

    public ar J() {
        return this.E;
    }

    public ao K() {
        return this.F;
    }

    public c L() {
        return this.G;
    }

    public at M() {
        return this.H;
    }

    public az N() {
        return this.I;
    }

    public ay O() {
        return this.J;
    }

    public ax P() {
        return this.K;
    }

    public av Q() {
        return this.L;
    }

    public aw R() {
        return this.M;
    }

    public x S() {
        return this.P;
    }

    public com.fimi.soul.drone.droneconnection.connection.f.a T() {
        return this.T;
    }

    public boolean U() {
        return this.al;
    }

    public void V() {
        if (this.ab) {
            this.ax = a.disCon;
            ab();
        }
    }

    public boolean W() {
        return com.fimi.soul.biz.e.d.a().m();
    }

    public f X() {
        return this.U;
    }

    public an Y() {
        return this.N;
    }

    public ap Z() {
        return this.O;
    }

    public g a() {
        return this.ai;
    }

    public void a(float f) {
        this.ak = f;
    }

    public void a(int i) {
        this.af.a(this.d.getResources().getString(i));
    }

    public void a(Location location) {
        this.an = location;
    }

    public void a(com.fimi.soul.drone.d.a aVar) {
        this.e.a(aVar);
    }

    public void a(d.b bVar) {
        this.e.a(bVar);
    }

    public void a(b bVar) {
        this.aq = bVar;
    }

    public void a(g gVar) {
        this.ai = gVar;
    }

    public void a(j jVar) {
        this.ap = jVar;
    }

    public void a(MapWrapperLayout mapWrapperLayout) {
        this.ay = mapWrapperLayout;
    }

    public void a(com.google.android.gms.maps.c cVar) {
        this.aa = cVar;
    }

    public void a(LatLng latLng) {
        this.aj = latLng;
    }

    public void a(boolean z) {
        this.ao = z;
    }

    public com.google.android.gms.maps.c aa() {
        return this.aa;
    }

    public void ab() {
        com.fimi.soul.drone.droneconnection.connection.c.a();
        switch (this.ax) {
            case inSky:
                if (this.ac) {
                    this.X = (double) System.currentTimeMillis();
                    this.ac = false;
                }
                if (System.currentTimeMillis() - this.Z >= 1000) {
                    this.Z = System.currentTimeMillis();
                    this.ad = Math.abs(com.fimi.kernel.utils.t.a(r().a() / 100.0d, 1)) + this.ad;
                    return;
                }
                return;
            case disCon:
            case onLand:
                this.Y = (long) (((double) System.currentTimeMillis()) - this.X);
                a(this.Y, (long) this.ad);
                this.X = 0.0d;
                this.ad = 0.0d;
                this.ac = true;
                return;
            default:
                return;
        }
    }

    public boolean ac() {
        return this.ab;
    }

    public q ad() {
        return this.V;
    }

    public float ae() {
        return this.ak;
    }

    public boolean af() {
        return this.ae;
    }

    public String ag() {
        return this.af.a();
    }

    public b ah() {
        return this.e;
    }

    public LatLng ai() {
        return this.aj;
    }

    public e aj() {
        return this.ag;
    }

    public w ak() {
        return this.Q;
    }

    public ac al() {
        return this.R;
    }

    public boolean am() {
        return this.W;
    }

    public int an() {
        return this.am;
    }

    public boolean ao() {
        return this.ah;
    }

    public com.fimi.soul.drone.h.a.a ap() {
        return this.aw;
    }

    public MapWrapperLayout aq() {
        return this.ay;
    }

    public ah ar() {
        return this.S;
    }

    public Location b() {
        return this.an;
    }

    public void b(int i) {
        this.am = i;
    }

    public void b(d.b bVar) {
        this.e.b(bVar);
    }

    public void b(boolean z) {
        this.al = z;
    }

    public void c(boolean z) {
        this.ab = z;
        if (z) {
            this.ax = a.inSky;
        } else {
            this.ax = a.onLand;
        }
        ab();
    }

    public boolean c() {
        return this.ao;
    }

    public o d() {
        return this.at;
    }

    public void d(boolean z) {
        this.ae = z;
    }

    public ae e() {
        return this.as;
    }

    public void e(boolean z) {
        this.W = z;
    }

    public p f() {
        return this.au;
    }

    public void f(boolean z) {
        this.ah = z;
    }

    public ad g() {
        return this.ar;
    }

    public b h() {
        return this.aq;
    }

    public j i() {
        return this.ap;
    }

    public u j() {
        return this.f;
    }

    public l k() {
        return this.g;
    }

    public al l() {
        return this.h;
    }

    public am m() {
        return this.i;
    }

    public aj n() {
        return this.j;
    }

    public as o() {
        return this.k;
    }

    public n p() {
        return this.av;
    }

    public ak q() {
        return this.l;
    }

    public y r() {
        return this.m;
    }

    public v s() {
        return this.n;
    }

    public ai t() {
        return this.o;
    }

    public ag u() {
        return this.p;
    }

    public z v() {
        return this.q;
    }

    public d w() {
        return this.r;
    }

    public aa x() {
        return this.s;
    }

    public ab y() {
        return this.t;
    }

    public k z() {
        return this.u;
    }
}
