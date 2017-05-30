package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.query.Query;

public class an implements Creator<QueryRequest> {
    static void a(QueryRequest queryRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, queryRequest.a);
        b.a(parcel, 2, queryRequest.b, i, false);
        b.a(parcel, a);
    }

    public QueryRequest a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        Query query = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    query = (Query) a.a(parcel, a, Query.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new QueryRequest(i, query);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public QueryRequest[] a(int i) {
        return new QueryRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
