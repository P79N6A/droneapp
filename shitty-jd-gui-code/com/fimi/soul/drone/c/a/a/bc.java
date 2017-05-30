package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class bc
  extends b
{
  public static final int b = 146;
  public static final int c = 3;
  private static final long serialVersionUID = 146L;
  public short d;
  public byte e;
  
  public bc()
  {
    this.a = 146;
  }
  
  public bc(c paramc)
  {
    this.a = 146;
    a(paramc.d);
  }
  
  public c a()
  {
    c localc = new c();
    localc.b = 3;
    localc.c = 146;
    localc.d.a(this.d);
    localc.d.b(this.e);
    return localc;
  }
  
  public void a(d paramd)
  {
    paramd.c();
    this.d = paramd.e();
    this.e = paramd.d();
  }
  
  public String toString()
  {
    return "msg_Gohome [Packet_sequence=" + this.d + "]";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/c/a/a/bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */