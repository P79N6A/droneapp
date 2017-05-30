package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class bk
  extends b
{
  public static final int b = 200;
  public static final int c = 6;
  private static final long serialVersionUID = 200L;
  public byte d;
  public byte e;
  public int f;
  
  public bk()
  {
    this.a = 200;
  }
  
  public bk(c paramc)
  {
    this.a = 200;
    a(paramc.d);
  }
  
  public c a()
  {
    c localc = new c();
    localc.b = 6;
    localc.c = 200;
    localc.d.b(this.d);
    localc.d.b(this.e);
    localc.d.b(this.f);
    return localc;
  }
  
  public void a(d paramd)
  {
    paramd.c();
    this.d = paramd.d();
    this.e = paramd.d();
    this.f = paramd.f();
  }
  
  public String toString()
  {
    return "updateDroneOrder [Packet_sequence=" + this.d + ", target_ID=" + this.e + ", length=" + this.f + "]";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/c/a/a/bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */