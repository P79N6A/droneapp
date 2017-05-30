package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class e implements Creator<LoyaltyPoints> {
    static void a(LoyaltyPoints loyaltyPoints, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, loyaltyPoints.a());
        b.a(parcel, 2, loyaltyPoints.a, false);
        b.a(parcel, 3, loyaltyPoints.b, i, false);
        b.a(parcel, 4, loyaltyPoints.c, false);
        b.a(parcel, 5, loyaltyPoints.d, i, false);
        b.a(parcel, a);
    }

    public LoyaltyPoints a(Parcel parcel) {
        TimeInterval timeInterval = null;
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        LoyaltyPointsBalance loyaltyPointsBalance = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str2 = a.q(parcel, a);
                    break;
                case 3:
                    loyaltyPointsBalance = (LoyaltyPointsBalance) a.a(parcel, a, LoyaltyPointsBalance.CREATOR);
                    break;
                case 4:
                    str = a.q(parcel, a);
                    break;
                case 5:
                    timeInterval = (TimeInterval) a.a(parcel, a, TimeInterval.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LoyaltyPoints(i, str2, loyaltyPointsBalance, str, timeInterval);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public LoyaltyPoints[] a(int i) {
        return new LoyaltyPoints[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
