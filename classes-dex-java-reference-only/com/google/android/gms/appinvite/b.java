package com.google.android.gms.appinvite;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;

public abstract interface b
{
  public abstract i<d> a(@NonNull g paramg, Activity paramActivity, boolean paramBoolean);
  
  @Deprecated
  public abstract i<Status> a(@NonNull g paramg, String paramString);
  
  public abstract i<Status> b(@NonNull g paramg, String paramString);
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/appinvite/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */