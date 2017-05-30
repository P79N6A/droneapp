package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.s;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abv;

@aaa
public class e
{
  public void a(Context paramContext, AdOverlayInfoParcel paramAdOverlayInfoParcel)
  {
    a(paramContext, paramAdOverlayInfoParcel, true);
  }
  
  public void a(Context paramContext, AdOverlayInfoParcel paramAdOverlayInfoParcel, boolean paramBoolean)
  {
    if ((paramAdOverlayInfoParcel.l == 4) && (paramAdOverlayInfoParcel.d == null))
    {
      if (paramAdOverlayInfoParcel.c != null) {
        paramAdOverlayInfoParcel.c.e();
      }
      u.b().a(paramContext, paramAdOverlayInfoParcel.b, paramAdOverlayInfoParcel.j);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.setClassName(paramContext, "com.google.android.gms.ads.AdActivity");
    localIntent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", paramAdOverlayInfoParcel.n.e);
    localIntent.putExtra("shouldCallOnOverlayOpened", paramBoolean);
    AdOverlayInfoParcel.a(localIntent, paramAdOverlayInfoParcel);
    if (!s.j()) {
      localIntent.addFlags(524288);
    }
    if (!(paramContext instanceof Activity)) {
      localIntent.addFlags(268435456);
    }
    u.e().a(paramContext, localIntent);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */