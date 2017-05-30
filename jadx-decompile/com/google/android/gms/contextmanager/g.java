package com.google.android.gms.contextmanager;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class g implements Creator<Relation> {
    static void a(Relation relation, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, relation.b());
        b.a(parcel, 2, relation.c(), false);
        b.a(parcel, a);
    }

    public Relation a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    bArr = a.t(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Relation(i, bArr);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public Relation[] a(int i) {
        return new Relation[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
