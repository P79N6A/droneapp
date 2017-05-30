package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.safebrowsing.SafeBrowsingConfigParcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class h implements Creator<AdResponseParcel> {
    static void a(AdResponseParcel adResponseParcel, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, adResponseParcel.a);
        b.a(parcel, 2, adResponseParcel.b, false);
        b.a(parcel, 3, adResponseParcel.c, false);
        b.b(parcel, 4, adResponseParcel.d, false);
        b.a(parcel, 5, adResponseParcel.e);
        b.b(parcel, 6, adResponseParcel.f, false);
        b.a(parcel, 7, adResponseParcel.g);
        b.a(parcel, 8, adResponseParcel.h);
        b.a(parcel, 9, adResponseParcel.i);
        b.b(parcel, 10, adResponseParcel.j, false);
        b.a(parcel, 11, adResponseParcel.k);
        b.a(parcel, 12, adResponseParcel.l);
        b.a(parcel, 13, adResponseParcel.m, false);
        b.a(parcel, 14, adResponseParcel.n);
        b.a(parcel, 15, adResponseParcel.o, false);
        b.a(parcel, 18, adResponseParcel.p);
        b.a(parcel, 19, adResponseParcel.q, false);
        b.a(parcel, 21, adResponseParcel.r, false);
        b.a(parcel, 22, adResponseParcel.s);
        b.a(parcel, 23, adResponseParcel.t);
        b.a(parcel, 24, adResponseParcel.u);
        b.a(parcel, 25, adResponseParcel.v);
        b.a(parcel, 26, adResponseParcel.w);
        b.a(parcel, 28, adResponseParcel.x, i, false);
        b.a(parcel, 29, adResponseParcel.y, false);
        b.a(parcel, 30, adResponseParcel.z, false);
        b.a(parcel, 31, adResponseParcel.A);
        b.a(parcel, 32, adResponseParcel.B);
        b.a(parcel, 33, adResponseParcel.C, i, false);
        b.b(parcel, 34, adResponseParcel.D, false);
        b.b(parcel, 35, adResponseParcel.E, false);
        b.a(parcel, 36, adResponseParcel.F);
        b.a(parcel, 37, adResponseParcel.G, i, false);
        b.a(parcel, 38, adResponseParcel.H);
        b.a(parcel, 39, adResponseParcel.I, false);
        b.b(parcel, 40, adResponseParcel.J, false);
        b.a(parcel, 42, adResponseParcel.K);
        b.a(parcel, 43, adResponseParcel.L, false);
        b.a(parcel, 44, adResponseParcel.M, i, false);
        b.a(parcel, 45, adResponseParcel.N, false);
        b.a(parcel, a);
    }

    public AdResponseParcel a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        List list = null;
        int i2 = 0;
        List list2 = null;
        long j = 0;
        boolean z = false;
        long j2 = 0;
        List list3 = null;
        long j3 = 0;
        int i3 = 0;
        String str3 = null;
        long j4 = 0;
        String str4 = null;
        boolean z2 = false;
        String str5 = null;
        String str6 = null;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        LargeParcelTeleporter largeParcelTeleporter = null;
        String str7 = null;
        String str8 = null;
        boolean z8 = false;
        boolean z9 = false;
        RewardItemParcel rewardItemParcel = null;
        List list4 = null;
        List list5 = null;
        boolean z10 = false;
        AutoClickProtectionConfigurationParcel autoClickProtectionConfigurationParcel = null;
        boolean z11 = false;
        String str9 = null;
        List list6 = null;
        boolean z12 = false;
        String str10 = null;
        SafeBrowsingConfigParcel safeBrowsingConfigParcel = null;
        String str11 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str = a.q(parcel, a);
                    break;
                case 3:
                    str2 = a.q(parcel, a);
                    break;
                case 4:
                    list = a.E(parcel, a);
                    break;
                case 5:
                    i2 = a.g(parcel, a);
                    break;
                case 6:
                    list2 = a.E(parcel, a);
                    break;
                case 7:
                    j = a.i(parcel, a);
                    break;
                case 8:
                    z = a.c(parcel, a);
                    break;
                case 9:
                    j2 = a.i(parcel, a);
                    break;
                case 10:
                    list3 = a.E(parcel, a);
                    break;
                case 11:
                    j3 = a.i(parcel, a);
                    break;
                case 12:
                    i3 = a.g(parcel, a);
                    break;
                case 13:
                    str3 = a.q(parcel, a);
                    break;
                case 14:
                    j4 = a.i(parcel, a);
                    break;
                case 15:
                    str4 = a.q(parcel, a);
                    break;
                case 18:
                    z2 = a.c(parcel, a);
                    break;
                case 19:
                    str5 = a.q(parcel, a);
                    break;
                case 21:
                    str6 = a.q(parcel, a);
                    break;
                case 22:
                    z3 = a.c(parcel, a);
                    break;
                case 23:
                    z4 = a.c(parcel, a);
                    break;
                case 24:
                    z5 = a.c(parcel, a);
                    break;
                case 25:
                    z6 = a.c(parcel, a);
                    break;
                case 26:
                    z7 = a.c(parcel, a);
                    break;
                case 28:
                    largeParcelTeleporter = (LargeParcelTeleporter) a.a(parcel, a, LargeParcelTeleporter.CREATOR);
                    break;
                case 29:
                    str7 = a.q(parcel, a);
                    break;
                case 30:
                    str8 = a.q(parcel, a);
                    break;
                case 31:
                    z8 = a.c(parcel, a);
                    break;
                case 32:
                    z9 = a.c(parcel, a);
                    break;
                case 33:
                    rewardItemParcel = (RewardItemParcel) a.a(parcel, a, (Creator) RewardItemParcel.CREATOR);
                    break;
                case 34:
                    list4 = a.E(parcel, a);
                    break;
                case 35:
                    list5 = a.E(parcel, a);
                    break;
                case 36:
                    z10 = a.c(parcel, a);
                    break;
                case 37:
                    autoClickProtectionConfigurationParcel = (AutoClickProtectionConfigurationParcel) a.a(parcel, a, (Creator) AutoClickProtectionConfigurationParcel.CREATOR);
                    break;
                case 38:
                    z11 = a.c(parcel, a);
                    break;
                case 39:
                    str9 = a.q(parcel, a);
                    break;
                case 40:
                    list6 = a.E(parcel, a);
                    break;
                case 42:
                    z12 = a.c(parcel, a);
                    break;
                case 43:
                    str10 = a.q(parcel, a);
                    break;
                case 44:
                    safeBrowsingConfigParcel = (SafeBrowsingConfigParcel) a.a(parcel, a, (Creator) SafeBrowsingConfigParcel.CREATOR);
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
            return new AdResponseParcel(i, str, str2, list, i2, list2, j, z, j2, list3, j3, i3, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, largeParcelTeleporter, str7, str8, z8, z9, rewardItemParcel, list4, list5, z10, autoClickProtectionConfigurationParcel, z11, str9, list6, z12, str10, safeBrowsingConfigParcel, str11);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public AdResponseParcel[] a(int i) {
        return new AdResponseParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
