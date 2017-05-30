package com.google.android.gms.nearby.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public class a implements Creator<AdvertisingOptions> {
    static void a(AdvertisingOptions advertisingOptions, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, advertisingOptions.a(), i, false);
        b.a(parcel, 2, advertisingOptions.b(), false);
        b.a(parcel, 1000, advertisingOptions.a);
        b.a(parcel, a);
    }

    public AdvertisingOptions a(Parcel parcel) {
        String str = null;
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        Strategy strategy = null;
        while (parcel.dataPosition() < b) {
            int i2;
            String str2;
            Strategy strategy2;
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    i2 = i;
                    Strategy strategy3 = (Strategy) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, Strategy.CREATOR);
                    str2 = str;
                    strategy2 = strategy3;
                    break;
                case 2:
                    str2 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    strategy2 = strategy;
                    i2 = i;
                    break;
                case 1000:
                    String str3 = str;
                    strategy2 = strategy;
                    i2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    str2 = str3;
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    str2 = str;
                    strategy2 = strategy;
                    i2 = i;
                    break;
            }
            i = i2;
            strategy = strategy2;
            str = str2;
        }
        if (parcel.dataPosition() == b) {
            return new AdvertisingOptions(i, strategy, str);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + b, parcel);
    }

    public AdvertisingOptions[] a(int i) {
        return new AdvertisingOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
