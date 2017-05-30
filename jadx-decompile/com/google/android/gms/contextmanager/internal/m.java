package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.contextmanager.internal.KeyFilterImpl.Inclusion;

public class m implements Creator<Inclusion> {
    static void a(Inclusion inclusion, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, inclusion.a());
        b.a(parcel, 2, inclusion.b(), false);
        b.a(parcel, 3, inclusion.c(), false);
        b.a(parcel, 4, inclusion.d(), false);
        b.a(parcel, a);
    }

    public Inclusion a(Parcel parcel) {
        String[] strArr = null;
        int b = a.b(parcel);
        int i = 0;
        String[] strArr2 = null;
        String[] strArr3 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    strArr3 = a.C(parcel, a);
                    break;
                case 3:
                    strArr2 = a.C(parcel, a);
                    break;
                case 4:
                    strArr = a.C(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Inclusion(i, strArr3, strArr2, strArr);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public Inclusion[] a(int i) {
        return new Inclusion[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
