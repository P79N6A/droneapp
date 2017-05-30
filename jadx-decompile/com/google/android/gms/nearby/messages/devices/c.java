package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class c implements Creator<NearbyDeviceId> {
    static void a(NearbyDeviceId nearbyDeviceId, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, nearbyDeviceId.a());
        b.a(parcel, 2, nearbyDeviceId.c, false);
        b.a(parcel, 1000, nearbyDeviceId.b);
        b.a(parcel, a);
    }

    public NearbyDeviceId a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        byte[] bArr = null;
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
                case 1000:
                    i2 = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new NearbyDeviceId(i2, i, bArr);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public NearbyDeviceId[] a(int i) {
        return new NearbyDeviceId[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
