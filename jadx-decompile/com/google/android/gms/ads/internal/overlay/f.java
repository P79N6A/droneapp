package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class f implements Creator<AdOverlayInfoParcel> {
    static void a(AdOverlayInfoParcel adOverlayInfoParcel, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, adOverlayInfoParcel.a);
        b.a(parcel, 2, adOverlayInfoParcel.b, i, false);
        b.a(parcel, 3, adOverlayInfoParcel.a(), false);
        b.a(parcel, 4, adOverlayInfoParcel.b(), false);
        b.a(parcel, 5, adOverlayInfoParcel.c(), false);
        b.a(parcel, 6, adOverlayInfoParcel.d(), false);
        b.a(parcel, 7, adOverlayInfoParcel.g, false);
        b.a(parcel, 8, adOverlayInfoParcel.h);
        b.a(parcel, 9, adOverlayInfoParcel.i, false);
        b.a(parcel, 10, adOverlayInfoParcel.f(), false);
        b.a(parcel, 11, adOverlayInfoParcel.k);
        b.a(parcel, 12, adOverlayInfoParcel.l);
        b.a(parcel, 13, adOverlayInfoParcel.m, false);
        b.a(parcel, 14, adOverlayInfoParcel.n, i, false);
        b.a(parcel, 15, adOverlayInfoParcel.e(), false);
        b.a(parcel, 16, adOverlayInfoParcel.p, false);
        b.a(parcel, 17, adOverlayInfoParcel.q, i, false);
        b.a(parcel, a);
    }

    public AdOverlayInfoParcel a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        AdLauncherIntentInfoParcel adLauncherIntentInfoParcel = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        boolean z = false;
        String str2 = null;
        IBinder iBinder5 = null;
        int i2 = 0;
        int i3 = 0;
        String str3 = null;
        VersionInfoParcel versionInfoParcel = null;
        IBinder iBinder6 = null;
        String str4 = null;
        InterstitialAdParameterParcel interstitialAdParameterParcel = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    adLauncherIntentInfoParcel = (AdLauncherIntentInfoParcel) a.a(parcel, a, AdLauncherIntentInfoParcel.CREATOR);
                    break;
                case 3:
                    iBinder = a.r(parcel, a);
                    break;
                case 4:
                    iBinder2 = a.r(parcel, a);
                    break;
                case 5:
                    iBinder3 = a.r(parcel, a);
                    break;
                case 6:
                    iBinder4 = a.r(parcel, a);
                    break;
                case 7:
                    str = a.q(parcel, a);
                    break;
                case 8:
                    z = a.c(parcel, a);
                    break;
                case 9:
                    str2 = a.q(parcel, a);
                    break;
                case 10:
                    iBinder5 = a.r(parcel, a);
                    break;
                case 11:
                    i2 = a.g(parcel, a);
                    break;
                case 12:
                    i3 = a.g(parcel, a);
                    break;
                case 13:
                    str3 = a.q(parcel, a);
                    break;
                case 14:
                    versionInfoParcel = (VersionInfoParcel) a.a(parcel, a, (Creator) VersionInfoParcel.CREATOR);
                    break;
                case 15:
                    iBinder6 = a.r(parcel, a);
                    break;
                case 16:
                    str4 = a.q(parcel, a);
                    break;
                case 17:
                    interstitialAdParameterParcel = (InterstitialAdParameterParcel) a.a(parcel, a, (Creator) InterstitialAdParameterParcel.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AdOverlayInfoParcel(i, adLauncherIntentInfoParcel, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i2, i3, str3, versionInfoParcel, iBinder6, str4, interstitialAdParameterParcel);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public AdOverlayInfoParcel[] a(int i) {
        return new AdOverlayInfoParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
