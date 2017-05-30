package com.facebook.imagepipeline.animated.impl;

import android.os.SystemClock;

class RollingStat
{
  private static final int WINDOWS = 60;
  private final short[] mStat = new short[60];
  
  int getSum(int paramInt)
  {
    int j = 0;
    long l = SystemClock.uptimeMillis() / 1000L;
    int m = (int)((l - paramInt) % 60L);
    int n = (int)(l / 60L & 0xFF);
    int i = 0;
    while (i < paramInt)
    {
      int i1 = this.mStat[((m + i) % 60)];
      int k = j;
      if ((i1 >> 8 & 0xFF) == n) {
        k = j + (i1 & 0xFF);
      }
      i += 1;
      j = k;
    }
    return j;
  }
  
  void incrementStats(int paramInt)
  {
    long l = SystemClock.uptimeMillis() / 1000L;
    int i = (int)(l % 60L);
    int j = (int)(l / 60L & 0xFF);
    int k = this.mStat[i];
    if (j != (k >> 8 & 0xFF)) {}
    for (;;)
    {
      this.mStat[i] = ((short)(j << 8 | paramInt));
      return;
      paramInt += (k & 0xFF);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/imagepipeline/animated/impl/RollingStat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */