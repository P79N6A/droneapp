package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.formats.b.b;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.c.f;
import com.google.android.gms.common.util.e;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@aaa
public class xk
  implements xl.a
{
  private final String a;
  private final xq b;
  private final long c;
  private final xh d;
  private final xg e;
  private AdRequestParcel f;
  private final AdSizeParcel g;
  private final Context h;
  private final Object i = new Object();
  private final VersionInfoParcel j;
  private final boolean k;
  private final NativeAdOptionsParcel l;
  private final List<String> m;
  private final boolean n;
  private xr o;
  private int p = -2;
  private xt q;
  
  public xk(Context paramContext, String paramString, xq paramxq, xh paramxh, xg paramxg, AdRequestParcel paramAdRequestParcel, AdSizeParcel paramAdSizeParcel, VersionInfoParcel paramVersionInfoParcel, boolean paramBoolean1, boolean paramBoolean2, NativeAdOptionsParcel paramNativeAdOptionsParcel, List<String> paramList)
  {
    this.h = paramContext;
    this.b = paramxq;
    this.e = paramxg;
    if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(paramString))
    {
      this.a = b();
      this.d = paramxh;
      if (paramxh.b == -1L) {
        break label136;
      }
    }
    label136:
    for (long l1 = paramxh.b;; l1 = 10000L)
    {
      this.c = l1;
      this.f = paramAdRequestParcel;
      this.g = paramAdSizeParcel;
      this.j = paramVersionInfoParcel;
      this.k = paramBoolean1;
      this.n = paramBoolean2;
      this.l = paramNativeAdOptionsParcel;
      this.m = paramList;
      return;
      this.a = paramString;
      break;
    }
  }
  
  private long a(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    for (;;)
    {
      if (this.p != -2) {
        return u.k().b() - paramLong1;
      }
      b(paramLong1, paramLong2, paramLong3, paramLong4);
    }
  }
  
  private String a(String paramString)
  {
    if ((paramString == null) || (!e()) || (b(2))) {
      return paramString;
    }
    try
    {
      Object localObject = new JSONObject(paramString);
      ((JSONObject)localObject).remove("cpm_floor_cents");
      localObject = ((JSONObject)localObject).toString();
      return (String)localObject;
    }
    catch (JSONException localJSONException)
    {
      abr.d("Could not remove field. Returning the original value");
    }
    return paramString;
  }
  
  private void a(xj paramxj)
  {
    String str = a(this.e.i);
    try
    {
      if (this.j.d < 4100000)
      {
        if (this.g.e)
        {
          this.o.a(f.a(this.h), this.f, str, paramxj);
          return;
        }
        this.o.a(f.a(this.h), this.g, this.f, str, paramxj);
        return;
      }
    }
    catch (RemoteException paramxj)
    {
      abr.d("Could not request ad from mediation adapter.", paramxj);
      a(5);
      return;
    }
    if (this.k)
    {
      this.o.a(f.a(this.h), this.f, str, this.e.a, paramxj, this.l, this.m);
      return;
    }
    if (this.g.e)
    {
      this.o.a(f.a(this.h), this.f, str, this.e.a, paramxj);
      return;
    }
    if (this.n)
    {
      if (this.e.l != null)
      {
        this.o.a(f.a(this.h), this.f, str, this.e.a, paramxj, new NativeAdOptionsParcel(b(this.e.p)), this.e.o);
        return;
      }
      this.o.a(f.a(this.h), this.g, this.f, str, this.e.a, paramxj);
      return;
    }
    this.o.a(f.a(this.h), this.g, this.f, str, this.e.a, paramxj);
  }
  
  private static com.google.android.gms.ads.formats.b b(String paramString)
  {
    b.b localb = new b.b();
    if (paramString == null) {
      return localb.a();
    }
    try
    {
      paramString = new JSONObject(paramString);
      localb.b(paramString.optBoolean("multiple_images", false));
      localb.a(paramString.optBoolean("only_urls", false));
      localb.a(c(paramString.optString("native_image_orientation", "any")));
      return localb.a();
    }
    catch (JSONException paramString)
    {
      for (;;)
      {
        abr.d("Exception occurred when creating native ad options", paramString);
      }
    }
  }
  
  private String b()
  {
    try
    {
      if (!TextUtils.isEmpty(this.e.e))
      {
        if (this.b.b(this.e.e)) {
          return "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
        }
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
      }
    }
    catch (RemoteException localRemoteException)
    {
      abr.d("Fail to determine the custom event's version, assuming the old one.");
    }
    return "com.google.ads.mediation.customevent.CustomEventAdapter";
  }
  
  private void b(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    long l1 = SystemClock.elapsedRealtime();
    paramLong1 = paramLong2 - (l1 - paramLong1);
    paramLong2 = paramLong4 - (l1 - paramLong3);
    if ((paramLong1 <= 0L) || (paramLong2 <= 0L))
    {
      abr.c("Timed out waiting for adapter.");
      this.p = 3;
      return;
    }
    try
    {
      this.i.wait(Math.min(paramLong1, paramLong2));
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      this.p = -1;
    }
  }
  
  private boolean b(int paramInt)
  {
    boolean bool = false;
    for (;;)
    {
      try
      {
        Bundle localBundle;
        if (this.k)
        {
          localBundle = this.o.l();
          if (localBundle != null)
          {
            if ((localBundle.getInt("capabilities", 0) & paramInt) == paramInt) {
              bool = true;
            }
          }
          else {
            return bool;
          }
        }
        else
        {
          if (this.g.e)
          {
            localBundle = this.o.k();
            continue;
          }
          localBundle = this.o.j();
          continue;
        }
        bool = false;
      }
      catch (RemoteException localRemoteException)
      {
        abr.d("Could not get adapter info. Returning false");
        return false;
      }
    }
  }
  
  private static int c(String paramString)
  {
    if ("landscape".equals(paramString)) {
      return 2;
    }
    if ("portrait".equals(paramString)) {
      return 1;
    }
    return 0;
  }
  
  private xt c()
  {
    if ((this.p != 0) || (!e())) {
      return null;
    }
    try
    {
      if ((b(4)) && (this.q != null) && (this.q.a() != 0))
      {
        xt localxt = this.q;
        return localxt;
      }
    }
    catch (RemoteException localRemoteException)
    {
      abr.d("Could not get cpm value from MediationResponseMetadata");
    }
    return c(f());
  }
  
  private static xt c(int paramInt)
  {
    return new xk.2(paramInt);
  }
  
  private xr d()
  {
    Object localObject = String.valueOf(this.a);
    if (((String)localObject).length() != 0) {}
    for (localObject = "Instantiating mediation adapter: ".concat((String)localObject);; localObject = new String("Instantiating mediation adapter: "))
    {
      abr.c((String)localObject);
      if (this.k) {
        break label156;
      }
      if ((!((Boolean)uf.aV.c()).booleanValue()) || (!"com.google.ads.mediation.admob.AdMobAdapter".equals(this.a))) {
        break;
      }
      return a(new AdMobAdapter());
    }
    if ((((Boolean)uf.aW.c()).booleanValue()) && ("com.google.ads.mediation.AdUrlAdapter".equals(this.a))) {
      return a(new AdUrlAdapter());
    }
    if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(this.a)) {
      return new xx(new yg());
    }
    try
    {
      label156:
      localObject = this.b.a(this.a);
      return (xr)localObject;
    }
    catch (RemoteException localRemoteException)
    {
      localObject = String.valueOf(this.a);
      if (((String)localObject).length() == 0) {}
    }
    for (localObject = "Could not instantiate mediation adapter: ".concat((String)localObject);; localObject = new String("Could not instantiate mediation adapter: "))
    {
      abr.a((String)localObject, localRemoteException);
      return null;
    }
  }
  
  private boolean e()
  {
    return this.d.l != -1;
  }
  
  private int f()
  {
    int i2;
    if (this.e.i == null)
    {
      i2 = 0;
      return i2;
    }
    try
    {
      JSONObject localJSONObject = new JSONObject(this.e.i);
      if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.a)) {
        return localJSONObject.optInt("cpm_cents", 0);
      }
    }
    catch (JSONException localJSONException)
    {
      abr.d("Could not convert to json. Returning 0");
      return 0;
    }
    if (b(2)) {}
    for (int i1 = localJSONException.optInt("cpm_floor_cents", 0);; i1 = 0)
    {
      i2 = i1;
      if (i1 != 0) {
        break;
      }
      return localJSONException.optInt("penalized_average_cpm_cents", 0);
    }
  }
  
  public xl a(long paramLong1, long paramLong2)
  {
    synchronized (this.i)
    {
      long l1 = SystemClock.elapsedRealtime();
      Object localObject2 = new xj();
      abv.a.post(new xk.1(this, (xj)localObject2));
      paramLong1 = a(l1, this.c, paramLong1, paramLong2);
      localObject2 = new xl(this.e, this.o, this.a, (xj)localObject2, this.p, c(), paramLong1);
      return (xl)localObject2;
    }
  }
  
  protected xr a(com.google.android.gms.ads.mediation.b paramb)
  {
    return new xx(paramb);
  }
  
  public void a()
  {
    synchronized (this.i)
    {
      try
      {
        if (this.o != null) {
          this.o.c();
        }
        this.p = -1;
        this.i.notify();
        return;
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          abr.d("Could not destroy mediation adapter.", localRemoteException);
        }
      }
    }
  }
  
  public void a(int paramInt)
  {
    synchronized (this.i)
    {
      this.p = paramInt;
      this.i.notify();
      return;
    }
  }
  
  public void a(int paramInt, xt paramxt)
  {
    synchronized (this.i)
    {
      this.p = paramInt;
      this.q = paramxt;
      this.i.notify();
      return;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/xk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */