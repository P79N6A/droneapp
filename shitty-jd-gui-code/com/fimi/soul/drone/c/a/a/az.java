package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class az
  extends b
{
  public static final int b = 193;
  public static final int c = 3;
  private static final long serialVersionUID = 193L;
  public byte d;
  public short e;
  
  public az()
  {
    this.a = 193;
  }
  
  public az(c paramc)
  {
    this.a = 193;
    a(paramc.d);
  }
  
  public c a()
  {
    c localc = new c();
    localc.b = 3;
    localc.c = 193;
    localc.d.b(this.d);
    localc.d.a(this.e);
    return localc;
  }
  
  public void a(d paramd)
  {
    paramd.c();
    this.d = paramd.d();
    this.e = paramd.e();
  }
  
  public String toString()
  {
    return "msg_RequestVersionUplink [Type=" + this.d + ", APP_version=" + this.e + "]";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/c/a/a/az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */