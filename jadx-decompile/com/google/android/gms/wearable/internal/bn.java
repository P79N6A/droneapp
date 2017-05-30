package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class bn implements Creator<CloseChannelResponse> {
    static void a(CloseChannelResponse closeChannelResponse, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, closeChannelResponse.a);
        b.a(parcel, 2, closeChannelResponse.b);
        b.a(parcel, a);
    }

    public CloseChannelResponse a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
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
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CloseChannelResponse(i2, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public CloseChannelResponse[] a(int i) {
        return new CloseChannelResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
