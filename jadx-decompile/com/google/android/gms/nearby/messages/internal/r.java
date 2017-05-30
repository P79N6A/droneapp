package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.nearby.messages.Message;

public class r implements Creator<MessageWrapper> {
    static void a(MessageWrapper messageWrapper, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, messageWrapper.b, i, false);
        b.a(parcel, 1000, messageWrapper.a);
        b.a(parcel, a);
    }

    public MessageWrapper a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        Message message = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    message = (Message) a.a(parcel, a, Message.CREATOR);
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
            return new MessageWrapper(i, message);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public MessageWrapper[] a(int i) {
        return new MessageWrapper[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
