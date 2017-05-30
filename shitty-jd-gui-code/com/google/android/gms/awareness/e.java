package com.google.android.gms.awareness;

import android.support.annotation.RequiresPermission;
import com.google.android.gms.awareness.snapshot.a;
import com.google.android.gms.awareness.snapshot.b;
import com.google.android.gms.awareness.snapshot.c;
import com.google.android.gms.awareness.snapshot.d;
import com.google.android.gms.awareness.snapshot.f;
import com.google.android.gms.awareness.state.BeaconState.TypeFilter;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import java.util.Collection;

public abstract interface e
{
  @RequiresPermission("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
  public abstract i<b> a(g paramg);
  
  @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
  public abstract i<a> a(g paramg, Collection<BeaconState.TypeFilter> paramCollection);
  
  @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
  public abstract i<a> a(g paramg, BeaconState.TypeFilter... paramVarArgs);
  
  public abstract i<c> b(g paramg);
  
  @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
  public abstract i<d> c(g paramg);
  
  @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
  public abstract i<com.google.android.gms.awareness.snapshot.e> d(g paramg);
  
  @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
  public abstract i<f> e(g paramg);
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/awareness/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */