package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class u implements Creator<GetLocalNodeResponse> {
    static void a(GetLocalNodeResponse getLocalNodeResponse, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, getLocalNodeResponse.a);
        b.a(parcel, 2, getLocalNodeResponse.b);
        b.a(parcel, 3, getLocalNodeResponse.c, i, false);
        b.a(parcel, a);
    }

    public GetLocalNodeResponse a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        NodeParcelable nodeParcelable = null;
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
                    nodeParcelable = (NodeParcelable) a.a(parcel, a, NodeParcelable.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GetLocalNodeResponse(i2, i, nodeParcelable);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public GetLocalNodeResponse[] a(int i) {
        return new GetLocalNodeResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
