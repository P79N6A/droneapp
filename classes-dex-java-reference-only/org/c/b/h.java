package org.c.b;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import org.c.f.d;
import org.c.j;

public class h
{
  public static final Comparator<Method> a = new Comparator()
  {
    public int a(Method paramAnonymousMethod1, Method paramAnonymousMethod2)
    {
      int i = paramAnonymousMethod1.getName().hashCode();
      int j = paramAnonymousMethod2.getName().hashCode();
      if (i != j)
      {
        if (i < j) {
          return -1;
        }
        return 1;
      }
      return h.b.compare(paramAnonymousMethod1, paramAnonymousMethod2);
    }
  };
  public static final Comparator<Method> b = new Comparator()
  {
    public int a(Method paramAnonymousMethod1, Method paramAnonymousMethod2)
    {
      int i = paramAnonymousMethod1.getName().compareTo(paramAnonymousMethod2.getName());
      if (i != 0) {
        return i;
      }
      return paramAnonymousMethod1.toString().compareTo(paramAnonymousMethod2.toString());
    }
  };
  
  private static Comparator<Method> a(j paramj)
  {
    if (paramj == null) {
      return a;
    }
    return paramj.a().a();
  }
  
  public static Method[] a(Class<?> paramClass)
  {
    Comparator localComparator = a((j)paramClass.getAnnotation(j.class));
    paramClass = paramClass.getDeclaredMethods();
    if (localComparator != null) {
      Arrays.sort(paramClass, localComparator);
    }
    return paramClass;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */