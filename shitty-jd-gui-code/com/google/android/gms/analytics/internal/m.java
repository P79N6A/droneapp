package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.e;

class m
{
  private final e a;
  private long b;
  
  public m(e parame)
  {
    d.a(parame);
    this.a = parame;
  }
  
  public m(e parame, long paramLong)
  {
    d.a(parame);
    this.a = parame;
    this.b = paramLong;
  }
  
  public void a()
  {
    this.b = this.a.b();
  }
  
  public boolean a(long paramLong)
  {
    if (this.b == 0L) {}
    while (this.a.b() - this.b > paramLong) {
      return true;
    }
    return false;
  }
  
  public void b()
  {
    this.b = 0L;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/internal/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */