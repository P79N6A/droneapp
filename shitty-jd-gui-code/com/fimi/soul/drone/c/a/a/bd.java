package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class bd
  extends b
{
  public static final int b = 6;
  public static final int c = 18;
  private static final long serialVersionUID = 6L;
  public float d;
  public float e;
  public float f;
  public short g;
  public short h;
  public byte i;
  public short j;
  
  public bd()
  {
    this.a = 6;
  }
  
  public bd(c paramc)
  {
    this.a = 6;
    a(paramc.d);
  }
  
  public c a()
  {
    c localc = new c();
    localc.b = 18;
    localc.c = 6;
    localc.d.a(this.d);
    localc.d.a(this.e);
    localc.d.a((int)this.f);
    localc.d.a(this.g);
    localc.d.a(this.h);
    localc.d.b(this.i);
    localc.d.a(this.j);
    return localc;
  }
  
  public void a(d paramd)
  {
    paramd.c();
  }
  
  public String toString()
  {
    return "msg_followme [Packet_Sequence=Packet_Sequence, GCSLongitude=" + this.d + ", GCSLatitude=" + this.e + ", HomeAltitude=" + this.f + ", ground_speed=" + this.g + ", ground_course=" + this.h + ", SatelliteNumber=" + this.i + ", accuracy=" + this.j + "]";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/c/a/a/bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */