package com.google.android.gms.ads.internal.purchase;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public class a implements Creator<GInAppPurchaseManagerInfoParcel> {
    static void a(GInAppPurchaseManagerInfoParcel gInAppPurchaseManagerInfoParcel, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, gInAppPurchaseManagerInfoParcel.a);
        b.a(parcel, 3, gInAppPurchaseManagerInfoParcel.b(), false);
        b.a(parcel, 4, gInAppPurchaseManagerInfoParcel.c(), false);
        b.a(parcel, 5, gInAppPurchaseManagerInfoParcel.d(), false);
        b.a(parcel, 6, gInAppPurchaseManagerInfoParcel.a(), false);
        b.a(parcel, a);
    }

    public GInAppPurchaseManagerInfoParcel a(Parcel parcel) {
        IBinder iBinder = null;
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                case 3:
                    iBinder4 = com.google.android.gms.common.internal.safeparcel.a.r(parcel, a);
                    break;
                case 4:
                    iBinder3 = com.google.android.gms.common.internal.safeparcel.a.r(parcel, a);
                    break;
                case 5:
                    iBinder2 = com.google.android.gms.common.internal.safeparcel.a.r(parcel, a);
                    break;
                case 6:
                    iBinder = com.google.android.gms.common.internal.safeparcel.a.r(parcel, a);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GInAppPurchaseManagerInfoParcel(i, iBinder4, iBinder3, iBinder2, iBinder);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + b, parcel);
    }

    public GInAppPurchaseManagerInfoParcel[] a(int i) {
        return new GInAppPurchaseManagerInfoParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
