package com.fimi.soul.drone.e;

import java.io.Serializable;

public class a
  implements Serializable
{
  private int a;
  private int b;
  private int c;
  private long d;
  private long e;
  private long f;
  private long g;
  private char h;
  
  public a() {}
  
  public a(int paramInt1, int paramInt2, int paramInt3, char paramChar, long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    this.c = paramInt1;
    this.a = paramInt2;
    this.b = paramInt3;
    this.h = paramChar;
    this.d = paramLong1;
    this.e = paramLong2;
    this.f = paramLong3;
    this.g = paramLong4;
  }
  
  public int a()
  {
    return this.a;
  }
  
  public void a(char paramChar)
  {
    this.h = paramChar;
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void a(long paramLong)
  {
    this.d = paramLong;
  }
  
  public void a(short paramShort)
  {
    this.b = paramShort;
  }
  
  public int b()
  {
    return this.c;
  }
  
  public void b(int paramInt)
  {
    this.c = paramInt;
  }
  
  public void b(long paramLong)
  {
    this.e = paramLong;
  }
  
  public int c()
  {
    return this.b;
  }
  
  public void c(long paramLong)
  {
    this.g = paramLong;
  }
  
  public long d()
  {
    return this.d;
  }
  
  public void d(long paramLong)
  {
    this.f = paramLong;
  }
  
  public long e()
  {
    return this.e;
  }
  
  public long f()
  {
    return this.g;
  }
  
  public long g()
  {
    return this.f;
  }
  
  public long h()
  {
    return Long.valueOf(this.h).longValue();
  }
  
  public String toString()
  {
    return "DroneUpdateInfo{model=" + this.a + ", version=" + this.b + ", type=" + this.c + ", IDA=" + this.d + ", IDB=" + this.e + ", IDC=" + this.f + ", IDD=" + this.g + ", hwVersion=" + this.h + '}';
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */