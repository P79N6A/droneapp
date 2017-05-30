package com.fimi.soul.utils;

import java.io.Serializable;

public class u
  implements Serializable
{
  private String a;
  private String b;
  private long c;
  private double d;
  
  public String a()
  {
    return this.a;
  }
  
  public void a(double paramDouble)
  {
    this.d = paramDouble;
  }
  
  public void a(long paramLong)
  {
    this.c = paramLong;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public void b(String paramString)
  {
    this.b = paramString;
  }
  
  public long c()
  {
    return this.c;
  }
  
  public double d()
  {
    return this.d;
  }
  
  public String toString()
  {
    return "FlyRecordEntity{user_id='" + this.a + '\'' + ", drone_id='" + this.b + '\'' + ", flyTime=" + this.c + ", flyDistance=" + this.d + '}';
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */