package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class as
  extends b
{
  public static final int b = 129;
  public static final int c = 11;
  private static final long serialVersionUID = 129L;
  public byte d;
  public int e;
  public int f;
  public short g;
  
  public as()
  {
    this.a = 129;
  }
  
  public as(c paramc)
  {
    this.a = 129;
    a(paramc.d);
  }
  
  public c a()
  {
    c localc = new c();
    localc.b = 11;
    localc.c = 129;
    localc.d.b(this.d);
    localc.d.b(this.e);
    localc.d.b(this.f);
    localc.d.a(this.g);
    return localc;
  }
  
  public void a(d paramd)
  {
    paramd.c();
    this.d = paramd.d();
    this.e = paramd.f();
    this.f = paramd.f();
    this.g = paramd.e();
  }
  
  public String toString()
  {
    return "msg_PosionUpLink [MILINK_MSG_ID_RCDATA=129+PacketSequence=" + this.d + ", HomeLongitude=" + this.e + ", HomeLatitude=" + this.f + ", HomeAltitude=" + this.g + "]";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/c/a/a/as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */