package com.android.volley;

public class u
  extends Exception
{
  public final j a;
  private long b;
  
  public u()
  {
    this.a = null;
  }
  
  public u(j paramj)
  {
    this.a = paramj;
  }
  
  public u(String paramString)
  {
    super(paramString);
    this.a = null;
  }
  
  public u(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
    this.a = null;
  }
  
  public u(Throwable paramThrowable)
  {
    super(paramThrowable);
    this.a = null;
  }
  
  void a(long paramLong)
  {
    this.b = paramLong;
  }
  
  public long b()
  {
    return this.b;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/android/volley/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */