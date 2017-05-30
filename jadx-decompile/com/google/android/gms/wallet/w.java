package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class w implements Creator<ProxyCard> {
    static void a(ProxyCard proxyCard, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, proxyCard.a());
        b.a(parcel, 2, proxyCard.a, false);
        b.a(parcel, 3, proxyCard.b, false);
        b.a(parcel, 4, proxyCard.c);
        b.a(parcel, 5, proxyCard.d);
        b.a(parcel, a);
    }

    public ProxyCard a(Parcel parcel) {
        String str = null;
        int i = 0;
        int b = a.b(parcel);
        int i2 = 0;
        String str2 = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i3 = a.g(parcel, a);
                    break;
                case 2:
                    str2 = a.q(parcel, a);
                    break;
                case 3:
                    str = a.q(parcel, a);
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
            return new ProxyCard(i3, str2, str, i2, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ProxyCard[] a(int i) {
        return new ProxyCard[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
