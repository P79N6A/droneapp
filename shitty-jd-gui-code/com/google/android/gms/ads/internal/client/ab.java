package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.uw;
import com.google.android.gms.internal.vj;
import com.google.android.gms.internal.xq;
import com.google.android.gms.internal.yp;
import com.google.android.gms.internal.yq;
import com.google.android.gms.internal.yz;
import com.google.android.gms.internal.zf;

@aaa
public class ab
{
  private an a;
  private final Object b = new Object();
  private final v c;
  private final u d;
  private final j e;
  private final vj f;
  private final com.google.android.gms.ads.internal.reward.client.f g;
  private final zf h;
  private final yp i;
  
  public ab(v paramv, u paramu, j paramj, vj paramvj, com.google.android.gms.ads.internal.reward.client.f paramf, zf paramzf, yp paramyp)
  {
    this.c = paramv;
    this.d = paramu;
    this.e = paramj;
    this.f = paramvj;
    this.g = paramf;
    this.h = paramzf;
    this.i = paramyp;
  }
  
  @Nullable
  private static an a()
  {
    try
    {
      Object localObject = ab.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").newInstance();
      if (!(localObject instanceof IBinder))
      {
        com.google.android.gms.ads.internal.util.client.b.d("ClientApi class is not an instance of IBinder");
        return null;
      }
      localObject = an.a.asInterface((IBinder)localObject);
      return (an)localObject;
    }
    catch (Exception localException)
    {
      com.google.android.gms.ads.internal.util.client.b.d("Failed to instantiate ClientApi class.", localException);
    }
    return null;
  }
  
  private void a(Context paramContext, String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("action", "no_ads_fallback");
    localBundle.putString("flow", paramString);
    ac.a().a(paramContext, null, "gmob-apps", localBundle, true);
  }
  
  private static boolean a(Activity paramActivity, String paramString)
  {
    paramActivity = paramActivity.getIntent();
    if (!paramActivity.hasExtra(paramString))
    {
      com.google.android.gms.ads.internal.util.client.b.b("useClientJar flag not found in activity intent extras.");
      return false;
    }
    return paramActivity.getBooleanExtra(paramString, false);
  }
  
  @Nullable
  private an b()
  {
    synchronized (this.b)
    {
      if (this.a == null) {
        this.a = a();
      }
      an localan = this.a;
      return localan;
    }
  }
  
  public ai a(final Context paramContext, final String paramString, final xq paramxq)
  {
    (ai)a(paramContext, false, new a(paramContext)
    {
      public ai a()
      {
        ai localai = ab.c(ab.this).a(paramContext, paramString, paramxq);
        if (localai != null) {
          return localai;
        }
        ab.a(ab.this, paramContext, "native_ad");
        return new k();
      }
      
      public ai a(an paramAnonymousan)
      {
        return paramAnonymousan.createAdLoaderBuilder(com.google.android.gms.c.f.a(paramContext), paramString, paramxq, 9683000);
      }
    });
  }
  
  public ak a(final Context paramContext, final AdSizeParcel paramAdSizeParcel, final String paramString)
  {
    (ak)a(paramContext, false, new a(paramContext)
    {
      public ak a()
      {
        ak localak = ab.b(ab.this).a(paramContext, paramAdSizeParcel, paramString, null, 3);
        if (localak != null) {
          return localak;
        }
        ab.a(ab.this, paramContext, "search");
        return new l();
      }
      
      public ak a(an paramAnonymousan)
      {
        return paramAnonymousan.createSearchAdManager(com.google.android.gms.c.f.a(paramContext), paramAdSizeParcel, paramString, 9683000);
      }
    });
  }
  
  public ak a(final Context paramContext, final AdSizeParcel paramAdSizeParcel, final String paramString, final xq paramxq)
  {
    (ak)a(paramContext, false, new a(paramContext)
    {
      public ak a()
      {
        ak localak = ab.b(ab.this).a(paramContext, paramAdSizeParcel, paramString, paramxq, 1);
        if (localak != null) {
          return localak;
        }
        ab.a(ab.this, paramContext, "banner");
        return new l();
      }
      
      public ak a(an paramAnonymousan)
      {
        return paramAnonymousan.createBannerAdManager(com.google.android.gms.c.f.a(paramContext), paramAdSizeParcel, paramString, paramxq, 9683000);
      }
    });
  }
  
  public ap a(final Context paramContext)
  {
    (ap)a(paramContext, false, new a(paramContext)
    {
      public ap a()
      {
        ap localap = ab.d(ab.this).a(paramContext);
        if (localap != null) {
          return localap;
        }
        ab.a(ab.this, paramContext, "mobile_ads_settings");
        return new m();
      }
      
      public ap a(an paramAnonymousan)
      {
        return paramAnonymousan.getMobileAdsSettingsManagerWithClientJarVersion(com.google.android.gms.c.f.a(paramContext), 9683000);
      }
    });
  }
  
  public com.google.android.gms.ads.internal.reward.client.b a(final Context paramContext, final xq paramxq)
  {
    (com.google.android.gms.ads.internal.reward.client.b)a(paramContext, false, new a(paramContext)
    {
      public com.google.android.gms.ads.internal.reward.client.b a()
      {
        com.google.android.gms.ads.internal.reward.client.b localb = ab.f(ab.this).a(paramContext, paramxq);
        if (localb != null) {
          return localb;
        }
        ab.a(ab.this, paramContext, "rewarded_video");
        return new o();
      }
      
      public com.google.android.gms.ads.internal.reward.client.b a(an paramAnonymousan)
      {
        return paramAnonymousan.createRewardedVideoAd(com.google.android.gms.c.f.a(paramContext), paramxq, 9683000);
      }
    });
  }
  
  public uw a(final Context paramContext, final FrameLayout paramFrameLayout1, final FrameLayout paramFrameLayout2)
  {
    (uw)a(paramContext, false, new a(paramFrameLayout1)
    {
      public uw a()
      {
        uw localuw = ab.e(ab.this).a(paramContext, paramFrameLayout1, paramFrameLayout2);
        if (localuw != null) {
          return localuw;
        }
        ab.a(ab.this, paramContext, "native_ad_view_delegate");
        return new n();
      }
      
      public uw a(an paramAnonymousan)
      {
        return paramAnonymousan.createNativeAdViewDelegate(com.google.android.gms.c.f.a(paramFrameLayout1), com.google.android.gms.c.f.a(paramFrameLayout2));
      }
    });
  }
  
  @Nullable
  public yz a(final Activity paramActivity)
  {
    (yz)a(paramActivity, a(paramActivity, "com.google.android.gms.ads.internal.purchase.useClientJar"), new a(paramActivity)
    {
      public yz a()
      {
        yz localyz = ab.g(ab.this).a(paramActivity);
        if (localyz != null) {
          return localyz;
        }
        ab.a(ab.this, paramActivity, "iap");
        return null;
      }
      
      public yz a(an paramAnonymousan)
      {
        return paramAnonymousan.createInAppPurchaseManager(com.google.android.gms.c.f.a(paramActivity));
      }
    });
  }
  
  @VisibleForTesting
  <T> T a(Context paramContext, boolean paramBoolean, a<T> parama)
  {
    boolean bool = paramBoolean;
    if (!paramBoolean)
    {
      bool = paramBoolean;
      if (!ac.a().b(paramContext))
      {
        com.google.android.gms.ads.internal.util.client.b.a("Google Play Services is not available");
        bool = true;
      }
    }
    Object localObject;
    if (bool)
    {
      localObject = parama.c();
      paramContext = (Context)localObject;
      if (localObject == null) {
        paramContext = parama.d();
      }
    }
    do
    {
      return paramContext;
      localObject = parama.d();
      paramContext = (Context)localObject;
    } while (localObject != null);
    return (T)parama.c();
  }
  
  public ak b(final Context paramContext, final AdSizeParcel paramAdSizeParcel, final String paramString, final xq paramxq)
  {
    (ak)a(paramContext, false, new a(paramContext)
    {
      public ak a()
      {
        ak localak = ab.b(ab.this).a(paramContext, paramAdSizeParcel, paramString, paramxq, 2);
        if (localak != null) {
          return localak;
        }
        ab.a(ab.this, paramContext, "interstitial");
        return new l();
      }
      
      public ak a(an paramAnonymousan)
      {
        return paramAnonymousan.createInterstitialAdManager(com.google.android.gms.c.f.a(paramContext), paramAdSizeParcel, paramString, paramxq, 9683000);
      }
    });
  }
  
  @Nullable
  public yq b(final Activity paramActivity)
  {
    (yq)a(paramActivity, a(paramActivity, "com.google.android.gms.ads.internal.overlay.useClientJar"), new a(paramActivity)
    {
      public yq a()
      {
        yq localyq = ab.h(ab.this).a(paramActivity);
        if (localyq != null) {
          return localyq;
        }
        ab.a(ab.this, paramActivity, "ad_overlay");
        return null;
      }
      
      public yq a(an paramAnonymousan)
      {
        return paramAnonymousan.createAdOverlay(com.google.android.gms.c.f.a(paramActivity));
      }
    });
  }
  
  @VisibleForTesting
  abstract class a<T>
  {
    a() {}
    
    @Nullable
    protected abstract T b();
    
    @Nullable
    protected abstract T b(an paraman);
    
    @Nullable
    protected final T c()
    {
      Object localObject = ab.a(ab.this);
      if (localObject == null)
      {
        com.google.android.gms.ads.internal.util.client.b.d("ClientApi class cannot be loaded.");
        return null;
      }
      try
      {
        localObject = b((an)localObject);
        return (T)localObject;
      }
      catch (RemoteException localRemoteException)
      {
        com.google.android.gms.ads.internal.util.client.b.d("Cannot invoke local loader using ClientApi class", localRemoteException);
      }
      return null;
    }
    
    @Nullable
    protected final T d()
    {
      try
      {
        Object localObject = b();
        return (T)localObject;
      }
      catch (RemoteException localRemoteException)
      {
        com.google.android.gms.ads.internal.util.client.b.d("Cannot invoke remote loader", localRemoteException);
      }
      return null;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/client/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */