package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.b;
import java.util.Iterator;
import java.util.Set;

public abstract class w<T extends IInterface>
  extends p<T>
  implements a.f, x.a
{
  private final s a;
  private final Set<Scope> e;
  private final Account f;
  
  protected w(Context paramContext, Looper paramLooper, int paramInt, s params, g.b paramb, g.c paramc)
  {
    this(paramContext, paramLooper, y.a(paramContext), b.a(), paramInt, params, (g.b)d.a(paramb), (g.c)d.a(paramc));
  }
  
  protected w(Context paramContext, Looper paramLooper, y paramy, b paramb, int paramInt, s params, g.b paramb1, g.c paramc)
  {
    super(paramContext, paramLooper, paramy, paramb, paramInt, a(paramb1), a(paramc), params.i());
    this.a = params;
    this.f = params.b();
    this.e = b(params.f());
  }
  
  @Nullable
  private static p.b a(g.b paramb)
  {
    if (paramb == null) {
      return null;
    }
    new p.b()
    {
      public void a(int paramAnonymousInt)
      {
        w.this.a(paramAnonymousInt);
      }
      
      public void a(@Nullable Bundle paramAnonymousBundle)
      {
        w.this.a(paramAnonymousBundle);
      }
    };
  }
  
  @Nullable
  private static p.c a(g.c paramc)
  {
    if (paramc == null) {
      return null;
    }
    new p.c()
    {
      public void a(@NonNull ConnectionResult paramAnonymousConnectionResult)
      {
        w.this.a(paramAnonymousConnectionResult);
      }
    };
  }
  
  private Set<Scope> b(@NonNull Set<Scope> paramSet)
  {
    Set localSet = a(paramSet);
    Iterator localIterator = localSet.iterator();
    while (localIterator.hasNext()) {
      if (!paramSet.contains((Scope)localIterator.next())) {
        throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
      }
    }
    return localSet;
  }
  
  public final Account D()
  {
    return this.f;
  }
  
  protected final Set<Scope> I()
  {
    return this.e;
  }
  
  protected final s J()
  {
    return this.a;
  }
  
  @NonNull
  protected Set<Scope> a(@NonNull Set<Scope> paramSet)
  {
    return paramSet;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/internal/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */