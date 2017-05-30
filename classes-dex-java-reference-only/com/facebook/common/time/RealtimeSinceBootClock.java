package com.facebook.common.time;

import android.os.SystemClock;

public class RealtimeSinceBootClock
  implements MonotonicClock
{
  private static final RealtimeSinceBootClock INSTANCE = new RealtimeSinceBootClock();
  
  public static RealtimeSinceBootClock get()
  {
    return INSTANCE;
  }
  
  public long now()
  {
    return SystemClock.elapsedRealtime();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/common/time/RealtimeSinceBootClock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */