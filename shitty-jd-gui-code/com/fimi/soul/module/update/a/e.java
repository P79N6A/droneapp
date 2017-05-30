package com.fimi.soul.module.update.a;

import java.io.Serializable;

public class e
  implements Serializable
{
  private int a;
  private int b;
  private String c;
  private int d;
  private long e;
  private long f;
  private long g;
  private long h;
  private String i;
  
  public e() {}
  
  public e(int paramInt1, int paramInt2, int paramInt3, String paramString, long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    this.a = paramInt2;
    this.b = paramInt3;
    this.c = paramString;
    this.d = paramInt1;
    this.e = paramLong1;
    this.f = paramLong2;
    this.g = paramLong3;
    this.h = paramLong4;
    if (paramInt1 == 5)
    {
      this.i = Long.toString((0xFFFF & paramLong1) << 32 | (0xFFFF & paramLong2) << 16 | 0xFFFF & paramLong3);
      return;
    }
    this.i = (String.valueOf(paramLong1) + String.valueOf(paramLong2) + String.valueOf(paramLong3) + String.valueOf(paramLong4));
  }
  
  public e(String paramString, int paramInt1, int paramInt2)
  {
    this.c = paramString;
    this.d = paramInt1;
    this.b = paramInt2;
  }
  
  public int a()
  {
    return this.a;
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void a(long paramLong)
  {
    this.e = paramLong;
  }
  
  public void a(String paramString)
  {
    this.c = paramString;
  }
  
  public int b()
  {
    return this.b;
  }
  
  public void b(int paramInt)
  {
    this.b = paramInt;
  }
  
  public void b(long paramLong)
  {
    this.f = paramLong;
  }
  
  public void b(String paramString)
  {
    this.i = paramString;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public void c(int paramInt)
  {
    this.d = paramInt;
  }
  
  public void c(long paramLong)
  {
    this.g = paramLong;
  }
  
  public int d()
  {
    return this.d;
  }
  
  public void d(long paramLong)
  {
    this.h = paramLong;
  }
  
  public long e()
  {
    return this.e;
  }
  
  public long f()
  {
    return this.f;
  }
  
  public long g()
  {
    return this.g;
  }
  
  public long h()
  {
    return this.h;
  }
  
  public String i()
  {
    return this.i;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/update/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */