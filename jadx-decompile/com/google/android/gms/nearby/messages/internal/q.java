package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class q implements Creator<MessageType> {
    static void a(MessageType messageType, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, messageType.b, false);
        b.a(parcel, 2, messageType.c, false);
        b.a(parcel, 1000, messageType.a);
        b.a(parcel, a);
    }

    public MessageType a(Parcel parcel) {
        String str = null;
        int b = a.b(parcel);
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str2 = a.q(parcel, a);
                    break;
                case 2:
                    str = a.q(parcel, a);
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
            return new MessageType(i, str2, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public MessageType[] a(int i) {
        return new MessageType[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
