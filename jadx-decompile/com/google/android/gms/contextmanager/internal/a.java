package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl.Inclusion;
import java.util.ArrayList;

public class a implements Creator<ContextDataFilterImpl> {
    static void a(ContextDataFilterImpl contextDataFilterImpl, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, contextDataFilterImpl.d());
        b.c(parcel, 2, contextDataFilterImpl.a(), false);
        b.b(parcel, 3, contextDataFilterImpl.b(), false);
        b.a(parcel, 4, contextDataFilterImpl.c(), i, false);
        b.a(parcel, a);
    }

    public ContextDataFilterImpl a(Parcel parcel) {
        QueryFilterParameters queryFilterParameters = null;
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                case 2:
                    arrayList2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, Inclusion.CREATOR);
                    break;
                case 3:
                    arrayList = com.google.android.gms.common.internal.safeparcel.a.E(parcel, a);
                    break;
                case 4:
                    queryFilterParameters = (QueryFilterParameters) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, QueryFilterParameters.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ContextDataFilterImpl(i, arrayList2, arrayList, queryFilterParameters);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + b, parcel);
    }

    public ContextDataFilterImpl[] a(int i) {
        return new ContextDataFilterImpl[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
