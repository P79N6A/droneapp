package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class r implements Creator<ParcelableIndexReference> {
    static void a(ParcelableIndexReference parcelableIndexReference, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, parcelableIndexReference.a);
        b.a(parcel, 2, parcelableIndexReference.b, false);
        b.a(parcel, 3, parcelableIndexReference.c);
        b.a(parcel, 4, parcelableIndexReference.d);
        b.a(parcel, 5, parcelableIndexReference.e);
        b.a(parcel, a);
    }

    public ParcelableIndexReference a(Parcel parcel) {
        boolean z = false;
        int b = a.b(parcel);
        String str = null;
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i3 = a.g(parcel, a);
                    break;
                case 2:
                    str = a.q(parcel, a);
                    break;
                case 3:
                    i2 = a.g(parcel, a);
                    break;
                case 4:
                    z = a.c(parcel, a);
                    break;
                case 5:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ParcelableIndexReference(i3, str, i2, z, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ParcelableIndexReference[] a(int i) {
        return new ParcelableIndexReference[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
