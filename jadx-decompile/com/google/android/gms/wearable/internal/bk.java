package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class bk implements Creator<ChannelSendFileResponse> {
    static void a(ChannelSendFileResponse channelSendFileResponse, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, channelSendFileResponse.a);
        b.a(parcel, 2, channelSendFileResponse.b);
        b.a(parcel, a);
    }

    public ChannelSendFileResponse a(Parcel parcel) {
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
            return new ChannelSendFileResponse(i2, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ChannelSendFileResponse[] a(int i) {
        return new ChannelSendFileResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}