package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class a implements Creator<ComparisonFilter> {
    static void a(ComparisonFilter comparisonFilter, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, comparisonFilter.a, i, false);
        b.a(parcel, 2, comparisonFilter.b, i, false);
        b.a(parcel, 1000, comparisonFilter.c);
        b.a(parcel, a);
    }

    public ComparisonFilter a(Parcel parcel) {
        MetadataBundle metadataBundle = null;
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        Operator operator = null;
        while (parcel.dataPosition() < b) {
            int i2;
            MetadataBundle metadataBundle2;
            Operator operator2;
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    i2 = i;
                    Operator operator3 = (Operator) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, Operator.CREATOR);
                    metadataBundle2 = metadataBundle;
                    operator2 = operator3;
                    break;
                case 2:
                    metadataBundle2 = (MetadataBundle) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, MetadataBundle.CREATOR);
                    operator2 = operator;
                    i2 = i;
                    break;
                case 1000:
                    MetadataBundle metadataBundle3 = metadataBundle;
                    operator2 = operator;
                    i2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    metadataBundle2 = metadataBundle3;
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    metadataBundle2 = metadataBundle;
                    operator2 = operator;
                    i2 = i;
                    break;
            }
            i = i2;
            operator = operator2;
            metadataBundle = metadataBundle2;
        }
        if (parcel.dataPosition() == b) {
            return new ComparisonFilter(i, operator, metadataBundle);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + b, parcel);
    }

    public ComparisonFilter[] a(int i) {
        return new ComparisonFilter[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
