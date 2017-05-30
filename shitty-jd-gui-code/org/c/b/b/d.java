package org.c.b.b;

import java.lang.reflect.Method;
import org.b.b;
import org.c.b.h;

@Deprecated
public abstract class d<T>
  extends b<T>
{
  private Class<?> a;
  
  protected d()
  {
    this.a = a(getClass());
  }
  
  protected d(Class<T> paramClass)
  {
    this.a = paramClass;
  }
  
  private static Class<?> a(Class<?> paramClass)
  {
    while (paramClass != Object.class)
    {
      Method[] arrayOfMethod = h.a(paramClass);
      int j = arrayOfMethod.length;
      int i = 0;
      while (i < j)
      {
        Method localMethod = arrayOfMethod[i];
        if (a(localMethod)) {
          return localMethod.getParameterTypes()[0];
        }
        i += 1;
      }
      paramClass = paramClass.getSuperclass();
    }
    throw new Error("Cannot determine correct type for matchesSafely() method.");
  }
  
  private static boolean a(Method paramMethod)
  {
    return (paramMethod.getName().equals("matchesSafely")) && (paramMethod.getParameterTypes().length == 1) && (!paramMethod.isSynthetic());
  }
  
  public final boolean a(Object paramObject)
  {
    return (paramObject != null) && (this.a.isInstance(paramObject)) && (b(paramObject));
  }
  
  public abstract boolean b(T paramT);
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/b/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */