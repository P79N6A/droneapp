package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.vision.barcode.Barcode.Address;

public class b implements Creator<Address> {
    static void a(Address address, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, address.a);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, address.e);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, address.f, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public Address a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        String[] strArr = null;
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
                    strArr = a.C(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Address(i2, i, strArr);
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
