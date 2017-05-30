package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class ac implements Creator<MessageEventParcelable> {
    static void a(MessageEventParcelable messageEventParcelable, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, messageEventParcelable.a);
        b.a(parcel, 2, messageEventParcelable.a());
        b.a(parcel, 3, messageEventParcelable.b(), false);
        b.a(parcel, 4, messageEventParcelable.c(), false);
        b.a(parcel, 5, messageEventParcelable.d(), false);
        b.a(parcel, a);
    }

    public MessageEventParcelable a(Parcel parcel) {
        int i = 0;
        String str = null;
        int b = a.b(parcel);
        byte[] bArr = null;
        String str2 = null;
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
                    str2 = a.q(parcel, a);
                    break;
                case 4:
                    bArr = a.t(parcel, a);
                    break;
                case 5:
                    str = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new MessageEventParcelable(i2, i, str2, bArr, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public MessageEventParcelable[] a(int i) {
        return new MessageEventParcelable[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
