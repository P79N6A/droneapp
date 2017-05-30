package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class p implements Creator<AutocompleteFilter> {
    static void a(AutocompleteFilter autocompleteFilter, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, autocompleteFilter.h);
        b.a(parcel, 2, autocompleteFilter.i, false);
        b.a(parcel, 3, autocompleteFilter.j, false);
        b.a(parcel, 1000, autocompleteFilter.g);
        b.a(parcel, a);
    }

    public AutocompleteFilter a(Parcel parcel) {
        String str = null;
        boolean z = false;
        int b = a.b(parcel);
        List list = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    z = a.c(parcel, a);
                    break;
                case 2:
                    list = a.D(parcel, a);
                    break;
                case 3:
                    str = a.q(parcel, a);
                    break;
                case 1000:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AutocompleteFilter(i, z, list, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public AutocompleteFilter[] a(int i) {
        return new AutocompleteFilter[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
