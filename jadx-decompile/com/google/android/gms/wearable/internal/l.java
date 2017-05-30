package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class l implements Creator<GetChannelOutputStreamResponse> {
    static void a(GetChannelOutputStreamResponse getChannelOutputStreamResponse, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, getChannelOutputStreamResponse.a);
        b.a(parcel, 2, getChannelOutputStreamResponse.b);
        b.a(parcel, 3, getChannelOutputStreamResponse.c, i, false);
        b.a(parcel, a);
    }

    public GetChannelOutputStreamResponse a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
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
                    parcelFileDescriptor = (ParcelFileDescriptor) a.a(parcel, a, ParcelFileDescriptor.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GetChannelOutputStreamResponse(i2, i, parcelFileDescriptor);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public GetChannelOutputStreamResponse[] a(int i) {
        return new GetChannelOutputStreamResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
