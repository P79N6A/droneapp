package org.b.a;

import org.b.b;
import org.b.g;
import org.b.k;

public class f<T>
  extends b<T>
{
  private final k<T> a;
  
  public f(k<T> paramk)
  {
    this.a = paramk;
  }
  
  @Deprecated
  @org.b.i
  public static <T> k<T> a(Class<T> paramClass)
  {
    return a(j.a(paramClass));
  }
  
  @org.b.i
  public static <T> k<T> a(k<T> paramk)
  {
    return new f(paramk);
  }
  
  @org.b.i
  public static <T> k<T> b(Class<T> paramClass)
  {
    return a(j.a(paramClass));
  }
  
  @org.b.i
  public static <T> k<T> b(T paramT)
  {
    return a(i.b(paramT));
  }
  
  public void a(Object paramObject, g paramg)
  {
    this.a.a(paramObject, paramg);
  }
  
  public void a(g paramg)
  {
    paramg.a("is ").a(this.a);
  }
  
  public boolean a(Object paramObject)
  {
    return this.a.a(paramObject);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/b/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */