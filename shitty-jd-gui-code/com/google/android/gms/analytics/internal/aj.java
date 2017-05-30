package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.analytics.p;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.e;

abstract class aj
{
  private static volatile Handler b;
  private final v a;
  private final Runnable c;
  private volatile long d;
  
  aj(v paramv)
  {
    d.a(paramv);
    this.a = paramv;
    this.c = new Runnable()
    {
      public void run()
      {
        if (Looper.myLooper() == Looper.getMainLooper()) {
          aj.a(aj.this).h().a(this);
        }
        boolean bool;
        do
        {
          return;
          bool = aj.this.c();
          aj.a(aj.this, 0L);
        } while ((!bool) || (aj.b(aj.this)));
        aj.this.a();
      }
    };
  }
  
  private Handler e()
  {
    if (b != null) {
      return b;
    }
    try
    {
      if (b == null) {
        b = new Handler(this.a.b().getMainLooper());
      }
      Handler localHandler = b;
      return localHandler;
    }
    finally {}
  }
  
  public abstract void a();
  
  public void a(long paramLong)
  {
    d();
    if (paramLong >= 0L)
    {
      this.d = this.a.d().a();
      if (!e().postDelayed(this.c, paramLong)) {
        this.a.f().e("Failed to schedule delayed post. time", Long.valueOf(paramLong));
      }
    }
  }
  
  public long b()
  {
    if (this.d == 0L) {
      return 0L;
    }
    return Math.abs(this.a.d().a() - this.d);
  }
  
  public void b(long paramLong)
  {
    long l = 0L;
    if (!c()) {
      return;
    }
    if (paramLong < 0L)
    {
      d();
      return;
    }
    paramLong -= Math.abs(this.a.d().a() - this.d);
    if (paramLong < 0L) {
      paramLong = l;
    }
    for (;;)
    {
      e().removeCallbacks(this.c);
      if (e().postDelayed(this.c, paramLong)) {
        break;
      }
      this.a.f().e("Failed to adjust delayed post. time", Long.valueOf(paramLong));
      return;
    }
  }
  
  public boolean c()
  {
    return this.d != 0L;
  }
  
  public void d()
  {
    this.d = 0L;
    e().removeCallbacks(this.c);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/internal/aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */