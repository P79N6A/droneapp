package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class af implements Creator<OnStoppedAdvertisingParams> {
    static void a(OnStoppedAdvertisingParams onStoppedAdvertisingParams, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, onStoppedAdvertisingParams.a());
        b.a(parcel, 1000, onStoppedAdvertisingParams.a);
        b.a(parcel, a);
    }

    public OnStoppedAdvertisingParams a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 1000:
                    i2 = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new OnStoppedAdvertisingParams(i2, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public OnStoppedAdvertisingParams[] a(int i) {
        return new OnStoppedAdvertisingParams[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
