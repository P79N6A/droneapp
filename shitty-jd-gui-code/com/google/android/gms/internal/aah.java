package com.google.android.gms.internal;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.AutoClickProtectionConfigurationParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.safebrowsing.SafeBrowsingConfigParcel;
import com.google.android.gms.ads.internal.u;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@aaa
public final class aah
{
  private boolean A = false;
  private String B;
  private List<String> C;
  private boolean D;
  private String E;
  private SafeBrowsingConfigParcel F;
  private final AdRequestInfoParcel G;
  private String a;
  private String b;
  private String c;
  private List<String> d;
  private String e;
  private String f;
  private String g;
  private List<String> h;
  private long i = -1L;
  private boolean j = false;
  private final long k = -1L;
  private List<String> l;
  private long m = -1L;
  private int n = -1;
  private boolean o = false;
  private boolean p = false;
  private boolean q = false;
  private boolean r = true;
  private String s = "";
  private boolean t = false;
  private boolean u = false;
  private RewardItemParcel v;
  private List<String> w;
  private List<String> x;
  private boolean y = false;
  private AutoClickProtectionConfigurationParcel z;
  
  public aah(AdRequestInfoParcel paramAdRequestInfoParcel)
  {
    this.G = paramAdRequestInfoParcel;
  }
  
  private void A(Map<String, List<String>> paramMap)
  {
    paramMap = c(paramMap, "X-Afma-Remote-Ping-Urls");
    if (paramMap != null) {
      this.C = paramMap;
    }
  }
  
  private void B(Map<String, List<String>> paramMap)
  {
    paramMap = a(paramMap, "X-Afma-Auto-Protection-Configuration");
    if ((paramMap == null) || (TextUtils.isEmpty(paramMap)))
    {
      paramMap = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204").buildUpon();
      paramMap.appendQueryParameter("id", "gmob-apps-blocked-navigation");
      if (!TextUtils.isEmpty(this.f)) {
        paramMap.appendQueryParameter("debugDialog", this.f);
      }
      boolean bool = ((Boolean)uf.j.c()).booleanValue();
      paramMap = String.valueOf(paramMap.toString());
      String str = String.valueOf("navigationURL");
      this.z = new AutoClickProtectionConfigurationParcel(bool, Arrays.asList(new String[] { String.valueOf(paramMap).length() + 18 + String.valueOf(str).length() + paramMap + "&" + str + "={NAVIGATION_URL}" }));
      return;
    }
    try
    {
      this.z = AutoClickProtectionConfigurationParcel.a(new JSONObject(paramMap));
      return;
    }
    catch (JSONException paramMap)
    {
      abr.d("Error parsing configuration JSON", paramMap);
      this.z = new AutoClickProtectionConfigurationParcel();
    }
  }
  
  private void C(Map<String, List<String>> paramMap)
  {
    this.B = a(paramMap, "Set-Cookie");
  }
  
  private void D(Map<String, List<String>> paramMap)
  {
    paramMap = a(paramMap, "X-Afma-Safe-Browsing");
    if (TextUtils.isEmpty(paramMap)) {
      return;
    }
    try
    {
      this.F = SafeBrowsingConfigParcel.a(new JSONObject(paramMap));
      return;
    }
    catch (JSONException paramMap)
    {
      abr.d("Error parsing safe browsing header", paramMap);
    }
  }
  
  static String a(Map<String, List<String>> paramMap, String paramString)
  {
    paramMap = (List)paramMap.get(paramString);
    if ((paramMap != null) && (!paramMap.isEmpty())) {
      return (String)paramMap.get(0);
    }
    return null;
  }
  
  static long b(Map<String, List<String>> paramMap, String paramString)
  {
    paramMap = (List)paramMap.get(paramString);
    if ((paramMap != null) && (!paramMap.isEmpty()))
    {
      paramMap = (String)paramMap.get(0);
      try
      {
        float f1 = Float.parseFloat(paramMap);
        return (f1 * 1000.0F);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        abr.d(String.valueOf(paramString).length() + 36 + String.valueOf(paramMap).length() + "Could not parse float from " + paramString + " header: " + paramMap);
      }
    }
    return -1L;
  }
  
  private void b(Map<String, List<String>> paramMap)
  {
    this.a = a(paramMap, "X-Afma-Ad-Size");
  }
  
  static List<String> c(Map<String, List<String>> paramMap, String paramString)
  {
    paramMap = (List)paramMap.get(paramString);
    if ((paramMap != null) && (!paramMap.isEmpty()))
    {
      paramMap = (String)paramMap.get(0);
      if (paramMap != null) {
        return Arrays.asList(paramMap.trim().split("\\s+"));
      }
    }
    return null;
  }
  
  private void c(Map<String, List<String>> paramMap)
  {
    this.E = a(paramMap, "X-Afma-Ad-Slot-Size");
  }
  
  private void d(Map<String, List<String>> paramMap)
  {
    paramMap = c(paramMap, "X-Afma-Click-Tracking-Urls");
    if (paramMap != null) {
      this.d = paramMap;
    }
  }
  
  private boolean d(Map<String, List<String>> paramMap, String paramString)
  {
    paramMap = (List)paramMap.get(paramString);
    return (paramMap != null) && (!paramMap.isEmpty()) && (Boolean.valueOf((String)paramMap.get(0)).booleanValue());
  }
  
  private void e(Map<String, List<String>> paramMap)
  {
    this.e = a(paramMap, "X-Afma-Debug-Signals");
  }
  
  private void f(Map<String, List<String>> paramMap)
  {
    paramMap = (List)paramMap.get("X-Afma-Debug-Dialog");
    if ((paramMap != null) && (!paramMap.isEmpty())) {
      this.f = ((String)paramMap.get(0));
    }
  }
  
  private void g(Map<String, List<String>> paramMap)
  {
    paramMap = c(paramMap, "X-Afma-Tracking-Urls");
    if (paramMap != null) {
      this.h = paramMap;
    }
  }
  
  private void h(Map<String, List<String>> paramMap)
  {
    long l1 = b(paramMap, "X-Afma-Interstitial-Timeout");
    if (l1 != -1L) {
      this.i = l1;
    }
  }
  
  private void i(Map<String, List<String>> paramMap)
  {
    this.g = a(paramMap, "X-Afma-ActiveView");
  }
  
  private void j(Map<String, List<String>> paramMap)
  {
    this.p = "native".equals(a(paramMap, "X-Afma-Ad-Format"));
  }
  
  private void k(Map<String, List<String>> paramMap)
  {
    this.o |= d(paramMap, "X-Afma-Custom-Rendering-Allowed");
  }
  
  private void l(Map<String, List<String>> paramMap)
  {
    this.j |= d(paramMap, "X-Afma-Mediation");
  }
  
  private void m(Map<String, List<String>> paramMap)
  {
    this.D |= d(paramMap, "X-Afma-Render-In-Browser");
  }
  
  private void n(Map<String, List<String>> paramMap)
  {
    paramMap = c(paramMap, "X-Afma-Manual-Tracking-Urls");
    if (paramMap != null) {
      this.l = paramMap;
    }
  }
  
  private void o(Map<String, List<String>> paramMap)
  {
    long l1 = b(paramMap, "X-Afma-Refresh-Rate");
    if (l1 != -1L) {
      this.m = l1;
    }
  }
  
  private void p(Map<String, List<String>> paramMap)
  {
    paramMap = (List)paramMap.get("X-Afma-Orientation");
    if ((paramMap != null) && (!paramMap.isEmpty()))
    {
      paramMap = (String)paramMap.get(0);
      if (!"portrait".equalsIgnoreCase(paramMap)) {
        break label58;
      }
      this.n = u.g().b();
    }
    label58:
    while (!"landscape".equalsIgnoreCase(paramMap)) {
      return;
    }
    this.n = u.g().a();
  }
  
  private void q(Map<String, List<String>> paramMap)
  {
    paramMap = (List)paramMap.get("X-Afma-Use-HTTPS");
    if ((paramMap != null) && (!paramMap.isEmpty())) {
      this.q = Boolean.valueOf((String)paramMap.get(0)).booleanValue();
    }
  }
  
  private void r(Map<String, List<String>> paramMap)
  {
    paramMap = (List)paramMap.get("X-Afma-Content-Url-Opted-Out");
    if ((paramMap != null) && (!paramMap.isEmpty())) {
      this.r = Boolean.valueOf((String)paramMap.get(0)).booleanValue();
    }
  }
  
  private void s(Map<String, List<String>> paramMap)
  {
    paramMap = (List)paramMap.get("X-Afma-Gws-Query-Id");
    if ((paramMap != null) && (!paramMap.isEmpty())) {
      this.s = ((String)paramMap.get(0));
    }
  }
  
  private void t(Map<String, List<String>> paramMap)
  {
    paramMap = a(paramMap, "X-Afma-Fluid");
    if ((paramMap != null) && (paramMap.equals("height"))) {
      this.t = true;
    }
  }
  
  private void u(Map<String, List<String>> paramMap)
  {
    this.u = "native_express".equals(a(paramMap, "X-Afma-Ad-Format"));
  }
  
  private void v(Map<String, List<String>> paramMap)
  {
    this.v = RewardItemParcel.a(a(paramMap, "X-Afma-Rewards"));
  }
  
  private void w(Map<String, List<String>> paramMap)
  {
    if (this.w != null) {
      return;
    }
    this.w = c(paramMap, "X-Afma-Reward-Video-Start-Urls");
  }
  
  private void x(Map<String, List<String>> paramMap)
  {
    if (this.x != null) {
      return;
    }
    this.x = c(paramMap, "X-Afma-Reward-Video-Complete-Urls");
  }
  
  private void y(Map<String, List<String>> paramMap)
  {
    this.y |= d(paramMap, "X-Afma-Use-Displayed-Impression");
  }
  
  private void z(Map<String, List<String>> paramMap)
  {
    this.A |= d(paramMap, "X-Afma-Auto-Collect-Location");
  }
  
  public AdResponseParcel a(long paramLong)
  {
    return new AdResponseParcel(this.G, this.b, this.c, this.d, this.h, this.i, this.j, -1L, this.l, this.m, this.n, this.a, paramLong, this.f, this.g, this.o, this.p, this.q, this.r, false, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.e);
  }
  
  public void a(String paramString1, Map<String, List<String>> paramMap, String paramString2)
  {
    this.b = paramString1;
    this.c = paramString2;
    a(paramMap);
  }
  
  public void a(Map<String, List<String>> paramMap)
  {
    b(paramMap);
    c(paramMap);
    d(paramMap);
    e(paramMap);
    f(paramMap);
    g(paramMap);
    h(paramMap);
    l(paramMap);
    n(paramMap);
    o(paramMap);
    p(paramMap);
    i(paramMap);
    q(paramMap);
    k(paramMap);
    j(paramMap);
    r(paramMap);
    s(paramMap);
    t(paramMap);
    u(paramMap);
    v(paramMap);
    w(paramMap);
    x(paramMap);
    y(paramMap);
    z(paramMap);
    C(paramMap);
    B(paramMap);
    A(paramMap);
    D(paramMap);
    m(paramMap);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/aah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */