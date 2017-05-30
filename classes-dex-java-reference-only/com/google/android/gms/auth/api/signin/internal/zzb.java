package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;
import android.util.Log;
import com.google.android.gms.common.api.g;
import com.google.android.gms.internal.ait;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class zzb
  extends AsyncTaskLoader<Void>
  implements ait
{
  private Semaphore a = new Semaphore(0);
  private Set<g> b;
  
  public zzb(Context paramContext, Set<g> paramSet)
  {
    super(paramContext);
    this.b = paramSet;
  }
  
  public Void a()
  {
    Iterator localIterator = this.b.iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      if (!((g)localIterator.next()).a(this)) {
        break label80;
      }
      i += 1;
    }
    label80:
    for (;;)
    {
      break;
      try
      {
        this.a.tryAcquire(i, 5L, TimeUnit.SECONDS);
        return null;
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          Log.i("GACSignInLoader", "Unexpected InterruptedException", localInterruptedException);
          Thread.currentThread().interrupt();
        }
      }
    }
  }
  
  public void b()
  {
    this.a.release();
  }
  
  protected void onStartLoading()
  {
    this.a.drainPermits();
    forceLoad();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/zzb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */