package com.fimi.soul.drone;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.location.Location;
import android.os.Handler;
import com.fimi.soul.drone.droneconnection.connection.f.a;
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
import com.fimi.soul.drone.h.f;
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
import com.fimi.soul.drone.h.v;
import com.fimi.soul.drone.h.w;
import com.fimi.soul.drone.h.x;
import com.fimi.soul.drone.h.y;
import com.fimi.soul.drone.h.z;
import com.fimi.soul.entity.User;
import com.fimi.soul.utils.FlyLogTools;
import com.fimi.soul.utils.NetUtil;
import com.fimi.soul.view.MapWrapperLayout;
import com.google.android.gms.maps.model.LatLng;

public class a
  implements c
{
  private final r A;
  private final af B;
  private final aq C;
  private final s D;
  private final ar E;
  private final ao F;
  private final com.fimi.soul.drone.h.c G;
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
  private final f.a T;
  private f U;
  private q V;
  private boolean W;
  private double X = 0.0D;
  private long Y = 0L;
  private long Z = 0L;
  SharedPreferences a = null;
  private com.google.android.gms.maps.c aa;
  private boolean ab;
  private boolean ac = true;
  private double ad = 0.0D;
  private boolean ae;
  private m af;
  private final com.fimi.soul.drone.h.a.e ag;
  private boolean ah;
  private com.fimi.soul.drone.h.g ai;
  private LatLng aj;
  private float ak;
  private boolean al;
  private int am;
  private Location an;
  private boolean ao;
  private j ap;
  private com.fimi.soul.drone.h.a.b aq;
  private ad ar;
  private ae as;
  private o at;
  private p au;
  private n av;
  private com.fimi.soul.drone.h.a.a aw;
  private volatile a ax = a.b;
  private MapWrapperLayout ay;
  FlyLogTools b;
  public com.fimi.soul.drone.c.a c;
  public Context d;
  private final b e;
  private final com.fimi.soul.drone.h.u f;
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
  private final com.fimi.soul.drone.h.d r;
  private final aa s;
  private final ab t;
  private final k u;
  private final com.fimi.soul.drone.h.a.c v;
  private final com.fimi.soul.drone.h.t w;
  private final com.fimi.soul.drone.h.a.g x;
  private final com.fimi.soul.drone.h.e y;
  private final au z;
  
  public a(f.a parama, Context paramContext, Handler paramHandler)
  {
    this.d = paramContext;
    this.T = parama;
    this.f = new com.fimi.soul.drone.h.u(this);
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
    this.r = new com.fimi.soul.drone.h.d(this);
    this.s = new aa(this);
    this.t = new ab(this);
    this.u = new k(this);
    this.v = new com.fimi.soul.drone.h.a.c(this);
    this.w = new com.fimi.soul.drone.h.t(this);
    this.x = new com.fimi.soul.drone.h.a.g(this);
    this.y = new com.fimi.soul.drone.h.e(this);
    this.z = new au(this);
    this.A = new r(this);
    this.B = new af(this);
    this.C = new aq(this);
    this.D = new s(this);
    this.E = new ar(this);
    this.F = new ao(this);
    this.G = new com.fimi.soul.drone.h.c(this);
    this.H = new at(this);
    this.I = new az(this);
    this.J = new ay(this);
    this.K = new ax(this);
    this.L = new av(this);
    this.M = new aw(this);
    this.P = new x(this);
    this.e = new b(this, paramHandler);
    this.U = new f(this);
    this.N = new an(this);
    this.O = new ap(this);
    this.V = new q(this);
    this.af = new m(this);
    this.aq = new com.fimi.soul.drone.h.a.b(this);
    this.ap = new j(this);
    this.ag = new com.fimi.soul.drone.h.a.e(this);
    this.Q = new w(this);
    this.R = new ac(this);
    this.ar = new ad(this);
    this.as = new ae(this);
    this.av = new n(this);
    this.aw = new com.fimi.soul.drone.h.a.a(this);
    this.au = new p(this);
    this.at = new o(this);
    this.b = FlyLogTools.a(paramContext);
    this.S = new ah(this);
  }
  
  private void a(long paramLong, double paramDouble)
  {
    boolean bool = NetUtil.a(this.d);
    com.fimi.soul.utils.t localt = com.fimi.soul.utils.t.a(this.d);
    com.fimi.soul.utils.u localu = new com.fimi.soul.utils.u();
    localu.a(paramDouble);
    localu.a(paramLong / 1000L);
    localu.a(com.fimi.soul.base.a.b(this.d).getUserID());
    localu.b(com.fimi.soul.module.update.a.a.a().a(0).i());
    localt.a(localu);
    if (bool) {
      this.b.a();
    }
  }
  
  private void a(long paramLong1, long paramLong2)
  {
    if (paramLong1 > 1800000L) {
      return;
    }
    a(paramLong1, this.ad);
  }
  
  public com.fimi.soul.drone.h.a.c A()
  {
    return this.v;
  }
  
  public com.fimi.soul.drone.h.t B()
  {
    return this.w;
  }
  
  public com.fimi.soul.drone.h.a.g C()
  {
    return this.x;
  }
  
  public com.fimi.soul.drone.h.e D()
  {
    return this.y;
  }
  
  public au E()
  {
    return this.z;
  }
  
  public r F()
  {
    return this.A;
  }
  
  public af G()
  {
    return this.B;
  }
  
  public aq H()
  {
    return this.C;
  }
  
  public s I()
  {
    return this.D;
  }
  
  public ar J()
  {
    return this.E;
  }
  
  public ao K()
  {
    return this.F;
  }
  
  public com.fimi.soul.drone.h.c L()
  {
    return this.G;
  }
  
  public at M()
  {
    return this.H;
  }
  
  public az N()
  {
    return this.I;
  }
  
  public ay O()
  {
    return this.J;
  }
  
  public ax P()
  {
    return this.K;
  }
  
  public av Q()
  {
    return this.L;
  }
  
  public aw R()
  {
    return this.M;
  }
  
  public x S()
  {
    return this.P;
  }
  
  public f.a T()
  {
    return this.T;
  }
  
  public boolean U()
  {
    return this.al;
  }
  
  public void V()
  {
    if (this.ab)
    {
      this.ax = a.c;
      ab();
    }
  }
  
  public boolean W()
  {
    return com.fimi.soul.biz.e.d.a().m();
  }
  
  public f X()
  {
    return this.U;
  }
  
  public an Y()
  {
    return this.N;
  }
  
  public ap Z()
  {
    return this.O;
  }
  
  public com.fimi.soul.drone.h.g a()
  {
    return this.ai;
  }
  
  public void a(float paramFloat)
  {
    this.ak = paramFloat;
  }
  
  public void a(int paramInt)
  {
    this.af.a(this.d.getResources().getString(paramInt));
  }
  
  public void a(Location paramLocation)
  {
    this.an = paramLocation;
  }
  
  public void a(d.a parama)
  {
    this.e.a(parama);
  }
  
  public void a(d.b paramb)
  {
    this.e.a(paramb);
  }
  
  public void a(com.fimi.soul.drone.h.a.b paramb)
  {
    this.aq = paramb;
  }
  
  public void a(com.fimi.soul.drone.h.g paramg)
  {
    this.ai = paramg;
  }
  
  public void a(j paramj)
  {
    this.ap = paramj;
  }
  
  public void a(MapWrapperLayout paramMapWrapperLayout)
  {
    this.ay = paramMapWrapperLayout;
  }
  
  public void a(com.google.android.gms.maps.c paramc)
  {
    this.aa = paramc;
  }
  
  public void a(LatLng paramLatLng)
  {
    this.aj = paramLatLng;
  }
  
  public void a(boolean paramBoolean)
  {
    this.ao = paramBoolean;
  }
  
  public com.google.android.gms.maps.c aa()
  {
    return this.aa;
  }
  
  public void ab()
  {
    com.fimi.soul.drone.droneconnection.connection.c.a();
    switch (1.a[this.ax.ordinal()])
    {
    default: 
    case 1: 
      do
      {
        return;
        if (this.ac)
        {
          this.X = System.currentTimeMillis();
          this.ac = false;
        }
      } while (System.currentTimeMillis() - this.Z < 1000L);
      this.Z = System.currentTimeMillis();
      this.ad = (Math.abs(com.fimi.kernel.utils.t.a(r().a() / 100.0D, 1)) + this.ad);
      return;
    }
    this.Y = ((System.currentTimeMillis() - this.X));
    a(this.Y, this.ad);
    this.X = 0.0D;
    this.ad = 0.0D;
    this.ac = true;
  }
  
  public boolean ac()
  {
    return this.ab;
  }
  
  public q ad()
  {
    return this.V;
  }
  
  public float ae()
  {
    return this.ak;
  }
  
  public boolean af()
  {
    return this.ae;
  }
  
  public String ag()
  {
    return this.af.a();
  }
  
  public b ah()
  {
    return this.e;
  }
  
  public LatLng ai()
  {
    return this.aj;
  }
  
  public com.fimi.soul.drone.h.a.e aj()
  {
    return this.ag;
  }
  
  public w ak()
  {
    return this.Q;
  }
  
  public ac al()
  {
    return this.R;
  }
  
  public boolean am()
  {
    return this.W;
  }
  
  public int an()
  {
    return this.am;
  }
  
  public boolean ao()
  {
    return this.ah;
  }
  
  public com.fimi.soul.drone.h.a.a ap()
  {
    return this.aw;
  }
  
  public MapWrapperLayout aq()
  {
    return this.ay;
  }
  
  public ah ar()
  {
    return this.S;
  }
  
  public Location b()
  {
    return this.an;
  }
  
  public void b(int paramInt)
  {
    this.am = paramInt;
  }
  
  public void b(d.b paramb)
  {
    this.e.b(paramb);
  }
  
  public void b(boolean paramBoolean)
  {
    this.al = paramBoolean;
  }
  
  public void c(boolean paramBoolean)
  {
    this.ab = paramBoolean;
    if (paramBoolean) {}
    for (this.ax = a.a;; this.ax = a.b)
    {
      ab();
      return;
    }
  }
  
  public boolean c()
  {
    return this.ao;
  }
  
  public o d()
  {
    return this.at;
  }
  
  public void d(boolean paramBoolean)
  {
    this.ae = paramBoolean;
  }
  
  public ae e()
  {
    return this.as;
  }
  
  public void e(boolean paramBoolean)
  {
    this.W = paramBoolean;
  }
  
  public p f()
  {
    return this.au;
  }
  
  public void f(boolean paramBoolean)
  {
    this.ah = paramBoolean;
  }
  
  public ad g()
  {
    return this.ar;
  }
  
  public com.fimi.soul.drone.h.a.b h()
  {
    return this.aq;
  }
  
  public j i()
  {
    return this.ap;
  }
  
  public com.fimi.soul.drone.h.u j()
  {
    return this.f;
  }
  
  public l k()
  {
    return this.g;
  }
  
  public al l()
  {
    return this.h;
  }
  
  public am m()
  {
    return this.i;
  }
  
  public aj n()
  {
    return this.j;
  }
  
  public as o()
  {
    return this.k;
  }
  
  public n p()
  {
    return this.av;
  }
  
  public ak q()
  {
    return this.l;
  }
  
  public y r()
  {
    return this.m;
  }
  
  public v s()
  {
    return this.n;
  }
  
  public ai t()
  {
    return this.o;
  }
  
  public ag u()
  {
    return this.p;
  }
  
  public z v()
  {
    return this.q;
  }
  
  public com.fimi.soul.drone.h.d w()
  {
    return this.r;
  }
  
  public aa x()
  {
    return this.s;
  }
  
  public ab y()
  {
    return this.t;
  }
  
  public k z()
  {
    return this.u;
  }
  
  private static enum a
  {
    private a() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */