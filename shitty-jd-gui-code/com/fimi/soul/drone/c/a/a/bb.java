package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class bb
  extends b
{
  public static final int b = 131;
  public static final int c = 20;
  private static final long serialVersionUID = 131L;
  public short d;
  public float e;
  public float f;
  public short g;
  public short h;
  public byte i;
  public byte j;
  public byte k;
  public short l;
  
  public bb()
  {
    this.a = 131;
  }
  
  public bb(c paramc)
  {
    this.a = 131;
    a(paramc.d);
  }
  
  public c a()
  {
    c localc = new c();
    localc.b = 20;
    localc.c = 131;
    localc.d.a(this.d);
    localc.d.a(this.e);
    localc.d.a(this.f);
    localc.d.a(this.g);
    localc.d.a(this.h);
    localc.d.b(this.i);
    localc.d.b(this.k);
    localc.d.a(this.l);
    return localc;
  }
  
  public void a(d paramd)
  {
    paramd.c();
    this.d = paramd.e();
    this.e = paramd.i();
    this.f = paramd.i();
    this.g = paramd.e();
    this.h = paramd.e();
    this.i = paramd.d();
    this.j = paramd.d();
    this.k = paramd.d();
    this.l = paramd.e();
  }
  
  public String toString()
  {
    return "msg_SettingWaypointUplink [number=" + this.d + ", Longitude=" + this.e + ", Latitude=" + this.f + ", Altitude=" + this.g + ", yaw_angle=" + this.h + ", hover_time=" + this.i + ", report=" + this.k + ", Number_to_be_transmited=" + this.l + "]";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/c/a/a/bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */