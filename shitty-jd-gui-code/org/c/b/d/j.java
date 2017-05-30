package org.c.b.d;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.c.b;
import org.c.b.h;
import org.c.f;
import org.c.g;
import org.c.m;

@Deprecated
public class j
{
  private final Class<?> a;
  
  public j(Class<?> paramClass)
  {
    this.a = paramClass;
  }
  
  private boolean a(Method paramMethod1, Method paramMethod2)
  {
    if (!paramMethod2.getName().equals(paramMethod1.getName())) {}
    while (paramMethod2.getParameterTypes().length != paramMethod1.getParameterTypes().length) {
      return false;
    }
    int i = 0;
    for (;;)
    {
      if (i >= paramMethod2.getParameterTypes().length) {
        break label65;
      }
      if (!paramMethod2.getParameterTypes()[i].equals(paramMethod1.getParameterTypes()[i])) {
        break;
      }
      i += 1;
    }
    label65:
    return true;
  }
  
  private boolean a(Method paramMethod, List<Method> paramList)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      if (a(paramMethod, (Method)paramList.next())) {
        return true;
      }
    }
    return false;
  }
  
  private boolean b(Class<? extends Annotation> paramClass)
  {
    return (paramClass.equals(f.class)) || (paramClass.equals(g.class));
  }
  
  private List<Class<?>> c(Class<?> paramClass)
  {
    ArrayList localArrayList = new ArrayList();
    while (paramClass != null)
    {
      localArrayList.add(paramClass);
      paramClass = paramClass.getSuperclass();
    }
    return localArrayList;
  }
  
  public List<Method> a()
  {
    return a(m.class);
  }
  
  public List<Method> a(Class<? extends Annotation> paramClass)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = c(this.a).iterator();
    while (localIterator.hasNext())
    {
      Method[] arrayOfMethod = h.a((Class)localIterator.next());
      int j = arrayOfMethod.length;
      int i = 0;
      while (i < j)
      {
        Method localMethod = arrayOfMethod[i];
        if ((localMethod.getAnnotation(paramClass) != null) && (!a(localMethod, localArrayList))) {
          localArrayList.add(localMethod);
        }
        i += 1;
      }
    }
    if (b(paramClass)) {
      Collections.reverse(localArrayList);
    }
    return localArrayList;
  }
  
  List<Method> b()
  {
    return a(g.class);
  }
  
  List<Method> c()
  {
    return a(b.class);
  }
  
  public Constructor<?> d()
  {
    return this.a.getConstructor(new Class[0]);
  }
  
  public Class<?> e()
  {
    return this.a;
  }
  
  public String f()
  {
    return this.a.getName();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/b/d/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */