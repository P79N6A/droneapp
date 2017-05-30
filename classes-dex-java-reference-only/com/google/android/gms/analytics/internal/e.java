package com.google.android.gms.analytics.internal;

public class e
{
  private final long a;
  private final int b;
  private double c;
  private long d;
  private final Object e = new Object();
  private final String f;
  private final com.google.android.gms.common.util.e g;
  
  public e(int paramInt, long paramLong, String paramString, com.google.android.gms.common.util.e parame)
  {
    this.b = paramInt;
    this.c = this.b;
    this.a = paramLong;
    this.f = paramString;
    this.g = parame;
  }
  
  public e(String paramString, com.google.android.gms.common.util.e parame)
  {
    this(60, 2000L, paramString, parame);
  }
  
  public boolean a()
  {
    synchronized (this.e)
    {
      long l = this.g.a();
      if (this.c < this.b)
      {
        double d1 = (l - this.d) / this.a;
        if (d1 > 0.0D) {
          this.c = Math.min(this.b, d1 + this.c);
        }
      }
      this.d = l;
      if (this.c >= 1.0D)
      {
        this.c -= 1.0D;
        return true;
      }
      String str = this.f;
      f.c(String.valueOf(str).length() + 34 + "Excessive " + str + " detected; call ignored.");
      return false;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/internal/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */