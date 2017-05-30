package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.vision.barcode.Barcode.PersonName;

public class j implements Creator<PersonName> {
    static void a(PersonName personName, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, personName.a);
        b.a(parcel, 2, personName.b, false);
        b.a(parcel, 3, personName.c, false);
        b.a(parcel, 4, personName.d, false);
        b.a(parcel, 5, personName.e, false);
        b.a(parcel, 6, personName.f, false);
        b.a(parcel, 7, personName.g, false);
        b.a(parcel, 8, personName.h, false);
        b.a(parcel, a);
    }

    public PersonName a(Parcel parcel) {
        String str = null;
        int b = a.b(parcel);
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str7 = a.q(parcel, a);
                    break;
                case 3:
                    str6 = a.q(parcel, a);
                    break;
                case 4:
                    str5 = a.q(parcel, a);
                    break;
                case 5:
                    str4 = a.q(parcel, a);
                    break;
                case 6:
                    str3 = a.q(parcel, a);
                    break;
                case 7:
                    str2 = a.q(parcel, a);
                    break;
                case 8:
                    str = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PersonName(i, str7, str6, str5, str4, str3, str2, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public PersonName[] a(int i) {
        return new PersonName[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
