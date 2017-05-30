package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class h implements Creator<CountrySpecification> {
    static void a(CountrySpecification countrySpecification, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, countrySpecification.a());
        b.a(parcel, 2, countrySpecification.a, false);
        b.a(parcel, a);
    }

    public CountrySpecification a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CountrySpecification(i, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public CountrySpecification[] a(int i) {
        return new CountrySpecification[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
