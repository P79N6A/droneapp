package org.b.a;

import org.b.g;
import org.b.h;
import org.b.i;
import org.b.k;

public class j
  extends h<Object>
{
  private final Class<?> a;
  private final Class<?> b;
  
  public j(Class<?> paramClass)
  {
    this.a = paramClass;
    this.b = c(paramClass);
  }
  
  @i
  public static <T> k<T> a(Class<?> paramClass)
  {
    return new j(paramClass);
  }
  
  @i
  public static <T> k<T> b(Class<T> paramClass)
  {
    return new j(paramClass);
  }
  
  private static Class<?> c(Class<?> paramClass)
  {
    Object localObject;
    if (Boolean.TYPE.equals(paramClass)) {
      localObject = Boolean.class;
    }
    do
    {
      return (Class<?>)localObject;
      if (Byte.TYPE.equals(paramClass)) {
        return Byte.class;
      }
      if (Character.TYPE.equals(paramClass)) {
        return Character.class;
      }
      if (Double.TYPE.equals(paramClass)) {
        return Double.class;
      }
      if (Float.TYPE.equals(paramClass)) {
        return Float.class;
      }
      if (Integer.TYPE.equals(paramClass)) {
        return Integer.class;
      }
      if (Long.TYPE.equals(paramClass)) {
        return Long.class;
      }
      localObject = paramClass;
    } while (!Short.TYPE.equals(paramClass));
    return Short.class;
  }
  
  public void a(g paramg)
  {
    paramg.a("an instance of ").a(this.a.getName());
  }
  
  protected boolean b(Object paramObject, g paramg)
  {
    if (paramObject == null)
    {
      paramg.a("null");
      return false;
    }
    if (!this.b.isInstance(paramObject))
    {
      paramg.a(paramObject).a(" is a " + paramObject.getClass().getName());
      return false;
    }
    return true;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/b/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */