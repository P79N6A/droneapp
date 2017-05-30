package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class ap
  extends b
{
  public static final int b = 4;
  public static final int c = 16;
  private static final long serialVersionUID = 4L;
  public float d;
  public float e;
  public float f;
  public byte g;
  public float h;
  public c i;
  public byte j;
  
  public ap()
  {
    this.a = 4;
  }
  
  public ap(c paramc)
  {
    this.a = 4;
    this.i = paramc;
    a(paramc.d);
  }
  
  public c a()
  {
    return null;
  }
  
  public void a(d paramd)
  {
    paramd.c();
    this.d = paramd.i();
    this.e = paramd.i();
    this.f = paramd.j();
    this.g = paramd.d();
    this.h = paramd.i();
    this.j = paramd.d();
  }
  
  public String toString()
  {
    return "msg_MessionState [HomeLongitude=" + this.d + ", HomeLatitude=" + this.e + ", HomeAltitude=" + this.f + ", CurrentWaypoint=" + this.g + "]";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/c/a/a/ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */