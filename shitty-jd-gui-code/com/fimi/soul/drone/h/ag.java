package com.fimi.soul.drone.h;

import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.e;
import com.fimi.soul.utils.af;
import com.fimi.soul.utils.z;

public class ag
  extends e
{
  private double b;
  private byte c;
  private double d;
  private double e;
  private double f;
  private double g;
  private byte h;
  
  public ag() {}
  
  public ag(com.fimi.soul.drone.a parama)
  {
    super(parama);
  }
  
  public byte a()
  {
    return this.h;
  }
  
  public void a(double paramDouble1, byte paramByte1, float paramFloat1, float paramFloat2, double paramDouble2, double paramDouble3, byte paramByte2)
  {
    this.b = paramDouble1;
    this.c = paramByte1;
    af localaf;
    if (!com.fimi.soul.biz.n.a.a().b())
    {
      localaf = z.a(paramFloat2, paramFloat1);
      this.d = localaf.b();
    }
    for (this.e = localaf.a();; this.e = paramFloat2)
    {
      this.g = paramDouble3;
      this.h = paramByte2;
      this.f = paramDouble2;
      if (this.a != null) {
        this.a.a(d.a.K);
      }
      return;
      this.d = paramFloat1;
    }
  }
  
  public double b()
  {
    return this.b;
  }
  
  public byte c()
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
  
  public double f()
  {
    return this.f;
  }
  
  public double g()
  {
    return this.g;
  }
  
  public String toString()
  {
    return "Pert{flighttime=" + this.b + ", SatelliteNumber=" + this.c + ", CurrentLongitude=" + this.d + ", CurrentLatitude=" + this.e + ", Height=" + this.f + ", Distance=" + this.g + ", RFsignalstrength=" + this.h + '}';
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/h/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */