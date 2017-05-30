package com.fimi.soul.module.setting;

import java.io.Serializable;

public class f
  implements Serializable
{
  String a = "";
  String b = "";
  int c = 0;
  String d = "0 k";
  long e;
  int f = 0;
  boolean g = false;
  boolean h;
  private boolean i;
  
  public void a(int paramInt)
  {
    this.c = paramInt;
  }
  
  public void a(long paramLong)
  {
    this.e = paramLong;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  public boolean a()
  {
    return this.g;
  }
  
  public String b()
  {
    return this.a;
  }
  
  public void b(int paramInt)
  {
    this.f = paramInt;
  }
  
  public void b(String paramString)
  {
    this.b = paramString;
  }
  
  public void b(boolean paramBoolean)
  {
    this.i = paramBoolean;
  }
  
  public String c()
  {
    return this.b;
  }
  
  public void c(String paramString)
  {
    this.d = paramString;
  }
  
  public void c(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  public int d()
  {
    return this.c;
  }
  
  public String e()
  {
    return this.d;
  }
  
  public long f()
  {
    return this.e;
  }
  
  public int g()
  {
    return this.f;
  }
  
  public boolean h()
  {
    return this.i;
  }
  
  public boolean i()
  {
    return this.h;
  }
  
  public String toString()
  {
    return "LogFileEntity{fileName='" + this.a + '\'' + ", path='" + this.b + '\'' + ", hasSync=" + this.c + ", fileSize='" + this.d + '\'' + ", createDate=" + this.e + ", percent=" + this.f + ", iselect=" + this.g + ", isTitleItem=" + this.i + '}';
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/setting/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */