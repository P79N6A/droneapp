package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.contextmanager.internal.RelationFilterImpl.Inclusion;
import java.util.ArrayList;

public class o implements Creator<RelationFilterImpl> {
    static void a(RelationFilterImpl relationFilterImpl, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, relationFilterImpl.a());
        b.c(parcel, 2, relationFilterImpl.b(), false);
        b.a(parcel, 3, relationFilterImpl.c(), i, false);
        b.a(parcel, a);
    }

    public RelationFilterImpl a(Parcel parcel) {
        QueryFilterParameters queryFilterParameters = null;
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
                case 3:
                    queryFilterParameters = (QueryFilterParameters) a.a(parcel, a, QueryFilterParameters.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new RelationFilterImpl(i, arrayList, queryFilterParameters);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public RelationFilterImpl[] a(int i) {
        return new RelationFilterImpl[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
