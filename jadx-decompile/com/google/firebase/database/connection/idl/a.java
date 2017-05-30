package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class a implements Creator<CompoundHashParcelable> {
    static void a(CompoundHashParcelable compoundHashParcelable, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, compoundHashParcelable.a);
        b.b(parcel, 2, compoundHashParcelable.b, false);
        b.b(parcel, 3, compoundHashParcelable.c, false);
        b.a(parcel, a);
    }

    public CompoundHashParcelable a(Parcel parcel) {
        List list = null;
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        List list2 = null;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                case 2:
                    list2 = com.google.android.gms.common.internal.safeparcel.a.E(parcel, a);
                    break;
                case 3:
                    list = com.google.android.gms.common.internal.safeparcel.a.E(parcel, a);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CompoundHashParcelable(i, list2, list);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + b, parcel);
    }

    public CompoundHashParcelable[] a(int i) {
        return new CompoundHashParcelable[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
