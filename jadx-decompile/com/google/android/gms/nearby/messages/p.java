package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.nearby.messages.devices.NearbyDeviceFilter;
import com.google.android.gms.nearby.messages.internal.MessageType;
import java.util.List;

public class p implements Creator<MessageFilter> {
    static void a(MessageFilter messageFilter, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.c(parcel, 1, messageFilter.a(), false);
        b.c(parcel, 2, messageFilter.c(), false);
        b.a(parcel, 3, messageFilter.b());
        b.a(parcel, 1000, messageFilter.b);
        b.a(parcel, a);
    }

    public MessageFilter a(Parcel parcel) {
        List list = null;
        boolean z = false;
        int b = a.b(parcel);
        List list2 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    list2 = a.c(parcel, a, MessageType.CREATOR);
                    break;
                case 2:
                    list = a.c(parcel, a, NearbyDeviceFilter.CREATOR);
                    break;
                case 3:
                    z = a.c(parcel, a);
                    break;
                case 1000:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new MessageFilter(i, list2, list, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public MessageFilter[] a(int i) {
        return new MessageFilter[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
