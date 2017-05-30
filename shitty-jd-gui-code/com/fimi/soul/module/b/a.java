package com.fimi.soul.module.b;

import android.os.Handler;
import android.os.Message;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.droneconnection.connection.f.a;
import com.fimi.soul.drone.g.f;

public class a
{
  static int a = 0;
  private static final int f = 1;
  private static final int g = 2;
  Handler b = new Handler()
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
          if (a.a(a.this) != null)
          {
            a.a(a.this).e();
            a.a(a.this).f();
          }
        } while ((a.b(a.this) == null) || (a.c(a.this) == null));
        a.b(a.this).a(a.c(a.this).c);
        a.a(a.this, null);
        return;
      } while (a.a(a.this) == null);
      a.a(a.this).e();
    }
  };
  private f c;
  private com.fimi.soul.drone.a d;
  private volatile c e;
  private b h;
  
  public a(b paramb)
  {
    this.h = paramb;
  }
  
  public static a a(b paramb)
  {
    return new a(paramb);
  }
  
  public void a()
  {
    a = 0;
    if ((this.c != null) && (!this.c.b()))
    {
      this.c.c();
      return;
    }
    this.c = new f(200, new Runnable()
    {
      public void run()
      {
        if (a.c(a.this) != null)
        {
          a.a += 1;
          a.d(a.this).T().a(a.c(a.this));
          if (a.a >= 5) {
            a.this.b.sendEmptyMessage(1);
          }
        }
      }
    });
    this.c.d();
  }
  
  public void a(com.fimi.soul.drone.a parama, c paramc)
  {
    this.d = parama;
    this.e = paramc;
  }
  
  public void b()
  {
    this.b.sendEmptyMessage(2);
  }
  
  public boolean c()
  {
    return this.c.b();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */