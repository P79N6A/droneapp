package com.google.android.gms.analytics.internal;

import android.content.Context;
import com.google.android.gms.analytics.c;
import com.google.android.gms.analytics.p;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;

public class v
{
  private static volatile v a;
  private final Context b;
  private final Context c;
  private final e d;
  private final ah e;
  private final g f;
  private final p g;
  private final r h;
  private final al i;
  private final q j;
  private final j k;
  private final c l;
  private final ad m;
  private final a n;
  private final aa o;
  private final ak p;
  
  protected v(w paramw)
  {
    Object localObject1 = paramw.a();
    d.a(localObject1, "Application context can't be null");
    Object localObject2 = paramw.b();
    d.a(localObject2);
    this.b = ((Context)localObject1);
    this.c = ((Context)localObject2);
    this.d = paramw.h(this);
    this.e = paramw.g(this);
    localObject2 = paramw.f(this);
    ((g)localObject2).E();
    this.f = ((g)localObject2);
    Object localObject3;
    if (e().a())
    {
      localObject2 = f();
      localObject3 = u.a;
      ((g)localObject2).s(String.valueOf(localObject3).length() + 33 + "Google Analytics " + (String)localObject3 + " is starting up.");
    }
    for (;;)
    {
      localObject2 = paramw.q(this);
      ((j)localObject2).E();
      this.k = ((j)localObject2);
      localObject2 = paramw.e(this);
      ((q)localObject2).E();
      this.j = ((q)localObject2);
      localObject2 = paramw.l(this);
      localObject3 = paramw.d(this);
      a locala = paramw.c(this);
      aa localaa = paramw.b(this);
      ak localak = paramw.a(this);
      localObject1 = paramw.a((Context)localObject1);
      ((p)localObject1).a(a());
      this.g = ((p)localObject1);
      localObject1 = paramw.i(this);
      ((ad)localObject3).E();
      this.m = ((ad)localObject3);
      locala.E();
      this.n = locala;
      localaa.E();
      this.o = localaa;
      localak.E();
      this.p = localak;
      paramw = paramw.p(this);
      paramw.E();
      this.i = paramw;
      ((r)localObject2).E();
      this.h = ((r)localObject2);
      if (e().a()) {
        f().b("Device AnalyticsService version", u.a);
      }
      ((c)localObject1).a();
      this.l = ((c)localObject1);
      ((r)localObject2).b();
      return;
      localObject2 = f();
      localObject3 = u.a;
      ((g)localObject2).s(String.valueOf(localObject3).length() + 134 + "Google Analytics " + (String)localObject3 + " is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
    }
  }
  
  public static v a(Context paramContext)
  {
    d.a(paramContext);
    if (a == null) {}
    try
    {
      if (a == null)
      {
        e locale = h.d();
        long l1 = locale.b();
        paramContext = new v(new w(paramContext));
        a = paramContext;
        c.d();
        l1 = locale.b() - l1;
        long l2 = ((Long)ao.Q.a()).longValue();
        if (l1 > l2) {
          paramContext.f().c("Slow initialization (ms)", Long.valueOf(l1), Long.valueOf(l2));
        }
      }
      return a;
    }
    finally {}
  }
  
  private void a(t paramt)
  {
    d.a(paramt, "Analytics service not created/initialized");
    d.b(paramt.C(), "Analytics service not initialized");
  }
  
  protected Thread.UncaughtExceptionHandler a()
  {
    new Thread.UncaughtExceptionHandler()
    {
      public void uncaughtException(Thread paramAnonymousThread, Throwable paramAnonymousThrowable)
      {
        paramAnonymousThread = v.this.g();
        if (paramAnonymousThread != null) {
          paramAnonymousThread.e("Job execution failed", paramAnonymousThrowable);
        }
      }
    };
  }
  
  public Context b()
  {
    return this.b;
  }
  
  public Context c()
  {
    return this.c;
  }
  
  public e d()
  {
    return this.d;
  }
  
  public ah e()
  {
    return this.e;
  }
  
  public g f()
  {
    a(this.f);
    return this.f;
  }
  
  public g g()
  {
    return this.f;
  }
  
  public p h()
  {
    d.a(this.g);
    return this.g;
  }
  
  public r i()
  {
    a(this.h);
    return this.h;
  }
  
  public al j()
  {
    a(this.i);
    return this.i;
  }
  
  public c k()
  {
    d.a(this.l);
    d.b(this.l.c(), "Analytics instance not initialized");
    return this.l;
  }
  
  public q l()
  {
    a(this.j);
    return this.j;
  }
  
  public j m()
  {
    a(this.k);
    return this.k;
  }
  
  public j n()
  {
    if ((this.k == null) || (!this.k.C())) {
      return null;
    }
    return this.k;
  }
  
  public a o()
  {
    a(this.n);
    return this.n;
  }
  
  public ad p()
  {
    a(this.m);
    return this.m;
  }
  
  public aa q()
  {
    a(this.o);
    return this.o;
  }
  
  public ak r()
  {
    return this.p;
  }
  
  public void s() {}
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/internal/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */