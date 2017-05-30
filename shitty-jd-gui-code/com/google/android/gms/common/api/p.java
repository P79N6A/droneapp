package com.google.android.gms.common.api;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.google.android.gms.internal.ais;

public abstract class p<R extends m, S extends m>
{
  @NonNull
  public Status a(@NonNull Status paramStatus)
  {
    return paramStatus;
  }
  
  @Nullable
  @WorkerThread
  public abstract i<S> a(@NonNull R paramR);
  
  @NonNull
  public final i<S> b(@NonNull Status paramStatus)
  {
    return new ais(paramStatus);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/api/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */