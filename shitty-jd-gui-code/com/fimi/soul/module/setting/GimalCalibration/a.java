package com.fimi.soul.module.setting.GimalCalibration;

import android.content.Context;
import android.content.res.Resources;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.droneconnection.connection.f.a;
import com.fimi.soul.drone.h.q;
import com.fimi.soul.drone.h.w;
import com.fimi.soul.module.dronemanage.h;
import com.fimi.soul.module.dronemanage.h.a;
import com.fimi.soul.utils.ao;

public class a
  implements d.b, h.a
{
  public static int a = 100;
  public static final byte b = 7;
  public static final byte c = 8;
  public static final int d = 2;
  private static final byte h = 0;
  h e = null;
  a f;
  com.fimi.soul.drone.a g;
  private final int i = 0;
  private final int j = 1;
  private final int k = 2;
  private final int l = 3;
  private final int m = 4;
  private final int n = 5;
  private boolean o;
  
  public a(a parama, com.fimi.soul.drone.a parama1)
  {
    this.f = parama;
    this.g = parama1;
  }
  
  private void b(byte paramByte)
  {
    String str = a(paramByte);
    if (this.f != null)
    {
      this.o = false;
      if (str != null) {
        this.f.a(str);
      }
    }
    else
    {
      return;
    }
    this.f.a(this.g.d.getString(2131361927));
  }
  
  private void h()
  {
    byte b1 = this.g.ak().b();
    if (b1 > 0) {
      b(b1);
    }
    int i1;
    do
    {
      return;
      i1 = this.g.ak().d();
      this.f.a(i1);
    } while (i1 != a);
    this.o = false;
    f();
    this.f.c();
  }
  
  public String a(byte paramByte)
  {
    int i1 = 0;
    while (i1 < 8)
    {
      if (ao.a(paramByte, i1) > 0) {}
      switch (i1)
      {
      default: 
        i1 += 1;
        break;
      case 0: 
        return b(2131361929);
      case 1: 
        return b(2131361931);
      case 2: 
        return b(2131361932);
      case 3: 
        return b(2131361930);
      case 4: 
        return b(2131361928);
      case 5: 
        return b(2131361933);
      }
    }
    return null;
  }
  
  public void a()
  {
    c localc = c();
    this.g.T().a(localc);
    if (this.e == null) {
      this.e = h.a(this);
    }
    this.e.a(this.g, localc);
    this.e.b();
    this.o = true;
  }
  
  public void a(int paramInt) {}
  
  public String b(int paramInt)
  {
    return this.g.d.getResources().getString(paramInt);
  }
  
  public void b()
  {
    if (this.e != null)
    {
      this.f.b();
      this.e.d();
      this.e.c();
      this.e = null;
    }
  }
  
  public c c()
  {
    c localc = new c();
    localc.b = 2;
    localc.c = 122;
    localc.d.b((byte)8);
    localc.d.b((byte)0);
    return localc;
  }
  
  public void d()
  {
    com.fimi.soul.module.b.d.a(this.g).r();
  }
  
  public void e()
  {
    this.g.a(this);
  }
  
  public void f()
  {
    this.g.b(this);
  }
  
  public void g()
  {
    if (this.f != null) {
      this.f = null;
    }
  }
  
  public void onDroneEvent(d.a parama, com.fimi.soul.drone.a parama1)
  {
    switch (1.a[parama.ordinal()])
    {
    }
    do
    {
      do
      {
        do
        {
          return;
          b();
          h();
          return;
        } while ((this.f == null) || (!this.o));
        this.f.a(b(2131361923));
        return;
        if ((this.f != null) && (!this.o))
        {
          this.f.d();
          return;
        }
        if ((this.f != null) && (!parama1.U()) && (this.o))
        {
          this.f.a(b(2131361924));
          return;
        }
      } while ((this.f == null) || (!this.o));
      if (parama1.ad().Z())
      {
        this.f.a(b(2131361929));
        return;
      }
    } while (!parama1.ad().u());
    this.f.a(b(2131362143));
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt);
    
    public abstract void a(String paramString);
    
    public abstract void b();
    
    public abstract void b(int paramInt);
    
    public abstract void c();
    
    public abstract void d();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/setting/GimalCalibration/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */