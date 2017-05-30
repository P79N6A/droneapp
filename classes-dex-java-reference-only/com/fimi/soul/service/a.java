package com.fimi.soul.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

public class a
{
  private static CameraSocketService a = null;
  private static a b;
  private static CameraSocketService.h e;
  private boolean c = false;
  private Context d;
  private ServiceConnection f = new ServiceConnection()
  {
    public void onServiceConnected(ComponentName paramAnonymousComponentName, IBinder paramAnonymousIBinder)
    {
      com.fimi.soul.base.a.a("onServiceConnected", CameraSocketService.class);
      a.a(((CameraSocketService.c)paramAnonymousIBinder).a());
      a.k().a(a.j());
      a.k().e();
      if (a.j() != null) {
        a.j().a(1, true, "onServiceConnected");
      }
    }
    
    public void onServiceDisconnected(ComponentName paramAnonymousComponentName)
    {
      com.fimi.soul.base.a.a("onServiceDisconnected", CameraSocketService.class);
      a.a(null);
    }
  };
  
  public a(Context paramContext)
  {
    this.d = paramContext;
  }
  
  public static a a(Context paramContext)
  {
    if (b == null) {
      b = new a(paramContext);
    }
    if (a == null) {
      b.c();
    }
    for (;;)
    {
      return b;
      if (!a.g()) {
        a.e();
      }
    }
  }
  
  public void a()
  {
    if (a != null) {
      a.b();
    }
  }
  
  public void a(CameraSocketService.h paramh)
  {
    e = paramh;
    if (a != null) {
      a.a(e);
    }
  }
  
  public void a(String paramString1, String paramString2)
  {
    a.a(paramString1, paramString2);
  }
  
  public CameraSocketService.b b()
  {
    return a.c();
  }
  
  public void c()
  {
    try
    {
      if (!this.c)
      {
        this.c = true;
        Intent localIntent = new Intent();
        localIntent.setClass(this.d, CameraSocketService.class);
        this.d.getApplicationContext().bindService(localIntent, this.f, 1);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void d()
  {
    try
    {
      if (this.c)
      {
        this.c = false;
        new Intent().setClass(this.d, CameraSocketService.class);
        this.d.getApplicationContext().unbindService(this.f);
        a.d();
        a.onDestroy();
        a = null;
        b = null;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void e()
  {
    a.a();
  }
  
  public String f()
  {
    if (a == null) {
      return null;
    }
    return a.f();
  }
  
  public String g()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    if ((a != null) && (h()))
    {
      localStringBuffer.append("rtsp://");
      localStringBuffer.append(a.f());
      localStringBuffer.append("/media/stream1");
      return localStringBuffer.toString();
    }
    return null;
  }
  
  public boolean h()
  {
    if (a == null) {
      return false;
    }
    return a.g();
  }
  
  public void i()
  {
    if (a != null) {
      a.e();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/service/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */