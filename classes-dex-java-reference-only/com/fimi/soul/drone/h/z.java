package com.fimi.soul.drone.h;

import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.e;
import com.fimi.soul.utils.af;

public class z
  extends e
{
  private double b;
  private double c;
  private double d;
  private int e;
  private float f;
  private byte g;
  
  public z() {}
  
  public z(com.fimi.soul.drone.a parama)
  {
    super(parama);
  }
  
  public float a()
  {
    return this.f;
  }
  
  public void a(double paramDouble)
  {
    this.b = paramDouble;
  }
  
  public void a(double paramDouble1, double paramDouble2, double paramDouble3, int paramInt, byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5)
  {
    af localaf;
    if (!com.fimi.soul.biz.n.a.a().b())
    {
      localaf = com.fimi.soul.utils.z.a(paramDouble2, paramDouble1);
      this.c = localaf.b();
    }
    for (this.b = localaf.a();; this.b = paramDouble2)
    {
      this.d = paramDouble3;
      this.e = paramInt;
      this.g = paramByte5;
      return;
      this.c = paramDouble1;
    }
  }
  
  public void a(double paramDouble1, double paramDouble2, double paramDouble3, int paramInt, float paramFloat, byte paramByte)
  {
    af localaf;
    if (!com.fimi.soul.biz.n.a.a().b())
    {
      localaf = com.fimi.soul.utils.z.a(paramDouble2, paramDouble1);
      this.c = localaf.b();
    }
    for (this.b = localaf.a();; this.b = paramDouble2)
    {
      this.d = paramDouble3;
      this.e = paramInt;
      this.f = paramFloat;
      this.g = paramByte;
      this.a.a(d.a.O);
      return;
      this.c = paramDouble1;
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
  
  public int e()
  {
    return this.e;
  }
  
  public boolean f()
  {
    return (this.g & 0xF) == 1;
  }
  
  public boolean g()
  {
    return (this.g & 0xF0) >> 4 == 1;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/h/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */