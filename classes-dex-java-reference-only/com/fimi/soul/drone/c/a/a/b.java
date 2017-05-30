package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class b
  extends com.fimi.soul.drone.c.a.b
{
  public static final int b = 152;
  public static final int c = 4;
  private static final long serialVersionUID = 152L;
  public short d;
  public byte e;
  public byte f;
  
  public b()
  {
    this.a = 152;
  }
  
  public b(c paramc)
  {
    this.a = 152;
    a(paramc.d);
  }
  
  public c a()
  {
    c localc = new c();
    localc.b = 4;
    localc.c = 152;
    localc.d.a(this.d);
    localc.d.b(this.e);
    localc.d.b(this.f);
    return localc;
  }
  
  public void a(d paramd)
  {
    paramd.c();
    this.d = paramd.e();
    this.e = paramd.d();
    this.f = paramd.d();
  }
  
  public String toString()
  {
    return "BeginFollowmeback{Packet_sequence=" + this.d + ", cmd=" + this.e + ", report=" + this.f + '}';
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/c/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */