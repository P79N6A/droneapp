package org.b.a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.b.g;
import org.b.i;
import org.b.k;

public class b<T>
  extends n<T>
{
  public b(Iterable<k<? super T>> paramIterable)
  {
    super(paramIterable);
  }
  
  @i
  public static <T> b<T> a(Iterable<k<? super T>> paramIterable)
  {
    return new b(paramIterable);
  }
  
  @i
  public static <T> b<T> a(k<T> paramk, k<? super T> paramk1)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramk);
    localArrayList.add(paramk1);
    return a(localArrayList);
  }
  
  @i
  public static <T> b<T> a(k<T> paramk, k<? super T> paramk1, k<? super T> paramk2)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramk);
    localArrayList.add(paramk1);
    localArrayList.add(paramk2);
    return a(localArrayList);
  }
  
  @i
  public static <T> b<T> a(k<T> paramk, k<? super T> paramk1, k<? super T> paramk2, k<? super T> paramk3)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramk);
    localArrayList.add(paramk1);
    localArrayList.add(paramk2);
    localArrayList.add(paramk3);
    return a(localArrayList);
  }
  
  @i
  public static <T> b<T> a(k<T> paramk, k<? super T> paramk1, k<? super T> paramk2, k<? super T> paramk3, k<? super T> paramk4)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramk);
    localArrayList.add(paramk1);
    localArrayList.add(paramk2);
    localArrayList.add(paramk3);
    localArrayList.add(paramk4);
    return a(localArrayList);
  }
  
  @i
  public static <T> b<T> a(k<T> paramk, k<? super T> paramk1, k<? super T> paramk2, k<? super T> paramk3, k<? super T> paramk4, k<? super T> paramk5)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramk);
    localArrayList.add(paramk1);
    localArrayList.add(paramk2);
    localArrayList.add(paramk3);
    localArrayList.add(paramk4);
    localArrayList.add(paramk5);
    return a(localArrayList);
  }
  
  @i
  public static <T> b<T> a(k<? super T>... paramVarArgs)
  {
    return a(Arrays.asList(paramVarArgs));
  }
  
  public void a(g paramg)
  {
    a(paramg, "or");
  }
  
  public boolean a(Object paramObject)
  {
    return a(paramObject, true);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/b/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */