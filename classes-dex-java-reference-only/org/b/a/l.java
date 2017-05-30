package org.b.a;

import org.b.b;
import org.b.g;
import org.b.i;

public class l<T>
  extends b<T>
{
  @i
  public static <T> org.b.k<T> a(Class<T> paramClass)
  {
    return new l();
  }
  
  @i
  public static org.b.k<Object> b()
  {
    return new l();
  }
  
  @i
  public static <T> org.b.k<T> b(Class<T> paramClass)
  {
    return k.a(a(paramClass));
  }
  
  @i
  public static org.b.k<Object> c()
  {
    return k.a(b());
  }
  
  public void a(g paramg)
  {
    paramg.a("null");
  }
  
  public boolean a(Object paramObject)
  {
    return paramObject == null;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/b/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */