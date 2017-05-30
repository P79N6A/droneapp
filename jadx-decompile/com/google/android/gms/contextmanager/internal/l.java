package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.contextmanager.internal.KeyFilterImpl.Inclusion;
import java.util.ArrayList;

public class l implements Creator<KeyFilterImpl> {
    static void a(KeyFilterImpl keyFilterImpl, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, keyFilterImpl.a());
        b.c(parcel, 2, keyFilterImpl.b(), false);
        b.a(parcel, a);
    }

    public KeyFilterImpl a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    arrayList = a.c(parcel, a, Inclusion.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new KeyFilterImpl(i, arrayList);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public KeyFilterImpl[] a(int i) {
        return new KeyFilterImpl[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
