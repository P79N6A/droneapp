package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.u;
import com.google.android.gms.common.util.e;

@aaa
public class ach
{
  private long a;
  private long b = Long.MIN_VALUE;
  private Object c = new Object();
  
  public ach(long paramLong)
  {
    this.a = paramLong;
  }
  
  public boolean a()
  {
    synchronized (this.c)
    {
      long l = u.k().b();
      if (this.b + this.a > l) {
        return false;
      }
      this.b = l;
      return true;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/ach.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */