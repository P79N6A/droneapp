package com.google.android.gms.nearby.internal.connection.dev;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.nearby.connection.dev.AdvertisingOptions;

public class e implements Creator<StartAdvertisingParams> {
    static void a(StartAdvertisingParams startAdvertisingParams, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, startAdvertisingParams.a(), false);
        b.a(parcel, 2, startAdvertisingParams.b(), false);
        b.a(parcel, 3, startAdvertisingParams.c(), false);
        b.a(parcel, 4, startAdvertisingParams.d());
        b.a(parcel, 5, startAdvertisingParams.e(), i, false);
        b.a(parcel, 1000, startAdvertisingParams.a);
        b.a(parcel, a);
    }

    public StartAdvertisingParams a(Parcel parcel) {
        AdvertisingOptions advertisingOptions = null;
        int b = a.b(parcel);
        int i = 0;
        long j = 0;
        String str = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    iBinder2 = a.r(parcel, a);
                    break;
                case 2:
                    iBinder = a.r(parcel, a);
                    break;
                case 3:
                    str = a.q(parcel, a);
                    break;
                case 4:
                    j = a.i(parcel, a);
                    break;
                case 5:
                    advertisingOptions = (AdvertisingOptions) a.a(parcel, a, AdvertisingOptions.CREATOR);
                    break;
                case 1000:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new StartAdvertisingParams(i, iBinder2, iBinder, str, j, advertisingOptions);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public StartAdvertisingParams[] a(int i) {
        return new StartAdvertisingParams[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
