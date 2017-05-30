package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class f implements Creator<Address> {
    static void a(Address address, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, address.a());
        b.a(parcel, 2, address.a, false);
        b.a(parcel, 3, address.b, false);
        b.a(parcel, 4, address.c, false);
        b.a(parcel, 5, address.d, false);
        b.a(parcel, 6, address.e, false);
        b.a(parcel, 7, address.f, false);
        b.a(parcel, 8, address.g, false);
        b.a(parcel, 9, address.h, false);
        b.a(parcel, 10, address.i, false);
        b.a(parcel, 11, address.j);
        b.a(parcel, 12, address.k, false);
        b.a(parcel, a);
    }

    public Address a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        boolean z = false;
        String str10 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str = a.q(parcel, a);
                    break;
                case 3:
                    str2 = a.q(parcel, a);
                    break;
                case 4:
                    str3 = a.q(parcel, a);
                    break;
                case 5:
                    str4 = a.q(parcel, a);
                    break;
                case 6:
                    str5 = a.q(parcel, a);
                    break;
                case 7:
                    str6 = a.q(parcel, a);
                    break;
                case 8:
                    str7 = a.q(parcel, a);
                    break;
                case 9:
                    str8 = a.q(parcel, a);
                    break;
                case 10:
                    str9 = a.q(parcel, a);
                    break;
                case 11:
                    z = a.c(parcel, a);
                    break;
                case 12:
                    str10 = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Address(i, str, str2, str3, str4, str5, str6, str7, str8, str9, z, str10);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public Address[] a(int i) {
        return new Address[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
