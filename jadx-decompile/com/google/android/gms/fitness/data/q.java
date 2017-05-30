package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class q implements Creator<DataUpdateNotification> {
    static void a(DataUpdateNotification dataUpdateNotification, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, dataUpdateNotification.a());
        b.a(parcel, 2, dataUpdateNotification.b());
        b.a(parcel, 3, dataUpdateNotification.c());
        b.a(parcel, 4, dataUpdateNotification.d(), i, false);
        b.a(parcel, 5, dataUpdateNotification.e(), i, false);
        b.a(parcel, 1000, dataUpdateNotification.f);
        b.a(parcel, a);
    }

    public DataUpdateNotification a(Parcel parcel) {
        long j = 0;
        DataType dataType = null;
        int i = 0;
        int b = a.b(parcel);
        DataSource dataSource = null;
        long j2 = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    j2 = a.i(parcel, a);
                    break;
                case 2:
                    j = a.i(parcel, a);
                    break;
                case 3:
                    i = a.g(parcel, a);
                    break;
                case 4:
                    dataSource = (DataSource) a.a(parcel, a, DataSource.CREATOR);
                    break;
                case 5:
                    dataType = (DataType) a.a(parcel, a, DataType.CREATOR);
                    break;
                case 1000:
                    i2 = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new DataUpdateNotification(i2, j2, j, i, dataSource, dataType);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public DataUpdateNotification[] a(int i) {
        return new DataUpdateNotification[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
