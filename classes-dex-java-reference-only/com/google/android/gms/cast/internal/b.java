package com.google.android.gms.cast.internal;

import com.google.android.gms.cast.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.m;
import com.google.android.gms.internal.ahl.a;

public abstract class b<R extends m>
  extends ahl.a<R, e>
{
  public b(g paramg)
  {
    super(a.k, paramg);
  }
  
  public void a(int paramInt)
  {
    b(b(new Status(paramInt)));
  }
  
  public void a(int paramInt, String paramString)
  {
    b(b(new Status(paramInt, paramString, null)));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/internal/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */