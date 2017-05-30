package com.google.android.gms.analytics;

import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class l
{
  private final o a;
  private final e b;
  private boolean c;
  private long d;
  private long e;
  private long f;
  private long g;
  private long h;
  private boolean i;
  private final Map<Class<? extends n>, n> j;
  private final List<r> k;
  
  l(l paraml)
  {
    this.a = paraml.a;
    this.b = paraml.b;
    this.d = paraml.d;
    this.e = paraml.e;
    this.f = paraml.f;
    this.g = paraml.g;
    this.h = paraml.h;
    this.k = new ArrayList(paraml.k);
    this.j = new HashMap(paraml.j.size());
    paraml = paraml.j.entrySet().iterator();
    while (paraml.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paraml.next();
      n localn = c((Class)localEntry.getKey());
      ((n)localEntry.getValue()).a(localn);
      this.j.put((Class)localEntry.getKey(), localn);
    }
  }
  
  l(o paramo, e parame)
  {
    d.a(paramo);
    d.a(parame);
    this.a = paramo;
    this.b = parame;
    this.g = 1800000L;
    this.h = 3024000000L;
    this.j = new HashMap();
    this.k = new ArrayList();
  }
  
  private static <T extends n> T c(Class<T> paramClass)
  {
    try
    {
      paramClass = (n)paramClass.newInstance();
      return paramClass;
    }
    catch (InstantiationException paramClass)
    {
      throw new IllegalArgumentException("dataType doesn't have default constructor", paramClass);
    }
    catch (IllegalAccessException paramClass)
    {
      throw new IllegalArgumentException("dataType default constructor is not accessible", paramClass);
    }
  }
  
  public l a()
  {
    return new l(this);
  }
  
  public <T extends n> T a(Class<T> paramClass)
  {
    return (n)this.j.get(paramClass);
  }
  
  public void a(long paramLong)
  {
    this.e = paramLong;
  }
  
  public void a(n paramn)
  {
    d.a(paramn);
    Class localClass = paramn.getClass();
    if (localClass.getSuperclass() != n.class) {
      throw new IllegalArgumentException();
    }
    paramn.a(b(localClass));
  }
  
  public <T extends n> T b(Class<T> paramClass)
  {
    n localn2 = (n)this.j.get(paramClass);
    n localn1 = localn2;
    if (localn2 == null)
    {
      localn1 = c(paramClass);
      this.j.put(paramClass, localn1);
    }
    return localn1;
  }
  
  public Collection<n> b()
  {
    return this.j.values();
  }
  
  public List<r> c()
  {
    return this.k;
  }
  
  public long d()
  {
    return this.d;
  }
  
  public void e()
  {
    i().a(this);
  }
  
  public boolean f()
  {
    return this.c;
  }
  
  void g()
  {
    this.f = this.b.b();
    if (this.e != 0L) {}
    for (this.d = this.e;; this.d = this.b.a())
    {
      this.c = true;
      return;
    }
  }
  
  o h()
  {
    return this.a;
  }
  
  p i()
  {
    return this.a.o();
  }
  
  boolean j()
  {
    return this.i;
  }
  
  void k()
  {
    this.i = true;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */