package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public class b implements Creator<AdLauncherIntentInfoParcel> {
    static void a(AdLauncherIntentInfoParcel adLauncherIntentInfoParcel, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, adLauncherIntentInfoParcel.a);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, adLauncherIntentInfoParcel.b, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, adLauncherIntentInfoParcel.c, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, adLauncherIntentInfoParcel.d, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, adLauncherIntentInfoParcel.e, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 6, adLauncherIntentInfoParcel.f, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 7, adLauncherIntentInfoParcel.g, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 8, adLauncherIntentInfoParcel.h, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 9, adLauncherIntentInfoParcel.i, i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public AdLauncherIntentInfoParcel a(Parcel parcel) {
        Intent intent = null;
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str7 = a.q(parcel, a);
                    break;
                case 3:
                    str6 = a.q(parcel, a);
                    break;
                case 4:
                    str5 = a.q(parcel, a);
                    break;
                case 5:
                    str4 = a.q(parcel, a);
                    break;
                case 6:
                    str3 = a.q(parcel, a);
                    break;
                case 7:
                    str2 = a.q(parcel, a);
                    break;
                case 8:
                    str = a.q(parcel, a);
                    break;
                case 9:
                    intent = (Intent) a.a(parcel, a, Intent.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AdLauncherIntentInfoParcel(i, str7, str6, str5, str4, str3, str2, str, intent);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public AdLauncherIntentInfoParcel[] a(int i) {
        return new AdLauncherIntentInfoParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
