package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@aaa
public final class xh
{
  public final List<xg> a;
  public final long b;
  public final List<String> c;
  public final List<String> d;
  public final List<String> e;
  public final List<String> f;
  public final boolean g;
  public final String h;
  public final long i;
  public final String j;
  public final int k;
  public final int l;
  public final long m;
  public final boolean n;
  public int o;
  public int p;
  
  public xh(String paramString)
  {
    Object localObject = new JSONObject(paramString);
    if (abr.a(2))
    {
      paramString = String.valueOf(((JSONObject)localObject).toString(2));
      if (paramString.length() == 0) {
        break label138;
      }
    }
    ArrayList localArrayList;
    int i2;
    label138:
    for (paramString = "Mediation Response JSON: ".concat(paramString);; paramString = new String("Mediation Response JSON: "))
    {
      abr.e(paramString);
      paramString = ((JSONObject)localObject).getJSONArray("ad_networks");
      localArrayList = new ArrayList(paramString.length());
      int i1 = 0;
      int i3;
      for (i2 = -1; i1 < paramString.length(); i2 = i3)
      {
        xg localxg = new xg(paramString.getJSONObject(i1));
        localArrayList.add(localxg);
        i3 = i2;
        if (i2 < 0)
        {
          i3 = i2;
          if (a(localxg)) {
            i3 = i1;
          }
        }
        i1 += 1;
      }
    }
    this.o = i2;
    this.p = paramString.length();
    this.a = Collections.unmodifiableList(localArrayList);
    this.h = ((JSONObject)localObject).getString("qdata");
    this.l = ((JSONObject)localObject).optInt("fs_model_type", -1);
    this.m = ((JSONObject)localObject).optLong("timeout_ms", -1L);
    paramString = ((JSONObject)localObject).optJSONObject("settings");
    if (paramString != null)
    {
      this.b = paramString.optLong("ad_network_timeout_millis", -1L);
      this.c = u.x().a(paramString, "click_urls");
      this.d = u.x().a(paramString, "imp_urls");
      this.e = u.x().a(paramString, "nofill_urls");
      this.f = u.x().a(paramString, "remote_ping_urls");
      this.g = paramString.optBoolean("render_in_browser", false);
      long l1 = paramString.optLong("refresh", -1L);
      if (l1 > 0L)
      {
        l1 *= 1000L;
        this.i = l1;
        localObject = RewardItemParcel.a(paramString.optJSONArray("rewards"));
        if (localObject != null) {
          break label376;
        }
        this.j = null;
      }
      for (this.k = 0;; this.k = ((RewardItemParcel)localObject).c)
      {
        this.n = paramString.optBoolean("use_displayed_impression", false);
        return;
        l1 = -1L;
        break;
        label376:
        this.j = ((RewardItemParcel)localObject).b;
      }
    }
    this.b = -1L;
    this.c = null;
    this.d = null;
    this.e = null;
    this.f = null;
    this.i = -1L;
    this.j = null;
    this.k = 0;
    this.n = false;
    this.g = false;
  }
  
  public xh(List<xg> paramList, long paramLong1, List<String> paramList1, List<String> paramList2, List<String> paramList3, List<String> paramList4, boolean paramBoolean1, String paramString1, long paramLong2, int paramInt1, int paramInt2, String paramString2, int paramInt3, int paramInt4, long paramLong3, boolean paramBoolean2)
  {
    this.a = paramList;
    this.b = paramLong1;
    this.c = paramList1;
    this.d = paramList2;
    this.e = paramList3;
    this.f = paramList4;
    this.g = paramBoolean1;
    this.h = paramString1;
    this.i = paramLong2;
    this.o = paramInt1;
    this.p = paramInt2;
    this.j = paramString2;
    this.k = paramInt3;
    this.l = paramInt4;
    this.m = paramLong3;
    this.n = paramBoolean2;
  }
  
  private boolean a(xg paramxg)
  {
    paramxg = paramxg.c.iterator();
    while (paramxg.hasNext()) {
      if (((String)paramxg.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/xh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */