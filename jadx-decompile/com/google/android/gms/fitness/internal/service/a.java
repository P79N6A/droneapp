package com.google.android.gms.fitness.internal.service;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.DataType;
import java.util.List;

public class a implements Creator<FitnessDataSourcesRequest> {
    static void a(FitnessDataSourcesRequest fitnessDataSourcesRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.c(parcel, 1, fitnessDataSourcesRequest.a(), false);
        b.a(parcel, 1000, fitnessDataSourcesRequest.b());
        b.a(parcel, a);
    }

    public FitnessDataSourcesRequest a(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        List list = null;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    list = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, DataType.CREATOR);
                    break;
                case 1000:
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new FitnessDataSourcesRequest(i, list);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + b, parcel);
    }

    public FitnessDataSourcesRequest[] a(int i) {
        return new FitnessDataSourcesRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
