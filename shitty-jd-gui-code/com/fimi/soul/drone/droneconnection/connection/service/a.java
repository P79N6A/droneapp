package com.fimi.soul.drone.droneconnection.connection.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.droneconnection.connection.e;
import com.fimi.soul.drone.droneconnection.connection.f.a;
import com.fimi.soul.drone.droneconnection.connection.f.b;
import java.util.concurrent.atomic.AtomicReference;

public class a
  implements f.a
{
  private static final String a = a.class.getSimpleName();
  private boolean b;
  private final Handler c = new Handler();
  private final AtomicReference<String> d = new AtomicReference();
  private final e e = new e()
  {
    private final Runnable b = new Runnable()
    {
      public void run()
      {
        a.a(a.this).e();
      }
    };
    private final Runnable c = new Runnable()
    {
      public void run()
      {
        a.a(a.this, false);
        a.a(a.this).f();
        a.this.g();
      }
    };
    private final Runnable d = new Runnable()
    {
      public void run()
      {
        a.b(a.this).removeCallbacks(this);
        a.a(a.this, false);
        String str = (String)a.c(a.this).get();
        if (str != null) {
          Log.e("error", str);
        }
      }
    };
    
    public void a()
    {
      a.b(a.this).post(this.b);
    }
    
    public void a(final b paramAnonymousb)
    {
      a.b(a.this).post(new Runnable()
      {
        public void run()
        {
          a.a(a.this, true);
          a.a(a.this).a(paramAnonymousb);
        }
      });
    }
    
    public void a(String paramAnonymousString)
    {
      a.c(a.this).set(paramAnonymousString);
      a.b(a.this).post(this.d);
    }
    
    public void a(final boolean paramAnonymousBoolean)
    {
      a.b(a.this).post(new Runnable()
      {
        public void run()
        {
          a.a(a.this).a(paramAnonymousBoolean);
        }
      });
    }
    
    public void b()
    {
      a.b(a.this).post(this.c);
    }
    
    public void b(final boolean paramAnonymousBoolean)
    {
      a.b(a.this).post(new Runnable()
      {
        public void run()
        {
          a.a(a.this).b(paramAnonymousBoolean);
        }
      });
    }
  };
  private final ServiceConnection f = new ServiceConnection()
  {
    public void onServiceConnected(ComponentName paramAnonymousComponentName, IBinder paramAnonymousIBinder)
    {
      a.a(a.this, (MiLinkService.a)paramAnonymousIBinder);
      a.d(a.this);
    }
    
    public void onServiceDisconnected(ComponentName paramAnonymousComponentName)
    {
      a.e(a.this);
    }
  };
  private final Context g;
  private final f.b h;
  private MiLinkService.a i;
  private boolean j;
  private boolean k;
  
  public a(Context paramContext, f.b paramb)
  {
    this.g = paramContext;
    this.h = paramb;
  }
  
  private void h()
  {
    if (this.j)
    {
      i();
      return;
    }
    this.g.bindService(new Intent(this.g, MiLinkService.class), this.f, 1);
  }
  
  private void i()
  {
    this.i.b();
    this.i.a(a, this.e);
  }
  
  private void j()
  {
    this.j = true;
    i();
  }
  
  private void k()
  {
    this.b = false;
    this.j = false;
    this.h.f();
  }
  
  public void a(c paramc)
  {
    if (!a()) {
      return;
    }
    this.i.a(paramc);
  }
  
  public void a(boolean paramBoolean)
  {
    this.i.a(paramBoolean);
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    if (!a()) {
      return;
    }
    this.i.a(paramArrayOfByte);
  }
  
  public boolean a()
  {
    return this.b;
  }
  
  public void b()
  {
    if (a())
    {
      g();
      return;
    }
    h();
  }
  
  public void b(boolean paramBoolean)
  {
    this.i.b(paramBoolean);
  }
  
  public void c()
  {
    if (a())
    {
      this.h.e();
      return;
    }
    this.h.f();
  }
  
  public void d()
  {
    g();
  }
  
  public String e()
  {
    return com.fimi.soul.drone.droneconnection.connection.a.a.a();
  }
  
  public boolean f()
  {
    return this.i.d();
  }
  
  public void g()
  {
    if (this.j)
    {
      if (this.i.a() == 2) {
        this.i.c();
      }
      this.i.a(a);
    }
    try
    {
      this.g.unbindService(this.f);
      k();
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/droneconnection/connection/service/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */