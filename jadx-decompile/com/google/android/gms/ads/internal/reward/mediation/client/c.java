package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class c implements Creator<RewardItemParcel> {
    static void a(RewardItemParcel rewardItemParcel, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, rewardItemParcel.a);
        b.a(parcel, 2, rewardItemParcel.b, false);
        b.a(parcel, 3, rewardItemParcel.c);
        b.a(parcel, a);
    }

    public RewardItemParcel a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    str = a.q(parcel, a);
                    break;
                case 3:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new RewardItemParcel(i2, str, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public RewardItemParcel[] a(int i) {
        return new RewardItemParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
