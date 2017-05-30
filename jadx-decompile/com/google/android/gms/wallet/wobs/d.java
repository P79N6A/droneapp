package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class d implements Creator<LoyaltyPointsBalance> {
    static void a(LoyaltyPointsBalance loyaltyPointsBalance, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, loyaltyPointsBalance.a());
        b.a(parcel, 2, loyaltyPointsBalance.a);
        b.a(parcel, 3, loyaltyPointsBalance.b, false);
        b.a(parcel, 4, loyaltyPointsBalance.c);
        b.a(parcel, 5, loyaltyPointsBalance.d, false);
        b.a(parcel, 6, loyaltyPointsBalance.e);
        b.a(parcel, 7, loyaltyPointsBalance.f);
        b.a(parcel, a);
    }

    public LoyaltyPointsBalance a(Parcel parcel) {
        String str = null;
        int i = 0;
        int b = a.b(parcel);
        double d = 0.0d;
        long j = 0;
        int i2 = -1;
        String str2 = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i3 = a.g(parcel, a);
                    break;
                case 2:
                    i = a.g(parcel, a);
                    break;
                case 3:
                    str2 = a.q(parcel, a);
                    break;
                case 4:
                    d = a.n(parcel, a);
                    break;
                case 5:
                    str = a.q(parcel, a);
                    break;
                case 6:
                    j = a.i(parcel, a);
                    break;
                case 7:
                    i2 = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LoyaltyPointsBalance(i3, i, str2, d, str, j, i2);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public LoyaltyPointsBalance[] a(int i) {
        return new LoyaltyPointsBalance[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
