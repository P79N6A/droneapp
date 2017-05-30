package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.ads.search.b;
import com.google.android.gms.internal.aaa;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

@aaa
public class y
{
  public static final y a = new y();
  
  public static y a()
  {
    return a;
  }
  
  public AdRequestParcel a(Context paramContext, e parame)
  {
    Object localObject1 = parame.a();
    long l;
    String str1;
    int i;
    label59:
    boolean bool1;
    int j;
    Location localLocation;
    Bundle localBundle;
    boolean bool2;
    String str2;
    if (localObject1 != null)
    {
      l = ((Date)localObject1).getTime();
      str1 = parame.b();
      i = parame.c();
      localObject1 = parame.d();
      if (((Set)localObject1).isEmpty()) {
        break label231;
      }
      localObject1 = Collections.unmodifiableList(new ArrayList((Collection)localObject1));
      bool1 = parame.a(paramContext);
      j = parame.l();
      localLocation = parame.e();
      localBundle = parame.b(AdMobAdapter.class);
      bool2 = parame.f();
      str2 = parame.g();
      localObject2 = parame.i();
      if (localObject2 == null) {
        break label237;
      }
    }
    label231:
    label237:
    for (Object localObject2 = new SearchAdRequestParcel((b)localObject2);; localObject2 = null)
    {
      Object localObject3 = null;
      Context localContext = paramContext.getApplicationContext();
      paramContext = (Context)localObject3;
      if (localContext != null)
      {
        paramContext = localContext.getPackageName();
        paramContext = ac.a().a(Thread.currentThread().getStackTrace(), paramContext);
      }
      boolean bool3 = parame.o();
      return new AdRequestParcel(7, l, localBundle, i, (List)localObject1, bool1, j, bool2, str2, (SearchAdRequestParcel)localObject2, localLocation, str1, parame.k(), parame.m(), Collections.unmodifiableList(new ArrayList(parame.n())), parame.h(), paramContext, bool3);
      l = -1L;
      break;
      localObject1 = null;
      break label59;
    }
  }
  
  public RewardedVideoAdRequestParcel a(Context paramContext, e parame, String paramString)
  {
    return new RewardedVideoAdRequestParcel(a(paramContext, parame), paramString);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/client/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */