package com.google.android.gms.awareness.fence;

import android.support.annotation.RequiresPermission;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.fence.internal.a;

public final class b
{
  public static final int a = 0;
  public static final int b = 1;
  public static final int c = 2;
  public static final int d = 3;
  public static final int e = 4;
  public static final int f = 5;
  public static final int g = 7;
  public static final int h = 8;
  
  @RequiresPermission("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
  public static AwarenessFence a(int... paramVarArgs)
  {
    return ContextFenceStub.a(a.a(paramVarArgs));
  }
  
  @RequiresPermission("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
  public static AwarenessFence b(int... paramVarArgs)
  {
    return ContextFenceStub.a(a.a(2, paramVarArgs));
  }
  
  @RequiresPermission("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
  public static AwarenessFence c(int... paramVarArgs)
  {
    return ContextFenceStub.a(a.a(3, paramVarArgs));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/awareness/fence/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */