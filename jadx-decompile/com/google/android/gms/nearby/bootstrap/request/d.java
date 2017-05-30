package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.nearby.bootstrap.Device;

public class d implements Creator<DisconnectRequest> {
    static void a(DisconnectRequest disconnectRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, disconnectRequest.a(), i, false);
        b.a(parcel, 2, disconnectRequest.b(), false);
        b.a(parcel, 1000, disconnectRequest.a);
        b.a(parcel, a);
    }

    public DisconnectRequest a(Parcel parcel) {
        IBinder iBinder = null;
        int b = a.b(parcel);
        int i = 0;
        Device device = null;
        while (parcel.dataPosition() < b) {
            int i2;
            IBinder iBinder2;
            Device device2;
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = i;
                    Device device3 = (Device) a.a(parcel, a, Device.CREATOR);
                    iBinder2 = iBinder;
                    device2 = device3;
                    break;
                case 2:
                    iBinder2 = a.r(parcel, a);
                    device2 = device;
                    i2 = i;
                    break;
                case 1000:
                    IBinder iBinder3 = iBinder;
                    device2 = device;
                    i2 = a.g(parcel, a);
                    iBinder2 = iBinder3;
                    break;
                default:
                    a.b(parcel, a);
                    iBinder2 = iBinder;
                    device2 = device;
                    i2 = i;
                    break;
            }
            i = i2;
            device = device2;
            iBinder = iBinder2;
        }
        if (parcel.dataPosition() == b) {
            return new DisconnectRequest(i, device, iBinder);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public DisconnectRequest[] a(int i) {
        return new DisconnectRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
