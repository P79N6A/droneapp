package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class bo
  extends b
{
  public static final int b = 201;
  public static final int c = 4;
  private static final long serialVersionUID = 201L;
  public byte d;
  public short e;
  public byte f;
  
  public bo()
  {
    this.a = 201;
  }
  
  public bo(c paramc)
  {
    this.a = 201;
    a(paramc.d);
  }
  
  public c a()
  {
    c localc = new c();
    localc.b = 4;
    localc.c = 201;
    localc.d.b(this.d);
    localc.d.a(this.e);
    localc.d.b(this.f);
    return localc;
  }
  
  public void a(d paramd)
  {
    paramd.c();
    this.d = paramd.d();
    this.e = paramd.e();
    this.f = paramd.d();
  }
  
  public String toString()
  {
    return "updatedronebackreport [Packet_sequence=" + this.e + ", report=" + this.f + "]";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/c/a/a/bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */