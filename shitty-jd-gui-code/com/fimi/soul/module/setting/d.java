package com.fimi.soul.module.setting;

import com.fimi.kernel.utils.t;
import com.fimi.kernel.utils.v;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.droneconnection.connection.f.a;

public class d
{
  public static final int a = 7;
  public static final int b = 120;
  public static final int c = 30;
  public static int d = 16;
  public static int e = 17;
  public static int f = 0;
  public static int g = 1880;
  private static a h;
  private static d i;
  private static boolean j = false;
  
  public static d a(a parama)
  {
    h = parama;
    if (i == null) {
      i = new d();
    }
    j = com.fimi.kernel.c.e().m();
    return i;
  }
  
  private com.fimi.soul.drone.c.a.c b()
  {
    com.fimi.soul.drone.c.a.c localc = new com.fimi.soul.drone.c.a.c();
    localc.b = 7;
    localc.c = 134;
    localc.d.b((byte)0);
    localc.d.b((byte)e);
    localc.d.a(0.0F);
    localc.d.b((byte)0);
    return localc;
  }
  
  private com.fimi.soul.drone.c.a.c b(float paramFloat)
  {
    com.fimi.soul.drone.c.a.c localc = new com.fimi.soul.drone.c.a.c();
    localc.b = 6;
    localc.c = 134;
    localc.d.b((byte)0);
    localc.d.b((byte)d);
    localc.d.a(paramFloat);
    return localc;
  }
  
  public void a()
  {
    h.T().a(b());
  }
  
  public void a(float paramFloat)
  {
    float f1 = paramFloat;
    if (j) {
      f1 = (int)t.d(paramFloat);
    }
    h.T().a(b(f1));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/setting/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */