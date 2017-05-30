package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;
import java.util.List;

public class k implements Creator<LogicalFilter> {
    static void a(LogicalFilter logicalFilter, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, logicalFilter.a, i, false);
        b.c(parcel, 2, logicalFilter.b, false);
        b.a(parcel, 1000, logicalFilter.c);
        b.a(parcel, a);
    }

    public LogicalFilter a(Parcel parcel) {
        List list = null;
        int b = a.b(parcel);
        int i = 0;
        Operator operator = null;
        while (parcel.dataPosition() < b) {
            int i2;
            Operator operator2;
            ArrayList c;
            int a = a.a(parcel);
            List list2;
            switch (a.a(a)) {
                case 1:
                    i2 = i;
                    Operator operator3 = (Operator) a.a(parcel, a, Operator.CREATOR);
                    list2 = list;
                    operator2 = operator3;
                    break;
                case 2:
                    c = a.c(parcel, a, FilterHolder.CREATOR);
                    operator2 = operator;
                    i2 = i;
                    break;
                case 1000:
                    List list3 = list;
                    operator2 = operator;
                    i2 = a.g(parcel, a);
                    list2 = list3;
                    break;
                default:
                    a.b(parcel, a);
                    c = list;
                    operator2 = operator;
                    i2 = i;
                    break;
            }
            i = i2;
            operator = operator2;
            Object obj = c;
        }
        if (parcel.dataPosition() == b) {
            return new LogicalFilter(i, operator, list);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public LogicalFilter[] a(int i) {
        return new LogicalFilter[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
