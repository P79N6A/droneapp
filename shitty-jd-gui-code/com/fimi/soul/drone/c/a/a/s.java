package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class s
  extends b
{
  public static final int b = 38;
  public static final int c = 11;
  private static final long serialVersionUID = 38L;
  public byte d;
  public byte e;
  public byte f;
  public int g;
  public int h;
  public c i;
  
  public s()
  {
    this.a = 38;
  }
  
  public s(c paramc)
  {
    this.a = 38;
    this.i = paramc;
    a(paramc.d);
  }
  
  public c a()
  {
    c localc = new c();
    localc.b = 11;
    localc.c = 38;
    return localc;
  }
  
  public void a(d paramd)
  {
    paramd.c();
    this.d = paramd.d();
    this.e = paramd.d();
    this.f = paramd.d();
    this.g = paramd.f();
    this.h = paramd.f();
  }
  
  public String toString()
  {
    return "IMUWorkStateInfoDwonLink{ISCHECK=" + (this.f & 0xFF) + "imuWorkState=" + (this.g & 0xFF) + ", magWorkState=" + (this.h & 0xFF) + ", miLinkPacket=" + this.i + '}';
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/c/a/a/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */