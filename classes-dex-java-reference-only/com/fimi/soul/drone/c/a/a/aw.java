package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class aw
  extends b
{
  public static final int b = 130;
  public static final int c = 2;
  private static final long serialVersionUID = 130L;
  public short d;
  
  public aw()
  {
    this.a = 130;
  }
  
  public aw(c paramc)
  {
    this.a = 130;
    a(paramc.d);
  }
  
  public c a()
  {
    c localc = new c();
    localc.b = 2;
    localc.c = 130;
    localc.d.a(this.d);
    return localc;
  }
  
  public void a(d paramd)
  {
    paramd.c();
    this.d = paramd.e();
  }
  
  public String toString()
  {
    return "msg_NumberUplink [MILINK_MSG_ID_RCDATA=130+number=" + this.d + "]";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/c/a/a/aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */