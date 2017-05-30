package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.IntentSender.SendIntentException;
import android.support.annotation.NonNull;
import android.util.Log;
import com.google.android.gms.common.internal.d;

public abstract class l<R extends m>
  extends o<R>
{
  private final Activity a;
  private final int b;
  
  protected l(@NonNull Activity paramActivity, int paramInt)
  {
    this.a = ((Activity)d.a(paramActivity, "Activity must not be null"));
    this.b = paramInt;
  }
  
  public final void a(@NonNull Status paramStatus)
  {
    if (paramStatus.e()) {
      try
      {
        paramStatus.a(this.a, this.b);
        return;
      }
      catch (IntentSender.SendIntentException paramStatus)
      {
        Log.e("ResolvingResultCallback", "Failed to start resolution", paramStatus);
        b(new Status(8));
        return;
      }
    }
    b(paramStatus);
  }
  
  public abstract void b(@NonNull Status paramStatus);
  
  public abstract void b(@NonNull R paramR);
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/api/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */