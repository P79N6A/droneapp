package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.util.Pair;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.g.f;
import com.google.android.gms.internal.ahh;
import com.google.android.gms.internal.ahl.a;
import com.google.android.gms.internal.aic;
import com.google.android.gms.internal.aid;
import com.google.android.gms.internal.aim;
import com.google.android.gms.internal.aiv;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class u<O extends a.a>
{
  private final Context a;
  private final aim b;
  private final a<O> c;
  private final O d;
  private final ahh<O> e;
  private final Looper f;
  private final int g;
  private final aic h;
  private final g i;
  private final AtomicBoolean j = new AtomicBoolean(false);
  private final AtomicInteger k = new AtomicInteger(0);
  private a.f l;
  
  public u(@NonNull Context paramContext, a<O> parama, O paramO) {}
  
  public u(@NonNull Context paramContext, a<O> parama, O paramO, Looper paramLooper)
  {
    d.a(paramContext, "Null context is not permitted.");
    d.a(parama, "Api must not be null.");
    d.a(paramLooper, "Looper must not be null.");
    this.a = paramContext.getApplicationContext();
    this.c = parama;
    this.d = paramO;
    this.f = paramLooper;
    this.b = new aim();
    this.e = ahh.a(this.c, this.d);
    this.i = new aid(this);
    paramContext = aic.a(this.a, this);
    this.h = ((aic)paramContext.first);
    this.g = ((Integer)paramContext.second).intValue();
  }
  
  private <TResult, A extends a.c> f<TResult> a(int paramInt, @NonNull aiv<A, TResult> paramaiv)
  {
    com.google.android.gms.g.g localg = new com.google.android.gms.g.g();
    this.h.a(this, paramInt, paramaiv, localg);
    return localg.a();
  }
  
  private <A extends a.c, T extends ahl.a<? extends m, A>> T a(int paramInt, @NonNull T paramT)
  {
    paramT.l();
    this.h.a(this, paramInt, paramT);
    return paramT;
  }
  
  @WorkerThread
  public a.f a(Looper paramLooper, g.b paramb, g.c paramc)
  {
    a.i locali;
    if (!d())
    {
      if (!this.c.e()) {
        break label70;
      }
      locali = this.c.c();
    }
    label70:
    for (this.l = new i(this.a, paramLooper, locali.b(), paramb, paramc, s.a(this.a), locali.b(this.d));; this.l = this.c.b().a(this.a, paramLooper, s.a(this.a), this.d, paramb, paramc)) {
      return this.l;
    }
  }
  
  public <TResult, A extends a.c> f<TResult> a(aiv<A, TResult> paramaiv)
  {
    return a(0, paramaiv);
  }
  
  public <A extends a.c, T extends ahl.a<? extends m, A>> T a(@NonNull T paramT)
  {
    return a(0, paramT);
  }
  
  public void a()
  {
    boolean bool = true;
    if (this.j.getAndSet(true)) {
      return;
    }
    this.b.a();
    aic localaic = this.h;
    int m = this.g;
    if (this.k.get() > 0) {}
    for (;;)
    {
      localaic.a(m, bool);
      return;
      bool = false;
    }
  }
  
  public <TResult, A extends a.c> f<TResult> b(aiv<A, TResult> paramaiv)
  {
    return a(1, paramaiv);
  }
  
  public <A extends a.c, T extends ahl.a<? extends m, A>> T b(@NonNull T paramT)
  {
    return a(1, paramT);
  }
  
  public void b()
  {
    this.k.incrementAndGet();
  }
  
  public void c()
  {
    if ((this.k.decrementAndGet() == 0) && (this.j.get())) {
      this.h.a(this.g, false);
    }
  }
  
  public boolean d()
  {
    return this.l != null;
  }
  
  public ahh<O> e()
  {
    return this.e;
  }
  
  public int f()
  {
    return this.g;
  }
  
  public g g()
  {
    return this.i;
  }
  
  public Looper h()
  {
    return this.f;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/api/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */