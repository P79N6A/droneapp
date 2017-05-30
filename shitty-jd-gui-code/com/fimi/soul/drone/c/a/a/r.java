package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class r
  extends b
{
  public static final int b = 40;
  public static final int c = 19;
  private static final long serialVersionUID = 40L;
  public byte d;
  public byte e;
  public short f;
  public short g;
  public short h;
  public short i;
  public short j;
  public short k;
  public c l;
  
  public r()
  {
    this.a = 40;
  }
  
  public r(c paramc)
  {
    this.a = 40;
    this.l = paramc;
    a(paramc.d);
  }
  
  public c a()
  {
    c localc = new c();
    localc.b = 19;
    localc.c = 40;
    return localc;
  }
  
  public void a(d paramd)
  {
    paramd.c();
    this.d = paramd.d();
    this.e = paramd.d();
    paramd.c(7);
    this.f = paramd.e();
    this.g = paramd.e();
    this.h = paramd.e();
    this.i = paramd.e();
    this.j = paramd.e();
    this.k = paramd.e();
  }
  
  public String toString()
  {
    return "IMUInfoDwonLink{gyroX=" + this.f + ", gyroY=" + this.g + ", gyroZ=" + this.h + ", accelX=" + this.i + ", accelY=" + this.j + ", accelZ=" + this.k + ", miLinkPacket=" + this.l + '}';
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/c/a/a/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */