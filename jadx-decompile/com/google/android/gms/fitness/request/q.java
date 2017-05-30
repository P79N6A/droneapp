package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.DataType;

public class q implements Creator<DailyTotalRequest> {
    static void a(DailyTotalRequest dailyTotalRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, dailyTotalRequest.d(), false);
        b.a(parcel, 2, dailyTotalRequest.b(), i, false);
        b.a(parcel, 4, dailyTotalRequest.c());
        b.a(parcel, 1000, dailyTotalRequest.a());
        b.a(parcel, a);
    }

    public DailyTotalRequest a(Parcel parcel) {
        DataType dataType = null;
        boolean z = false;
        int b = a.b(parcel);
        IBinder iBinder = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int i2;
            IBinder r;
            boolean z2;
            DataType dataType2;
            int a = a.a(parcel);
            boolean z3;
            switch (a.a(a)) {
                case 1:
                    i2 = i;
                    DataType dataType3 = dataType;
                    r = a.r(parcel, a);
                    z2 = z;
                    dataType2 = dataType3;
                    break;
                case 2:
                    r = iBinder;
                    i2 = i;
                    z3 = z;
                    dataType2 = (DataType) a.a(parcel, a, DataType.CREATOR);
                    z2 = z3;
                    break;
                case 4:
                    z2 = a.c(parcel, a);
                    dataType2 = dataType;
                    r = iBinder;
                    i2 = i;
                    break;
                case 1000:
                    z3 = z;
                    dataType2 = dataType;
                    r = iBinder;
                    i2 = a.g(parcel, a);
                    z2 = z3;
                    break;
                default:
                    a.b(parcel, a);
                    z2 = z;
                    dataType2 = dataType;
                    r = iBinder;
                    i2 = i;
                    break;
            }
            i = i2;
            iBinder = r;
            dataType = dataType2;
            z = z2;
        }
        if (parcel.dataPosition() == b) {
            return new DailyTotalRequest(i, iBinder, dataType, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public DailyTotalRequest[] a(int i) {
        return new DailyTotalRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
