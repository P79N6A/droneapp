package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public class b implements Creator<NearbyDeviceFilter> {
    static void a(NearbyDeviceFilter nearbyDeviceFilter, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, nearbyDeviceFilter.b);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, nearbyDeviceFilter.c, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, nearbyDeviceFilter.d);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1000, nearbyDeviceFilter.a);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public NearbyDeviceFilter a(Parcel parcel) {
        boolean z = false;
        int b = a.b(parcel);
        byte[] bArr = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    bArr = a.t(parcel, a);
                    break;
                case 3:
                    z = a.c(parcel, a);
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
            return new NearbyDeviceFilter(i2, i, bArr, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public NearbyDeviceFilter[] a(int i) {
        return new NearbyDeviceFilter[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
