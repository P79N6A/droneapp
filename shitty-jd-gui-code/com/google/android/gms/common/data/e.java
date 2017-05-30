package com.google.android.gms.common.data;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

public final class e
{
  public static <T, E extends f<T>> ArrayList<T> a(b<E> paramb)
  {
    ArrayList localArrayList = new ArrayList(paramb.c());
    try
    {
      Iterator localIterator = paramb.iterator();
      while (localIterator.hasNext()) {
        localArrayList.add(((f)localIterator.next()).a());
      }
    }
    finally
    {
      paramb.d();
    }
    return localArrayList1;
  }
  
  public static boolean b(b<?> paramb)
  {
    paramb = paramb.f();
    return (paramb != null) && (paramb.getString("next_page_token") != null);
  }
  
  public static boolean c(b<?> paramb)
  {
    paramb = paramb.f();
    return (paramb != null) && (paramb.getString("prev_page_token") != null);
  }
  
  public static boolean d(b<?> paramb)
  {
    return (paramb != null) && (paramb.c() > 0);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/data/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */