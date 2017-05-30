package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.wearable.ConnectionConfiguration;

public class q implements Creator<GetConfigsResponse> {
    static void a(GetConfigsResponse getConfigsResponse, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, getConfigsResponse.a);
        b.a(parcel, 2, getConfigsResponse.b);
        b.a(parcel, 3, getConfigsResponse.c, i, false);
        b.a(parcel, a);
    }

    public GetConfigsResponse a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        ConnectionConfiguration[] connectionConfigurationArr = null;
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
                    connectionConfigurationArr = (ConnectionConfiguration[]) a.b(parcel, a, ConnectionConfiguration.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GetConfigsResponse(i2, i, connectionConfigurationArr);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public GetConfigsResponse[] a(int i) {
        return new GetConfigsResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
