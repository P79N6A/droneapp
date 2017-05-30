package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class s implements Creator<GetDataItemResponse> {
    static void a(GetDataItemResponse getDataItemResponse, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, getDataItemResponse.a);
        b.a(parcel, 2, getDataItemResponse.b);
        b.a(parcel, 3, getDataItemResponse.c, i, false);
        b.a(parcel, a);
    }

    public GetDataItemResponse a(Parcel parcel) {
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
            return new GetDataItemResponse(i2, i, dataItemParcelable);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public GetDataItemResponse[] a(int i) {
        return new GetDataItemResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
