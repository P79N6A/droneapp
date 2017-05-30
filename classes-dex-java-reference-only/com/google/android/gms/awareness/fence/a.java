package com.google.android.gms.awareness.fence;

import android.support.annotation.RequiresPermission;
import com.google.android.gms.awareness.state.BeaconState.TypeFilter;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.fence.internal.d;
import java.util.Collection;

public final class a
{
  @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
  public static AwarenessFence a(Collection<BeaconState.TypeFilter> paramCollection)
  {
    if ((paramCollection == null) || (paramCollection.isEmpty())) {
      return a(new BeaconState.TypeFilter[0]);
    }
    return a((BeaconState.TypeFilter[])paramCollection.toArray(new BeaconState.TypeFilter[paramCollection.size()]));
  }
  
  @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
  public static AwarenessFence a(BeaconState.TypeFilter... paramVarArgs)
  {
    return ContextFenceStub.a(d.a(paramVarArgs));
  }
  
  @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
  public static AwarenessFence b(Collection<BeaconState.TypeFilter> paramCollection)
  {
    if ((paramCollection == null) || (paramCollection.isEmpty())) {
      return b(new BeaconState.TypeFilter[0]);
    }
    return b((BeaconState.TypeFilter[])paramCollection.toArray(new BeaconState.TypeFilter[paramCollection.size()]));
  }
  
  @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
  public static AwarenessFence b(BeaconState.TypeFilter... paramVarArgs)
  {
    return ContextFenceStub.a(d.b(paramVarArgs));
  }
  
  @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
  public static AwarenessFence c(Collection<BeaconState.TypeFilter> paramCollection)
  {
    if ((paramCollection == null) || (paramCollection.isEmpty())) {
      return c(new BeaconState.TypeFilter[0]);
    }
    return c((BeaconState.TypeFilter[])paramCollection.toArray(new BeaconState.TypeFilter[paramCollection.size()]));
  }
  
  @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
  public static AwarenessFence c(BeaconState.TypeFilter... paramVarArgs)
  {
    return ContextFenceStub.a(d.c(paramVarArgs));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/awareness/fence/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */