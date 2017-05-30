package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class ay
  extends b
{
  public static final int b = 197;
  public static final int c = 6;
  private static final long serialVersionUID = 197L;
  public byte d;
  public byte e;
  public byte f;
  public byte g;
  public byte h;
  
  public ay()
  {
    this.a = 197;
  }
  
  public ay(c paramc)
  {
    this.a = 197;
    a(paramc.d);
  }
  
  public c a()
  {
    c localc = new c();
    localc.b = 6;
    localc.c = 197;
    localc.d.b(this.d);
    localc.d.b(this.e);
    localc.d.b(this.f);
    localc.d.b(this.g);
    localc.d.b(this.h);
    return localc;
  }
  
  public void a(d paramd)
  {
    paramd.c();
    this.d = paramd.d();
    this.e = paramd.d();
    this.f = paramd.d();
    this.g = paramd.d();
    this.h = paramd.d();
  }
  
  public String toString()
  {
    return "msg_ReportAnswerFlightDownlink [Battery_hardware_version=" + this.d + ", Battery_software_version=" + this.e + ", Gimbal_hardware_version=" + this.f + ", Gimbal_software_version=" + this.g + ", Other_equipment_vesion=" + this.h + "]";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/c/a/a/ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */