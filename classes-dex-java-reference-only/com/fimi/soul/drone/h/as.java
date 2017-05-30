package com.fimi.soul.drone.h;

import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.e;
import com.fimi.soul.utils.af;

public class as
  extends e
{
  public double b;
  public byte c;
  public double d;
  public double e;
  public double f;
  public byte g;
  public int h;
  public double i;
  public double j;
  
  public as(com.fimi.soul.drone.a parama)
  {
    super(parama);
  }
  
  public double a()
  {
    return this.b;
  }
  
  public void a(double paramDouble)
  {
    this.b = paramDouble;
  }
  
  public void a(double paramDouble1, float paramFloat1, float paramFloat2, double paramDouble2, byte paramByte1, double paramDouble3, double paramDouble4, double paramDouble5, byte paramByte2)
  {
    af localaf;
    if (!com.fimi.soul.biz.n.a.a().b())
    {
      localaf = new af(paramFloat2, paramFloat1);
      this.d = localaf.b();
    }
    for (this.e = localaf.a();; this.e = paramFloat2)
    {
      this.b = paramDouble1;
      this.f = paramDouble2;
      this.g = paramByte1;
      this.h = ((int)paramDouble3 & 0xFF);
      this.i = paramDouble4;
      this.j = paramDouble5;
      this.c = paramByte2;
      this.a.a(d.a.v);
      return;
      this.d = paramFloat1;
    }
  }
  
  public void a(float paramFloat)
  {
    this.e = paramFloat;
  }
  
  public double b()
  {
    return this.d;
  }
  
  public void b(double paramDouble)
  {
    this.f = paramDouble;
  }
  
  public void b(float paramFloat)
  {
    this.d = paramFloat;
  }
  
  public double c()
  {
    return this.f;
  }
  
  public void c(double paramDouble)
  {
    this.i = paramDouble;
  }
  
  public byte d()
  {
    return this.g;
  }
  
  public void d(double paramDouble)
  {
    this.j = paramDouble;
  }
  
  public int e()
  {
    return this.h;
  }
  
  public double f()
  {
    return this.i;
  }
  
  public double g()
  {
    return this.j;
  }
  
  public double h()
  {
    return this.e;
  }
  
  public byte i()
  {
    return this.c;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/h/as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */