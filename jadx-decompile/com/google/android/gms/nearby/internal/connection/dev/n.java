package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class n implements Creator<GetLocalDeviceIdParams> {
    static void a(GetLocalDeviceIdParams getLocalDeviceIdParams, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1000, getLocalDeviceIdParams.a);
        b.a(parcel, a);
    }

    public GetLocalDeviceIdParams a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1000:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GetLocalDeviceIdParams(i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public GetLocalDeviceIdParams[] a(int i) {
        return new GetLocalDeviceIdParams[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
