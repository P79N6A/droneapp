package com.fimi.soul.drone.h;

import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.e;
import com.fimi.soul.utils.af;
import com.fimi.soul.utils.z;

public class ak
  extends e
{
  public double b;
  public int c;
  public double d;
  public double e;
  public double f;
  public short g;
  public int h;
  public int i;
  public byte j;
  public byte k;
  public byte l;
  
  public ak(com.fimi.soul.drone.a parama)
  {
    super(parama);
  }
  
  public byte a()
  {
    return this.l;
  }
  
  public void a(double paramDouble1, int paramInt1, float paramFloat1, float paramFloat2, double paramDouble2, short paramShort, int paramInt2, int paramInt3, byte paramByte1, byte paramByte2, byte paramByte3)
  {
    af localaf;
    if (!com.fimi.soul.biz.n.a.a().b())
    {
      localaf = z.a(paramFloat2, paramFloat1);
      this.d = localaf.b();
    }
    for (this.e = localaf.a();; this.e = paramFloat2)
    {
      this.b = paramDouble1;
      this.c = paramInt1;
      this.f = paramDouble2;
      this.g = paramShort;
      this.h = (paramInt2 & 0xFF);
      this.i = (paramInt3 & 0xFF);
      this.j = paramByte1;
      this.k = paramByte2;
      this.l = paramByte3;
      this.a.a(d.a.x);
      return;
      this.d = paramFloat1;
    }
  }
  
  public byte b()
  {
    return this.k;
  }
  
  public byte c()
  {
    return this.j;
  }
  
  public int d()
  {
    return this.i;
  }
  
  public int e()
  {
    return this.h;
  }
  
  public short f()
  {
    return this.g;
  }
  
  public double g()
  {
    return this.f;
  }
  
  public double h()
  {
    return this.e;
  }
  
  public double i()
  {
    return this.d;
  }
  
  public int j()
  {
    return this.c;
  }
  
  public double k()
  {
    return this.b;
  }
  
  public String toString()
  {
    return "ReceiveSettingPoint{PacketSequence=" + this.b + ", Opration_Code=" + this.c + ", POI_Longitude=" + this.d + ", POI_Latitude=" + this.e + ", POI_Altitude=" + this.f + ", Radius=" + this.g + ", speek=" + this.h + ", Start_Point_Pole_Angle=" + this.i + ", Paral=" + this.j + ", yaw_mode=" + this.k + ", report=" + this.l + '}';
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/h/ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */