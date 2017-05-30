package com.google.android.gms.plus;

import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;

@Deprecated
public abstract interface a
{
  @Deprecated
  public abstract i<Status> a(g paramg);
  
  @Deprecated
  public abstract void b(g paramg);
  
  @Deprecated
  @RequiresPermission("android.permission.GET_ACCOUNTS")
  public abstract String c(g paramg);
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/plus/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */