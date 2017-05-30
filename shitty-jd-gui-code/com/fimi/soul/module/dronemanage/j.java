package com.fimi.soul.module.dronemanage;

import android.os.Handler;
import android.os.Message;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.droneconnection.connection.f.a;
import com.fimi.soul.drone.g.f;

public class j
{
  static f a;
  static a b;
  static c c;
  static int d = 0;
  static Handler e = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      switch (paramAnonymousMessage.what)
      {
      }
      do
      {
        return;
      } while (j.a == null);
      j.a.e();
      j.a.f();
    }
  };
  private static final int f = 1;
  
  public static void a()
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
        j.d += 1;
        j.b.T().a(j.c);
        if (j.d >= 5) {
          j.e.sendEmptyMessage(1);
        }
      }
    });
    a.d();
  }
  
  public static void a(a parama, c paramc)
  {
    b = parama;
    c = paramc;
  }
  
  public static void b()
  {
    e.sendEmptyMessage(1);
  }
  
  public boolean c()
  {
    return a.b();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/dronemanage/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */