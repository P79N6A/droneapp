package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.wearable.ConnectionConfiguration;

public class p implements Creator<GetConfigResponse> {
    static void a(GetConfigResponse getConfigResponse, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, getConfigResponse.a);
        b.a(parcel, 2, getConfigResponse.b);
        b.a(parcel, 3, getConfigResponse.c, i, false);
        b.a(parcel, a);
    }

    public GetConfigResponse a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        ConnectionConfiguration connectionConfiguration = null;
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
                    connectionConfiguration = (ConnectionConfiguration) a.a(parcel, a, ConnectionConfiguration.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GetConfigResponse(i2, i, connectionConfiguration);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public GetConfigResponse[] a(int i) {
        return new GetConfigResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
