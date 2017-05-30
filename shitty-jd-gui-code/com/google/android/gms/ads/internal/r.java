package com.google.android.gms.ads.internal;

import android.os.Handler;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abv;
import java.lang.ref.WeakReference;

@aaa
public class r
{
  private final a a;
  private final Runnable b;
  @Nullable
  private AdRequestParcel c;
  private boolean d = false;
  private boolean e = false;
  private long f = 0L;
  
  public r(a parama)
  {
    this(parama, new a(abv.a));
  }
  
  r(a parama, a parama1)
  {
    this.a = parama1;
    this.b = new Runnable()
    {
      public void run()
      {
        r.a(r.this, false);
        a locala = (a)this.a.get();
        if (locala != null) {
          locala.c(r.a(r.this));
        }
      }
    };
  }
  
  public void a()
  {
    this.d = false;
    this.a.a(this.b);
  }
  
  public void a(AdRequestParcel paramAdRequestParcel)
  {
    this.c = paramAdRequestParcel;
  }
  
  public void a(AdRequestParcel paramAdRequestParcel, long paramLong)
  {
    if (this.d) {
      abr.d("An ad refresh is already scheduled.");
    }
    do
    {
      return;
      this.c = paramAdRequestParcel;
      this.d = true;
      this.f = paramLong;
    } while (this.e);
    abr.c(65 + "Scheduling ad refresh " + paramLong + " milliseconds from now.");
    this.a.a(this.b, paramLong);
  }
  
  public void b()
  {
    this.e = true;
    if (this.d) {
      this.a.a(this.b);
    }
  }
  
  public void b(AdRequestParcel paramAdRequestParcel)
  {
    a(paramAdRequestParcel, 60000L);
  }
  
  public void c()
  {
    this.e = false;
    if (this.d)
    {
      this.d = false;
      a(this.c, this.f);
    }
  }
  
  public boolean d()
  {
    return this.d;
  }
  
  public static class a
  {
    private final Handler a;
    
    public a(Handler paramHandler)
    {
      this.a = paramHandler;
    }
    
    public void a(Runnable paramRunnable)
    {
      this.a.removeCallbacks(paramRunnable);
    }
    
    public boolean a(Runnable paramRunnable, long paramLong)
    {
      return this.a.postDelayed(paramRunnable, paramLong);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */