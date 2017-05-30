package org.c.b.a;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.c.e.l;

public class a
  extends org.c.f.a.h
{
  private final boolean a;
  
  public a(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  protected f a()
  {
    return new f();
  }
  
  public l a(Class<?> paramClass)
  {
    Iterator localIterator = Arrays.asList(new org.c.f.a.h[] { d(), c(), e(), b(), a() }).iterator();
    while (localIterator.hasNext())
    {
      l locall = ((org.c.f.a.h)localIterator.next()).c(paramClass);
      if (locall != null) {
        return locall;
      }
    }
    return null;
  }
  
  protected e b()
  {
    return new e();
  }
  
  protected b c()
  {
    return new b(this);
  }
  
  protected c d()
  {
    return new c();
  }
  
  protected org.c.f.a.h e()
  {
    if (this.a) {
      return new h();
    }
    return new g();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/b/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */