package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abq;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.zd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@aaa
public class c
  extends abq
  implements ServiceConnection
{
  private final Object a = new Object();
  private boolean b = false;
  private Context c;
  private zd d;
  private b e;
  private h f;
  private List<f> g = null;
  private k h;
  
  public c(Context paramContext, zd paramzd, k paramk)
  {
    this(paramContext, paramzd, paramk, new b(paramContext), h.a(paramContext.getApplicationContext()));
  }
  
  c(Context paramContext, zd paramzd, k paramk, b paramb, h paramh)
  {
    this.c = paramContext;
    this.d = paramzd;
    this.h = paramk;
    this.e = paramb;
    this.f = paramh;
    this.g = this.f.a(10L);
  }
  
  private void a(long paramLong)
  {
    do
    {
      if (!b(paramLong)) {
        abr.e("Timeout waiting for pending transaction to be processed.");
      }
    } while (!this.b);
  }
  
  private boolean b(long paramLong)
  {
    paramLong = 60000L - (SystemClock.elapsedRealtime() - paramLong);
    if (paramLong <= 0L) {
      return false;
    }
    try
    {
      this.a.wait(paramLong);
      return true;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        abr.d("waitWithTimeout_lock interrupted");
      }
    }
  }
  
  public void a()
  {
    synchronized (this.a)
    {
      Intent localIntent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
      localIntent.setPackage("com.android.vending");
      com.google.android.gms.common.stats.b.a().a(this.c, localIntent, this, 1);
      a(SystemClock.elapsedRealtime());
      com.google.android.gms.common.stats.b.a().a(this.c, this);
      this.e.a();
      return;
    }
  }
  
  protected void a(final f paramf, String paramString1, String paramString2)
  {
    final Intent localIntent = new Intent();
    u.s();
    localIntent.putExtra("RESPONSE_CODE", 0);
    u.s();
    localIntent.putExtra("INAPP_PURCHASE_DATA", paramString1);
    u.s();
    localIntent.putExtra("INAPP_DATA_SIGNATURE", paramString2);
    abv.a.post(new Runnable()
    {
      public void run()
      {
        try
        {
          if (c.a(c.this).a(paramf.b, -1, localIntent))
          {
            c.c(c.this).a(new g(c.b(c.this), paramf.c, true, -1, localIntent, paramf));
            return;
          }
          c.c(c.this).a(new g(c.b(c.this), paramf.c, false, -1, localIntent, paramf));
          return;
        }
        catch (RemoteException localRemoteException)
        {
          abr.d("Fail to verify and dispatch pending transaction");
        }
      }
    });
  }
  
  public void b()
  {
    synchronized (this.a)
    {
      com.google.android.gms.common.stats.b.a().a(this.c, this);
      this.e.a();
      return;
    }
  }
  
  protected void c()
  {
    if (this.g.isEmpty()) {
      return;
    }
    HashMap localHashMap = new HashMap();
    Object localObject1 = this.g.iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (f)((Iterator)localObject1).next();
      localHashMap.put(((f)localObject2).c, localObject2);
    }
    localObject1 = null;
    for (;;)
    {
      localObject1 = this.e.b(this.c.getPackageName(), (String)localObject1);
      if (localObject1 == null) {}
      do
      {
        do
        {
          localObject1 = localHashMap.keySet().iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (String)((Iterator)localObject1).next();
            this.f.a((f)localHashMap.get(localObject2));
          }
          break;
        } while (u.s().a((Bundle)localObject1) != 0);
        localObject2 = ((Bundle)localObject1).getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList localArrayList1 = ((Bundle)localObject1).getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList localArrayList2 = ((Bundle)localObject1).getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        localObject1 = ((Bundle)localObject1).getString("INAPP_CONTINUATION_TOKEN");
        int i = 0;
        while (i < ((ArrayList)localObject2).size())
        {
          if (localHashMap.containsKey(((ArrayList)localObject2).get(i)))
          {
            String str1 = (String)((ArrayList)localObject2).get(i);
            String str2 = (String)localArrayList1.get(i);
            String str3 = (String)localArrayList2.get(i);
            f localf = (f)localHashMap.get(str1);
            String str4 = u.s().a(str2);
            if (localf.b.equals(str4))
            {
              a(localf, str2, str3);
              localHashMap.remove(str1);
            }
          }
          i += 1;
        }
      } while ((localObject1 == null) || (localHashMap.isEmpty()));
    }
  }
  
  public void onServiceConnected(ComponentName arg1, IBinder paramIBinder)
  {
    synchronized (this.a)
    {
      this.e.a(paramIBinder);
      c();
      this.b = true;
      this.a.notify();
      return;
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    abr.c("In-app billing service disconnected.");
    this.e.a();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/purchase/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */