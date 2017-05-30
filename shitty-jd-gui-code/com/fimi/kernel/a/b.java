package com.fimi.kernel.a;

import com.fimi.kernel.utils.j;

public class b
{
  public static final int a = 0;
  public static final int b = -1;
  private int c;
  private String d;
  
  public b() {}
  
  public b(int paramInt, String paramString)
  {
    this.c = paramInt;
    this.d = paramString;
  }
  
  public b(String paramString)
  {
    paramString = (b)j.a(paramString, getClass());
    this.c = paramString.a();
    this.d = paramString.b();
  }
  
  public int a()
  {
    return this.c;
  }
  
  public void a(int paramInt)
  {
    this.c = paramInt;
  }
  
  public void a(String paramString)
  {
    this.d = paramString;
  }
  
  public String b()
  {
    return this.d;
  }
  
  public String c()
  {
    return j.a(this);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */