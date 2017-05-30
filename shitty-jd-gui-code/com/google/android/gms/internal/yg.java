package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.customtabs.CustomTabsIntent;
import android.support.customtabs.CustomTabsIntent.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.ads.mediation.a;
import com.google.android.gms.ads.mediation.e;
import com.google.android.gms.ads.mediation.f;

@aaa
public class yg
  implements e
{
  private Activity a;
  private ut b;
  private f c;
  private Uri d;
  
  public static boolean a(Context paramContext)
  {
    return ut.a(paramContext);
  }
  
  public void onDestroy()
  {
    b.a("Destroying AdMobCustomTabsAdapter adapter.");
    try
    {
      this.b.a(this.a);
      return;
    }
    catch (Exception localException)
    {
      b.b("Exception while unbinding from CustomTabsService.", localException);
    }
  }
  
  public void onPause()
  {
    b.a("Pausing AdMobCustomTabsAdapter adapter.");
  }
  
  public void onResume()
  {
    b.a("Resuming AdMobCustomTabsAdapter adapter.");
  }
  
  public void requestInterstitialAd(Context paramContext, f paramf, Bundle paramBundle1, a parama, Bundle paramBundle2)
  {
    this.c = paramf;
    if (this.c == null)
    {
      b.d("Listener not set for mediation. Returning.");
      return;
    }
    if (!(paramContext instanceof Activity))
    {
      b.d("AdMobCustomTabs can only work with Activity context. Bailing out.");
      this.c.a(this, 0);
      return;
    }
    if (!a(paramContext))
    {
      b.d("Default browser does not support custom tabs. Bailing out.");
      this.c.a(this, 0);
      return;
    }
    paramf = paramBundle1.getString("tab_url");
    if (TextUtils.isEmpty(paramf))
    {
      b.d("The tab_url retrieved from mediation metadata is empty. Bailing out.");
      this.c.a(this, 0);
      return;
    }
    this.a = ((Activity)paramContext);
    this.d = Uri.parse(paramf);
    this.b = new ut();
    paramContext = new yg.1(this);
    this.b.a(paramContext);
    this.b.b(this.a);
    this.c.a(this);
  }
  
  public void showInterstitial()
  {
    Object localObject = new CustomTabsIntent.Builder(this.b.b()).build();
    ((CustomTabsIntent)localObject).intent.setData(this.d);
    localObject = new AdOverlayInfoParcel(new AdLauncherIntentInfoParcel(((CustomTabsIntent)localObject).intent), null, new yg.2(this), null, new VersionInfoParcel(0, 0, false));
    abv.a.post(new yg.3(this, (AdOverlayInfoParcel)localObject));
    u.i().c(false);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/yg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */