package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.contextmanager.fence.internal.FenceQueryRequestImpl.QueryFenceOperation;

public class h implements Creator<FenceQueryRequestImpl> {
    static void a(FenceQueryRequestImpl fenceQueryRequestImpl, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, fenceQueryRequestImpl.b());
        b.a(parcel, 2, fenceQueryRequestImpl.c(), i, false);
        b.a(parcel, a);
    }

    public FenceQueryRequestImpl a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        QueryFenceOperation queryFenceOperation = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    queryFenceOperation = (QueryFenceOperation) a.a(parcel, a, QueryFenceOperation.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new FenceQueryRequestImpl(i, queryFenceOperation);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public FenceQueryRequestImpl[] a(int i) {
        return new FenceQueryRequestImpl[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
