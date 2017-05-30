package org.b.a;

import org.b.b;
import org.b.g;
import org.b.i;
import org.b.k;

public class m<T>
  extends b<T>
{
  private final T a;
  
  public m(T paramT)
  {
    this.a = paramT;
  }
  
  @i
  public static <T> k<T> b(T paramT)
  {
    return new m(paramT);
  }
  
  @i
  public static <T> k<T> c(T paramT)
  {
    return new m(paramT);
  }
  
  public void a(g paramg)
  {
    paramg.a("sameInstance(").a(this.a).a(")");
  }
  
  public boolean a(Object paramObject)
  {
    return paramObject == this.a;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/b/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */