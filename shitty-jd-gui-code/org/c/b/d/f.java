package org.c.b.d;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.c.e.a.b;
import org.c.e.a.d;
import org.c.e.a.e;
import org.c.e.l;

@Deprecated
public class f
  extends l
  implements b, d
{
  private final List<Method> a;
  private j b;
  
  public f(Class<?> paramClass)
  {
    this.b = new j(paramClass);
    this.a = a();
    b();
  }
  
  private void a(org.c.e.b.c paramc, org.c.e.c paramc1, Throwable paramThrowable)
  {
    paramc.b(paramc1);
    paramc.a(new org.c.e.b.a(paramc1, paramThrowable));
    paramc.d(paramc1);
  }
  
  protected List<Method> a()
  {
    return this.b.a();
  }
  
  protected k a(Method paramMethod)
  {
    return new k(paramMethod, this.b);
  }
  
  protected void a(Method paramMethod, org.c.e.b.c paramc)
  {
    org.c.e.c localc = c(paramMethod);
    try
    {
      Object localObject = f();
      new g(localObject, a(paramMethod), paramc, localc).a();
      return;
    }
    catch (InvocationTargetException paramMethod)
    {
      a(paramc, localc, paramMethod.getCause());
      return;
    }
    catch (Exception paramMethod)
    {
      a(paramc, localc, paramMethod);
    }
  }
  
  public void a(org.c.e.a.a parama)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      if (!parama.a(c((Method)localIterator.next()))) {
        localIterator.remove();
      }
    }
    if (this.a.isEmpty()) {
      throw new org.c.e.a.c();
    }
  }
  
  public void a(e parame)
  {
    Collections.sort(this.a, new f.2(this, parame));
  }
  
  public void a(org.c.e.b.c paramc)
  {
    new a(paramc, this.b, d(), new f.1(this, paramc)).b();
  }
  
  protected String b(Method paramMethod)
  {
    return paramMethod.getName();
  }
  
  protected void b()
  {
    h localh = new h(this.b);
    localh.c();
    localh.d();
  }
  
  protected void b(org.c.e.b.c paramc)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      a((Method)localIterator.next(), paramc);
    }
  }
  
  protected org.c.e.c c(Method paramMethod)
  {
    return org.c.e.c.a(g().e(), b(paramMethod), d(paramMethod));
  }
  
  protected Annotation[] c()
  {
    return this.b.e().getAnnotations();
  }
  
  public org.c.e.c d()
  {
    org.c.e.c localc = org.c.e.c.a(e(), c());
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      localc.a(c((Method)localIterator.next()));
    }
    return localc;
  }
  
  protected Annotation[] d(Method paramMethod)
  {
    return paramMethod.getAnnotations();
  }
  
  protected String e()
  {
    return g().f();
  }
  
  protected Object f()
  {
    return g().d().newInstance(new Object[0]);
  }
  
  protected j g()
  {
    return this.b;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/b/d/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */