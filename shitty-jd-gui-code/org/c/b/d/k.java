package org.c.b.d;

import java.lang.reflect.Method;
import java.util.List;
import org.c.a;
import org.c.f;
import org.c.m;
import org.c.m.a;

@Deprecated
public class k
{
  private final Method a;
  private j b;
  
  public k(Method paramMethod, j paramj)
  {
    this.a = paramMethod;
    this.b = paramj;
  }
  
  public void a(Object paramObject)
  {
    this.a.invoke(paramObject, new Object[0]);
  }
  
  public boolean a()
  {
    return this.a.getAnnotation(org.c.k.class) != null;
  }
  
  boolean a(Throwable paramThrowable)
  {
    return !c().isAssignableFrom(paramThrowable.getClass());
  }
  
  public long b()
  {
    m localm = (m)this.a.getAnnotation(m.class);
    if (localm == null) {
      return 0L;
    }
    return localm.b();
  }
  
  protected Class<? extends Throwable> c()
  {
    m localm = (m)this.a.getAnnotation(m.class);
    if ((localm == null) || (localm.a() == m.a.class)) {
      return null;
    }
    return localm.a();
  }
  
  boolean d()
  {
    return c() != null;
  }
  
  List<Method> e()
  {
    return this.b.a(f.class);
  }
  
  List<Method> f()
  {
    return this.b.a(a.class);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/b/d/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */