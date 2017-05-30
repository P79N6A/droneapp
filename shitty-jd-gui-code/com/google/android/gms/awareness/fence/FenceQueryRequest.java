package com.google.android.gms.awareness.fence;

import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.contextmanager.fence.internal.FenceQueryRequestImpl;
import java.util.Collection;
import java.util.Iterator;

public abstract class FenceQueryRequest
  extends AbstractSafeParcelable
{
  public static FenceQueryRequest a()
  {
    return new FenceQueryRequestImpl();
  }
  
  public static FenceQueryRequest a(Collection<String> paramCollection)
  {
    d.a(paramCollection);
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext()) {
      d.a((String)localIterator.next());
    }
    return new FenceQueryRequestImpl(paramCollection);
  }
  
  public static FenceQueryRequest a(String... paramVarArgs)
  {
    d.a(paramVarArgs);
    int j = paramVarArgs.length;
    int i = 0;
    while (i < j)
    {
      d.a(paramVarArgs[i]);
      i += 1;
    }
    return new FenceQueryRequestImpl(paramVarArgs);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/awareness/fence/FenceQueryRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */