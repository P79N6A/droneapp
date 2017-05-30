package com.fimi.soul.drone.h;

import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.e;
import com.fimi.soul.utils.af;
import com.fimi.soul.utils.z;

public class v
  extends e
{
  private double b;
  private double c;
  private double d;
  private double e;
  private byte f;
  private double g;
  private double h;
  
  public v(com.fimi.soul.drone.a parama)
  {
    super(parama);
  }
  
  public double a()
  {
    return this.h;
  }
  
  public void a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, byte paramByte, double paramDouble6)
  {
    af localaf;
    if (!com.fimi.soul.biz.n.a.a().b())
    {
      localaf = z.a(paramDouble2, paramDouble1);
      this.b = localaf.b();
    }
    for (this.c = localaf.a();; this.c = paramDouble2)
    {
      this.d = paramDouble3;
      this.e = paramDouble4;
      this.f = paramByte;
      this.g = paramDouble5;
      this.h = paramDouble6;
      this.a.a(d.a.n);
      return;
      this.b = paramDouble1;
    }
  }
  
  public double b()
  {
    return this.b;
  }
  
  public double c()
  {
    return this.c;
  }
  
  public double d()
  {
    return this.d;
  }
  
  public double e()
  {
    return this.e;
  }
  
  public byte f()
  {
    return this.f;
  }
  
  public double g()
  {
    return this.g;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/h/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */