package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class n implements Creator<QueryResultEventParcelable> {
    static void a(QueryResultEventParcelable queryResultEventParcelable, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, queryResultEventParcelable.a);
        b.a(parcel, 2, queryResultEventParcelable.b, i, false);
        b.a(parcel, 3, queryResultEventParcelable.c);
        b.a(parcel, 4, queryResultEventParcelable.d);
        b.a(parcel, a);
    }

    public QueryResultEventParcelable a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        DataHolder dataHolder = null;
        boolean z = false;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            boolean z2;
            DataHolder dataHolder2;
            int g;
            int a = a.a(parcel);
            int i3;
            switch (a.a(a)) {
                case 1:
                    i3 = i;
                    z2 = z;
                    dataHolder2 = dataHolder;
                    g = a.g(parcel, a);
                    a = i3;
                    break;
                case 2:
                    g = i2;
                    boolean z3 = z;
                    dataHolder2 = (DataHolder) a.a(parcel, a, DataHolder.CREATOR);
                    a = i;
                    z2 = z3;
                    break;
                case 3:
                    dataHolder2 = dataHolder;
                    g = i2;
                    i3 = i;
                    z2 = a.c(parcel, a);
                    a = i3;
                    break;
                case 4:
                    a = a.g(parcel, a);
                    z2 = z;
                    dataHolder2 = dataHolder;
                    g = i2;
                    break;
                default:
                    a.b(parcel, a);
                    a = i;
                    z2 = z;
                    dataHolder2 = dataHolder;
                    g = i2;
                    break;
            }
            i2 = g;
            dataHolder = dataHolder2;
            z = z2;
            i = a;
        }
        if (parcel.dataPosition() == b) {
            return new QueryResultEventParcelable(i2, dataHolder, z, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public QueryResultEventParcelable[] a(int i) {
        return new QueryResultEventParcelable[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
