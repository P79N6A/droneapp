package com.google.android.gms.common.api;

import android.support.v4.util.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ahh;

public class s
  extends t
{
  private final ConnectionResult a;
  
  public s(Status paramStatus, ArrayMap<ahh<?>, ConnectionResult> paramArrayMap)
  {
    super(paramStatus, paramArrayMap);
    this.a = ((ConnectionResult)paramArrayMap.get(paramArrayMap.keyAt(0)));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/api/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */