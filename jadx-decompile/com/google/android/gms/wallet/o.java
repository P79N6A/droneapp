package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class o implements Creator<LineItem> {
    static void a(LineItem lineItem, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, lineItem.b());
        b.a(parcel, 2, lineItem.a, false);
        b.a(parcel, 3, lineItem.b, false);
        b.a(parcel, 4, lineItem.c, false);
        b.a(parcel, 5, lineItem.d, false);
        b.a(parcel, 6, lineItem.e);
        b.a(parcel, 7, lineItem.f, false);
        b.a(parcel, a);
    }

    public LineItem a(Parcel parcel) {
        int i = 0;
        String str = null;
        int b = a.b(parcel);
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    str5 = a.q(parcel, a);
                    break;
                case 3:
                    str4 = a.q(parcel, a);
                    break;
                case 4:
                    str3 = a.q(parcel, a);
                    break;
                case 5:
                    str2 = a.q(parcel, a);
                    break;
                case 6:
                    i = a.g(parcel, a);
                    break;
                case 7:
                    str = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LineItem(i2, str5, str4, str3, str2, i, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public LineItem[] a(int i) {
        return new LineItem[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
