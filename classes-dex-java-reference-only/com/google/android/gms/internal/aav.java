package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.common.util.e;

@aaa
public class aav
  extends abq
  implements aax, aba
{
  private final abi.a a;
  private final Context b;
  private final abc c;
  private final aba d;
  private final Object e;
  private final String f;
  private final String g;
  private final xg h;
  private final long i;
  private int j = 0;
  private int k = 3;
  private aaw l;
  
  public aav(Context paramContext, String paramString1, String paramString2, xg paramxg, abi.a parama, abc paramabc, aba paramaba, long paramLong)
  {
    this.b = paramContext;
    this.f = paramString1;
    this.g = paramString2;
    this.h = paramxg;
    this.a = parama;
    this.c = paramabc;
    this.e = new Object();
    this.d = paramaba;
    this.i = paramLong;
  }
  
  private void a(AdRequestParcel paramAdRequestParcel, xr paramxr)
  {
    this.c.b().a(this);
    try
    {
      if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.f))
      {
        paramxr.a(paramAdRequestParcel, this.g, this.h.a);
        return;
      }
      paramxr.a(paramAdRequestParcel, this.g);
      return;
    }
    catch (RemoteException paramAdRequestParcel)
    {
      abr.d("Fail to load ad from adapter.", paramAdRequestParcel);
      a(this.f, 0);
    }
  }
  
  private void b(long paramLong)
  {
    for (;;)
    {
      synchronized (this.e)
      {
        if (this.j != 0)
        {
          aaw.a locala = new aaw.a().a(u.k().b() - paramLong);
          if (1 == this.j)
          {
            m = 6;
            this.l = locala.a(m).a(this.f).b(this.h.d).a();
            return;
          }
          int m = this.k;
          continue;
        }
        if (!a(paramLong))
        {
          this.l = new aaw.a().a(this.k).a(u.k().b() - paramLong).a(this.f).b(this.h.d).a();
          return;
        }
      }
    }
  }
  
  public void a()
  {
    if ((this.c == null) || (this.c.b() == null) || (this.c.a() == null)) {
      return;
    }
    aaz localaaz = this.c.b();
    localaaz.a(null);
    localaaz.a(this);
    AdRequestParcel localAdRequestParcel = this.a.a.c;
    xr localxr = this.c.a();
    try
    {
      if (localxr.g()) {
        a.a.post(new aav.1(this, localAdRequestParcel, localxr));
      }
      for (;;)
      {
        b(u.k().b());
        localaaz.a(null);
        localaaz.a(null);
        if (this.j != 1) {
          break;
        }
        this.d.a(this.f);
        return;
        a.a.post(new aav.2(this, localxr, localAdRequestParcel, localaaz));
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        abr.d("Fail to check if adapter is initialized.", localRemoteException);
        a(this.f, 0);
      }
      this.d.a(this.f, this.k);
    }
  }
  
  public void a(int paramInt)
  {
    a(this.f, 0);
  }
  
  public void a(String arg1)
  {
    synchronized (this.e)
    {
      this.j = 1;
      this.e.notify();
      return;
    }
  }
  
  public void a(String arg1, int paramInt)
  {
    synchronized (this.e)
    {
      this.j = 2;
      this.k = paramInt;
      this.e.notify();
      return;
    }
  }
  
  protected boolean a(long paramLong)
  {
    paramLong = this.i - (u.k().b() - paramLong);
    if (paramLong <= 0L)
    {
      this.k = 4;
      return false;
    }
    try
    {
      this.e.wait(paramLong);
      return true;
    }
    catch (InterruptedException localInterruptedException)
    {
      Thread.currentThread().interrupt();
      this.k = 5;
    }
    return false;
  }
  
  public void b() {}
  
  public aaw c()
  {
    synchronized (this.e)
    {
      aaw localaaw = this.l;
      return localaaw;
    }
  }
  
  public xg f()
  {
    return this.h;
  }
  
  public void g()
  {
    a(this.a.a.c, this.c.a());
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/aav.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */