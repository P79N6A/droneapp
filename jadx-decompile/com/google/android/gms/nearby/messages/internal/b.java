package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.nearby.messages.Message;

public class b implements Creator<Update> {
    static void a(Update update, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, update.a);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, update.b);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, update.c, i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, update.d, i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, update.e, i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public Update a(Parcel parcel) {
        int i = 0;
        BleSignalImpl bleSignalImpl = null;
        int b = a.b(parcel);
        DistanceImpl distanceImpl = null;
        Message message = null;
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
                    message = (Message) a.a(parcel, a, Message.CREATOR);
                    break;
                case 4:
                    distanceImpl = (DistanceImpl) a.a(parcel, a, DistanceImpl.CREATOR);
                    break;
                case 5:
                    bleSignalImpl = (BleSignalImpl) a.a(parcel, a, BleSignalImpl.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Update(i2, i, message, distanceImpl, bleSignalImpl);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public Update[] a(int i) {
        return new Update[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
