package com.google.android.gms.common.api;

import android.support.annotation.NonNull;
import android.util.Log;

public abstract class o<R extends m>
  implements n<R>
{
  public abstract void a(@NonNull Status paramStatus);
  
  public final void a(@NonNull R paramR)
  {
    Status localStatus = paramR.a();
    if (localStatus.f()) {
      b(paramR);
    }
    do
    {
      return;
      a(localStatus);
    } while (!(paramR instanceof k));
    try
    {
      ((k)paramR).b();
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      paramR = String.valueOf(paramR);
      Log.w("ResultCallbacks", String.valueOf(paramR).length() + 18 + "Unable to release " + paramR, localRuntimeException);
    }
  }
  
  public abstract void b(@NonNull R paramR);
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/api/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */