package com.fimi.soul.module.dronemanage;

import android.os.Handler;
import android.os.Message;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.droneconnection.connection.f.a;
import com.fimi.soul.drone.g.f;

public class h
{
  static f a;
  static a b;
  static c c;
  static int d = 0;
  public static final int e = 0;
  public static final int f = 1;
  static a g;
  private static final int i = 1;
  private static final int j = 2;
  Handler h = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      switch (paramAnonymousMessage.what)
      {
      }
      do
      {
        do
        {
          return;
        } while (h.a == null);
        h.a.e();
        h.a.f();
        return;
        if (h.a != null)
        {
          h.a.e();
          h.a.f();
        }
      } while (h.g == null);
      h.g.a(1);
      h.g = null;
    }
  };
  
  public h() {}
  
  public h(a parama)
  {
    g = parama;
  }
  
  public static h a()
  {
    return new h();
  }
  
  public static h a(a parama)
  {
    return new h(parama);
  }
  
  public void a(a parama, c paramc)
  {
    b = parama;
    c = paramc;
  }
  
  public void b()
  {
    d = 0;
    if (a != null)
    {
      a.c();
      return;
    }
    a = new f(200, new Runnable()
    {
      public void run()
      {
        h.d += 1;
        h.b.T().a(h.c);
        if (h.d >= 5) {
          h.this.h.sendEmptyMessage(2);
        }
      }
    });
    a.d();
  }
  
  public void c()
  {
    this.h.sendEmptyMessage(1);
  }
  
  public void d()
  {
    g = null;
  }
  
  public boolean e()
  {
    return a.b();
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/dronemanage/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */