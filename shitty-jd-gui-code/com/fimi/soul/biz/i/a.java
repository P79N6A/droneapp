package com.fimi.soul.biz.i;

import com.fimi.soul.biz.camera.entity.RelayEntity;
import com.fimi.soul.biz.e.d;
import com.fimi.soul.biz.e.d.a;

public class a
  implements d.a
{
  public static a a;
  private static final int b = 100;
  private volatile boolean c;
  private d d = d.a();
  
  public a()
  {
    this.d.a(this);
  }
  
  public static a b()
  {
    if (a == null) {}
    try
    {
      if (a == null) {
        a = new a();
      }
      return a;
    }
    finally {}
  }
  
  public void a()
  {
    this.d.b();
    this.d.c("5G");
  }
  
  public void a(RelayEntity paramRelayEntity)
  {
    if ((paramRelayEntity != null) && (!"5G".equals(paramRelayEntity.getDevice_type()))) {
      this.c = true;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  public boolean c()
  {
    return this.c;
  }
  
  public void d()
  {
    this.c = false;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/i/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */