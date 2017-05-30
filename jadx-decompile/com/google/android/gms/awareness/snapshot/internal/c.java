package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class c implements Creator<DayAttributesImpl> {
    static void a(DayAttributesImpl dayAttributesImpl, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, dayAttributesImpl.a());
        b.a(parcel, 2, dayAttributesImpl.b(), false);
        b.a(parcel, a);
    }

    public DayAttributesImpl a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        int[] iArr = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    iArr = a.w(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new DayAttributesImpl(i, iArr);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public DayAttributesImpl[] a(int i) {
        return new DayAttributesImpl[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
