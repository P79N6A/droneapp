package com.fimi.soul.utils;

import java.util.Locale;

public class ag
{
  private double a;
  
  public ag(double paramDouble)
  {
    a(paramDouble);
  }
  
  public double a()
  {
    return this.a;
  }
  
  public void a(double paramDouble)
  {
    this.a = paramDouble;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((paramObject instanceof ag))
    {
      bool1 = bool2;
      if (this.a == ((ag)paramObject).a) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public String toString()
  {
    if (this.a >= 1000.0D) {
      return String.format(Locale.US, "%2.1f km", new Object[] { Double.valueOf(this.a / 1000.0D) });
    }
    if (this.a >= 1.0D) {
      return String.format(Locale.US, "%2.1f m", new Object[] { Double.valueOf(this.a) });
    }
    if (this.a >= 0.001D) {
      return String.format(Locale.US, "%2.1f mm", new Object[] { Double.valueOf(this.a * 1000.0D) });
    }
    return this.a + " m";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */