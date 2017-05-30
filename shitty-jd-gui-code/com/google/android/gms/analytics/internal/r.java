package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.p;
import com.google.android.gms.common.internal.d;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class r
  extends t
{
  private final ab a;
  
  public r(v paramv, w paramw)
  {
    super(paramv);
    d.a(paramw);
    this.a = paramw.j(paramv);
  }
  
  public long a(x paramx)
  {
    D();
    d.a(paramx);
    m();
    long l = this.a.a(paramx, true);
    if (l == 0L) {
      this.a.a(paramx);
    }
    return l;
  }
  
  protected void a()
  {
    this.a.E();
  }
  
  public void a(final int paramInt)
  {
    D();
    b("setLocalDispatchPeriod (sec)", Integer.valueOf(paramInt));
    r().a(new Runnable()
    {
      public void run()
      {
        r.a(r.this).a(paramInt * 1000L);
      }
    });
  }
  
  public void a(final am paramam)
  {
    D();
    r().a(new Runnable()
    {
      public void run()
      {
        r.a(r.this).a(paramam);
      }
    });
  }
  
  public void a(final c paramc)
  {
    d.a(paramc);
    D();
    b("Hit delivery requested", paramc);
    r().a(new Runnable()
    {
      public void run()
      {
        r.a(r.this).a(paramc);
      }
    });
  }
  
  public void a(final String paramString, final Runnable paramRunnable)
  {
    d.a(paramString, "campaign param can't be empty");
    r().a(new Runnable()
    {
      public void run()
      {
        r.a(r.this).a(paramString);
        if (paramRunnable != null) {
          paramRunnable.run();
        }
      }
    });
  }
  
  public void a(final boolean paramBoolean)
  {
    a("Network connectivity status changed", Boolean.valueOf(paramBoolean));
    r().a(new Runnable()
    {
      public void run()
      {
        r.a(r.this).a(paramBoolean);
      }
    });
  }
  
  public void b()
  {
    this.a.b();
  }
  
  public void c()
  {
    D();
    l();
    r().a(new Runnable()
    {
      public void run()
      {
        r.a(r.this).h();
      }
    });
  }
  
  public void d()
  {
    D();
    Context localContext = o();
    if ((k.a(localContext)) && (l.a(localContext)))
    {
      Intent localIntent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
      localIntent.setComponent(new ComponentName(localContext, "com.google.android.gms.analytics.AnalyticsService"));
      localContext.startService(localIntent);
      return;
    }
    a(null);
  }
  
  public boolean e()
  {
    D();
    Future localFuture = r().a(new Callable()
    {
      public Void a()
      {
        r.a(r.this).F();
        return null;
      }
    });
    try
    {
      localFuture.get(4L, TimeUnit.SECONDS);
      return true;
    }
    catch (InterruptedException localInterruptedException)
    {
      d("syncDispatchLocalHits interrupted", localInterruptedException);
      return false;
    }
    catch (ExecutionException localExecutionException)
    {
      e("syncDispatchLocalHits failed", localExecutionException);
      return false;
    }
    catch (TimeoutException localTimeoutException)
    {
      d("syncDispatchLocalHits timed out", localTimeoutException);
    }
    return false;
  }
  
  public void f()
  {
    D();
    p.d();
    this.a.f();
  }
  
  public void g()
  {
    q("Radio powered up");
    d();
  }
  
  void h()
  {
    m();
    this.a.e();
  }
  
  void i()
  {
    m();
    this.a.d();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/internal/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */