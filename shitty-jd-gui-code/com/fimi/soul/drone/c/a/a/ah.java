package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class ah
  extends b
{
  public static final int b = 151;
  public static final int c = 3;
  private static final long serialVersionUID = 151L;
  public short d;
  public byte e;
  
  public ah()
  {
    this.a = 151;
  }
  
  public ah(c paramc)
  {
    this.a = 151;
    a(paramc.d);
  }
  
  public c a()
  {
    c localc = new c();
    localc.b = 3;
    localc.c = 151;
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


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/c/a/a/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */