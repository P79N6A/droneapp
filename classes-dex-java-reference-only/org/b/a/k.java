package org.b.a;

import org.b.b;
import org.b.g;

public class k<T>
  extends b<T>
{
  private final org.b.k<T> a;
  
  public k(org.b.k<T> paramk)
  {
    this.a = paramk;
  }
  
  @org.b.i
  public static <T> org.b.k<T> a(org.b.k<T> paramk)
  {
    return new k(paramk);
  }
  
  @org.b.i
  public static <T> org.b.k<T> b(T paramT)
  {
    return a(i.b(paramT));
  }
  
  public void a(g paramg)
  {
    paramg.a("not ").a(this.a);
  }
  
  public boolean a(Object paramObject)
  {
    return !this.a.a(paramObject);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/b/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */