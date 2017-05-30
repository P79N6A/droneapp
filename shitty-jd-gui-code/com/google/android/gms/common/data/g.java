package com.google.android.gms.common.data;

import java.util.ArrayList;
import java.util.Iterator;

public final class g
{
  public static <T, E extends f<T>> ArrayList<T> a(Iterable<E> paramIterable)
  {
    ArrayList localArrayList = new ArrayList();
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext()) {
      localArrayList.add(((f)paramIterable.next()).a());
    }
    return localArrayList;
  }
  
  public static <T, E extends f<T>> ArrayList<T> a(ArrayList<E> paramArrayList)
  {
    ArrayList localArrayList = new ArrayList(paramArrayList.size());
    int j = paramArrayList.size();
    int i = 0;
    while (i < j)
    {
      localArrayList.add(((f)paramArrayList.get(i)).a());
      i += 1;
    }
    return localArrayList;
  }
  
  public static <T, E extends f<T>> ArrayList<T> a(E[] paramArrayOfE)
  {
    ArrayList localArrayList = new ArrayList(paramArrayOfE.length);
    int i = 0;
    while (i < paramArrayOfE.length)
    {
      localArrayList.add(paramArrayOfE[i].a());
      i += 1;
    }
    return localArrayList;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/data/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */