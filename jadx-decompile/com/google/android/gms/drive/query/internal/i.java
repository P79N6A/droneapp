package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class i implements Creator<HasFilter> {
    static void a(HasFilter hasFilter, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, hasFilter.a, i, false);
        b.a(parcel, 1000, hasFilter.b);
        b.a(parcel, a);
    }

    public HasFilter a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        MetadataBundle metadataBundle = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    metadataBundle = (MetadataBundle) a.a(parcel, a, MetadataBundle.CREATOR);
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
            return new HasFilter(i, metadataBundle);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public HasFilter[] a(int i) {
        return new HasFilter[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
