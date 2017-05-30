package org.b.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.b.g;
import org.b.k;
import org.b.o;

public class h<T>
  extends o<Iterable<? super T>>
{
  private final k<? super T> a;
  
  public h(k<? super T> paramk)
  {
    this.a = paramk;
  }
  
  @org.b.i
  public static <T> k<Iterable<? super T>> a(k<? super T> paramk)
  {
    return new h(paramk);
  }
  
  @org.b.i
  public static <T> k<Iterable<T>> a(T... paramVarArgs)
  {
    ArrayList localArrayList = new ArrayList(paramVarArgs.length);
    int j = paramVarArgs.length;
    int i = 0;
    while (i < j)
    {
      localArrayList.add(b(paramVarArgs[i]));
      i += 1;
    }
    return a.a(localArrayList);
  }
  
  @org.b.i
  public static <T> k<Iterable<T>> a(k<? super T>... paramVarArgs)
  {
    ArrayList localArrayList = new ArrayList(paramVarArgs.length);
    int j = paramVarArgs.length;
    int i = 0;
    while (i < j)
    {
      localArrayList.add(new h(paramVarArgs[i]));
      i += 1;
    }
    return a.a(localArrayList);
  }
  
  @org.b.i
  public static <T> k<Iterable<? super T>> b(T paramT)
  {
    return new h(i.b(paramT));
  }
  
  public void a(g paramg)
  {
    paramg.a("a collection containing ").a(this.a);
  }
  
  protected boolean a(Iterable<? super T> paramIterable, g paramg)
  {
    paramIterable = paramIterable.iterator();
    for (int i = 0; paramIterable.hasNext(); i = 1)
    {
      Object localObject = paramIterable.next();
      if (this.a.a(localObject)) {
        return true;
      }
      if (i != 0) {
        paramg.a(", ");
      }
      this.a.a(localObject, paramg);
    }
    return false;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/b/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */