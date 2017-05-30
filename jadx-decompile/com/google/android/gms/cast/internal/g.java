package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class g implements Creator<DeviceStatus> {
    static void a(DeviceStatus deviceStatus, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, deviceStatus.a());
        b.a(parcel, 2, deviceStatus.b());
        b.a(parcel, 3, deviceStatus.c());
        b.a(parcel, 4, deviceStatus.d());
        b.a(parcel, 5, deviceStatus.f(), i, false);
        b.a(parcel, 6, deviceStatus.e());
        b.a(parcel, a);
    }

    public DeviceStatus a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        double d = 0.0d;
        ApplicationMetadata applicationMetadata = null;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i3 = a.g(parcel, a);
                    break;
                case 2:
                    d = a.n(parcel, a);
                    break;
                case 3:
                    z = a.c(parcel, a);
                    break;
                case 4:
                    i2 = a.g(parcel, a);
                    break;
                case 5:
                    applicationMetadata = (ApplicationMetadata) a.a(parcel, a, ApplicationMetadata.CREATOR);
                    break;
                case 6:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new DeviceStatus(i3, d, z, i2, applicationMetadata, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public DeviceStatus[] a(int i) {
        return new DeviceStatus[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
