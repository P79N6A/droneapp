package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class bg
  extends b
{
  public static final int b = 99;
  public static final int c = 5;
  private static final long serialVersionUID = 99L;
  public byte d;
  public byte e;
  public byte f;
  public byte g;
  public byte h;
  public byte i;
  
  public bg()
  {
    this.a = 99;
  }
  
  public bg(c paramc)
  {
    this.a = 99;
    a(paramc.d);
  }
  
  public c a()
  {
    c localc = new c();
    localc.b = 5;
    localc.c = 99;
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
    this.i = paramd.d();
  }
  
  public String toString()
  {
    return "msg_remotecontrol [ number1=" + this.d + ", number2=" + this.e + ", number3=" + this.f + ", number4=" + this.g + ", number5=" + this.h + "]";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/c/a/a/bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */