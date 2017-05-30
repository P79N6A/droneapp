package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.Relation;
import java.util.ArrayList;

public class s implements Creator<WriteBatchImpl> {
    static void a(WriteBatchImpl writeBatchImpl, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, writeBatchImpl.a());
        b.a(parcel, 2, writeBatchImpl.b());
        b.c(parcel, 3, writeBatchImpl.c(), false);
        b.c(parcel, 4, writeBatchImpl.d(), false);
        b.c(parcel, 5, writeBatchImpl.e(), false);
        b.a(parcel, a);
    }

    public WriteBatchImpl a(Parcel parcel) {
        boolean z = false;
        ArrayList arrayList = null;
        int b = a.b(parcel);
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    z = a.c(parcel, a);
                    break;
                case 3:
                    arrayList3 = a.c(parcel, a, ContextData.CREATOR);
                    break;
                case 4:
                    arrayList2 = a.c(parcel, a, Relation.CREATOR);
                    break;
                case 5:
                    arrayList = a.c(parcel, a, Relation.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new WriteBatchImpl(i, z, arrayList3, arrayList2, arrayList);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public WriteBatchImpl[] a(int i) {
        return new WriteBatchImpl[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
