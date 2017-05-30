package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class n<T>
  implements Comparable<n<T>>
{
  private static final String a = "UTF-8";
  private static long q;
  private final v.a b;
  private final int c;
  private final String d;
  private String e;
  private String f;
  private final int g;
  private p.a h;
  private Integer i;
  private o j;
  private boolean k;
  private boolean l;
  private boolean m;
  private r n;
  private b.a o;
  private Object p;
  
  public n(int paramInt, String paramString, p.a parama)
  {
    if (v.a.a) {}
    for (v.a locala = new v.a();; locala = null)
    {
      this.b = locala;
      this.k = true;
      this.l = false;
      this.m = false;
      this.o = null;
      this.c = paramInt;
      this.d = paramString;
      this.f = a(paramInt, paramString);
      this.h = parama;
      a(new d());
      this.g = d(paramString);
      return;
    }
  }
  
  @Deprecated
  public n(String paramString, p.a parama)
  {
    this(-1, paramString, parama);
  }
  
  private static String a(int paramInt, String paramString)
  {
    paramString = new StringBuilder().append("Request:").append(paramInt).append(":").append(paramString).append(":").append(System.currentTimeMillis()).append(":");
    long l1 = q;
    q = 1L + l1;
    return f.a(l1);
  }
  
  private byte[] a(Map<String, String> paramMap, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        localStringBuilder.append(URLEncoder.encode((String)localEntry.getKey(), paramString));
        localStringBuilder.append('=');
        localStringBuilder.append(URLEncoder.encode((String)localEntry.getValue(), paramString));
        localStringBuilder.append('&');
      }
      paramMap = localStringBuilder.toString().getBytes(paramString);
    }
    catch (UnsupportedEncodingException paramMap)
    {
      throw new RuntimeException("Encoding not supported: " + paramString, paramMap);
    }
    return paramMap;
  }
  
  private static int d(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      paramString = Uri.parse(paramString);
      if (paramString != null)
      {
        paramString = paramString.getHost();
        if (paramString != null) {
          return paramString.hashCode();
        }
      }
    }
    return 0;
  }
  
  public void A()
  {
    this.m = true;
  }
  
  public boolean B()
  {
    return this.m;
  }
  
  public int a()
  {
    return this.c;
  }
  
  public int a(n<T> paramn)
  {
    b localb1 = x();
    b localb2 = paramn.x();
    if (localb1 == localb2) {
      return this.i.intValue() - paramn.i.intValue();
    }
    return localb2.ordinal() - localb1.ordinal();
  }
  
  public final n<?> a(int paramInt)
  {
    this.i = Integer.valueOf(paramInt);
    return this;
  }
  
  public n<?> a(b.a parama)
  {
    this.o = parama;
    return this;
  }
  
  public n<?> a(o paramo)
  {
    this.j = paramo;
    return this;
  }
  
  public n<?> a(r paramr)
  {
    this.n = paramr;
    return this;
  }
  
  public n<?> a(Object paramObject)
  {
    this.p = paramObject;
    return this;
  }
  
  public final n<?> a(boolean paramBoolean)
  {
    this.k = paramBoolean;
    return this;
  }
  
  protected abstract p<T> a(j paramj);
  
  protected u a(u paramu)
  {
    return paramu;
  }
  
  public void a(String paramString)
  {
    if (v.a.a) {
      this.b.a(paramString, Thread.currentThread().getId());
    }
  }
  
  public Object b()
  {
    return this.p;
  }
  
  public void b(u paramu)
  {
    if (this.h != null) {
      this.h.a(paramu);
    }
  }
  
  protected abstract void b(T paramT);
  
  void b(final String paramString)
  {
    if (this.j != null)
    {
      this.j.b(this);
      e();
    }
    final long l1;
    if (v.a.a)
    {
      l1 = Thread.currentThread().getId();
      if (Looper.myLooper() != Looper.getMainLooper()) {
        new Handler(Looper.getMainLooper()).post(new Runnable()
        {
          public void run()
          {
            n.b(n.this).a(paramString, l1);
            n.b(n.this).a(toString());
          }
        });
      }
    }
    else
    {
      return;
    }
    this.b.a(paramString, l1);
    this.b.a(toString());
  }
  
  public p.a c()
  {
    return this.h;
  }
  
  public void c(String paramString)
  {
    this.e = paramString;
  }
  
  public int d()
  {
    return this.g;
  }
  
  protected void e()
  {
    this.h = null;
  }
  
  public final int f()
  {
    if (this.i == null) {
      throw new IllegalStateException("getSequence called before setSequence");
    }
    return this.i.intValue();
  }
  
  public String g()
  {
    if (this.e != null) {
      return this.e;
    }
    return this.d;
  }
  
  public String h()
  {
    return this.d;
  }
  
  public String i()
  {
    return this.f;
  }
  
  public String j()
  {
    return this.c + ":" + this.d;
  }
  
  public b.a k()
  {
    return this.o;
  }
  
  public void l()
  {
    this.l = true;
  }
  
  public boolean m()
  {
    return this.l;
  }
  
  public Map<String, String> n()
  {
    return Collections.emptyMap();
  }
  
  @Deprecated
  protected Map<String, String> o()
  {
    return s();
  }
  
  @Deprecated
  protected String p()
  {
    return t();
  }
  
  @Deprecated
  public String q()
  {
    return u();
  }
  
  @Deprecated
  public byte[] r()
  {
    Map localMap = o();
    if ((localMap != null) && (localMap.size() > 0)) {
      return a(localMap, p());
    }
    return null;
  }
  
  protected Map<String, String> s()
  {
    return null;
  }
  
  protected String t()
  {
    return "UTF-8";
  }
  
  public String toString()
  {
    String str2 = "0x" + Integer.toHexString(d());
    StringBuilder localStringBuilder = new StringBuilder();
    if (this.l) {}
    for (String str1 = "[X] ";; str1 = "[ ] ") {
      return str1 + g() + " " + str2 + " " + x() + " " + this.i;
    }
  }
  
  public String u()
  {
    return "application/x-www-form-urlencoded; charset=" + t();
  }
  
  public byte[] v()
  {
    Map localMap = s();
    if ((localMap != null) && (localMap.size() > 0)) {
      return a(localMap, t());
    }
    return null;
  }
  
  public final boolean w()
  {
    return this.k;
  }
  
  public b x()
  {
    return b.b;
  }
  
  public final int y()
  {
    return this.n.a();
  }
  
  public r z()
  {
    return this.n;
  }
  
  public static abstract interface a
  {
    public static final int a = -1;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
  }
  
  public static enum b
  {
    private b() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/android/volley/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */