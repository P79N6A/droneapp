package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.RequiresPermission;
import android.util.Log;
import com.google.android.gms.analytics.internal.ad;
import com.google.android.gms.analytics.internal.ao;
import com.google.android.gms.analytics.internal.ao.a;
import com.google.android.gms.analytics.internal.f;
import com.google.android.gms.analytics.internal.n;
import com.google.android.gms.analytics.internal.o;
import com.google.android.gms.analytics.internal.q;
import com.google.android.gms.analytics.internal.r;
import com.google.android.gms.analytics.internal.v;
import com.google.android.gms.common.internal.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class c
  extends h
{
  private static List<Runnable> b = new ArrayList();
  private boolean c;
  private Set<a> d = new HashSet();
  private boolean e;
  private boolean f;
  private volatile boolean g;
  private boolean h;
  
  public c(v paramv)
  {
    super(paramv);
  }
  
  @RequiresPermission(allOf={"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
  public static c a(Context paramContext)
  {
    return v.a(paramContext).k();
  }
  
  public static void d()
  {
    try
    {
      if (b != null)
      {
        Iterator localIterator = b.iterator();
        while (localIterator.hasNext()) {
          ((Runnable)localIterator.next()).run();
        }
        b = null;
      }
    }
    finally {}
  }
  
  private r p()
  {
    return k().i();
  }
  
  private q q()
  {
    return k().l();
  }
  
  public g a(int paramInt)
  {
    try
    {
      g localg = new g(k(), null, null);
      if (paramInt > 0)
      {
        o localo = (o)new n(k()).a(paramInt);
        if (localo != null) {
          localg.a(localo);
        }
      }
      localg.E();
      return localg;
    }
    finally {}
  }
  
  public g a(String paramString)
  {
    try
    {
      paramString = new g(k(), paramString, null);
      paramString.E();
      return paramString;
    }
    finally {}
  }
  
  public void a()
  {
    b();
    this.c = true;
  }
  
  public void a(Activity paramActivity)
  {
    if (!this.e) {
      b(paramActivity);
    }
  }
  
  @TargetApi(14)
  public void a(Application paramApplication)
  {
    if ((Build.VERSION.SDK_INT >= 14) && (!this.e))
    {
      paramApplication.registerActivityLifecycleCallbacks(new b());
      this.e = true;
    }
  }
  
  void a(a parama)
  {
    this.d.add(parama);
    parama = k().b();
    if ((parama instanceof Application)) {
      a((Application)parama);
    }
  }
  
  @Deprecated
  public void a(e parame)
  {
    f.a(parame);
    if (!this.h)
    {
      parame = (String)ao.c.a();
      String str = (String)ao.c.a();
      Log.i(parame, String.valueOf(str).length() + 112 + "GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag." + str + " DEBUG");
      this.h = true;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  void b()
  {
    q localq = q();
    if (localq.d()) {
      g().a(localq.e());
    }
    if (localq.h()) {
      a(localq.i());
    }
    if (localq.d())
    {
      e locale = f.a();
      if (locale != null) {
        locale.a(localq.e());
      }
    }
  }
  
  public void b(int paramInt)
  {
    p().a(paramInt);
  }
  
  void b(Activity paramActivity)
  {
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext()) {
      ((a)localIterator.next()).a(paramActivity);
    }
  }
  
  void b(a parama)
  {
    this.d.remove(parama);
  }
  
  public void b(boolean paramBoolean)
  {
    this.g = paramBoolean;
    if (this.g) {
      p().c();
    }
  }
  
  public void c(Activity paramActivity)
  {
    if (!this.e) {
      d(paramActivity);
    }
  }
  
  public boolean c()
  {
    return this.c;
  }
  
  void d(Activity paramActivity)
  {
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext()) {
      ((a)localIterator.next()).b(paramActivity);
    }
  }
  
  public boolean e()
  {
    return this.f;
  }
  
  public boolean f()
  {
    return this.g;
  }
  
  @Deprecated
  public e g()
  {
    return f.a();
  }
  
  public String h()
  {
    d.c("getClientId can not be called from the main thread");
    return k().p().b();
  }
  
  public void i()
  {
    p().d();
  }
  
  void j()
  {
    p().e();
  }
  
  static abstract interface a
  {
    public abstract void a(Activity paramActivity);
    
    public abstract void b(Activity paramActivity);
  }
  
  @TargetApi(14)
  class b
    implements Application.ActivityLifecycleCallbacks
  {
    b() {}
    
    public void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
    
    public void onActivityDestroyed(Activity paramActivity) {}
    
    public void onActivityPaused(Activity paramActivity) {}
    
    public void onActivityResumed(Activity paramActivity) {}
    
    public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
    
    public void onActivityStarted(Activity paramActivity)
    {
      c.this.b(paramActivity);
    }
    
    public void onActivityStopped(Activity paramActivity)
    {
      c.this.d(paramActivity);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */