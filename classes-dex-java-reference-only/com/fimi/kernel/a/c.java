package com.fimi.kernel.a;

import android.graphics.drawable.Drawable;

public class c
  implements Comparable<c>
{
  public String a;
  public String b;
  public int c;
  public int d;
  public Drawable e;
  public long f;
  public String g;
  public String h;
  public String i;
  
  public c() {}
  
  public c(String paramString, int paramInt1, int paramInt2)
  {
    this.b = paramString;
    this.c = paramInt1;
    this.d = paramInt2;
  }
  
  public int a(c paramc)
  {
    if (this.b.compareTo(paramc.b) == 0)
    {
      if (this.f < paramc.f) {
        return 1;
      }
      if (this.f == paramc.f) {
        return 0;
      }
      return -1;
    }
    return this.b.compareTo(paramc.b);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */