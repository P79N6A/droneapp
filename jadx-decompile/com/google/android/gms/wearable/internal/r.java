package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class r implements Creator<GetConnectedNodesResponse> {
    static void a(GetConnectedNodesResponse getConnectedNodesResponse, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, getConnectedNodesResponse.a);
        b.a(parcel, 2, getConnectedNodesResponse.b);
        b.c(parcel, 3, getConnectedNodesResponse.c, false);
        b.a(parcel, a);
    }

    public GetConnectedNodesResponse a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        List list = null;
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
                    list = a.c(parcel, a, NodeParcelable.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GetConnectedNodesResponse(i2, i, list);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public GetConnectedNodesResponse[] a(int i) {
        return new GetConnectedNodesResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
