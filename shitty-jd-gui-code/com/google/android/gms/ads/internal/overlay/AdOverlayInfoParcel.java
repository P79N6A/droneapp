package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.client.a;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.c.e;
import com.google.android.gms.c.e.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.vp;
import com.google.android.gms.internal.vv;

@aaa
public final class AdOverlayInfoParcel
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final f CREATOR = new f();
  public final int a;
  public final AdLauncherIntentInfoParcel b;
  public final a c;
  public final g d;
  public final acy e;
  public final vp f;
  public final String g;
  public final boolean h;
  public final String i;
  public final p j;
  public final int k;
  public final int l;
  public final String m;
  public final VersionInfoParcel n;
  public final vv o;
  public final String p;
  public final InterstitialAdParameterParcel q;
  
  AdOverlayInfoParcel(int paramInt1, AdLauncherIntentInfoParcel paramAdLauncherIntentInfoParcel, IBinder paramIBinder1, IBinder paramIBinder2, IBinder paramIBinder3, IBinder paramIBinder4, String paramString1, boolean paramBoolean, String paramString2, IBinder paramIBinder5, int paramInt2, int paramInt3, String paramString3, VersionInfoParcel paramVersionInfoParcel, IBinder paramIBinder6, String paramString4, InterstitialAdParameterParcel paramInterstitialAdParameterParcel)
  {
    this.a = paramInt1;
    this.b = paramAdLauncherIntentInfoParcel;
    this.c = ((a)com.google.android.gms.c.f.a(e.a.a(paramIBinder1)));
    this.d = ((g)com.google.android.gms.c.f.a(e.a.a(paramIBinder2)));
    this.e = ((acy)com.google.android.gms.c.f.a(e.a.a(paramIBinder3)));
    this.f = ((vp)com.google.android.gms.c.f.a(e.a.a(paramIBinder4)));
    this.g = paramString1;
    this.h = paramBoolean;
    this.i = paramString2;
    this.j = ((p)com.google.android.gms.c.f.a(e.a.a(paramIBinder5)));
    this.k = paramInt2;
    this.l = paramInt3;
    this.m = paramString3;
    this.n = paramVersionInfoParcel;
    this.o = ((vv)com.google.android.gms.c.f.a(e.a.a(paramIBinder6)));
    this.p = paramString4;
    this.q = paramInterstitialAdParameterParcel;
  }
  
  public AdOverlayInfoParcel(a parama, g paramg, p paramp, acy paramacy, int paramInt, VersionInfoParcel paramVersionInfoParcel, String paramString, InterstitialAdParameterParcel paramInterstitialAdParameterParcel)
  {
    this.a = 4;
    this.b = null;
    this.c = parama;
    this.d = paramg;
    this.e = paramacy;
    this.f = null;
    this.g = null;
    this.h = false;
    this.i = null;
    this.j = paramp;
    this.k = paramInt;
    this.l = 1;
    this.m = null;
    this.n = paramVersionInfoParcel;
    this.o = null;
    this.p = paramString;
    this.q = paramInterstitialAdParameterParcel;
  }
  
  public AdOverlayInfoParcel(a parama, g paramg, p paramp, acy paramacy, boolean paramBoolean, int paramInt, VersionInfoParcel paramVersionInfoParcel)
  {
    this.a = 4;
    this.b = null;
    this.c = parama;
    this.d = paramg;
    this.e = paramacy;
    this.f = null;
    this.g = null;
    this.h = paramBoolean;
    this.i = null;
    this.j = paramp;
    this.k = paramInt;
    this.l = 2;
    this.m = null;
    this.n = paramVersionInfoParcel;
    this.o = null;
    this.p = null;
    this.q = null;
  }
  
  public AdOverlayInfoParcel(a parama, g paramg, vp paramvp, p paramp, acy paramacy, boolean paramBoolean, int paramInt, String paramString, VersionInfoParcel paramVersionInfoParcel, vv paramvv)
  {
    this.a = 4;
    this.b = null;
    this.c = parama;
    this.d = paramg;
    this.e = paramacy;
    this.f = paramvp;
    this.g = null;
    this.h = paramBoolean;
    this.i = null;
    this.j = paramp;
    this.k = paramInt;
    this.l = 3;
    this.m = paramString;
    this.n = paramVersionInfoParcel;
    this.o = paramvv;
    this.p = null;
    this.q = null;
  }
  
  public AdOverlayInfoParcel(a parama, g paramg, vp paramvp, p paramp, acy paramacy, boolean paramBoolean, int paramInt, String paramString1, String paramString2, VersionInfoParcel paramVersionInfoParcel, vv paramvv)
  {
    this.a = 4;
    this.b = null;
    this.c = parama;
    this.d = paramg;
    this.e = paramacy;
    this.f = paramvp;
    this.g = paramString2;
    this.h = paramBoolean;
    this.i = paramString1;
    this.j = paramp;
    this.k = paramInt;
    this.l = 3;
    this.m = null;
    this.n = paramVersionInfoParcel;
    this.o = paramvv;
    this.p = null;
    this.q = null;
  }
  
  public AdOverlayInfoParcel(AdLauncherIntentInfoParcel paramAdLauncherIntentInfoParcel, a parama, g paramg, p paramp, VersionInfoParcel paramVersionInfoParcel)
  {
    this.a = 4;
    this.b = paramAdLauncherIntentInfoParcel;
    this.c = parama;
    this.d = paramg;
    this.e = null;
    this.f = null;
    this.g = null;
    this.h = false;
    this.i = null;
    this.j = paramp;
    this.k = -1;
    this.l = 4;
    this.m = null;
    this.n = paramVersionInfoParcel;
    this.o = null;
    this.p = null;
    this.q = null;
  }
  
  public static AdOverlayInfoParcel a(Intent paramIntent)
  {
    try
    {
      paramIntent = paramIntent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
      paramIntent.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
      paramIntent = (AdOverlayInfoParcel)paramIntent.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
      return paramIntent;
    }
    catch (Exception paramIntent) {}
    return null;
  }
  
  public static void a(Intent paramIntent, AdOverlayInfoParcel paramAdOverlayInfoParcel)
  {
    Bundle localBundle = new Bundle(1);
    localBundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", paramAdOverlayInfoParcel);
    paramIntent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", localBundle);
  }
  
  IBinder a()
  {
    return com.google.android.gms.c.f.a(this.c).asBinder();
  }
  
  IBinder b()
  {
    return com.google.android.gms.c.f.a(this.d).asBinder();
  }
  
  IBinder c()
  {
    return com.google.android.gms.c.f.a(this.e).asBinder();
  }
  
  IBinder d()
  {
    return com.google.android.gms.c.f.a(this.f).asBinder();
  }
  
  IBinder e()
  {
    return com.google.android.gms.c.f.a(this.o).asBinder();
  }
  
  IBinder f()
  {
    return com.google.android.gms.c.f.a(this.j).asBinder();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    f.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */