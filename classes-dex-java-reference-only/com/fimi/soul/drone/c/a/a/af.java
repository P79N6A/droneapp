package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class af
  extends b
{
  public static final int b = 198;
  public static final int c = 10;
  private static final long serialVersionUID = 198L;
  public short d;
  public short e;
  public short f;
  public short g;
  public short h;
  public c i;
  
  public af()
  {
    this.a = 198;
  }
  
  public af(c paramc)
  {
    this.a = 198;
    this.i = paramc;
    a(paramc.d);
  }
  
  public c a()
  {
    c localc = new c();
    localc.b = 10;
    localc.c = 198;
    localc.d.a(this.d);
    localc.d.a(this.e);
    localc.d.a(this.g);
    localc.d.a(this.h);
    localc.d.a(this.f);
    return localc;
  }
  
  public void a(d paramd)
  {
    paramd.c();
    this.d = paramd.e();
    this.e = paramd.e();
    this.g = paramd.e();
    this.h = paramd.e();
    this.f = paramd.e();
  }
  
  public String toString()
  {
    return "msg_BatteryAnswerUplink [Battery_IDA=" + this.d + ", Battery_IDB=" + this.e + ", Cycle_count=" + this.f + ", Design_capacity=" + this.g + ", Full_charge_capacity=" + this.h + "]";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/c/a/a/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */