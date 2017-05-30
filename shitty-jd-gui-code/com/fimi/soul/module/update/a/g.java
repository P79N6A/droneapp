package com.fimi.soul.module.update.a;

import android.content.Context;
import com.fimi.kernel.c;
import com.fimi.soul.biz.camera.b;
import com.fimi.soul.biz.camera.entity.X11SystemConfig;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.d.f;
import com.fimi.soul.drone.h.i;
import com.fimi.soul.drone.h.u;
import com.fimi.soul.entity.DroneInfoBean;

public class g
  implements d.b
{
  Context a;
  com.fimi.soul.drone.a b;
  a c;
  com.fimi.soul.biz.camera.d d;
  
  public g(Context paramContext, com.fimi.soul.drone.a parama)
  {
    this.a = paramContext;
    this.b = parama;
    parama.a(this);
    this.c = a.a();
    this.d = ((com.fimi.soul.biz.camera.d)b.a().d());
    c.c().a("firmware_info", DroneInfoBean.class);
  }
  
  private void a(u paramu)
  {
    int i = paramu.c() & 0xFFFF;
    int j = paramu.b();
    int k = paramu.a() & 0xFF;
    int m = paramu.d();
    long l1 = paramu.e();
    long l2 = paramu.f();
    long l3 = paramu.g();
    long l4 = paramu.h();
    if (i > 0)
    {
      this.c.a(new e(k, m, i, String.valueOf(Long.valueOf(j)), l1, l2, l3, l4));
      this.c.a(k, i);
    }
  }
  
  private void d()
  {
    i locali;
    if (this.b.c.a() == 51)
    {
      locali = (i)this.b.c;
      this.d.i().setDvVersion(locali.d() + "");
      this.d.i().setCameraType(locali.b());
      if (com.fimi.soul.biz.e.d.a().k())
      {
        this.c.a(13, locali.d());
        this.c.a(new e("", 13, locali.d()));
      }
    }
    else
    {
      return;
    }
    this.c.a(4, locali.d());
    this.c.a(new e("", 4, locali.d()));
  }
  
  public void a()
  {
    f.k(this.b);
    this.d.u().j();
  }
  
  public void b()
  {
    f.j(this.b);
    this.d.u().j();
  }
  
  public void c()
  {
    this.b.b(this);
  }
  
  public void onDroneEvent(d.a parama, com.fimi.soul.drone.a parama1)
  {
    switch (1.a[parama.ordinal()])
    {
    default: 
      return;
    case 1: 
      a(parama1.j());
      return;
    }
    d();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/update/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */