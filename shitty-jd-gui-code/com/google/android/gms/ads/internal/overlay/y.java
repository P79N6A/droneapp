package com.google.android.gms.ads.internal.overlay;

import android.os.Handler;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abv;

@aaa
class y
  implements Runnable
{
  private k a;
  private boolean b = false;
  
  y(k paramk)
  {
    this.a = paramk;
  }
  
  public void a()
  {
    this.b = true;
    abv.a.removeCallbacks(this);
  }
  
  public void b()
  {
    abv.a.postDelayed(this, 250L);
  }
  
  public void run()
  {
    if (!this.b)
    {
      this.a.n();
      b();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */