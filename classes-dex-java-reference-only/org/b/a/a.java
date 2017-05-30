package org.b.a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.b.g;
import org.b.h;
import org.b.i;
import org.b.k;

public class a<T>
  extends h<T>
{
  private final Iterable<k<? super T>> a;
  
  public a(Iterable<k<? super T>> paramIterable)
  {
    this.a = paramIterable;
  }
  
  @i
  public static <T> k<T> a(Iterable<k<? super T>> paramIterable)
  {
    return new a(paramIterable);
  }
  
  @i
  public static <T> k<T> a(k<? super T> paramk1, k<? super T> paramk2)
  {
    ArrayList localArrayList = new ArrayList(2);
    localArrayList.add(paramk1);
    localArrayList.add(paramk2);
    return a(localArrayList);
  }
  
  @i
  public static <T> k<T> a(k<? super T> paramk1, k<? super T> paramk2, k<? super T> paramk3)
  {
    ArrayList localArrayList = new ArrayList(3);
    localArrayList.add(paramk1);
    localArrayList.add(paramk2);
    localArrayList.add(paramk3);
    return a(localArrayList);
  }
  
  @i
  public static <T> k<T> a(k<? super T> paramk1, k<? super T> paramk2, k<? super T> paramk3, k<? super T> paramk4)
  {
    ArrayList localArrayList = new ArrayList(4);
    localArrayList.add(paramk1);
    localArrayList.add(paramk2);
    localArrayList.add(paramk3);
    localArrayList.add(paramk4);
    return a(localArrayList);
  }
  
  @i
  public static <T> k<T> a(k<? super T> paramk1, k<? super T> paramk2, k<? super T> paramk3, k<? super T> paramk4, k<? super T> paramk5)
  {
    ArrayList localArrayList = new ArrayList(5);
    localArrayList.add(paramk1);
    localArrayList.add(paramk2);
    localArrayList.add(paramk3);
    localArrayList.add(paramk4);
    localArrayList.add(paramk5);
    return a(localArrayList);
  }
  
  @i
  public static <T> k<T> a(k<? super T> paramk1, k<? super T> paramk2, k<? super T> paramk3, k<? super T> paramk4, k<? super T> paramk5, k<? super T> paramk6)
  {
    ArrayList localArrayList = new ArrayList(6);
    localArrayList.add(paramk1);
    localArrayList.add(paramk2);
    localArrayList.add(paramk3);
    localArrayList.add(paramk4);
    localArrayList.add(paramk5);
    localArrayList.add(paramk6);
    return a(localArrayList);
  }
  
  @i
  public static <T> k<T> a(k<? super T>... paramVarArgs)
  {
    return a(Arrays.asList(paramVarArgs));
  }
  
  public void a(g paramg)
  {
    paramg.b("(", " and ", ")", this.a);
  }
  
  public boolean b(Object paramObject, g paramg)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      k localk = (k)localIterator.next();
      if (!localk.a(paramObject))
      {
        paramg.a(localk).a(" ");
        localk.a(paramObject, paramg);
        return false;
      }
    }
    return true;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/b/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */