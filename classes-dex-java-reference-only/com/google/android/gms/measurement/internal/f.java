package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.support.annotation.MainThread;
import com.google.android.gms.common.internal.d;

public final class f
{
  private static Boolean d;
  private static Boolean e;
  private final Handler a;
  private final Context b;
  private final a c;
  
  public f(a parama)
  {
    this.b = parama.a();
    d.a(this.b);
    this.c = parama;
    this.a = new Handler();
  }
  
  public static boolean a(Context paramContext, boolean paramBoolean)
  {
    d.a(paramContext);
    if ((d != null) && (!paramBoolean)) {
      return d.booleanValue();
    }
    if ((e != null) && (paramBoolean)) {
      return e.booleanValue();
    }
    if (paramBoolean) {}
    boolean bool;
    for (String str = "com.google.android.gms.measurement.PackageMeasurementService";; str = "com.google.android.gms.measurement.AppMeasurementService")
    {
      bool = m.a(paramContext, str);
      if (!paramBoolean) {
        break;
      }
      e = Boolean.valueOf(bool);
      return bool;
    }
    d = Boolean.valueOf(bool);
    return bool;
  }
  
  private ab c()
  {
    return aj.a(this.b).f();
  }
  
  @MainThread
  public int a(Intent paramIntent, int paramInt1, int paramInt2)
  {
    aj localaj = aj.a(this.b);
    ab localab = localaj.f();
    if (paramIntent == null) {
      localab.z().a("AppMeasurementService started with null intent");
    }
    for (;;)
    {
      return 2;
      paramIntent = paramIntent.getAction();
      if (localaj.d().N()) {
        localab.E().a("Device PackageMeasurementService called. startId, action", Integer.valueOf(paramInt2), paramIntent);
      }
      while ("com.google.android.gms.measurement.UPLOAD".equals(paramIntent))
      {
        localaj.h().a(new f.1(this, localaj, paramInt2, localab));
        return 2;
        localab.E().a("Local AppMeasurementService called. startId, action", Integer.valueOf(paramInt2), paramIntent);
      }
    }
  }
  
  @MainThread
  public IBinder a(Intent paramIntent)
  {
    if (paramIntent == null)
    {
      c().f().a("onBind called with null intent");
      return null;
    }
    paramIntent = paramIntent.getAction();
    if ("com.google.android.gms.measurement.START".equals(paramIntent)) {
      return new ak(aj.a(this.b));
    }
    c().z().a("onBind received unknown action", paramIntent);
    return null;
  }
  
  @MainThread
  public void a()
  {
    aj localaj = aj.a(this.b);
    ab localab = localaj.f();
    if (localaj.d().N())
    {
      localab.E().a("Device PackageMeasurementService is starting up");
      return;
    }
    localab.E().a("Local AppMeasurementService is starting up");
  }
  
  @MainThread
  public void b()
  {
    aj localaj = aj.a(this.b);
    ab localab = localaj.f();
    if (localaj.d().N())
    {
      localab.E().a("Device PackageMeasurementService is shutting down");
      return;
    }
    localab.E().a("Local AppMeasurementService is shutting down");
  }
  
  @MainThread
  public boolean b(Intent paramIntent)
  {
    if (paramIntent == null)
    {
      c().f().a("onUnbind called with null intent");
      return true;
    }
    paramIntent = paramIntent.getAction();
    c().E().a("onUnbind called for intent. action", paramIntent);
    return true;
  }
  
  @MainThread
  public void c(Intent paramIntent)
  {
    if (paramIntent == null)
    {
      c().f().a("onRebind called with null intent");
      return;
    }
    paramIntent = paramIntent.getAction();
    c().E().a("onRebind called. action", paramIntent);
  }
  
  public static abstract interface a
  {
    public abstract Context a();
    
    public abstract boolean a(int paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */