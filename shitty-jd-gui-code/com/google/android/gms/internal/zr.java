package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.AutoClickProtectionConfigurationParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

@aaa
public class zr
  extends zm
{
  xf g;
  protected xl h;
  private xq i;
  private xh j;
  private final un k;
  private final acy l;
  private boolean m;
  
  zr(Context paramContext, abi.a parama, xq paramxq, zn.a parama1, un paramun, acy paramacy)
  {
    super(paramContext, parama, parama1);
    this.i = paramxq;
    this.j = parama.c;
    this.k = paramun;
    this.l = paramacy;
  }
  
  private static String a(xl paramxl)
  {
    String str = paramxl.b.d;
    int n = b(paramxl.a);
    long l1 = paramxl.g;
    return String.valueOf(str).length() + 33 + str + "." + n + "." + l1;
  }
  
  private static String a(List<xl> paramList)
  {
    if (paramList == null) {
      return "".toString();
    }
    Iterator localIterator = paramList.iterator();
    label20:
    Object localObject;
    for (paramList = ""; localIterator.hasNext(); paramList = String.valueOf(paramList).length() + 1 + String.valueOf(localObject).length() + paramList + (String)localObject + "_")
    {
      localObject = (xl)localIterator.next();
      if ((localObject == null) || (((xl)localObject).b == null) || (TextUtils.isEmpty(((xl)localObject).b.d))) {
        break label20;
      }
      paramList = String.valueOf(paramList);
      localObject = String.valueOf(a((xl)localObject));
    }
    return paramList.substring(0, Math.max(0, paramList.length() - 1));
  }
  
  private static int b(int paramInt)
  {
    switch (paramInt)
    {
    case 2: 
    default: 
      return 6;
    case 0: 
      return 0;
    case 1: 
      return 1;
    case 3: 
      return 2;
    case 4: 
      return 3;
    case -1: 
      return 4;
    }
    return 5;
  }
  
  private void c()
  {
    ??? = new CountDownLatch(1);
    abv.a.post(new zr.1(this, (CountDownLatch)???));
    String str;
    try
    {
      ((CountDownLatch)???).await(10L, TimeUnit.SECONDS);
      synchronized (this.d)
      {
        if (!this.m) {
          throw new zm.a("View could not be prepared", 0);
        }
      }
      if (!this.l.r()) {
        break label133;
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      str = String.valueOf(localInterruptedException);
      throw new zm.a(String.valueOf(str).length() + 38 + "Interrupted while waiting for latch : " + str, 0);
    }
    throw new zm.a("Assets not loaded, web view is destroyed", 0);
    label133:
  }
  
  protected abi a(int paramInt)
  {
    Object localObject = this.e.a;
    AdRequestParcel localAdRequestParcel = ((AdRequestInfoParcel)localObject).c;
    acy localacy = this.l;
    List localList1 = this.f.d;
    List localList2 = this.f.f;
    List localList3 = this.f.j;
    int n = this.f.l;
    long l1 = this.f.k;
    String str3 = ((AdRequestInfoParcel)localObject).i;
    boolean bool2 = this.f.h;
    xr localxr;
    label113:
    String str1;
    label129:
    xh localxh;
    xj localxj;
    label151:
    long l2;
    AdSizeParcel localAdSizeParcel;
    long l3;
    long l4;
    long l5;
    String str4;
    JSONObject localJSONObject;
    RewardItemParcel localRewardItemParcel;
    List localList4;
    List localList5;
    boolean bool1;
    label257:
    AutoClickProtectionConfigurationParcel localAutoClickProtectionConfigurationParcel;
    if (this.h != null)
    {
      localObject = this.h.b;
      if (this.h == null) {
        break label369;
      }
      localxr = this.h.c;
      if (this.h == null) {
        break label375;
      }
      str1 = this.h.d;
      localxh = this.j;
      if (this.h == null) {
        break label386;
      }
      localxj = this.h.e;
      l2 = this.f.i;
      localAdSizeParcel = this.e.d;
      l3 = this.f.g;
      l4 = this.e.f;
      l5 = this.f.n;
      str4 = this.f.o;
      localJSONObject = this.e.h;
      localRewardItemParcel = this.f.C;
      localList4 = this.f.D;
      localList5 = this.f.E;
      if (this.j == null) {
        break label392;
      }
      bool1 = this.j.n;
      localAutoClickProtectionConfigurationParcel = this.f.G;
      if (this.g == null) {
        break label398;
      }
    }
    label369:
    label375:
    label386:
    label392:
    label398:
    for (String str2 = a(this.g.b());; str2 = null)
    {
      return new abi(localAdRequestParcel, localacy, localList1, paramInt, localList2, localList3, n, l1, str3, bool2, (xg)localObject, localxr, str1, localxh, localxj, l2, localAdSizeParcel, l3, l4, l5, str4, localJSONObject, null, localRewardItemParcel, localList4, localList5, bool1, localAutoClickProtectionConfigurationParcel, str2, this.f.J, this.f.N);
      localObject = null;
      break;
      localxr = null;
      break label113;
      str1 = AdMobAdapter.class.getName();
      break label129;
      localxj = null;
      break label151;
      bool1 = false;
      break label257;
    }
  }
  
  protected void a(long paramLong)
  {
    for (;;)
    {
      synchronized (this.d)
      {
        this.g = b(paramLong);
        ??? = new ArrayList(this.j.a);
        Object localObject2 = this.e.a.c.m;
        if (localObject2 == null) {
          break label271;
        }
        localObject2 = ((Bundle)localObject2).getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (localObject2 == null) {
          break label271;
        }
        bool = ((Bundle)localObject2).getBoolean("_skipMediation");
        if (bool)
        {
          localObject2 = ((List)???).listIterator();
          if (((ListIterator)localObject2).hasNext())
          {
            if (((xg)((ListIterator)localObject2).next()).c.contains("com.google.ads.mediation.admob.AdMobAdapter")) {
              continue;
            }
            ((ListIterator)localObject2).remove();
          }
        }
      }
      this.h = this.g.a((List)???);
      switch (this.h.a)
      {
      default: 
        int n = this.h.a;
        throw new zm.a(40 + "Unexpected mediation result: " + n, 0);
      case 1: 
        throw new zm.a("No fill from any mediation ad networks.", 3);
      }
      if ((this.h.b != null) && (this.h.b.l != null)) {
        c();
      }
      return;
      label271:
      boolean bool = false;
    }
  }
  
  xf b(long paramLong)
  {
    if (this.j.l != -1) {
      return new xn(this.b, this.e.a, this.i, this.j, this.f.t, this.f.B, paramLong, ((Long)uf.aY.c()).longValue(), 2);
    }
    return new xo(this.b, this.e.a, this.i, this.j, this.f.t, this.f.B, paramLong, ((Long)uf.aY.c()).longValue(), this.k);
  }
  
  public void b()
  {
    synchronized (this.d)
    {
      super.b();
      if (this.g != null) {
        this.g.a();
      }
      return;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/zr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */