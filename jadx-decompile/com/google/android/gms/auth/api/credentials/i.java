package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class i implements Creator<PasswordSpecification> {
    static void a(PasswordSpecification passwordSpecification, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, passwordSpecification.d, false);
        b.b(parcel, 2, passwordSpecification.e, false);
        b.a(parcel, 3, passwordSpecification.f, false);
        b.a(parcel, 4, passwordSpecification.g);
        b.a(parcel, 5, passwordSpecification.h);
        b.a(parcel, 1000, passwordSpecification.c);
        b.a(parcel, a);
    }

    public PasswordSpecification a(Parcel parcel) {
        List list = null;
        int i = 0;
        int b = a.b(parcel);
        int i2 = 0;
        List list2 = null;
        String str = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str = a.q(parcel, a);
                    break;
                case 2:
                    list2 = a.E(parcel, a);
                    break;
                case 3:
                    list = a.D(parcel, a);
                    break;
                case 4:
                    i2 = a.g(parcel, a);
                    break;
                case 5:
                    i = a.g(parcel, a);
                    break;
                case 1000:
                    i3 = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PasswordSpecification(i3, str, list2, list, i2, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public PasswordSpecification[] a(int i) {
        return new PasswordSpecification[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
