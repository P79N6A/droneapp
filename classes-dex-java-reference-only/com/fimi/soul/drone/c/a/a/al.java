package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class al
  extends b
{
  public static final int b = 192;
  public static final int c = 2;
  private static final long serialVersionUID = 192L;
  public byte d;
  public byte e;
  
  public al()
  {
    this.a = 192;
  }
  
  public al(c paramc)
  {
    this.a = 192;
    a(paramc.d);
  }
  
  public c a()
  {
    c localc = new c();
    localc.b = 2;
    localc.c = 192;
    localc.d.b(this.d);
    localc.d.b(this.e);
    return localc;
  }
  
  public void a(d paramd)
  {
    paramd.c();
    this.d = paramd.d();
    this.e = paramd.d();
  }
  
  public String toString()
  {
    return "msg_GoupOrderUplink [MILINK_MSG_ID_RCDATA=192+Packet_sequence=" + this.d + ", target_ID=" + this.e + "]";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/c/a/a/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */