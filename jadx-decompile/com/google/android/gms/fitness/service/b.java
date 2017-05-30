package com.google.android.gms.fitness.service;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.fitness.data.DataSource;

public class b implements Creator<FitnessSensorServiceRequest> {
    static void a(FitnessSensorServiceRequest fitnessSensorServiceRequest, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, fitnessSensorServiceRequest.a(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, fitnessSensorServiceRequest.d(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, fitnessSensorServiceRequest.e());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, fitnessSensorServiceRequest.f());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1000, fitnessSensorServiceRequest.c());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public FitnessSensorServiceRequest a(Parcel parcel) {
        long j = 0;
        IBinder iBinder = null;
        int b = a.b(parcel);
        int i = 0;
        long j2 = 0;
        DataSource dataSource = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    dataSource = (DataSource) a.a(parcel, a, DataSource.CREATOR);
                    break;
                case 2:
                    iBinder = a.r(parcel, a);
                    break;
                case 3:
                    j2 = a.i(parcel, a);
                    break;
                case 4:
                    j = a.i(parcel, a);
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
            return new FitnessSensorServiceRequest(i, dataSource, iBinder, j2, j);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public FitnessSensorServiceRequest[] a(int i) {
        return new FitnessSensorServiceRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
