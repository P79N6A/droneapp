package com.fimi.kernel.b.b;

final class d
{
  private int a;
  private long b;
  private long c;
  private long d;
  private String e;
  
  public d() {}
  
  public d(int paramInt, long paramLong1, long paramLong2, long paramLong3, String paramString)
  {
    this.a = paramInt;
    this.b = paramLong1;
    this.c = paramLong2;
    this.d = paramLong3;
    this.e = paramString;
  }
  
  public String a()
  {
    return this.e;
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void a(long paramLong)
  {
    this.b = paramLong;
  }
  
  public void a(String paramString)
  {
    this.e = paramString;
  }
  
  public int b()
  {
    return this.a;
  }
  
  public void b(long paramLong)
  {
    this.c = paramLong;
  }
  
  public long c()
  {
    return this.b;
  }
  
  public void c(long paramLong)
  {
    this.d = paramLong;
  }
  
  public long d()
  {
    return this.c;
  }
  
  public long e()
  {
    return this.d;
  }
  
  public String toString()
  {
    return "DownloadThreadInfo{threadId=" + this.a + ", startPos=" + this.b + ", endPos=" + this.c + ", compeleteSize=" + this.d + ", url='" + this.e + '\'' + '}';
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/b/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */