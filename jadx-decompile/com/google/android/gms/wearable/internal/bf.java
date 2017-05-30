package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class bf implements Creator<ChannelEventParcelable> {
    static void a(ChannelEventParcelable channelEventParcelable, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, channelEventParcelable.a);
        b.a(parcel, 2, channelEventParcelable.b, i, false);
        b.a(parcel, 3, channelEventParcelable.c);
        b.a(parcel, 4, channelEventParcelable.d);
        b.a(parcel, 5, channelEventParcelable.e);
        b.a(parcel, a);
    }

    public ChannelEventParcelable a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        ChannelImpl channelImpl = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i4 = a.g(parcel, a);
                    break;
                case 2:
                    channelImpl = (ChannelImpl) a.a(parcel, a, ChannelImpl.CREATOR);
                    break;
                case 3:
                    i3 = a.g(parcel, a);
                    break;
                case 4:
                    i2 = a.g(parcel, a);
                    break;
                case 5:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ChannelEventParcelable(i4, channelImpl, i3, i2, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ChannelEventParcelable[] a(int i) {
        return new ChannelEventParcelable[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
