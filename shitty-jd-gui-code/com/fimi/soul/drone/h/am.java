package com.fimi.soul.drone.h;

import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.e;
import com.fimi.soul.utils.af;
import com.fimi.soul.utils.z;

public class am
  extends e
{
  public int b;
  public double c;
  public double d;
  public double e;
  public double f;
  public double g;
  public double h;
  public int i = 0;
  
  public am(com.fimi.soul.drone.a parama)
  {
    super(parama);
  }
  
  public int a()
  {
    return this.b;
  }
  
  public void a(int paramInt1, float paramFloat1, float paramFloat2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt2)
  {
    af localaf;
    if (!com.fimi.soul.biz.n.a.a().b())
    {
      localaf = z.a(paramFloat2, paramFloat1);
      this.c = localaf.b();
    }
    for (this.d = localaf.a();; this.d = paramFloat2)
    {
      this.b = paramInt1;
      this.e = paramDouble1;
      this.f = paramDouble2;
      this.g = paramDouble3;
      this.h = paramDouble4;
      this.i = paramInt2;
      this.a.a(d.a.U);
      return;
      this.c = paramFloat1;
    }
  }
  
  public double b()
  {
    return this.c;
  }
  
  public double c()
  {
    return this.d;
  }
  
  public double d()
  {
    return this.e;
  }
  
  public double e()
  {
    return this.f;
  }
  
  public double f()
  {
    return this.g;
  }
  
  public double g()
  {
    return this.h;
  }
  
  public int h()
  {
    return this.i;
  }
  
  public String toString()
  {
    return "Receivepoints [number=" + this.b + ", Longitude=" + this.c + ", Latitude=" + this.d + ", Altitude=" + this.e + ", yaw_angle=" + this.f + ", hover_time=" + this.g + ", speed=" + this.h + ", Number_to_be_transmited=" + this.i + "]";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/h/am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */