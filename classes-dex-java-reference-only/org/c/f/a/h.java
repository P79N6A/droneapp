package org.c.f.a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.c.b.d.b;
import org.c.e.l;

public abstract class h
{
  private final Set<Class<?>> a = new HashSet();
  
  private List<l> a(Class<?>[] paramArrayOfClass)
  {
    ArrayList localArrayList = new ArrayList();
    int j = paramArrayOfClass.length;
    int i = 0;
    while (i < j)
    {
      l locall = c(paramArrayOfClass[i]);
      if (locall != null) {
        localArrayList.add(locall);
      }
      i += 1;
    }
    return localArrayList;
  }
  
  public List<l> a(Class<?> paramClass, List<Class<?>> paramList)
  {
    return a(paramClass, (Class[])paramList.toArray(new Class[0]));
  }
  
  public List<l> a(Class<?> paramClass, Class<?>[] paramArrayOfClass)
  {
    d(paramClass);
    try
    {
      paramArrayOfClass = a(paramArrayOfClass);
      return paramArrayOfClass;
    }
    finally
    {
      e(paramClass);
    }
  }
  
  public abstract l a(Class<?> paramClass);
  
  public l c(Class<?> paramClass)
  {
    try
    {
      l locall = a(paramClass);
      return locall;
    }
    catch (Throwable localThrowable)
    {
      return new b(paramClass, localThrowable);
    }
  }
  
  Class<?> d(Class<?> paramClass)
  {
    if (!this.a.add(paramClass)) {
      throw new e(String.format("class '%s' (possibly indirectly) contains itself as a SuiteClass", new Object[] { paramClass.getName() }));
    }
    return paramClass;
  }
  
  void e(Class<?> paramClass)
  {
    this.a.remove(paramClass);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/f/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */