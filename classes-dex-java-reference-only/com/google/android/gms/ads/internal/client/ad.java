package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.aaa;
import java.util.Random;

@aaa
public class ad
  extends ao.a
{
  private final Random a = new Random();
  private long b;
  private Object c = new Object();
  
  public ad()
  {
    a();
  }
  
  public void a()
  {
    Object localObject1 = this.c;
    int i = 3;
    long l1 = 0L;
    for (;;)
    {
      int j = i - 1;
      if (j > 0) {}
      try
      {
        long l2 = this.a.nextInt() + 2147483648L;
        l1 = l2;
        i = j;
        if (l2 == this.b) {
          continue;
        }
        l1 = l2;
        i = j;
        if (l2 == 0L) {
          continue;
        }
        l1 = l2;
        this.b = l1;
        return;
      }
      finally {}
    }
  }
  
  public long b()
  {
    return this.b;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/client/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */