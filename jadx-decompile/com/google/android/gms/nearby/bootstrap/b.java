package com.google.android.gms.nearby.bootstrap;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public class b implements Creator<Device> {
    static void a(Device device, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, device.a(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, device.b(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, device.c(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, device.d());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1000, device.a);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public Device a(Parcel parcel) {
        byte b = (byte) 0;
        String str = null;
        int b2 = a.b(parcel);
        String str2 = null;
        String str3 = null;
        int i = 0;
        while (parcel.dataPosition() < b2) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str3 = a.q(parcel, a);
                    break;
                case 2:
                    str2 = a.q(parcel, a);
                    break;
                case 3:
                    str = a.q(parcel, a);
                    break;
                case 4:
                    b = a.e(parcel, a);
                    break;
                case 1000:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b2) {
            return new Device(i, str3, str2, str, b);
        }
        throw new a.a("Overread allowed size end=" + b2, parcel);
    }

    public Device[] a(int i) {
        return new Device[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
