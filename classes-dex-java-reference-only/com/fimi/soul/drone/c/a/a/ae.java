package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class ae
  extends b
{
  public static final int b = 130;
  public static final int c = 19;
  private static final long serialVersionUID = 130L;
  public short d;
  public float e;
  public float f;
  public short g;
  public short h;
  public byte i;
  public byte j;
  public short k;
  private volatile c l;
  
  public ae()
  {
    this.a = 130;
  }
  
  public ae(c paramc)
  {
    this.l = paramc;
    this.a = 130;
    a(paramc.d);
  }
  
  public c a()
  {
    c localc = new c();
    localc.b = 19;
    localc.c = 130;
    localc.d.a(this.d);
    localc.d.a(this.e);
    localc.d.a(this.f);
    localc.d.a(this.g);
    localc.d.a(this.h);
    localc.d.a((short)this.i);
    localc.d.b(this.j);
    localc.d.a(this.k);
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
    this.k = paramd.e();
  }
  
  public c b()
  {
    return this.l;
  }
  
  public String toString()
  {
    return "msg_SettingWaypointUplink [number=" + this.d + ", Longitude=" + this.e + ", Latitude=" + this.f + ", Altitude=" + this.g + ", yaw_angle=" + this.h + ", hover_time=" + this.i + ", speed=" + this.j + ", Number_to_be_transmited=" + this.k + "]";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/c/a/a/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */