package com.google.android.gms.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.d;

@aaa
public class acd
{
  private HandlerThread a = null;
  private Handler b = null;
  private int c = 0;
  private final Object d = new Object();
  
  public Looper a()
  {
    for (;;)
    {
      synchronized (this.d)
      {
        if (this.c == 0)
        {
          if (this.a == null)
          {
            abr.e("Starting the looper thread.");
            this.a = new HandlerThread("LooperProvider");
            this.a.start();
            this.b = new Handler(this.a.getLooper());
            abr.e("Looper thread started.");
            this.c += 1;
            Looper localLooper = this.a.getLooper();
            return localLooper;
          }
          abr.e("Resuming the looper thread");
          this.d.notifyAll();
        }
      }
      d.a(this.a, "Invalid state: mHandlerThread should already been initialized.");
    }
  }
  
  public void b()
  {
    for (;;)
    {
      synchronized (this.d)
      {
        if (this.c > 0)
        {
          bool = true;
          d.b(bool, "Invalid state: release() called more times than expected.");
          int i = this.c - 1;
          this.c = i;
          if (i == 0) {
            this.b.post(new acd.1(this));
          }
          return;
        }
      }
      boolean bool = false;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/acd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */