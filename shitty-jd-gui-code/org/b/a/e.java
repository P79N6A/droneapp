package org.b.a;

import java.util.Iterator;
import org.b.g;
import org.b.i;
import org.b.k;
import org.b.o;

public class e<T>
  extends o<Iterable<T>>
{
  private final k<? super T> a;
  
  public e(k<? super T> paramk)
  {
    this.a = paramk;
  }
  
  @i
  public static <U> k<Iterable<U>> a(k<U> paramk)
  {
    return new e(paramk);
  }
  
  public void a(g paramg)
  {
    paramg.a("every item is ").a(this.a);
  }
  
  public boolean a(Iterable<T> paramIterable, g paramg)
  {
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext())
    {
      Object localObject = paramIterable.next();
      if (!this.a.a(localObject))
      {
        paramg.a("an item ");
        this.a.a(localObject, paramg);
        return false;
      }
    }
    return true;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/b/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */