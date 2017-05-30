package com.fimi.soul.module.a;

import com.fimi.soul.module.a.a.a.a;

public enum d
{
  private final int b;
  private final e c;
  
  private d(int paramInt, e parame)
  {
    this.b = paramInt;
    this.c = parame;
  }
  
  public static d a(int paramInt)
  {
    d[] arrayOfd = values();
    int j = arrayOfd.length;
    int i = 0;
    while (i < j)
    {
      d locald = arrayOfd[i];
      if (locald.b == paramInt) {
        return locald;
      }
      i += 1;
    }
    return a;
  }
  
  public int a()
  {
    return this.b;
  }
  
  public e b()
  {
    return this.c;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */