package org.c.b.b;

import org.b.g;
import org.b.i;
import org.b.k;
import org.b.p;

public class c<T extends Throwable>
  extends p<T>
{
  private final k<String> a;
  
  public c(k<String> paramk)
  {
    this.a = paramk;
  }
  
  @i
  public static <T extends Throwable> k<T> a(k<String> paramk)
  {
    return new c(paramk);
  }
  
  protected void a(T paramT, g paramg)
  {
    paramg.a("message ");
    this.a.a(paramT.getMessage(), paramg);
  }
  
  public void a(g paramg)
  {
    paramg.a("exception with message ");
    paramg.a(this.a);
  }
  
  protected boolean a(T paramT)
  {
    return this.a.a(paramT.getMessage());
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/b/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */