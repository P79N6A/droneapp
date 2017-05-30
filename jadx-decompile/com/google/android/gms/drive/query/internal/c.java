package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class c implements Creator<FieldWithSortOrder> {
    static void a(FieldWithSortOrder fieldWithSortOrder, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, fieldWithSortOrder.a, false);
        b.a(parcel, 2, fieldWithSortOrder.b);
        b.a(parcel, 1000, fieldWithSortOrder.c);
        b.a(parcel, a);
    }

    public FieldWithSortOrder a(Parcel parcel) {
        boolean z = false;
        int b = a.b(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str = a.q(parcel, a);
                    break;
                case 2:
                    z = a.c(parcel, a);
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
            return new FieldWithSortOrder(i, str, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public FieldWithSortOrder[] a(int i) {
        return new FieldWithSortOrder[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
