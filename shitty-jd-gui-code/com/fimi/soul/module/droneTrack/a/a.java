package com.fimi.soul.module.droneTrack.a;

import com.fimi.soul.drone.h.a.b;
import com.fimi.soul.drone.h.ad;
import com.fimi.soul.drone.h.ag;
import com.fimi.soul.drone.h.c;
import com.fimi.soul.drone.h.d;
import com.fimi.soul.drone.h.q;
import com.fimi.soul.drone.h.y;
import com.fimi.soul.drone.h.z;

public class a
{
  y a = new y();
  ag b = new ag();
  z c = new z();
  d d = new d();
  b e = new b();
  com.fimi.soul.drone.h.a.e f = new com.fimi.soul.drone.h.a.e();
  com.fimi.soul.drone.h.ao g = new com.fimi.soul.drone.h.ao();
  com.fimi.soul.drone.h.e h = new com.fimi.soul.drone.h.e();
  ad i = new ad();
  c j;
  boolean k;
  q l = new q();
  
  public com.fimi.soul.drone.h.a.e a()
  {
    return this.f;
  }
  
  public void a(b paramb)
  {
    this.e = paramb;
  }
  
  public void a(com.fimi.soul.drone.h.a.e parame)
  {
    this.f = parame;
  }
  
  public void a(ad paramad)
  {
    this.i = paramad;
  }
  
  public void a(ag paramag)
  {
    this.b = paramag;
  }
  
  public void a(com.fimi.soul.drone.h.ao paramao)
  {
    this.g = paramao;
  }
  
  public void a(c paramc)
  {
    this.j = paramc;
  }
  
  public void a(d paramd)
  {
    this.d = paramd;
  }
  
  public void a(com.fimi.soul.drone.h.e parame)
  {
    this.h = parame;
  }
  
  public void a(q paramq)
  {
    this.l = paramq;
  }
  
  public void a(y paramy)
  {
    this.a = paramy;
    if ((paramy.g() & 0xF0) >> 4 == 1)
    {
      a(true);
      return;
    }
    a(false);
  }
  
  public void a(z paramz)
  {
    this.c = paramz;
  }
  
  public void a(boolean paramBoolean)
  {
    this.k = paramBoolean;
  }
  
  public q b()
  {
    return this.l;
  }
  
  public b c()
  {
    return this.e;
  }
  
  public d d()
  {
    return this.d;
  }
  
  public z e()
  {
    return this.c;
  }
  
  public ag f()
  {
    return this.b;
  }
  
  public y g()
  {
    return this.a;
  }
  
  public com.fimi.soul.drone.h.ao h()
  {
    return this.g;
  }
  
  public com.fimi.soul.drone.h.e i()
  {
    return this.h;
  }
  
  public boolean j()
  {
    return this.k;
  }
  
  public ad k()
  {
    return this.i;
  }
  
  public c l()
  {
    return this.j;
  }
  
  public boolean m()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (this.g != null)
    {
      bool1 = bool2;
      if (com.fimi.soul.utils.ao.a(this.g.e(), Math.abs(0)) > 0) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public boolean n()
  {
    if (this.g != null) {
      return com.fimi.soul.utils.ao.a(this.g.e(), Math.abs(1)) > 0;
    }
    return false;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneTrack/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */