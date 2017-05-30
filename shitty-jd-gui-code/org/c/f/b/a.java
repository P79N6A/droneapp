package org.c.f.b;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import org.c.e.b.c;
import org.c.f.a.j;
import org.c.f.a.k;
import org.c.f.e.a;

public class a
  extends org.c.f.b
{
  private final Object[] a;
  private final String b;
  
  public a(d paramd)
  {
    super(paramd.b().d());
    this.a = paramd.c().toArray(new Object[paramd.c().size()]);
    this.b = paramd.a();
  }
  
  private Object j()
  {
    return g().f().newInstance(this.a);
  }
  
  private Object k()
  {
    Object localObject2 = l();
    if (((List)localObject2).size() != this.a.length) {
      throw new Exception("Wrong number of parameters and @Parameter fields. @Parameter fields counted: " + ((List)localObject2).size() + ", available parameters: " + this.a.length + ".");
    }
    Object localObject1 = g().d().newInstance();
    Iterator localIterator = ((List)localObject2).iterator();
    while (localIterator.hasNext())
    {
      localObject2 = ((org.c.f.a.b)localIterator.next()).d();
      int i = ((e.a)((Field)localObject2).getAnnotation(e.a.class)).a();
      try
      {
        ((Field)localObject2).set(localObject1, this.a[i]);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        throw new Exception(g().e() + ": Trying to set " + ((Field)localObject2).getName() + " with the value " + this.a[i] + " that is not the right type (" + this.a[i].getClass().getSimpleName() + " instead of " + ((Field)localObject2).getType().getSimpleName() + ").", localIllegalArgumentException);
      }
    }
    return localIllegalArgumentException;
  }
  
  private List<org.c.f.a.b> l()
  {
    return g().c(e.a.class);
  }
  
  private boolean m()
  {
    return !l().isEmpty();
  }
  
  public Object b()
  {
    if (m()) {
      return k();
    }
    return j();
  }
  
  protected j b(c paramc)
  {
    return c(paramc);
  }
  
  protected void b(List<Throwable> paramList)
  {
    e(paramList);
    if (m()) {
      f(paramList);
    }
  }
  
  protected String d(org.c.f.a.d paramd)
  {
    return paramd.b() + f();
  }
  
  protected String f()
  {
    return this.b;
  }
  
  protected void h(List<Throwable> paramList)
  {
    super.h(paramList);
    if (m())
    {
      List localList = l();
      int[] arrayOfInt = new int[localList.size()];
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        i = ((e.a)((org.c.f.a.b)localIterator.next()).d().getAnnotation(e.a.class)).a();
        if ((i < 0) || (i > localList.size() - 1)) {
          paramList.add(new Exception("Invalid @Parameter value: " + i + ". @Parameter fields counted: " + localList.size() + ". Please use an index between 0 and " + (localList.size() - 1) + "."));
        } else {
          arrayOfInt[i] += 1;
        }
      }
      int i = 0;
      if (i < arrayOfInt.length)
      {
        int j = arrayOfInt[i];
        if (j == 0) {
          paramList.add(new Exception("@Parameter(" + i + ") is never used."));
        }
        for (;;)
        {
          i += 1;
          break;
          if (j > 1) {
            paramList.add(new Exception("@Parameter(" + i + ") is used more than once (" + j + ")."));
          }
        }
      }
    }
  }
  
  protected Annotation[] i()
  {
    return new Annotation[0];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/f/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */