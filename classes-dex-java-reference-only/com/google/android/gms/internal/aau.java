package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.v;
import com.google.android.gms.c.f;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@aaa
public class aau
  extends b
  implements aay
{
  private static final xp l = new xp();
  private final Map<String, abc> m = new HashMap();
  private boolean n;
  
  public aau(Context paramContext, com.google.android.gms.ads.internal.d paramd, AdSizeParcel paramAdSizeParcel, xq paramxq, VersionInfoParcel paramVersionInfoParcel)
  {
    super(paramContext, paramAdSizeParcel, null, paramxq, paramVersionInfoParcel, paramd);
  }
  
  private abi.a b(abi.a parama)
  {
    abr.e("Creating mediation ad response for non-mediated rewarded ad.");
    try
    {
      Object localObject1 = aaf.a(parama.b).toString();
      Object localObject2 = new JSONObject();
      ((JSONObject)localObject2).put("pubid", parama.a.e);
      localObject2 = ((JSONObject)localObject2).toString();
      localObject1 = new xh(Arrays.asList(new xg[] { new xg((String)localObject1, null, Arrays.asList(new String[] { "com.google.ads.mediation.admob.AdMobAdapter" }), null, null, Collections.emptyList(), Collections.emptyList(), (String)localObject2, null, Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList()) }), -1L, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), false, "", -1L, 0, 1, null, 0, -1, -1L, false);
      return new abi.a(parama.a, parama.b, (xh)localObject1, parama.d, parama.e, parama.f, parama.g, parama.h);
    }
    catch (JSONException localJSONException)
    {
      abr.b("Unable to generate ad state for non-mediated rewarded video.", localJSONException);
    }
    return c(parama);
  }
  
  private abi.a c(abi.a parama)
  {
    return new abi.a(parama.a, parama.b, null, parama.d, 0, parama.f, parama.g, parama.h);
  }
  
  public void E()
  {
    com.google.android.gms.common.internal.d.b("showAd must be called on the main UI thread.");
    if (!F()) {
      abr.d("The reward video has not loaded.");
    }
    abc localabc;
    do
    {
      return;
      this.n = true;
      localabc = c(this.f.j.q);
    } while ((localabc == null) || (localabc.a() == null));
    try
    {
      localabc.a().f();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      abr.d("Could not call showVideo.", localRemoteException);
    }
  }
  
  public boolean F()
  {
    com.google.android.gms.common.internal.d.b("isLoaded must be called on the main UI thread.");
    return (this.f.g == null) && (this.f.h == null) && (this.f.j != null) && (!this.n);
  }
  
  public void G()
  {
    a(this.f.j, false);
    r();
  }
  
  public void H()
  {
    if ((this.f.j != null) && (this.f.j.o != null)) {
      u.x().a(this.f.c, this.f.e.b, this.f.j, this.f.b, false, this.f.j.o.j);
    }
    t();
  }
  
  public void I()
  {
    p();
  }
  
  public void J()
  {
    e();
  }
  
  public void K()
  {
    q();
  }
  
  public void a(@NonNull Context paramContext)
  {
    Iterator localIterator = this.m.values().iterator();
    while (localIterator.hasNext())
    {
      abc localabc = (abc)localIterator.next();
      try
      {
        localabc.a().a(f.a(paramContext));
      }
      catch (RemoteException localRemoteException)
      {
        abr.b("Unable to call Adapter.onContextChanged.", localRemoteException);
      }
    }
  }
  
  public void a(RewardedVideoAdRequestParcel paramRewardedVideoAdRequestParcel)
  {
    com.google.android.gms.common.internal.d.b("loadAd must be called on the main UI thread.");
    if (TextUtils.isEmpty(paramRewardedVideoAdRequestParcel.c))
    {
      abr.d("Invalid ad unit id. Aborting.");
      abv.a.post(new aau.1(this));
      return;
    }
    this.n = false;
    this.f.b = paramRewardedVideoAdRequestParcel.c;
    super.a(paramRewardedVideoAdRequestParcel.b);
  }
  
  public void a(abi.a parama, un paramun)
  {
    if (parama.e != -2)
    {
      abv.a.post(new aau.2(this, parama));
      return;
    }
    this.f.k = parama;
    if (parama.c == null) {
      this.f.k = b(parama);
    }
    this.f.E = 0;
    this.f.h = u.d().a(this.f.c, this.f.k, this);
  }
  
  protected boolean a(AdRequestParcel paramAdRequestParcel, abi paramabi, boolean paramBoolean)
  {
    return false;
  }
  
  public boolean a(abi paramabi1, abi paramabi2)
  {
    return true;
  }
  
  public void b()
  {
    com.google.android.gms.common.internal.d.b("destroy must be called on the main UI thread.");
    Iterator localIterator = this.m.keySet().iterator();
    for (;;)
    {
      if (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        try
        {
          abc localabc = (abc)this.m.get(str);
          if ((localabc != null) && (localabc.a() != null)) {
            localabc.a().c();
          }
        }
        catch (RemoteException localRemoteException)
        {
          str = String.valueOf(str);
          if (str.length() != 0) {}
          for (str = "Fail to destroy adapter: ".concat(str);; str = new String("Fail to destroy adapter: "))
          {
            abr.d(str);
            break;
          }
        }
      }
    }
  }
  
  public void b(@Nullable RewardItemParcel paramRewardItemParcel)
  {
    if ((this.f.j != null) && (this.f.j.o != null)) {
      u.x().a(this.f.c, this.f.e.b, this.f.j, this.f.b, false, this.f.j.o.k);
    }
    RewardItemParcel localRewardItemParcel = paramRewardItemParcel;
    if (this.f.j != null)
    {
      localRewardItemParcel = paramRewardItemParcel;
      if (this.f.j.r != null)
      {
        localRewardItemParcel = paramRewardItemParcel;
        if (!TextUtils.isEmpty(this.f.j.r.j)) {
          localRewardItemParcel = new RewardItemParcel(this.f.j.r.j, this.f.j.r.k);
        }
      }
    }
    a(localRewardItemParcel);
  }
  
  @Nullable
  public abc c(String paramString)
  {
    Object localObject1 = (abc)this.m.get(paramString);
    Object localObject2 = localObject1;
    if (localObject1 == null) {}
    try
    {
      localObject2 = this.j;
      if ("com.google.ads.mediation.admob.AdMobAdapter".equals(paramString))
      {
        localObject2 = l;
        localObject2 = new abc(((xq)localObject2).a(paramString), this);
      }
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        try
        {
          this.m.put(paramString, localObject2);
          return (abc)localObject2;
        }
        catch (Exception localException2)
        {
          localObject1 = localException1;
          Object localObject3 = localException2;
          continue;
        }
        localException1 = localException1;
        paramString = String.valueOf(paramString);
        if (paramString.length() != 0)
        {
          paramString = "Fail to instantiate adapter ".concat(paramString);
          abr.d(paramString, localException1);
          return (abc)localObject1;
        }
        paramString = new String("Fail to instantiate adapter ");
      }
    }
  }
  
  public void c_()
  {
    com.google.android.gms.common.internal.d.b("resume must be called on the main UI thread.");
    Iterator localIterator = this.m.keySet().iterator();
    for (;;)
    {
      if (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        try
        {
          abc localabc = (abc)this.m.get(str);
          if ((localabc != null) && (localabc.a() != null)) {
            localabc.a().e();
          }
        }
        catch (RemoteException localRemoteException)
        {
          str = String.valueOf(str);
          if (str.length() != 0) {}
          for (str = "Fail to resume adapter: ".concat(str);; str = new String("Fail to resume adapter: "))
          {
            abr.d(str);
            break;
          }
        }
      }
    }
  }
  
  public void d()
  {
    com.google.android.gms.common.internal.d.b("pause must be called on the main UI thread.");
    Iterator localIterator = this.m.keySet().iterator();
    for (;;)
    {
      if (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        try
        {
          abc localabc = (abc)this.m.get(str);
          if ((localabc != null) && (localabc.a() != null)) {
            localabc.a().d();
          }
        }
        catch (RemoteException localRemoteException)
        {
          str = String.valueOf(str);
          if (str.length() != 0) {}
          for (str = "Fail to pause adapter: ".concat(str);; str = new String("Fail to pause adapter: "))
          {
            abr.d(str);
            break;
          }
        }
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/aau.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */