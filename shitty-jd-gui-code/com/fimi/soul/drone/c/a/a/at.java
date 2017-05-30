package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class at
  extends b
{
  public static final int b = 128;
  public static final int c = 13;
  private static final long serialVersionUID = 128L;
  public byte d;
  public double e;
  public double f;
  public short g;
  public byte h;
  public byte i;
  
  public at()
  {
    this.a = 128;
  }
  
  public at(c paramc)
  {
    this.a = 128;
    a(paramc.d);
  }
  
  public c a()
  {
    c localc = new c();
    localc.b = 13;
    localc.c = 128;
    localc.d.b(this.d);
    localc.d.a(this.e);
    localc.d.a(this.f);
    localc.d.a(this.g);
    localc.d.b(this.h);
    localc.d.b(this.i);
    return localc;
  }
  
  public void a(d paramd)
  {
    paramd.c();
    this.d = paramd.d();
    this.e = paramd.i();
    this.f = paramd.i();
    this.g = paramd.e();
    this.h = paramd.d();
    this.i = paramd.d();
  }
  
  public String toString()
  {
    return "msg_PosionUplink_home [MILINK_MSG_ID_RCDATA=128+PacketSequence=" + this.d + ", HomeLongitude=" + this.e + ", HomeLatitude=" + this.f + ", HomeAltitude=" + this.g + ", reserve=" + this.h + ", reserve2=" + this.i + "]";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/c/a/a/at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */