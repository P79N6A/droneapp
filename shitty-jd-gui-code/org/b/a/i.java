package org.b.a;

import java.lang.reflect.Array;
import org.b.b;
import org.b.g;
import org.b.k;

public class i<T>
  extends b<T>
{
  private final Object a;
  
  public i(T paramT)
  {
    this.a = paramT;
  }
  
  private static boolean a(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null) {
      if (paramObject2 != null) {}
    }
    do
    {
      return true;
      return false;
      if ((paramObject2 == null) || (!c(paramObject1))) {
        break;
      }
    } while ((c(paramObject2)) && (b(paramObject1, paramObject2)));
    return false;
    return paramObject1.equals(paramObject2);
  }
  
  @org.b.i
  public static <T> k<T> b(T paramT)
  {
    return new i(paramT);
  }
  
  private static boolean b(Object paramObject1, Object paramObject2)
  {
    return (c(paramObject1, paramObject2)) && (d(paramObject1, paramObject2));
  }
  
  private static boolean c(Object paramObject)
  {
    return paramObject.getClass().isArray();
  }
  
  private static boolean c(Object paramObject1, Object paramObject2)
  {
    return Array.getLength(paramObject1) == Array.getLength(paramObject2);
  }
  
  private static boolean d(Object paramObject1, Object paramObject2)
  {
    int i = 0;
    while (i < Array.getLength(paramObject1))
    {
      if (!a(Array.get(paramObject1, i), Array.get(paramObject2, i))) {
        return false;
      }
      i += 1;
    }
    return true;
  }
  
  public void a(g paramg)
  {
    paramg.a(this.a);
  }
  
  public boolean a(Object paramObject)
  {
    return a(paramObject, this.a);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/b/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */