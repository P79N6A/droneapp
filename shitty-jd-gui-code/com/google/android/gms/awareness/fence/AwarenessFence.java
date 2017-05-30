package com.google.android.gms.awareness.fence;

import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public abstract class AwarenessFence
  extends AbstractSafeParcelable
{
  public static AwarenessFence a(AwarenessFence paramAwarenessFence)
  {
    d.a(paramAwarenessFence);
    return ContextFenceStub.a((ContextFenceStub)paramAwarenessFence);
  }
  
  public static AwarenessFence a(Collection<AwarenessFence> paramCollection)
  {
    if ((paramCollection != null) && (!paramCollection.isEmpty())) {}
    for (boolean bool = true;; bool = false)
    {
      d.b(bool);
      return ContextFenceStub.c(c(paramCollection));
    }
  }
  
  public static AwarenessFence a(AwarenessFence... paramVarArgs)
  {
    if ((paramVarArgs != null) && (paramVarArgs.length > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      d.b(bool);
      return ContextFenceStub.c(c(paramVarArgs));
    }
  }
  
  public static AwarenessFence b(Collection<AwarenessFence> paramCollection)
  {
    if ((paramCollection != null) && (!paramCollection.isEmpty())) {}
    for (boolean bool = true;; bool = false)
    {
      d.b(bool);
      return ContextFenceStub.d(c(paramCollection));
    }
  }
  
  public static AwarenessFence b(AwarenessFence... paramVarArgs)
  {
    if ((paramVarArgs != null) && (paramVarArgs.length > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      d.b(bool);
      return ContextFenceStub.d(c(paramVarArgs));
    }
  }
  
  private static ArrayList<ContextFenceStub> c(Collection<AwarenessFence> paramCollection)
  {
    ArrayList localArrayList = new ArrayList(paramCollection.size());
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      localArrayList.add((ContextFenceStub)paramCollection.next());
    }
    return localArrayList;
  }
  
  private static ArrayList<ContextFenceStub> c(AwarenessFence[] paramArrayOfAwarenessFence)
  {
    ArrayList localArrayList = new ArrayList(paramArrayOfAwarenessFence.length);
    int j = paramArrayOfAwarenessFence.length;
    int i = 0;
    while (i < j)
    {
      localArrayList.add((ContextFenceStub)paramArrayOfAwarenessFence[i]);
      i += 1;
    }
    return localArrayList;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/awareness/fence/AwarenessFence.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */