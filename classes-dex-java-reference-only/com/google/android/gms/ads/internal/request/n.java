package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.aab;
import com.google.android.gms.internal.aaf;
import com.google.android.gms.internal.aal;
import com.google.android.gms.internal.abi.a;
import com.google.android.gms.internal.abq;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.aca;
import com.google.android.gms.internal.acr.a;
import com.google.android.gms.internal.acr.c;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.ub;
import com.google.android.gms.internal.uf;
import com.google.android.gms.internal.vt;
import com.google.android.gms.internal.vu;
import com.google.android.gms.internal.vz;
import com.google.android.gms.internal.wu;
import com.google.android.gms.internal.wx;
import com.google.android.gms.internal.wx.c;
import com.google.android.gms.internal.wy;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

@aaa
public class n
  extends abq
{
  static final long a = TimeUnit.SECONDS.toMillis(10L);
  static boolean b = false;
  private static final Object c = new Object();
  private static wx d = null;
  private static vu e = null;
  private static vz f = null;
  private static vt g = null;
  private final a.a h;
  private final AdRequestInfoParcel.a i;
  private final Object j = new Object();
  private final Context k;
  private wx.c l;
  
  public n(Context paramContext, AdRequestInfoParcel.a parama, a.a arg3)
  {
    super(true);
    this.h = ???;
    this.k = paramContext;
    this.i = parama;
    synchronized (c)
    {
      if (!b)
      {
        f = new vz();
        e = new vu(paramContext.getApplicationContext(), parama.j);
        g = new c();
        d = new wx(this.k.getApplicationContext(), this.i.j, (String)uf.b.c(), new b(), new a());
        b = true;
      }
      return;
    }
  }
  
  private AdResponseParcel a(AdRequestInfoParcel paramAdRequestInfoParcel)
  {
    final Object localObject = u.e().c();
    final JSONObject localJSONObject = a(paramAdRequestInfoParcel, (String)localObject);
    if (localJSONObject == null) {
      paramAdRequestInfoParcel = new AdResponseParcel(0);
    }
    for (;;)
    {
      return paramAdRequestInfoParcel;
      long l1 = u.k().b();
      Future localFuture = f.a((String)localObject);
      com.google.android.gms.ads.internal.util.client.a.a.post(new Runnable()
      {
        public void run()
        {
          n.a(n.this, n.f().a());
          n.b(n.this).a(new acr.c()new acr.a
          {
            public void a(wy paramAnonymous2wy)
            {
              try
              {
                paramAnonymous2wy.a("AFMA_getAdapterLessMediationAd", n.2.this.a);
                return;
              }
              catch (Exception paramAnonymous2wy)
              {
                abr.b("Error requesting an ad url", paramAnonymous2wy);
                n.c().b(n.2.this.b);
              }
            }
          }, new acr.a()
          {
            public void a()
            {
              n.c().b(n.2.this.b);
            }
          });
        }
      });
      long l2 = a;
      long l3 = u.k().b();
      try
      {
        localObject = (JSONObject)localFuture.get(l2 - (l3 - l1), TimeUnit.MILLISECONDS);
        if (localObject == null) {
          return new AdResponseParcel(-1);
        }
      }
      catch (InterruptedException paramAdRequestInfoParcel)
      {
        return new AdResponseParcel(-1);
      }
      catch (TimeoutException paramAdRequestInfoParcel)
      {
        return new AdResponseParcel(2);
      }
      catch (ExecutionException paramAdRequestInfoParcel)
      {
        return new AdResponseParcel(0);
        localObject = aaf.a(this.k, paramAdRequestInfoParcel, ((JSONObject)localObject).toString());
        paramAdRequestInfoParcel = (AdRequestInfoParcel)localObject;
        if (((AdResponseParcel)localObject).e == -3) {
          continue;
        }
        paramAdRequestInfoParcel = (AdRequestInfoParcel)localObject;
        if (!TextUtils.isEmpty(((AdResponseParcel)localObject).c)) {
          continue;
        }
        return new AdResponseParcel(3);
      }
      catch (CancellationException paramAdRequestInfoParcel)
      {
        for (;;) {}
      }
    }
  }
  
  private JSONObject a(AdRequestInfoParcel paramAdRequestInfoParcel, String paramString)
  {
    Bundle localBundle = paramAdRequestInfoParcel.c.c.getBundle("sdk_less_server_data");
    if (localBundle == null) {}
    JSONObject localJSONObject;
    do
    {
      return null;
      localJSONObject = aaf.a(this.k, new aab().a(paramAdRequestInfoParcel).a(u.n().a(this.k)));
    } while (localJSONObject == null);
    try
    {
      paramAdRequestInfoParcel = com.google.android.gms.ads.a.a.b(this.k);
      localHashMap = new HashMap();
      localHashMap.put("request_id", paramString);
      localHashMap.put("request_param", localJSONObject);
      localHashMap.put("data", localBundle);
      if (paramAdRequestInfoParcel != null)
      {
        localHashMap.put("adid", paramAdRequestInfoParcel.a());
        if (!paramAdRequestInfoParcel.b()) {
          break label171;
        }
        m = 1;
        localHashMap.put("lat", Integer.valueOf(m));
      }
    }
    catch (c paramAdRequestInfoParcel)
    {
      for (;;)
      {
        try
        {
          HashMap localHashMap;
          paramAdRequestInfoParcel = u.e().a(localHashMap);
          return paramAdRequestInfoParcel;
        }
        catch (JSONException paramAdRequestInfoParcel)
        {
          int m;
          return null;
        }
        paramAdRequestInfoParcel = paramAdRequestInfoParcel;
        abr.d("Cannot get advertising id info", paramAdRequestInfoParcel);
        paramAdRequestInfoParcel = null;
        continue;
        m = 0;
      }
    }
    catch (d paramAdRequestInfoParcel)
    {
      for (;;) {}
    }
    catch (IllegalStateException paramAdRequestInfoParcel)
    {
      for (;;) {}
    }
    catch (IOException paramAdRequestInfoParcel)
    {
      label171:
      for (;;) {}
    }
  }
  
  protected static void a(wu paramwu)
  {
    paramwu.a("/loadAd", f);
    paramwu.a("/fetchHttpRequest", e);
    paramwu.a("/invalidRequest", g);
  }
  
  protected static void b(wu paramwu)
  {
    paramwu.b("/loadAd", f);
    paramwu.b("/fetchHttpRequest", e);
    paramwu.b("/invalidRequest", g);
  }
  
  public void a()
  {
    abr.a("SdkLessAdLoaderBackgroundTask started.");
    final Object localObject = new AdRequestInfoParcel(this.i, null, -1L);
    AdResponseParcel localAdResponseParcel = a((AdRequestInfoParcel)localObject);
    long l1 = u.k().b();
    localObject = new abi.a((AdRequestInfoParcel)localObject, localAdResponseParcel, null, null, localAdResponseParcel.e, l1, localAdResponseParcel.n, null);
    com.google.android.gms.ads.internal.util.client.a.a.post(new Runnable()
    {
      public void run()
      {
        n.a(n.this).a(localObject);
        if (n.b(n.this) != null)
        {
          n.b(n.this).q_();
          n.a(n.this, null);
        }
      }
    });
  }
  
  public void b()
  {
    synchronized (this.j)
    {
      com.google.android.gms.ads.internal.util.client.a.a.post(new Runnable()
      {
        public void run()
        {
          if (n.b(n.this) != null)
          {
            n.b(n.this).q_();
            n.a(n.this, null);
          }
        }
      });
      return;
    }
  }
  
  public static class a
    implements aca<wu>
  {
    public void a(wu paramwu)
    {
      n.b(paramwu);
    }
  }
  
  public static class b
    implements aca<wu>
  {
    public void a(wu paramwu)
    {
      n.a(paramwu);
    }
  }
  
  public static class c
    implements vt
  {
    public void a(acy paramacy, Map<String, String> paramMap)
    {
      String str = (String)paramMap.get("request_id");
      paramacy = String.valueOf((String)paramMap.get("errors"));
      if (paramacy.length() != 0) {}
      for (paramacy = "Invalid request: ".concat(paramacy);; paramacy = new String("Invalid request: "))
      {
        abr.d(paramacy);
        n.c().b(str);
        return;
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/request/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */