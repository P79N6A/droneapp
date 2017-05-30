package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class j implements Creator<GetCapabilityResponse> {
    static void a(GetCapabilityResponse getCapabilityResponse, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, getCapabilityResponse.a);
        b.a(parcel, 2, getCapabilityResponse.b);
        b.a(parcel, 3, getCapabilityResponse.c, i, false);
        b.a(parcel, a);
    }

    public GetCapabilityResponse a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        CapabilityInfoParcelable capabilityInfoParcelable = null;
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
                    capabilityInfoParcelable = (CapabilityInfoParcelable) a.a(parcel, a, CapabilityInfoParcelable.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GetCapabilityResponse(i2, i, capabilityInfoParcelable);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public GetCapabilityResponse[] a(int i) {
        return new GetCapabilityResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
