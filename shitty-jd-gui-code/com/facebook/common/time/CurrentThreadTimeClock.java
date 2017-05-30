package com.facebook.common.time;

import android.os.SystemClock;

public class CurrentThreadTimeClock
  implements Clock
{
  public long now()
  {
    return SystemClock.currentThreadTimeMillis();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/common/time/CurrentThreadTimeClock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */