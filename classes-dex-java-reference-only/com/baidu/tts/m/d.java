package com.baidu.tts.m;

import com.baidu.tts.f.h;
import com.baidu.tts.n.a;

public class d<T>
  extends a<T>
{
  private String a = "5";
  private String b = "5";
  private String c = "5";
  private h d = h.a;
  private com.baidu.tts.f.d e = com.baidu.tts.f.d.c;
  private String f = "0";
  
  public void a(com.baidu.tts.f.d paramd)
  {
    this.e = paramd;
  }
  
  public void i(String paramString)
  {
    this.d = h.a(paramString);
  }
  
  public void j(String paramString)
  {
    this.f = paramString;
  }
  
  public void k(String paramString)
  {
    this.a = paramString;
  }
  
  public void l(String paramString)
  {
    this.b = paramString;
  }
  
  public void m(String paramString)
  {
    this.c = paramString;
  }
  
  public String p()
  {
    return this.e.a();
  }
  
  public String q()
  {
    return this.e.b();
  }
  
  public String r()
  {
    return this.d.a();
  }
  
  public String s()
  {
    return this.f;
  }
  
  public long t()
  {
    try
    {
      long l = Long.parseLong(this.f);
      return l;
    }
    catch (Exception localException) {}
    return 0L;
  }
  
  public String u()
  {
    return this.a;
  }
  
  public String v()
  {
    return this.b;
  }
  
  public String w()
  {
    return this.c;
  }
  
  public long x()
  {
    return Long.parseLong(this.c);
  }
  
  public long y()
  {
    return Long.parseLong(this.a);
  }
  
  public long z()
  {
    return Long.parseLong(this.b);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/baidu/tts/m/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */