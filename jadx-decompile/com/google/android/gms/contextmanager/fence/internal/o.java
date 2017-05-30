package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.contextmanager.fence.internal.FenceQueryRequestImpl.QueryFenceOperation;
import java.util.List;

public class o implements Creator<QueryFenceOperation> {
    static void a(QueryFenceOperation queryFenceOperation, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, queryFenceOperation.c());
        b.a(parcel, 2, queryFenceOperation.a());
        b.b(parcel, 3, queryFenceOperation.b(), false);
        b.a(parcel, a);
    }

    public QueryFenceOperation a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        List list = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    i = a.g(parcel, a);
                    break;
                case 3:
                    list = a.E(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new QueryFenceOperation(i2, i, list);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public QueryFenceOperation[] a(int i) {
        return new QueryFenceOperation[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
