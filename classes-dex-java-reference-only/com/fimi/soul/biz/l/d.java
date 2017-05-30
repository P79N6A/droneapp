package com.fimi.soul.biz.l;

import com.xiaomi.infra.galaxy.fds.android.auth.GalaxyFDSCredential;
import com.xiaomi.infra.galaxy.fds.android.util.Args;

public class d
{
  public static final int a = 50000;
  public static final int b = 3;
  public static final int c = 4096;
  public static final int d = 50000;
  private static final String e = "http://";
  private static final String f = "https://";
  private static final String g = "files";
  private static final String h = "cdn";
  private static final String i = ".fds.api.xiaomi.com";
  private static final String j = ".fds-ssl.api.xiaomi.com";
  private int k = 50000;
  private int l = 50000;
  private int m = 0;
  private int n = 0;
  private int o = 3;
  private int p = 4096;
  private GalaxyFDSCredential q;
  private String r = "";
  private boolean s = true;
  private boolean t = false;
  private boolean u = true;
  private boolean v = false;
  private String w = "";
  
  public int a()
  {
    return this.o;
  }
  
  public String a(boolean paramBoolean, String paramString)
  {
    if (paramString.isEmpty())
    {
      if (paramBoolean) {
        return "cdn";
      }
      return "files";
    }
    if (paramBoolean) {
      return paramString + "-" + "cdn";
    }
    return paramString + "-" + "files";
  }
  
  public String a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramBoolean1) && (paramBoolean2)) {
      return ".fds-ssl.api.xiaomi.com";
    }
    return ".fds.api.xiaomi.com";
  }
  
  public void a(int paramInt)
  {
    Args.notNegative(paramInt, "max retry times");
    this.o = paramInt;
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.m = paramInt1;
    this.n = paramInt2;
  }
  
  public void a(GalaxyFDSCredential paramGalaxyFDSCredential)
  {
    Args.notNull(paramGalaxyFDSCredential, "credential");
    this.q = paramGalaxyFDSCredential;
  }
  
  @Deprecated
  public void a(String paramString) {}
  
  public void a(boolean paramBoolean)
  {
    this.s = paramBoolean;
  }
  
  public int b()
  {
    return this.k;
  }
  
  public d b(int paramInt)
  {
    a(paramInt);
    return this;
  }
  
  public d b(int paramInt1, int paramInt2)
  {
    a(paramInt1, paramInt2);
    return this;
  }
  
  public d b(GalaxyFDSCredential paramGalaxyFDSCredential)
  {
    a(paramGalaxyFDSCredential);
    return this;
  }
  
  @Deprecated
  public d b(String paramString)
  {
    return this;
  }
  
  public d b(boolean paramBoolean)
  {
    a(paramBoolean);
    return this;
  }
  
  public int c()
  {
    return this.l;
  }
  
  public void c(int paramInt)
  {
    this.k = paramInt;
  }
  
  @Deprecated
  public void c(String paramString) {}
  
  public void c(boolean paramBoolean)
  {
    this.t = paramBoolean;
  }
  
  public d d(int paramInt)
  {
    c(paramInt);
    return this;
  }
  
  @Deprecated
  public d d(String paramString)
  {
    return this;
  }
  
  public d d(boolean paramBoolean)
  {
    c(paramBoolean);
    return this;
  }
  
  public int[] d()
  {
    return new int[] { this.m, this.n };
  }
  
  public int e()
  {
    return this.p;
  }
  
  public void e(int paramInt)
  {
    this.l = paramInt;
  }
  
  public void e(String paramString)
  {
    this.r = paramString;
  }
  
  public void e(boolean paramBoolean)
  {
    this.u = paramBoolean;
  }
  
  public d f(int paramInt)
  {
    e(paramInt);
    return this;
  }
  
  public d f(String paramString)
  {
    e(paramString);
    return this;
  }
  
  public d f(boolean paramBoolean)
  {
    e(paramBoolean);
    return this;
  }
  
  public GalaxyFDSCredential f()
  {
    return this.q;
  }
  
  @Deprecated
  public String g()
  {
    return o();
  }
  
  public void g(int paramInt)
  {
    Args.positive(paramInt, "upload part size");
    this.p = paramInt;
  }
  
  void g(String paramString)
  {
    this.w = paramString;
  }
  
  void g(boolean paramBoolean)
  {
    this.v = paramBoolean;
  }
  
  public d h(int paramInt)
  {
    g(paramInt);
    return this;
  }
  
  d h(String paramString)
  {
    g(paramString);
    return this;
  }
  
  d h(boolean paramBoolean)
  {
    g(paramBoolean);
    return this;
  }
  
  @Deprecated
  public String h()
  {
    return p();
  }
  
  public String i()
  {
    return this.r;
  }
  
  String i(boolean paramBoolean)
  {
    if (this.v) {
      return this.w;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    if (this.s) {}
    for (String str = "https://";; str = "http://")
    {
      localStringBuilder.append(str);
      localStringBuilder.append(a(paramBoolean, this.r));
      localStringBuilder.append(a(paramBoolean, this.s));
      return localStringBuilder.toString();
    }
  }
  
  public boolean j()
  {
    return this.s;
  }
  
  public boolean k()
  {
    return this.t;
  }
  
  public boolean l()
  {
    return this.u;
  }
  
  boolean m()
  {
    return this.v;
  }
  
  String n()
  {
    return this.w;
  }
  
  String o()
  {
    return i(false);
  }
  
  String p()
  {
    return i(true);
  }
  
  String q()
  {
    return i(this.u);
  }
  
  String r()
  {
    return i(this.t);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/l/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */