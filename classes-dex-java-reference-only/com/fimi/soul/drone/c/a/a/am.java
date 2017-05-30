package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class am
  extends b
{
  public static final int b = 2;
  public static final int c = 19;
  private static final long serialVersionUID = 2L;
  public c d;
  public byte e;
  public byte f;
  public byte g;
  public byte h;
  public byte i;
  public short j;
  public short k;
  public short l;
  public byte m;
  public byte n;
  public short o;
  public short p;
  public byte q;
  public byte r;
  
  public am()
  {
    this.a = 2;
  }
  
  public am(c paramc)
  {
    this.a = 2;
    this.d = paramc;
    a(paramc.d);
  }
  
  public c a()
  {
    c localc = new c();
    localc.b = 19;
    localc.c = 2;
    localc.d.b(this.e);
    localc.d.b(this.f);
    localc.d.b(this.g);
    localc.d.b(this.h);
    localc.d.b(this.i);
    localc.d.a(this.j);
    localc.d.a(this.k);
    localc.d.a(this.l);
    localc.d.b(this.m);
    localc.d.b(this.n);
    localc.d.a(this.o);
    localc.d.a(this.p);
    localc.d.b(this.q);
    localc.d.b(this.r);
    return localc;
  }
  
  public void a(d paramd)
  {
    paramd.c();
    this.e = paramd.d();
    this.f = paramd.d();
    this.g = paramd.d();
    this.h = paramd.d();
    this.i = paramd.d();
    this.j = paramd.e();
    this.k = paramd.e();
    this.l = paramd.e();
    this.m = paramd.d();
    this.n = paramd.d();
    this.o = paramd.e();
    this.p = paramd.e();
    this.q = paramd.d();
    this.r = paramd.d();
  }
  
  public String toString()
  {
    return "msg_Heartbeat{Heartbeat=" + this.e + ", ThrottleStick=" + this.f + ", RollStick=" + this.g + ", PitchStick=" + this.h + ", YawStick=" + this.i + ", RollAngle=" + this.j + ", PitchAngle=" + this.k + ", HeadingAngle=" + this.l + ", DisarmCount=" + this.m + ", FlightMode=" + this.n + ", GroundSpeed=" + this.o + ", DownVelocity=" + this.p + ", rcReceiver=" + this.q + ", takeoffTag=" + this.r + '}';
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/c/a/a/am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */