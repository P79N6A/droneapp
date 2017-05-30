package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.p.b;
import com.google.android.gms.common.internal.p.c;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.aad;
import com.google.android.gms.internal.aae;
import com.google.android.gms.internal.abl;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.abx;
import com.google.android.gms.internal.acd;
import com.google.android.gms.internal.acr;
import com.google.android.gms.internal.acr.a;
import com.google.android.gms.internal.acr.c;
import com.google.android.gms.internal.ty;
import com.google.android.gms.internal.ub;
import com.google.android.gms.internal.uf;

@aaa
public abstract class d
  implements c.a, abx<Void>
{
  private final acr<AdRequestInfoParcel> a;
  private final c.a b;
  private final Object c = new Object();
  
  public d(acr<AdRequestInfoParcel> paramacr, c.a parama)
  {
    this.a = paramacr;
    this.b = parama;
  }
  
  public abstract void a();
  
  public void a(AdResponseParcel paramAdResponseParcel)
  {
    synchronized (this.c)
    {
      this.b.a(paramAdResponseParcel);
      a();
      return;
    }
  }
  
  boolean a(k paramk, AdRequestInfoParcel paramAdRequestInfoParcel)
  {
    try
    {
      paramk.a(paramAdRequestInfoParcel, new g(this));
      return true;
    }
    catch (RemoteException paramk)
    {
      abr.d("Could not fetch ad response from ad request service.", paramk);
      u.i().a(paramk, "AdRequestClientTask.getAdResponseFromService");
      this.b.a(new AdResponseParcel(0));
      return false;
    }
    catch (NullPointerException paramk)
    {
      for (;;)
      {
        abr.d("Could not fetch ad response from ad request service due to an Exception.", paramk);
        u.i().a(paramk, "AdRequestClientTask.getAdResponseFromService");
      }
    }
    catch (SecurityException paramk)
    {
      for (;;)
      {
        abr.d("Could not fetch ad response from ad request service due to an Exception.", paramk);
        u.i().a(paramk, "AdRequestClientTask.getAdResponseFromService");
      }
    }
    catch (Throwable paramk)
    {
      for (;;)
      {
        abr.d("Could not fetch ad response from ad request service due to an Exception.", paramk);
        u.i().a(paramk, "AdRequestClientTask.getAdResponseFromService");
      }
    }
  }
  
  public abstract k b();
  
  public Void c()
  {
    final k localk = b();
    if (localk == null)
    {
      this.b.a(new AdResponseParcel(0));
      a();
      return null;
    }
    this.a.a(new acr.c()new acr.a
    {
      public void a(AdRequestInfoParcel paramAnonymousAdRequestInfoParcel)
      {
        if (!d.this.a(localk, paramAnonymousAdRequestInfoParcel)) {
          d.this.a();
        }
      }
    }, new acr.a()
    {
      public void a()
      {
        d.this.a();
      }
    });
    return null;
  }
  
  public void d()
  {
    a();
  }
  
  @aaa
  public static final class a
    extends d
  {
    private final Context a;
    
    public a(Context paramContext, acr<AdRequestInfoParcel> paramacr, c.a parama)
    {
      super(parama);
      this.a = paramContext;
    }
    
    public void a() {}
    
    public k b()
    {
      ty localty = new ty((String)uf.b.c());
      return aae.a(this.a, localty, aad.a());
    }
  }
  
  @aaa
  public static class b
    extends d
    implements p.b, p.c
  {
    protected e a;
    private Context b;
    private VersionInfoParcel c;
    private acr<AdRequestInfoParcel> d;
    private final c.a e;
    private final Object f = new Object();
    private boolean g;
    
    public b(Context paramContext, VersionInfoParcel paramVersionInfoParcel, acr<AdRequestInfoParcel> paramacr, c.a parama)
    {
      super(parama);
      this.b = paramContext;
      this.c = paramVersionInfoParcel;
      this.d = paramacr;
      this.e = parama;
      if (((Boolean)uf.H.c()).booleanValue()) {
        this.g = true;
      }
      for (paramVersionInfoParcel = u.u().a();; paramVersionInfoParcel = paramContext.getMainLooper())
      {
        this.a = new e(paramContext, paramVersionInfoParcel, this, this, this.c.d);
        f();
        return;
      }
    }
    
    public void a()
    {
      synchronized (this.f)
      {
        if ((this.a.t()) || (this.a.u())) {
          this.a.f();
        }
        Binder.flushPendingCommands();
        if (this.g)
        {
          u.u().b();
          this.g = false;
        }
        return;
      }
    }
    
    public void a(int paramInt)
    {
      abr.a("Disconnected from remote ad request service.");
    }
    
    public void a(Bundle paramBundle)
    {
      paramBundle = (Void)e();
    }
    
    public void a(@NonNull ConnectionResult paramConnectionResult)
    {
      abr.a("Cannot connect to remote service, fallback to local instance.");
      g().e();
      paramConnectionResult = new Bundle();
      paramConnectionResult.putString("action", "gms_connection_failed_fallback_to_local");
      u.e().b(this.b, this.c.b, "gmob-apps", paramConnectionResult, true);
    }
    
    /* Error */
    public k b()
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 36	com/google/android/gms/ads/internal/request/d$b:f	Ljava/lang/Object;
      //   4: astore_1
      //   5: aload_1
      //   6: monitorenter
      //   7: aload_0
      //   8: getfield 86	com/google/android/gms/ads/internal/request/d$b:a	Lcom/google/android/gms/ads/internal/request/e;
      //   11: invokevirtual 165	com/google/android/gms/ads/internal/request/e:b_	()Lcom/google/android/gms/ads/internal/request/k;
      //   14: astore_2
      //   15: aload_1
      //   16: monitorexit
      //   17: aload_2
      //   18: areturn
      //   19: aload_1
      //   20: monitorexit
      //   21: aconst_null
      //   22: areturn
      //   23: astore_2
      //   24: aload_1
      //   25: monitorexit
      //   26: aload_2
      //   27: athrow
      //   28: astore_2
      //   29: goto -10 -> 19
      //   32: astore_2
      //   33: goto -14 -> 19
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	36	0	this	b
      //   14	4	2	localk	k
      //   23	4	2	localObject2	Object
      //   28	1	2	localDeadObjectException	android.os.DeadObjectException
      //   32	1	2	localIllegalStateException	IllegalStateException
      // Exception table:
      //   from	to	target	type
      //   7	15	23	finally
      //   15	17	23	finally
      //   19	21	23	finally
      //   24	26	23	finally
      //   7	15	28	android/os/DeadObjectException
      //   7	15	32	java/lang/IllegalStateException
    }
    
    protected void f()
    {
      this.a.A();
    }
    
    abx g()
    {
      return new d.a(this.b, this.d, this.e);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/request/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */