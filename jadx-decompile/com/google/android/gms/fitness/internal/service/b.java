package com.google.android.gms.fitness.internal.service;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.fitness.data.DataSource;

public class b implements Creator<FitnessUnregistrationRequest> {
    static void a(FitnessUnregistrationRequest fitnessUnregistrationRequest, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, fitnessUnregistrationRequest.a(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1000, fitnessUnregistrationRequest.b());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public FitnessUnregistrationRequest a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        DataSource dataSource = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    dataSource = (DataSource) a.a(parcel, a, DataSource.CREATOR);
                    break;
                case 1000:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new FitnessUnregistrationRequest(i, dataSource);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public FitnessUnregistrationRequest[] a(int i) {
        return new FitnessUnregistrationRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
