package org.c.b.b;

import org.b.g;
import org.b.i;
import org.b.k;
import org.b.p;

public class b<T extends Throwable>
  extends p<T>
{
  private final k<? extends Throwable> a;
  
  public b(k<? extends Throwable> paramk)
  {
    this.a = paramk;
  }
  
  @i
  public static <T extends Throwable> k<T> a(k<? extends Throwable> paramk)
  {
    return new b(paramk);
  }
  
  protected void a(T paramT, g paramg)
  {
    paramg.a("cause ");
    this.a.a(paramT.getCause(), paramg);
  }
  
  public void a(g paramg)
  {
    paramg.a("exception with cause ");
    paramg.a(this.a);
  }
  
  protected boolean a(T paramT)
  {
    return this.a.a(paramT.getCause());
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/b/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */