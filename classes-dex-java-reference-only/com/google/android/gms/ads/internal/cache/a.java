package com.google.android.gms.ads.internal.cache;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.p.b;
import com.google.android.gms.common.internal.p.c;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.acd;
import com.google.android.gms.internal.tp;
import com.google.android.gms.internal.tp.b;
import com.google.android.gms.internal.ub;
import com.google.android.gms.internal.uf;

@aaa
public class a
{
  private final Runnable a = new Runnable()
  {
    public void run()
    {
      a.a(a.this);
    }
  };
  private final Object b = new Object();
  @Nullable
  private c c;
  @Nullable
  private Context d;
  @Nullable
  private f e;
  
  private void b()
  {
    synchronized (this.b)
    {
      if ((this.d == null) || (this.c != null)) {
        return;
      }
      this.c = a(new p.b()new p.c
      {
        public void a(int paramAnonymousInt)
        {
          synchronized (a.c(a.this))
          {
            a.a(a.this, null);
            a.a(a.this, null);
            a.c(a.this).notifyAll();
            u.u().b();
            return;
          }
        }
        
        public void a(@Nullable Bundle arg1)
        {
          synchronized (a.c(a.this))
          {
            try
            {
              a.a(a.this, a.d(a.this).a_());
              a.c(a.this).notifyAll();
              return;
            }
            catch (DeadObjectException localDeadObjectException)
            {
              for (;;)
              {
                abr.b("Unable to obtain a cache service instance.", localDeadObjectException);
                a.a(a.this);
              }
            }
          }
        }
      }, new p.c()
      {
        public void a(@NonNull ConnectionResult arg1)
        {
          synchronized (a.c(a.this))
          {
            a.a(a.this, null);
            a.a(a.this, null);
            a.c(a.this).notifyAll();
            u.u().b();
            return;
          }
        }
      });
      this.c.A();
      return;
    }
  }
  
  private void c()
  {
    synchronized (this.b)
    {
      if (this.c == null) {
        return;
      }
      if ((this.c.t()) || (this.c.u())) {
        this.c.f();
      }
      this.c = null;
      this.e = null;
      Binder.flushPendingCommands();
      u.u().b();
      return;
    }
  }
  
  public CacheEntryParcel a(CacheOffering paramCacheOffering)
  {
    synchronized (this.b)
    {
      if (this.e == null)
      {
        paramCacheOffering = new CacheEntryParcel();
        return paramCacheOffering;
      }
    }
    return paramCacheOffering;
  }
  
  protected c a(p.b paramb, p.c paramc)
  {
    return new c(this.d, u.u().a(), paramb, paramc);
  }
  
  public void a()
  {
    if (((Boolean)uf.cz.c()).booleanValue()) {
      synchronized (this.b)
      {
        b();
        u.e();
        abv.a.removeCallbacks(this.a);
        u.e();
        abv.a.postDelayed(this.a, ((Long)uf.cA.c()).longValue());
        return;
      }
    }
  }
  
  public void a(Context paramContext)
  {
    if (paramContext == null) {
      return;
    }
    synchronized (this.b)
    {
      if (this.d != null) {
        return;
      }
    }
    this.d = paramContext.getApplicationContext();
    if (((Boolean)uf.cy.c()).booleanValue()) {
      b();
    }
    for (;;)
    {
      return;
      if (((Boolean)uf.cx.c()).booleanValue()) {
        a(new tp.b()
        {
          public void a(boolean paramAnonymousBoolean)
          {
            if (paramAnonymousBoolean)
            {
              a.b(a.this);
              return;
            }
            a.a(a.this);
          }
        });
      }
    }
  }
  
  protected void a(tp.b paramb)
  {
    u.h().a(paramb);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/cache/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */