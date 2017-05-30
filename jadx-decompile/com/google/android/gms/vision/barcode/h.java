package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.vision.barcode.Barcode.Email;

public class h implements Creator<Email> {
    static void a(Email email, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, email.d);
        b.a(parcel, 2, email.e);
        b.a(parcel, 3, email.f, false);
        b.a(parcel, 4, email.g, false);
        b.a(parcel, 5, email.h, false);
        b.a(parcel, a);
    }

    public Email a(Parcel parcel) {
        int i = 0;
        String str = null;
        int b = a.b(parcel);
        String str2 = null;
        String str3 = null;
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
                    str3 = a.q(parcel, a);
                    break;
                case 4:
                    str2 = a.q(parcel, a);
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
            return new Email(i2, i, str3, str2, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public Email[] a(int i) {
        return new Email[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
