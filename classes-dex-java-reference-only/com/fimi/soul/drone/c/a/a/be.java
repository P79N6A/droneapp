package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class be
  extends b
{
  public static final int b = 132;
  public static final int c = 12;
  private static final long serialVersionUID = 132L;
  public short d;
  public float e;
  public float f;
  public byte g;
  public byte h;
  
  public be()
  {
    this.a = 132;
  }
  
  public be(c paramc)
  {
    this.a = 132;
    a(paramc.d);
  }
  
  public c a()
  {
    c localc = new c();
    localc.b = 12;
    localc.c = 132;
    localc.d.a(this.d);
    localc.d.a(this.e);
    localc.d.a(this.f);
    localc.d.b(this.g);
    localc.d.b(this.h);
    return localc;
  }
  
  public void a(d paramd)
  {
    paramd.c();
    this.d = paramd.e();
    this.e = paramd.i();
    this.f = paramd.i();
    this.g = paramd.d();
    this.h = paramd.d();
  }
  
  public String toString()
  {
    return "msg_forbiddenpointUplink{number=" + this.d + ", Longitude=" + this.e + ", Latitude=" + this.f + ", Altitude=" + this.g + ", Operation_code=" + this.h + '}';
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/c/a/a/be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */