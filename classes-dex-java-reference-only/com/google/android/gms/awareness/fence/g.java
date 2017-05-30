package com.google.android.gms.awareness.fence;

import android.support.annotation.RequiresPermission;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.fence.internal.n;

public final class g
{
  @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
  public static AwarenessFence a(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    return ContextFenceStub.a(n.a((int)(paramDouble1 * 1.0E7D), (int)(1.0E7D * paramDouble2), paramDouble3));
  }
  
  @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
  public static AwarenessFence a(double paramDouble1, double paramDouble2, double paramDouble3, long paramLong)
  {
    return ContextFenceStub.a(n.a((int)(paramDouble1 * 1.0E7D), (int)(1.0E7D * paramDouble2), paramDouble3, paramLong));
  }
  
  @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
  public static AwarenessFence b(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    return ContextFenceStub.a(n.b((int)(paramDouble1 * 1.0E7D), (int)(1.0E7D * paramDouble2), paramDouble3));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/awareness/fence/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */