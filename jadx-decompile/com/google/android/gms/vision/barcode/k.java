package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.vision.barcode.Barcode.Phone;

public class k implements Creator<Phone> {
    static void a(Phone phone, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, phone.f);
        b.a(parcel, 2, phone.g);
        b.a(parcel, 3, phone.h, false);
        b.a(parcel, a);
    }

    public Phone a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        String str = null;
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
                    str = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Phone(i2, i, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public Phone[] a(int i) {
        return new Phone[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
