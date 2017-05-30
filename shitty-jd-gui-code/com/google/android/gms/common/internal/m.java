package com.google.android.gms.common.internal;

import android.support.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.api.v;

public class m
{
  @NonNull
  public static r a(@NonNull ConnectionResult paramConnectionResult)
  {
    return a(new Status(paramConnectionResult.c(), paramConnectionResult.e(), paramConnectionResult.d()));
  }
  
  @NonNull
  public static r a(@NonNull Status paramStatus)
  {
    if (paramStatus.e()) {
      return new v(paramStatus);
    }
    return new r(paramStatus);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/internal/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */