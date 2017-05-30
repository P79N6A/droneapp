package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;
import com.fimi.soul.drone.h.x;

public class aj
  extends b
{
  public static final int b = 16;
  public static final int c = 112;
  public static final int d = 113;
  private static final int g = 3;
  public c e;
  private x f;
  
  public aj(int paramInt)
  {
    this.a = paramInt;
  }
  
  public aj(c paramc, int paramInt)
  {
    this.a = paramInt;
    this.e = paramc;
    a(paramc.d);
  }
  
  public c a()
  {
    c localc = new c();
    localc.b = 3;
    localc.c = this.a;
    localc.d.b(this.f.a());
    localc.d.b((byte)this.f.b());
    localc.d.b(this.f.c());
    return localc;
  }
  
  public void a(d paramd)
  {
    this.f = new x(null);
    paramd.c();
    paramd.d();
    this.f.a(paramd.d());
    this.f.a((short)paramd.d());
    this.f.b(paramd.d());
  }
  
  public void a(x paramx)
  {
    this.f = paramx;
  }
  
  public x b()
  {
    return this.f;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/c/a/a/aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */