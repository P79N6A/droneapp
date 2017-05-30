package com.fimi.soul.drone.a;

import android.content.Context;
import com.fimi.soul.biz.c.h;
import com.fimi.soul.drone.c.a.a.af;
import com.fimi.soul.drone.c.a.a.au;
import com.fimi.soul.drone.c.a.a.bb;
import com.fimi.soul.drone.c.a.a.bc;
import com.fimi.soul.drone.c.a.a.bd;
import com.fimi.soul.drone.c.a.a.be;
import com.fimi.soul.drone.c.a.a.bf;
import com.fimi.soul.drone.c.a.a.bg;
import com.fimi.soul.drone.c.a.a.bh;
import com.fimi.soul.drone.c.a.a.bi;
import com.fimi.soul.drone.c.a.a.bj;
import com.fimi.soul.drone.c.a.a.bm;
import com.fimi.soul.drone.c.a.a.bo;
import com.fimi.soul.drone.c.a.a.bq;
import com.fimi.soul.drone.c.a.a.br;
import com.fimi.soul.drone.c.a.a.i;
import com.fimi.soul.drone.c.a.a.l;
import com.fimi.soul.drone.c.a.a.m;
import com.fimi.soul.drone.c.a.a.s;
import com.fimi.soul.drone.c.a.a.t;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.droneconnection.connection.f.a;
import com.fimi.soul.drone.h.ad;
import com.fimi.soul.drone.h.ah;
import com.fimi.soul.drone.h.al;
import com.fimi.soul.drone.h.as;
import com.fimi.soul.drone.h.aw;
import com.fimi.soul.drone.h.ax;
import com.fimi.soul.drone.h.ay;
import com.fimi.soul.drone.h.az;
import com.fimi.soul.drone.h.z;
import com.fimi.soul.entity.SavreDroneInFoBean;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class a
{
  private static final int g = 1;
  private com.fimi.soul.drone.a a;
  private Context b;
  private SavreDroneInFoBean c;
  private com.fimi.soul.service.b d;
  private com.fimi.soul.module.dronemanage.b e;
  private boolean f;
  private long h = 0L;
  private ConcurrentHashMap<String, com.fimi.soul.drone.c.a.c> i;
  
  public a(com.fimi.soul.drone.a parama, Context paramContext)
  {
    this.a = parama;
    this.b = paramContext;
    this.c = new SavreDroneInFoBean();
    this.i = this.c.getHashMap();
    this.d = com.fimi.soul.service.b.a();
    this.e = com.fimi.soul.module.dronemanage.b.a();
  }
  
  public void a(com.fimi.soul.drone.c.a.b paramb)
  {
    switch (paramb.a)
    {
    }
    for (;;)
    {
      com.fimi.soul.drone.c.a.a.f.a(paramb, this.a);
      return;
      Object localObject1 = (bo)paramb;
      this.a.N().a(((bo)localObject1).d, ((bo)localObject1).e, ((bo)localObject1).f);
      continue;
      localObject1 = (bm)paramb;
      this.a.O().a(((bm)localObject1).d, ((bm)localObject1).e);
      continue;
      localObject1 = (bj)paramb;
      this.a.P().a(((bj)localObject1).d, ((bj)localObject1).e, ((bj)localObject1).f);
      continue;
      localObject1 = (br)paramb;
      this.a.Q().a(((br)localObject1).d, ((br)localObject1).e);
      continue;
      localObject1 = (bq)paramb;
      this.a.R().a(((bq)localObject1).d, ((bq)localObject1).e);
      continue;
      localObject1 = (com.fimi.soul.drone.c.a.a.y)paramb;
      this.a.Y().a(((com.fimi.soul.drone.c.a.a.y)localObject1).d, ((com.fimi.soul.drone.c.a.a.y)localObject1).e, ((com.fimi.soul.drone.c.a.a.y)localObject1).f);
      continue;
      localObject1 = (com.fimi.soul.drone.c.a.a.av)paramb;
      this.a.t().a(((com.fimi.soul.drone.c.a.a.av)localObject1).d, ((com.fimi.soul.drone.c.a.a.av)localObject1).e, ((com.fimi.soul.drone.c.a.a.av)localObject1).f, ((com.fimi.soul.drone.c.a.a.av)localObject1).g, ((com.fimi.soul.drone.c.a.a.av)localObject1).h);
      continue;
      this.a.b(true);
      localObject1 = (com.fimi.soul.drone.c.a.a.am)paramb;
      this.i.put("2", ((com.fimi.soul.drone.c.a.a.am)localObject1).d);
      this.a.r().a(((com.fimi.soul.drone.c.a.a.am)localObject1).h, ((com.fimi.soul.drone.c.a.a.am)localObject1).f, ((com.fimi.soul.drone.c.a.a.am)localObject1).j, ((com.fimi.soul.drone.c.a.a.am)localObject1).k, ((com.fimi.soul.drone.c.a.a.am)localObject1).l, ((com.fimi.soul.drone.c.a.a.am)localObject1).i, ((com.fimi.soul.drone.c.a.a.am)localObject1).g, ((com.fimi.soul.drone.c.a.a.am)localObject1).e, ((com.fimi.soul.drone.c.a.a.am)localObject1).m, ((com.fimi.soul.drone.c.a.a.am)localObject1).n, ((com.fimi.soul.drone.c.a.a.am)localObject1).q, ((com.fimi.soul.drone.c.a.a.am)localObject1).r, ((com.fimi.soul.drone.c.a.a.am)localObject1).o, ((com.fimi.soul.drone.c.a.a.am)localObject1).p);
      if ((((com.fimi.soul.drone.c.a.a.am)localObject1).r & 0xF0) >> 4 == 1)
      {
        this.a.T().b(true);
        this.a.c(true);
        this.f = true;
        label795:
        if ((((com.fimi.soul.drone.c.a.a.am)localObject1).r & 0xF) != 1) {
          break label894;
        }
        this.a.d(true);
      }
      for (;;)
      {
        com.fimi.soul.drone.d.u.a(this.a);
        this.a.a(d.a.bW);
        break;
        this.a.c(false);
        this.a.T().b(false);
        if (this.f) {
          this.a.a(d.a.bH);
        }
        h.a(this.a.d).a(0);
        this.f = false;
        break label795;
        label894:
        this.a.d(false);
      }
      localObject1 = (com.fimi.soul.drone.c.a.a.ar)paramb;
      this.i.put("3", ((com.fimi.soul.drone.c.a.a.ar)localObject1).k);
      this.a.u().a(((com.fimi.soul.drone.c.a.a.ar)localObject1).d, ((com.fimi.soul.drone.c.a.a.ar)localObject1).e, ((com.fimi.soul.drone.c.a.a.ar)localObject1).f, ((com.fimi.soul.drone.c.a.a.ar)localObject1).g, ((com.fimi.soul.drone.c.a.a.ar)localObject1).h, ((com.fimi.soul.drone.c.a.a.ar)localObject1).i, ((com.fimi.soul.drone.c.a.a.ar)localObject1).j);
      continue;
      localObject1 = (com.fimi.soul.drone.c.a.a.ap)paramb;
      this.i.put("4", ((com.fimi.soul.drone.c.a.a.ap)localObject1).i);
      this.a.v().a(((com.fimi.soul.drone.c.a.a.ap)localObject1).d, ((com.fimi.soul.drone.c.a.a.ap)localObject1).e, ((com.fimi.soul.drone.c.a.a.ap)localObject1).f, ((com.fimi.soul.drone.c.a.a.ap)localObject1).g, ((com.fimi.soul.drone.c.a.a.ap)localObject1).h, ((com.fimi.soul.drone.c.a.a.ap)localObject1).j);
      continue;
      localObject1 = (com.fimi.soul.drone.c.a.a.e)paramb;
      this.i.put("5", ((com.fimi.soul.drone.c.a.a.e)localObject1).r);
      this.a.w().a(((com.fimi.soul.drone.c.a.a.e)localObject1).d, ((com.fimi.soul.drone.c.a.a.e)localObject1).e, ((com.fimi.soul.drone.c.a.a.e)localObject1).f, ((com.fimi.soul.drone.c.a.a.e)localObject1).g, ((com.fimi.soul.drone.c.a.a.e)localObject1).h, ((com.fimi.soul.drone.c.a.a.e)localObject1).i, ((com.fimi.soul.drone.c.a.a.e)localObject1).j, ((com.fimi.soul.drone.c.a.a.e)localObject1).k, ((com.fimi.soul.drone.c.a.a.e)localObject1).l, ((com.fimi.soul.drone.c.a.a.e)localObject1).n, ((com.fimi.soul.drone.c.a.a.e)localObject1).o, ((com.fimi.soul.drone.c.a.a.e)localObject1).p, ((com.fimi.soul.drone.c.a.a.e)localObject1).q);
      continue;
      localObject1 = (bd)paramb;
      this.a.s().a(((bd)localObject1).d, ((bd)localObject1).e, ((bd)localObject1).f, ((bd)localObject1).g, ((bd)localObject1).h, ((bd)localObject1).i, ((bd)localObject1).j);
      continue;
      localObject1 = (com.fimi.soul.drone.c.a.a.w)paramb;
      this.a.h().a(((com.fimi.soul.drone.c.a.a.w)localObject1).d, ((com.fimi.soul.drone.c.a.a.w)localObject1).e, ((com.fimi.soul.drone.c.a.a.w)localObject1).f, ((com.fimi.soul.drone.c.a.a.w)localObject1).g, ((com.fimi.soul.drone.c.a.a.w)localObject1).h, ((com.fimi.soul.drone.c.a.a.w)localObject1).i, ((com.fimi.soul.drone.c.a.a.w)localObject1).j, ((com.fimi.soul.drone.c.a.a.w)localObject1).k, ((com.fimi.soul.drone.c.a.a.w)localObject1).l, ((com.fimi.soul.drone.c.a.a.w)localObject1).m, ((com.fimi.soul.drone.c.a.a.w)localObject1).n);
      continue;
      localObject1 = (com.fimi.soul.drone.c.a.a.at)paramb;
      continue;
      localObject1 = (com.fimi.soul.drone.c.a.a.o)paramb;
      continue;
      com.fimi.soul.module.b.d.a(this.a).c(129);
      localObject1 = (au)paramb;
      com.fimi.soul.biz.j.b.a(((au)localObject1).n);
      this.a.q().a(((au)localObject1).d, ((au)localObject1).e, ((au)localObject1).f, ((au)localObject1).g, ((au)localObject1).h, ((au)localObject1).i, ((au)localObject1).j, ((au)localObject1).k, ((au)localObject1).l, ((au)localObject1).m, ((au)localObject1).n);
      continue;
      localObject1 = (com.fimi.soul.drone.c.a.a.ae)paramb;
      this.a.m().a(((com.fimi.soul.drone.c.a.a.ae)localObject1).d, ((com.fimi.soul.drone.c.a.a.ae)localObject1).e, ((com.fimi.soul.drone.c.a.a.ae)localObject1).f, ((com.fimi.soul.drone.c.a.a.ae)localObject1).g, ((com.fimi.soul.drone.c.a.a.ae)localObject1).h, ((com.fimi.soul.drone.c.a.a.ae)localObject1).i, ((com.fimi.soul.drone.c.a.a.ae)localObject1).j, ((com.fimi.soul.drone.c.a.a.ae)localObject1).k);
      continue;
      com.fimi.soul.module.calibcompass.a.a().a("131");
      localObject1 = (bb)paramb;
      this.a.l().a(((bb)localObject1).d, ((bb)localObject1).e, ((bb)localObject1).f, ((bb)localObject1).g, ((bb)localObject1).h, ((bb)localObject1).i, ((bb)localObject1).k, ((bb)localObject1).l, ((bb)localObject1).j);
      continue;
      localObject1 = (be)paramb;
      continue;
      localObject1 = (com.fimi.soul.drone.c.a.a.p)paramb;
      this.a.o().a(((com.fimi.soul.drone.c.a.a.p)localObject1).d, ((com.fimi.soul.drone.c.a.a.p)localObject1).f, ((com.fimi.soul.drone.c.a.a.p)localObject1).g, ((com.fimi.soul.drone.c.a.a.p)localObject1).h, ((com.fimi.soul.drone.c.a.a.p)localObject1).i, ((com.fimi.soul.drone.c.a.a.p)localObject1).j, ((com.fimi.soul.drone.c.a.a.p)localObject1).k, ((com.fimi.soul.drone.c.a.a.p)localObject1).l, ((com.fimi.soul.drone.c.a.a.p)localObject1).e);
      continue;
      localObject1 = (com.fimi.soul.drone.c.a.a.j)paramb;
      this.a.p().a(((com.fimi.soul.drone.c.a.a.j)localObject1).d, ((com.fimi.soul.drone.c.a.a.j)localObject1).e, ((com.fimi.soul.drone.c.a.a.j)localObject1).f, ((com.fimi.soul.drone.c.a.a.j)localObject1).g);
      continue;
      localObject1 = (com.fimi.soul.drone.c.a.a.ai)paramb;
      this.a.j().a(((com.fimi.soul.drone.c.a.a.ai)localObject1).d, ((com.fimi.soul.drone.c.a.a.ai)localObject1).f, ((com.fimi.soul.drone.c.a.a.ai)localObject1).g, ((com.fimi.soul.drone.c.a.a.ai)localObject1).e, ((com.fimi.soul.drone.c.a.a.ai)localObject1).h, ((com.fimi.soul.drone.c.a.a.ai)localObject1).i, ((com.fimi.soul.drone.c.a.a.ai)localObject1).j, ((com.fimi.soul.drone.c.a.a.ai)localObject1).k);
      continue;
      localObject1 = (bh)paramb;
      this.i.put("100", ((bh)localObject1).o);
      this.a.M().a(((bh)localObject1).d, ((bh)localObject1).e, ((bh)localObject1).f, ((bh)localObject1).g, ((bh)localObject1).h, ((bh)localObject1).i, ((bh)localObject1).j, ((bh)localObject1).k, ((bh)localObject1).l, ((bh)localObject1).m, ((bh)localObject1).n);
      continue;
      localObject1 = (bf)paramb;
      if (((bf)localObject1).d == 114)
      {
        com.fimi.soul.biz.h.a.a().b().put(Integer.valueOf(98), ((bf)localObject1).g);
        com.fimi.soul.drone.droneconnection.connection.c.a().a(((bf)localObject1).g);
      }
      this.a.L().a(((bf)localObject1).d, ((bf)localObject1).e, ((bf)localObject1).f);
      continue;
      localObject1 = (bg)paramb;
      this.a.K().a(((bg)localObject1).d, ((bg)localObject1).e, ((bg)localObject1).f, ((bg)localObject1).g, ((bg)localObject1).h, ((bg)localObject1).i);
      continue;
      localObject1 = (af)paramb;
      com.fimi.soul.biz.h.a.a().b().put(Integer.valueOf(198), ((af)localObject1).i);
      com.fimi.soul.drone.droneconnection.connection.c.a().a(((af)localObject1).i);
      this.a.D().a(((af)localObject1).d, ((af)localObject1).e, ((af)localObject1).g, ((af)localObject1).h, ((af)localObject1).f);
      continue;
      localObject1 = (com.fimi.soul.drone.c.a.a.ak)paramb;
      this.a.a(d.a.z);
      com.fimi.soul.biz.j.b.a(((com.fimi.soul.drone.c.a.a.ak)localObject1).e);
      continue;
      localObject1 = (com.fimi.soul.drone.c.a.a.ao)paramb;
      this.a.a(d.a.A);
      com.fimi.soul.biz.j.b.a(((com.fimi.soul.drone.c.a.a.ao)localObject1).e);
      continue;
      localObject1 = (bc)paramb;
      this.e.a(((bc)localObject1).e, this.b);
      this.a.a(d.a.B);
      continue;
      localObject1 = (com.fimi.soul.drone.c.a.a.an)paramb;
      this.a.J().a(((com.fimi.soul.drone.c.a.a.an)localObject1).d, ((com.fimi.soul.drone.c.a.a.an)localObject1).e);
      com.fimi.soul.module.b.d.a(this.a).c(147);
      com.fimi.soul.biz.j.b.a(((com.fimi.soul.drone.c.a.a.an)localObject1).f);
      continue;
      com.fimi.soul.module.b.d.a(this.a).c(148);
      this.a.a(d.a.bw);
      localObject1 = (com.fimi.soul.drone.c.a.a.ag)paramb;
      com.fimi.soul.biz.j.b.a(((com.fimi.soul.drone.c.a.a.ag)localObject1).e);
      this.a.F().a(((com.fimi.soul.drone.c.a.a.ag)localObject1).d, ((com.fimi.soul.drone.c.a.a.ag)localObject1).e);
      continue;
      localObject1 = (com.fimi.soul.drone.c.a.a.b)paramb;
      this.a.a(d.a.R);
      this.a.n().a(((com.fimi.soul.drone.c.a.a.b)localObject1).d, ((com.fimi.soul.drone.c.a.a.b)localObject1).e, ((com.fimi.soul.drone.c.a.a.b)localObject1).f);
      continue;
      localObject1 = (com.fimi.soul.drone.c.a.a.aj)paramb;
      this.i.put("16", ((com.fimi.soul.drone.c.a.a.aj)localObject1).e);
      this.a.S().a(((com.fimi.soul.drone.c.a.a.aj)localObject1).b().b());
      this.a.a(d.a.aC);
      continue;
      this.a.a(d.a.aD);
      continue;
      localObject1 = (com.fimi.soul.drone.c.a.a.d)paramb;
      this.a.X().a(((com.fimi.soul.drone.c.a.a.d)localObject1).d, ((com.fimi.soul.drone.c.a.a.d)localObject1).e, ((com.fimi.soul.drone.c.a.a.d)localObject1).f, ((com.fimi.soul.drone.c.a.a.d)localObject1).g);
      continue;
      localObject1 = (com.fimi.soul.drone.c.a.a.n)paramb;
      this.i.put("9", ((com.fimi.soul.drone.c.a.a.n)localObject1).b);
      this.a.ad().a(((com.fimi.soul.drone.c.a.a.n)localObject1).b(), ((com.fimi.soul.drone.c.a.a.n)localObject1).c());
      continue;
      localObject1 = (com.fimi.soul.drone.c.a.a.aa)paramb;
      this.a.Z().a(((com.fimi.soul.drone.c.a.a.aa)localObject1).d);
      continue;
      localObject1 = (com.fimi.soul.drone.c.a.a.c)paramb;
      this.a.i().a(((com.fimi.soul.drone.c.a.a.c)localObject1).d, ((com.fimi.soul.drone.c.a.a.c)localObject1).e, ((com.fimi.soul.drone.c.a.a.c)localObject1).f, ((com.fimi.soul.drone.c.a.a.c)localObject1).g, ((com.fimi.soul.drone.c.a.a.c)localObject1).h);
      continue;
      com.fimi.soul.module.b.d.a(this.a).c(153);
      localObject1 = (com.fimi.soul.drone.c.a.a.r)paramb;
      this.a.x().a(((com.fimi.soul.drone.c.a.a.r)localObject1).f, ((com.fimi.soul.drone.c.a.a.r)localObject1).g, ((com.fimi.soul.drone.c.a.a.r)localObject1).h, ((com.fimi.soul.drone.c.a.a.r)localObject1).i, ((com.fimi.soul.drone.c.a.a.r)localObject1).j, ((com.fimi.soul.drone.c.a.a.r)localObject1).k);
      continue;
      com.fimi.soul.module.b.d.a(this.a).c(153);
      localObject1 = (i)paramb;
      this.a.z().a(((i)localObject1).f, ((i)localObject1).g, ((i)localObject1).h, ((i)localObject1).i, ((i)localObject1).j, ((i)localObject1).k);
      continue;
      localObject1 = (s)paramb;
      this.a.y().a(((s)localObject1).g, ((s)localObject1).h, ((s)localObject1).f);
      continue;
      localObject1 = (com.fimi.soul.drone.c.a.a.u)paramb;
      this.a.aj().a(((com.fimi.soul.drone.c.a.a.u)localObject1).d, ((com.fimi.soul.drone.c.a.a.u)localObject1).e, ((com.fimi.soul.drone.c.a.a.u)localObject1).f, ((com.fimi.soul.drone.c.a.a.u)localObject1).g, ((com.fimi.soul.drone.c.a.a.u)localObject1).h, ((com.fimi.soul.drone.c.a.a.u)localObject1).i, ((com.fimi.soul.drone.c.a.a.u)localObject1).j);
      continue;
      localObject1 = (com.fimi.soul.drone.c.a.a.q)paramb;
      this.a.ak().a(((com.fimi.soul.drone.c.a.a.q)localObject1).d, ((com.fimi.soul.drone.c.a.a.q)localObject1).e, ((com.fimi.soul.drone.c.a.a.q)localObject1).f, ((com.fimi.soul.drone.c.a.a.q)localObject1).g);
      continue;
      localObject1 = (com.fimi.soul.drone.c.a.a.v)paramb;
      if (((com.fimi.soul.drone.c.a.a.v)localObject1).j.b == 8)
      {
        this.a.al().a(((com.fimi.soul.drone.c.a.a.v)localObject1).j);
        if (this.a.al().g == 0) {
          this.a.al().a(true);
        } else {
          this.a.al().a(false);
        }
      }
      else
      {
        this.a.al().b(((com.fimi.soul.drone.c.a.a.v)localObject1).j);
        if ((this.a.al().h == 1) && (this.a.al().g == 0))
        {
          this.a.al().a(true);
        }
        else if (this.a.al().h == 1)
        {
          this.a.al().a(false);
          continue;
          localObject1 = (bi)paramb;
          Object localObject2 = this.a.g();
          ((ad)localObject2).a(((bi)localObject1).d);
          ((ad)localObject2).h(((bi)localObject1).e);
          ((ad)localObject2).g(((bi)localObject1).f);
          ((ad)localObject2).f(((bi)localObject1).g);
          ((ad)localObject2).e(((bi)localObject1).h);
          ((ad)localObject2).d(((bi)localObject1).i);
          ((ad)localObject2).c(((bi)localObject1).j);
          ((ad)localObject2).b(((bi)localObject1).k);
          ((ad)localObject2).a(((bi)localObject1).l);
          ((ad)localObject2).b(((bi)localObject1).m);
          if (System.currentTimeMillis() - this.h >= 1000L)
          {
            this.a.a(d.a.ag);
            this.h = System.currentTimeMillis();
          }
          this.a.a(d.a.bf);
          continue;
          localObject1 = (com.fimi.soul.drone.c.a.a.ab)paramb;
          this.a.b(((com.fimi.soul.drone.c.a.a.ab)localObject1).h);
          continue;
          localObject1 = (t)paramb;
          localObject2 = this.a.e();
          ((com.fimi.soul.drone.h.ae)localObject2).a(((t)localObject1).k);
          ((com.fimi.soul.drone.h.ae)localObject2).b(((t)localObject1).l);
          ((com.fimi.soul.drone.h.ae)localObject2).c(((t)localObject1).m);
          ((com.fimi.soul.drone.h.ae)localObject2).d(((t)localObject1).n);
          ((com.fimi.soul.drone.h.ae)localObject2).e(((t)localObject1).o);
          this.a.a(d.a.bU);
          continue;
          localObject1 = (com.fimi.soul.drone.c.a.a.k)paramb;
          localObject2 = this.a.d();
          ((com.fimi.soul.drone.h.o)localObject2).a(((com.fimi.soul.drone.c.a.a.k)localObject1).f());
          ((com.fimi.soul.drone.h.o)localObject2).d(((com.fimi.soul.drone.c.a.a.k)localObject1).l());
          ((com.fimi.soul.drone.h.o)localObject2).e(((com.fimi.soul.drone.c.a.a.k)localObject1).m());
          ((com.fimi.soul.drone.h.o)localObject2).f(((com.fimi.soul.drone.c.a.a.k)localObject1).n());
          this.a.a(d.a.bX);
          continue;
          localObject1 = (l)paramb;
          localObject2 = this.a.d();
          ((com.fimi.soul.drone.h.o)localObject2).a(((l)localObject1).b());
          ((com.fimi.soul.drone.h.o)localObject2).f(((l)localObject1).c());
          this.a.a(d.a.bX);
          continue;
          com.fimi.soul.module.b.d.a(this.a).c(134);
          localObject1 = (com.fimi.soul.drone.c.a.a.ac)paramb;
          com.fimi.soul.biz.j.b.a(((com.fimi.soul.drone.c.a.a.ac)localObject1).m);
          this.a.ap().a(((com.fimi.soul.drone.c.a.a.ac)localObject1).d, ((com.fimi.soul.drone.c.a.a.ac)localObject1).e, ((com.fimi.soul.drone.c.a.a.ac)localObject1).f, ((com.fimi.soul.drone.c.a.a.ac)localObject1).g, ((com.fimi.soul.drone.c.a.a.ac)localObject1).h, (short)((com.fimi.soul.drone.c.a.a.ac)localObject1).i, ((com.fimi.soul.drone.c.a.a.ac)localObject1).j, ((com.fimi.soul.drone.c.a.a.ac)localObject1).k, ((com.fimi.soul.drone.c.a.a.ac)localObject1).l, ((com.fimi.soul.drone.c.a.a.ac)localObject1).m);
          continue;
          localObject1 = (m)paramb;
          localObject2 = this.a.f();
          ((com.fimi.soul.drone.h.p)localObject2).a((byte)((m)localObject1).a);
          ((com.fimi.soul.drone.h.p)localObject2).b(((m)localObject1).g);
          ((com.fimi.soul.drone.h.p)localObject2).c(((m)localObject1).h);
          ((com.fimi.soul.drone.h.p)localObject2).d(((m)localObject1).i);
          ((com.fimi.soul.drone.h.p)localObject2).e(((m)localObject1).j);
          this.a.a(d.a.bV);
          continue;
          localObject1 = (com.fimi.soul.drone.c.a.a.x)paramb;
          this.a.ar().a(((com.fimi.soul.drone.c.a.a.x)localObject1).d, ((com.fimi.soul.drone.c.a.a.x)localObject1).f, ((com.fimi.soul.drone.c.a.a.x)localObject1).e);
        }
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */