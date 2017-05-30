package com.google.android.gms.common.api;

import android.support.v4.util.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ahh;

public class t
  implements m
{
  private final Status a;
  private final ArrayMap<ahh<?>, ConnectionResult> b;
  
  public t(Status paramStatus, ArrayMap<ahh<?>, ConnectionResult> paramArrayMap)
  {
    this.a = paramStatus;
    this.b = paramArrayMap;
  }
  
  public Status a()
  {
    return this.a;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/api/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */