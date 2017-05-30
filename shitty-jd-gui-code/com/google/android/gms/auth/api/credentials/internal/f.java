package com.google.android.gms.auth.api.credentials.internal;

import android.content.Context;
import com.google.android.gms.auth.api.a;
import com.google.android.gms.common.api.m;
import com.google.android.gms.internal.ahl.a;

abstract class f<R extends m>
  extends ahl.a<R, g>
{
  f(com.google.android.gms.common.api.g paramg)
  {
    super(a.e, paramg);
  }
  
  protected abstract void a(Context paramContext, k paramk);
  
  protected final void a(g paramg)
  {
    a(paramg.B(), (k)paramg.G());
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/credentials/internal/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */