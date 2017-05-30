package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.client.a;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.vp;
import com.google.android.gms.internal.vv;

@aaa
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
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

    AdOverlayInfoParcel(int i, AdLauncherIntentInfoParcel adLauncherIntentInfoParcel, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i2, int i3, String str3, VersionInfoParcel versionInfoParcel, IBinder iBinder6, String str4, InterstitialAdParameterParcel interstitialAdParameterParcel) {
        this.a = i;
        this.b = adLauncherIntentInfoParcel;
        this.c = (a) f.a(e.a.a(iBinder));
        this.d = (g) f.a(e.a.a(iBinder2));
        this.e = (acy) f.a(e.a.a(iBinder3));
        this.f = (vp) f.a(e.a.a(iBinder4));
        this.g = str;
        this.h = z;
        this.i = str2;
        this.j = (p) f.a(e.a.a(iBinder5));
        this.k = i2;
        this.l = i3;
        this.m = str3;
        this.n = versionInfoParcel;
        this.o = (vv) f.a(e.a.a(iBinder6));
        this.p = str4;
        this.q = interstitialAdParameterParcel;
    }

    public AdOverlayInfoParcel(a aVar, g gVar, p pVar, acy com_google_android_gms_internal_acy, int i, VersionInfoParcel versionInfoParcel, String str, InterstitialAdParameterParcel interstitialAdParameterParcel) {
        this.a = 4;
        this.b = null;
        this.c = aVar;
        this.d = gVar;
        this.e = com_google_android_gms_internal_acy;
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = null;
        this.j = pVar;
        this.k = i;
        this.l = 1;
        this.m = null;
        this.n = versionInfoParcel;
        this.o = null;
        this.p = str;
        this.q = interstitialAdParameterParcel;
    }

    public AdOverlayInfoParcel(a aVar, g gVar, p pVar, acy com_google_android_gms_internal_acy, boolean z, int i, VersionInfoParcel versionInfoParcel) {
        this.a = 4;
        this.b = null;
        this.c = aVar;
        this.d = gVar;
        this.e = com_google_android_gms_internal_acy;
        this.f = null;
        this.g = null;
        this.h = z;
        this.i = null;
        this.j = pVar;
        this.k = i;
        this.l = 2;
        this.m = null;
        this.n = versionInfoParcel;
        this.o = null;
        this.p = null;
        this.q = null;
    }

    public AdOverlayInfoParcel(a aVar, g gVar, vp vpVar, p pVar, acy com_google_android_gms_internal_acy, boolean z, int i, String str, VersionInfoParcel versionInfoParcel, vv vvVar) {
        this.a = 4;
        this.b = null;
        this.c = aVar;
        this.d = gVar;
        this.e = com_google_android_gms_internal_acy;
        this.f = vpVar;
        this.g = null;
        this.h = z;
        this.i = null;
        this.j = pVar;
        this.k = i;
        this.l = 3;
        this.m = str;
        this.n = versionInfoParcel;
        this.o = vvVar;
        this.p = null;
        this.q = null;
    }

    public AdOverlayInfoParcel(a aVar, g gVar, vp vpVar, p pVar, acy com_google_android_gms_internal_acy, boolean z, int i, String str, String str2, VersionInfoParcel versionInfoParcel, vv vvVar) {
        this.a = 4;
        this.b = null;
        this.c = aVar;
        this.d = gVar;
        this.e = com_google_android_gms_internal_acy;
        this.f = vpVar;
        this.g = str2;
        this.h = z;
        this.i = str;
        this.j = pVar;
        this.k = i;
        this.l = 3;
        this.m = null;
        this.n = versionInfoParcel;
        this.o = vvVar;
        this.p = null;
        this.q = null;
    }

    public AdOverlayInfoParcel(AdLauncherIntentInfoParcel adLauncherIntentInfoParcel, a aVar, g gVar, p pVar, VersionInfoParcel versionInfoParcel) {
        this.a = 4;
        this.b = adLauncherIntentInfoParcel;
        this.c = aVar;
        this.d = gVar;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = null;
        this.j = pVar;
        this.k = -1;
        this.l = 4;
        this.m = null;
        this.n = versionInfoParcel;
        this.o = null;
        this.p = null;
        this.q = null;
    }

    public static AdOverlayInfoParcel a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e) {
            return null;
        }
    }

    public static void a(Intent intent, AdOverlayInfoParcel adOverlayInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    IBinder a() {
        return f.a(this.c).asBinder();
    }

    IBinder b() {
        return f.a(this.d).asBinder();
    }

    IBinder c() {
        return f.a(this.e).asBinder();
    }

    IBinder d() {
        return f.a(this.f).asBinder();
    }

    IBinder e() {
        return f.a(this.o).asBinder();
    }

    IBinder f() {
        return f.a(this.j).asBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        f.a(this, parcel, i);
    }
}
