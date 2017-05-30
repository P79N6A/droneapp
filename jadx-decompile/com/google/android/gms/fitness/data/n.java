package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class n implements Creator<DataSource> {
    static void a(DataSource dataSource, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, dataSource.a(), i, false);
        b.a(parcel, 2, dataSource.c(), false);
        b.a(parcel, 3, dataSource.b());
        b.a(parcel, 4, dataSource.f(), i, false);
        b.a(parcel, 5, dataSource.e(), i, false);
        b.a(parcel, 6, dataSource.g(), false);
        b.a(parcel, 1000, dataSource.k());
        b.a(parcel, 8, dataSource.h(), false);
        b.a(parcel, a);
    }

    public DataSource a(Parcel parcel) {
        int i = 0;
        int[] iArr = null;
        int b = a.b(parcel);
        String str = null;
        Application application = null;
        Device device = null;
        String str2 = null;
        DataType dataType = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    dataType = (DataType) a.a(parcel, a, DataType.CREATOR);
                    break;
                case 2:
                    str2 = a.q(parcel, a);
                    break;
                case 3:
                    i = a.g(parcel, a);
                    break;
                case 4:
                    device = (Device) a.a(parcel, a, Device.CREATOR);
                    break;
                case 5:
                    application = (Application) a.a(parcel, a, Application.CREATOR);
                    break;
                case 6:
                    str = a.q(parcel, a);
                    break;
                case 8:
                    iArr = a.w(parcel, a);
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
            return new DataSource(i2, dataType, str2, i, device, application, str, iArr);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public DataSource[] a(int i) {
        return new DataSource[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
