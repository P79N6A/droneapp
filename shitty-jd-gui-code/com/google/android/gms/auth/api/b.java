package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.g;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.aev;

public final class b
{
  public static final a.g<aev> a = new a.g();
  public static final a<c> b = new a("Auth.PROXY_API", c, a);
  private static final a.b<aev, c> c = new a.b()
  {
    public aev a(Context paramAnonymousContext, Looper paramAnonymousLooper, s paramAnonymouss, c paramAnonymousc, g.b paramAnonymousb, g.c paramAnonymousc1)
    {
      return new aev(paramAnonymousContext, paramAnonymousLooper, paramAnonymouss, paramAnonymousc, paramAnonymousb, paramAnonymousc1);
    }
  };
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */