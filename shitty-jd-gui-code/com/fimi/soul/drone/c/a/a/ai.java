package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class ai
  extends b
{
  public static final int b = 193;
  public static final int c = 22;
  private static final long serialVersionUID = 193L;
  public byte d;
  public byte e;
  public char f;
  public short g;
  public long h;
  public long i;
  public long j;
  public long k;
  
  public ai()
  {
    this.a = 193;
  }
  
  public ai(c paramc)
  {
    this.a = 193;
    a(paramc.d);
  }
  
  public c a()
  {
    c localc = new c();
    localc.b = 22;
    localc.c = 193;
    localc.d.b(this.d);
    localc.d.b(this.e);
    localc.d.a(this.f);
    localc.d.a(this.g);
    localc.d.a(this.h);
    localc.d.a(this.i);
    localc.d.a(this.j);
    localc.d.a(this.k);
    return localc;
  }
  
  public void a(d paramd)
  {
    paramd.c();
    this.d = paramd.d();
    this.e = paramd.d();
    this.f = paramd.l();
    this.g = paramd.e();
    this.h = paramd.m();
    this.i = paramd.m();
    this.j = paramd.m();
    this.k = paramd.m();
  }
  
  public String toString()
  {
    return "msg_FCAnswerDownlink{type=" + this.d + ", Model=" + this.e + ", FC_hardware_version=" + this.f + ", Software_version=" + this.g + ", IDA=" + this.h + ", IDB=" + this.i + ", IDC=" + this.j + ", reserve=" + this.k + '}';
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/c/a/a/ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */