package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abi.a;
import com.google.android.gms.internal.abl;
import com.google.android.gms.internal.abq;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abu;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.abw;
import com.google.android.gms.internal.abx;
import com.google.android.gms.internal.acr;
import com.google.android.gms.internal.acs;
import com.google.android.gms.internal.oq;
import com.google.android.gms.internal.ro;
import com.google.android.gms.internal.ub;
import com.google.android.gms.internal.uf;
import com.google.android.gms.internal.xh;
import org.json.JSONException;
import org.json.JSONObject;

@aaa
public class b
  extends abq
  implements c.a
{
  abx a;
  AdResponseParcel b;
  xh c;
  private final a.a d;
  private final AdRequestInfoParcel.a e;
  private final Object f = new Object();
  private final Context g;
  private final ro h;
  private AdRequestInfoParcel i;
  private Runnable j;
  
  public b(Context paramContext, AdRequestInfoParcel.a parama, ro paramro, a.a parama1)
  {
    this.d = parama1;
    this.g = paramContext;
    this.e = parama;
    this.h = paramro;
  }
  
  private void a(int paramInt, String paramString)
  {
    if ((paramInt == 3) || (paramInt == -1))
    {
      abr.c(paramString);
      if (this.b != null) {
        break label93;
      }
      this.b = new AdResponseParcel(paramInt);
      label33:
      if (this.i == null) {
        break label115;
      }
    }
    label93:
    label115:
    for (paramString = this.i;; paramString = new AdRequestInfoParcel(this.e, null, -1L))
    {
      paramString = new abi.a(paramString, this.b, this.c, null, paramInt, -1L, this.b.n, null);
      this.d.a(paramString);
      return;
      abr.d(paramString);
      break;
      this.b = new AdResponseParcel(paramInt, this.b.k);
      break label33;
    }
  }
  
  protected AdSizeParcel a(AdRequestInfoParcel paramAdRequestInfoParcel)
  {
    int m;
    int k;
    AdSizeParcel localAdSizeParcel;
    if (this.b.A)
    {
      localObject = paramAdRequestInfoParcel.d.h;
      m = localObject.length;
      k = 0;
      while (k < m)
      {
        localAdSizeParcel = localObject[k];
        if (localAdSizeParcel.j) {
          return new AdSizeParcel(localAdSizeParcel, paramAdRequestInfoParcel.d.h);
        }
        k += 1;
      }
    }
    if (this.b.m == null) {
      throw new a("The ad response must specify one of the supported ad sizes.", 0);
    }
    Object localObject = this.b.m.split("x");
    if (localObject.length != 2)
    {
      paramAdRequestInfoParcel = String.valueOf(this.b.m);
      if (paramAdRequestInfoParcel.length() != 0) {}
      for (paramAdRequestInfoParcel = "Invalid ad size format from the ad response: ".concat(paramAdRequestInfoParcel);; paramAdRequestInfoParcel = new String("Invalid ad size format from the ad response: ")) {
        throw new a(paramAdRequestInfoParcel, 0);
      }
    }
    try
    {
      i1 = Integer.parseInt(localObject[0]);
      i2 = Integer.parseInt(localObject[1]);
      localObject = paramAdRequestInfoParcel.d.h;
      i3 = localObject.length;
      k = 0;
    }
    catch (NumberFormatException paramAdRequestInfoParcel)
    {
      for (;;)
      {
        int i1;
        int i2;
        int i3;
        float f1;
        paramAdRequestInfoParcel = String.valueOf(this.b.m);
        if (paramAdRequestInfoParcel.length() != 0) {}
        for (paramAdRequestInfoParcel = "Invalid ad size number from the ad response: ".concat(paramAdRequestInfoParcel);; paramAdRequestInfoParcel = new String("Invalid ad size number from the ad response: ")) {
          throw new a(paramAdRequestInfoParcel, 0);
        }
        m = localAdSizeParcel.f;
        continue;
        label359:
        int n = localAdSizeParcel.c;
        continue;
        label369:
        k += 1;
      }
      paramAdRequestInfoParcel = String.valueOf(this.b.m);
      if (paramAdRequestInfoParcel.length() == 0) {
        break label411;
      }
    }
    if (k < i3)
    {
      localAdSizeParcel = localObject[k];
      f1 = this.g.getResources().getDisplayMetrics().density;
      if (localAdSizeParcel.f == -1)
      {
        m = (int)(localAdSizeParcel.g / f1);
        if (localAdSizeParcel.c != -2) {
          break label359;
        }
        n = (int)(localAdSizeParcel.d / f1);
        if ((i1 != m) || (i2 != n) || (localAdSizeParcel.j)) {
          break label369;
        }
        return new AdSizeParcel(localAdSizeParcel, paramAdRequestInfoParcel.d.h);
      }
    }
    label411:
    for (paramAdRequestInfoParcel = "The ad size from the ad response was not one of the requested sizes: ".concat(paramAdRequestInfoParcel);; paramAdRequestInfoParcel = new String("The ad size from the ad response was not one of the requested sizes: ")) {
      throw new a(paramAdRequestInfoParcel, 0);
    }
  }
  
  abx a(VersionInfoParcel paramVersionInfoParcel, acr<AdRequestInfoParcel> paramacr)
  {
    return c.a(this.g, paramVersionInfoParcel, paramacr, this);
  }
  
  public void a()
  {
    abr.a("AdLoaderBackgroundTask started.");
    this.j = new Runnable()
    {
      public void run()
      {
        synchronized (b.a(b.this))
        {
          if (b.this.a == null) {
            return;
          }
          b.this.b();
          b.a(b.this, 2, "Timed out waiting for ad response.");
          return;
        }
      }
    };
    abv.a.postDelayed(this.j, ((Long)uf.aX.c()).longValue());
    final acs localacs = new acs();
    long l = u.k().b();
    abu.a(new Runnable()
    {
      public void run()
      {
        synchronized (b.a(b.this))
        {
          b.this.a = b.this.a(b.b(b.this).j, localacs);
          if (b.this.a == null)
          {
            b.a(b.this, 0, "Could not start the ad request service.");
            abv.a.removeCallbacks(b.c(b.this));
          }
          return;
        }
      }
    });
    String str = this.h.a().a(this.g);
    this.i = new AdRequestInfoParcel(this.e, str, l);
    localacs.a(this.i);
  }
  
  public void a(@NonNull AdResponseParcel arg1)
  {
    abr.a("Received ad response.");
    this.b = ???;
    long l = u.k().b();
    synchronized (this.f)
    {
      this.a = null;
      u.i().b(this.g, this.b.H);
      try
      {
        if ((this.b.e != -2) && (this.b.e != -3))
        {
          int k = this.b.e;
          throw new a(66 + "There was a problem getting an ad response. ErrorCode: " + k, this.b.e);
        }
      }
      catch (a ???)
      {
        a(???.a(), ???.getMessage());
        abv.a.removeCallbacks(this.j);
        return;
      }
    }
    c();
    if (this.i.d.h != null) {}
    for (??? = a(this.i);; ??? = null)
    {
      u.i().b(this.b.v);
      if (!TextUtils.isEmpty(this.b.r)) {}
      for (;;)
      {
        try
        {
          JSONObject localJSONObject = new JSONObject(this.b.r);
          ??? = new abi.a(this.i, this.b, this.c, ???, -2, l, this.b.n, localJSONObject);
          this.d.a(???);
          abv.a.removeCallbacks(this.j);
          return;
        }
        catch (Exception localException)
        {
          abr.b("Error parsing the JSON for Active View.", localException);
        }
        Object localObject2 = null;
      }
    }
  }
  
  public void b()
  {
    synchronized (this.f)
    {
      if (this.a != null) {
        this.a.d();
      }
      return;
    }
  }
  
  protected void c()
  {
    if (this.b.e == -3) {
      return;
    }
    if (TextUtils.isEmpty(this.b.c)) {
      throw new a("No fill from ad server.", 3);
    }
    u.i().a(this.g, this.b.u);
    if (this.b.h) {}
    for (;;)
    {
      try
      {
        this.c = new xh(this.b.c);
        u.i().c(this.c.g);
        if ((TextUtils.isEmpty(this.b.I)) || (!((Boolean)uf.cu.c()).booleanValue())) {
          break;
        }
        abr.a("Received cookie from server. Setting webview cookie in CookieManager.");
        CookieManager localCookieManager = u.g().b(this.g);
        if (localCookieManager == null) {
          break;
        }
        localCookieManager.setCookie("googleads.g.doubleclick.net", this.b.I);
        return;
      }
      catch (JSONException localJSONException)
      {
        abr.b("Could not parse mediation config.", localJSONException);
        str = String.valueOf(this.b.c);
        if (str.length() == 0) {}
      }
      for (String str = "Could not parse mediation config: ".concat(str);; str = new String("Could not parse mediation config: ")) {
        throw new a(str, 0);
      }
      u.i().c(this.b.K);
    }
  }
  
  @aaa
  static final class a
    extends Exception
  {
    private final int a;
    
    public a(String paramString, int paramInt)
    {
      super();
      this.a = paramInt;
    }
    
    public int a()
    {
      return this.a;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/request/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */