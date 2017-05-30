package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class f implements Creator<AdRequestInfoParcel> {
    static void a(AdRequestInfoParcel adRequestInfoParcel, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, adRequestInfoParcel.a);
        b.a(parcel, 2, adRequestInfoParcel.b, false);
        b.a(parcel, 3, adRequestInfoParcel.c, i, false);
        b.a(parcel, 4, adRequestInfoParcel.d, i, false);
        b.a(parcel, 5, adRequestInfoParcel.e, false);
        b.a(parcel, 6, adRequestInfoParcel.f, i, false);
        b.a(parcel, 7, adRequestInfoParcel.g, i, false);
        b.a(parcel, 8, adRequestInfoParcel.h, false);
        b.a(parcel, 9, adRequestInfoParcel.i, false);
        b.a(parcel, 10, adRequestInfoParcel.j, false);
        b.a(parcel, 11, adRequestInfoParcel.k, i, false);
        b.a(parcel, 12, adRequestInfoParcel.l, false);
        b.a(parcel, 13, adRequestInfoParcel.m);
        b.b(parcel, 14, adRequestInfoParcel.n, false);
        b.a(parcel, 15, adRequestInfoParcel.o, false);
        b.a(parcel, 16, adRequestInfoParcel.p);
        b.a(parcel, 17, adRequestInfoParcel.q, i, false);
        b.a(parcel, 18, adRequestInfoParcel.r);
        b.a(parcel, 19, adRequestInfoParcel.s);
        b.a(parcel, 20, adRequestInfoParcel.t);
        b.a(parcel, 21, adRequestInfoParcel.u, false);
        b.a(parcel, 25, adRequestInfoParcel.v);
        b.a(parcel, 26, adRequestInfoParcel.w, false);
        b.b(parcel, 27, adRequestInfoParcel.x, false);
        b.a(parcel, 28, adRequestInfoParcel.y, false);
        b.a(parcel, 29, adRequestInfoParcel.z, i, false);
        b.b(parcel, 30, adRequestInfoParcel.A, false);
        b.a(parcel, 31, adRequestInfoParcel.B);
        b.a(parcel, 32, adRequestInfoParcel.C, i, false);
        b.a(parcel, 33, adRequestInfoParcel.D, false);
        b.a(parcel, 34, adRequestInfoParcel.E);
        b.a(parcel, 35, adRequestInfoParcel.F);
        b.a(parcel, 36, adRequestInfoParcel.G);
        b.a(parcel, 37, adRequestInfoParcel.H);
        b.a(parcel, 38, adRequestInfoParcel.I);
        b.a(parcel, 39, adRequestInfoParcel.J, false);
        b.a(parcel, 40, adRequestInfoParcel.K);
        b.a(parcel, 41, adRequestInfoParcel.L, false);
        b.a(parcel, 42, adRequestInfoParcel.M);
        b.a(parcel, 43, adRequestInfoParcel.N);
        b.a(parcel, 44, adRequestInfoParcel.O, false);
        b.a(parcel, 45, adRequestInfoParcel.P, false);
        b.a(parcel, a);
    }

    public AdRequestInfoParcel a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        Bundle bundle = null;
        AdRequestParcel adRequestParcel = null;
        AdSizeParcel adSizeParcel = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        VersionInfoParcel versionInfoParcel = null;
        Bundle bundle2 = null;
        int i2 = 0;
        List list = null;
        Bundle bundle3 = null;
        boolean z = false;
        Messenger messenger = null;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        String str5 = null;
        long j = 0;
        String str6 = null;
        List list2 = null;
        String str7 = null;
        NativeAdOptionsParcel nativeAdOptionsParcel = null;
        List list3 = null;
        long j2 = 0;
        CapabilityParcel capabilityParcel = null;
        String str8 = null;
        float f2 = 0.0f;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        String str9 = null;
        String str10 = null;
        boolean z5 = false;
        int i7 = 0;
        Bundle bundle4 = null;
        String str11 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    bundle = a.s(parcel, a);
                    break;
                case 3:
                    adRequestParcel = (AdRequestParcel) a.a(parcel, a, AdRequestParcel.CREATOR);
                    break;
                case 4:
                    adSizeParcel = (AdSizeParcel) a.a(parcel, a, AdSizeParcel.CREATOR);
                    break;
                case 5:
                    str = a.q(parcel, a);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) a.a(parcel, a, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) a.a(parcel, a, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = a.q(parcel, a);
                    break;
                case 9:
                    str3 = a.q(parcel, a);
                    break;
                case 10:
                    str4 = a.q(parcel, a);
                    break;
                case 11:
                    versionInfoParcel = (VersionInfoParcel) a.a(parcel, a, VersionInfoParcel.CREATOR);
                    break;
                case 12:
                    bundle2 = a.s(parcel, a);
                    break;
                case 13:
                    i2 = a.g(parcel, a);
                    break;
                case 14:
                    list = a.E(parcel, a);
                    break;
                case 15:
                    bundle3 = a.s(parcel, a);
                    break;
                case 16:
                    z = a.c(parcel, a);
                    break;
                case 17:
                    messenger = (Messenger) a.a(parcel, a, Messenger.CREATOR);
                    break;
                case 18:
                    i3 = a.g(parcel, a);
                    break;
                case 19:
                    i4 = a.g(parcel, a);
                    break;
                case 20:
                    f = a.l(parcel, a);
                    break;
                case 21:
                    str5 = a.q(parcel, a);
                    break;
                case 25:
                    j = a.i(parcel, a);
                    break;
                case 26:
                    str6 = a.q(parcel, a);
                    break;
                case 27:
                    list2 = a.E(parcel, a);
                    break;
                case 28:
                    str7 = a.q(parcel, a);
                    break;
                case 29:
                    nativeAdOptionsParcel = (NativeAdOptionsParcel) a.a(parcel, a, (Creator) NativeAdOptionsParcel.CREATOR);
                    break;
                case 30:
                    list3 = a.E(parcel, a);
                    break;
                case 31:
                    j2 = a.i(parcel, a);
                    break;
                case 32:
                    capabilityParcel = (CapabilityParcel) a.a(parcel, a, CapabilityParcel.CREATOR);
                    break;
                case 33:
                    str8 = a.q(parcel, a);
                    break;
                case 34:
                    f2 = a.l(parcel, a);
                    break;
                case 35:
                    i5 = a.g(parcel, a);
                    break;
                case 36:
                    i6 = a.g(parcel, a);
                    break;
                case 37:
                    z3 = a.c(parcel, a);
                    break;
                case 38:
                    z4 = a.c(parcel, a);
                    break;
                case 39:
                    str9 = a.q(parcel, a);
                    break;
                case 40:
                    z2 = a.c(parcel, a);
                    break;
                case 41:
                    str10 = a.q(parcel, a);
                    break;
                case 42:
                    z5 = a.c(parcel, a);
                    break;
                case 43:
                    i7 = a.g(parcel, a);
                    break;
                case 44:
                    bundle4 = a.s(parcel, a);
                    break;
                case 45:
                    str11 = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AdRequestInfoParcel(i, bundle, adRequestParcel, adSizeParcel, str, applicationInfo, packageInfo, str2, str3, str4, versionInfoParcel, bundle2, i2, list, bundle3, z, messenger, i3, i4, f, str5, j, str6, list2, str7, nativeAdOptionsParcel, list3, j2, capabilityParcel, str8, f2, z2, i5, i6, z3, z4, str9, str10, z5, i7, bundle4, str11);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public AdRequestInfoParcel[] a(int i) {
        return new AdRequestInfoParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
