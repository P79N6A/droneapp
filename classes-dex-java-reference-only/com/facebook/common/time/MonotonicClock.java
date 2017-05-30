package com.facebook.common.time;

import com.facebook.common.internal.DoNotStrip;

public abstract interface MonotonicClock
{
  @DoNotStrip
  public abstract long now();
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/common/time/MonotonicClock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */