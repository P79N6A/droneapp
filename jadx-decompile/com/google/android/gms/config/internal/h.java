package com.google.android.gms.config.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class h implements Creator<FetchConfigIpcResponse> {
    static void a(FetchConfigIpcResponse fetchConfigIpcResponse, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, fetchConfigIpcResponse.a());
        b.a(parcel, 2, fetchConfigIpcResponse.b());
        b.a(parcel, 3, fetchConfigIpcResponse.c(), i, false);
        b.a(parcel, 4, fetchConfigIpcResponse.d());
        b.a(parcel, a);
    }

    public FetchConfigIpcResponse a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        DataHolder dataHolder = null;
        long j = 0;
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
                    dataHolder = (DataHolder) a.a(parcel, a, DataHolder.CREATOR);
                    break;
                case 4:
                    j = a.i(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new FetchConfigIpcResponse(i2, i, dataHolder, j);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public FetchConfigIpcResponse[] a(int i) {
        return new FetchConfigIpcResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
