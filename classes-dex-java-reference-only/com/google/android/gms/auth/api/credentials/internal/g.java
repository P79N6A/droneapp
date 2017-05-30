package com.google.android.gms.auth.api.credentials.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.support.annotation.Nullable;
import com.google.android.gms.auth.api.a.a;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;

public final class g
  extends w<k>
{
  @Nullable
  private final a.a a;
  
  public g(Context paramContext, Looper paramLooper, s params, a.a parama, g.b paramb, g.c paramc)
  {
    super(paramContext, paramLooper, 68, params, paramb, paramc);
    this.a = parama;
  }
  
  protected k a(IBinder paramIBinder)
  {
    return k.a.a(paramIBinder);
  }
  
  protected String a()
  {
    return "com.google.android.gms.auth.api.credentials.service.START";
  }
  
  protected String b()
  {
    return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
  }
  
  protected Bundle c()
  {
    if (this.a == null) {
      return new Bundle();
    }
    return this.a.b();
  }
  
  a.a d()
  {
    return this.a;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/credentials/internal/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */