package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class ah implements Creator<PutDataResponse> {
    static void a(PutDataResponse putDataResponse, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, putDataResponse.a);
        b.a(parcel, 2, putDataResponse.b);
        b.a(parcel, 3, putDataResponse.c, i, false);
        b.a(parcel, a);
    }

    public PutDataResponse a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        DataItemParcelable dataItemParcelable = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    i = a.g(parcel, a);
                    break;
                case 3:
                    dataItemParcelable = (DataItemParcelable) a.a(parcel, a, DataItemParcelable.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PutDataResponse(i2, i, dataItemParcelable);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public PutDataResponse[] a(int i) {
        return new PutDataResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
