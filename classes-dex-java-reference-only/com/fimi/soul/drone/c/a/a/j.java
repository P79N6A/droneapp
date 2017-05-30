package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class j
  extends b
{
  public static final int b = 134;
  public static final int c = 7;
  private static final long serialVersionUID = 134L;
  public byte d;
  public byte e;
  public float f;
  public byte g;
  
  public j()
  {
    this.a = 134;
  }
  
  public j(c paramc)
  {
    this.a = 134;
    a(paramc.d);
  }
  
  public c a()
  {
    c localc = new c();
    localc.b = 7;
    localc.c = 134;
    localc.d.b(this.d);
    localc.d.b(this.e);
    localc.d.a(this.f);
    localc.d.b(this.g);
    return localc;
  }
  
  public void a(d paramd)
  {
    paramd.c();
    this.d = paramd.d();
    this.e = paramd.d();
    this.f = paramd.i();
    this.g = paramd.d();
  }
  
  public String toString()
  {
    return "DroneRTHMessage{Packet_sequence=" + this.d + ", cmdID=" + this.e + ", height=" + this.f + ", report=" + this.g + '}';
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/c/a/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */