package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class i implements Creator<GetAllCapabilitiesResponse> {
    static void a(GetAllCapabilitiesResponse getAllCapabilitiesResponse, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, getAllCapabilitiesResponse.a);
        b.a(parcel, 2, getAllCapabilitiesResponse.b);
        b.c(parcel, 3, getAllCapabilitiesResponse.c, false);
        b.a(parcel, a);
    }

    public GetAllCapabilitiesResponse a(Parcel parcel) {
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
                    list = a.c(parcel, a, CapabilityInfoParcelable.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GetAllCapabilitiesResponse(i2, i, list);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public GetAllCapabilitiesResponse[] a(int i) {
        return new GetAllCapabilitiesResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
