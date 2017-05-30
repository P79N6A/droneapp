package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class af implements Creator<OpenChannelResponse> {
    static void a(OpenChannelResponse openChannelResponse, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, openChannelResponse.a);
        b.a(parcel, 2, openChannelResponse.b);
        b.a(parcel, 3, openChannelResponse.c, i, false);
        b.a(parcel, a);
    }

    public OpenChannelResponse a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        ChannelImpl channelImpl = null;
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
                    channelImpl = (ChannelImpl) a.a(parcel, a, ChannelImpl.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new OpenChannelResponse(i2, i, channelImpl);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public OpenChannelResponse[] a(int i) {
        return new OpenChannelResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
