package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.firebase.appindexing.internal.Thing.Metadata;

public class h implements Creator<Metadata> {
    static void a(Metadata metadata, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, metadata.a());
        b.a(parcel, 2, metadata.b());
        b.a(parcel, 3, metadata.c(), false);
        b.a(parcel, 1000, metadata.a);
        b.a(parcel, a);
    }

    public Metadata a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        String str = null;
        boolean z = false;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    z = a.c(parcel, a);
                    break;
                case 2:
                    i = a.g(parcel, a);
                    break;
                case 3:
                    str = a.q(parcel, a);
                    break;
                case 1000:
                    i2 = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Metadata(i2, z, i, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public Metadata[] a(int i) {
        return new Metadata[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
