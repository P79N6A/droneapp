package com.google.android.gms.ads.internal.reward.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class h implements Creator<RewardedVideoAdRequestParcel> {
    static void a(RewardedVideoAdRequestParcel rewardedVideoAdRequestParcel, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, rewardedVideoAdRequestParcel.a);
        b.a(parcel, 2, rewardedVideoAdRequestParcel.b, i, false);
        b.a(parcel, 3, rewardedVideoAdRequestParcel.c, false);
        b.a(parcel, a);
    }

    public RewardedVideoAdRequestParcel a(Parcel parcel) {
        String str = null;
        int b = a.b(parcel);
        int i = 0;
        AdRequestParcel adRequestParcel = null;
        while (parcel.dataPosition() < b) {
            AdRequestParcel adRequestParcel2;
            int g;
            String str2;
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    String str3 = str;
                    adRequestParcel2 = adRequestParcel;
                    g = a.g(parcel, a);
                    str2 = str3;
                    break;
                case 2:
                    g = i;
                    AdRequestParcel adRequestParcel3 = (AdRequestParcel) a.a(parcel, a, AdRequestParcel.CREATOR);
                    str2 = str;
                    adRequestParcel2 = adRequestParcel3;
                    break;
                case 3:
                    str2 = a.q(parcel, a);
                    adRequestParcel2 = adRequestParcel;
                    g = i;
                    break;
                default:
                    a.b(parcel, a);
                    str2 = str;
                    adRequestParcel2 = adRequestParcel;
                    g = i;
                    break;
            }
            i = g;
            adRequestParcel = adRequestParcel2;
            str = str2;
        }
        if (parcel.dataPosition() == b) {
            return new RewardedVideoAdRequestParcel(i, adRequestParcel, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public RewardedVideoAdRequestParcel[] a(int i) {
        return new RewardedVideoAdRequestParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
