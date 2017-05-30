package com.google.android.gms.common.api;

import java.util.concurrent.TimeUnit;

public final class c
  implements m
{
  private final Status a;
  private final i<?>[] b;
  
  c(Status paramStatus, i<?>[] paramArrayOfi)
  {
    this.a = paramStatus;
    this.b = paramArrayOfi;
  }
  
  public Status a()
  {
    return this.a;
  }
  
  public <R extends m> R a(d<R> paramd)
  {
    if (paramd.a < this.b.length) {}
    for (boolean bool = true;; bool = false)
    {
      com.google.android.gms.common.internal.d.b(bool, "The result token does not belong to this batch");
      return this.b[paramd.a].a(0L, TimeUnit.MILLISECONDS);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/api/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */