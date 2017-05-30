package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public class a implements Creator<NearbyDevice> {
    static void a(NearbyDevice nearbyDevice, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, nearbyDevice.c, i, false);
        b.a(parcel, 2, nearbyDevice.d, false);
        b.a(parcel, 3, nearbyDevice.a(), false);
        b.a(parcel, 4, nearbyDevice.e, i, false);
        b.a(parcel, 5, nearbyDevice.f, false);
        b.a(parcel, 1000, nearbyDevice.b);
        b.a(parcel, a);
    }

    public NearbyDevice a(Parcel parcel) {
        String[] strArr = null;
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        NearbyDeviceId[] nearbyDeviceIdArr = null;
        String str = null;
        String str2 = null;
        NearbyDeviceId nearbyDeviceId = null;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    nearbyDeviceId = (NearbyDeviceId) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, NearbyDeviceId.CREATOR);
                    break;
                case 2:
                    str2 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 3:
                    str = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 4:
                    nearbyDeviceIdArr = (NearbyDeviceId[]) com.google.android.gms.common.internal.safeparcel.a.b(parcel, a, NearbyDeviceId.CREATOR);
                    break;
                case 5:
                    strArr = com.google.android.gms.common.internal.safeparcel.a.C(parcel, a);
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
            return new NearbyDevice(i, nearbyDeviceId, str2, str, nearbyDeviceIdArr, strArr);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + b, parcel);
    }

    public NearbyDevice[] a(int i) {
        return new NearbyDevice[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
