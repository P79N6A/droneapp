package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.nearby.bootstrap.Device;

public class f implements Creator<SendDataRequest> {
    static void a(SendDataRequest sendDataRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, sendDataRequest.a(), i, false);
        b.a(parcel, 2, sendDataRequest.b(), false);
        b.a(parcel, 3, sendDataRequest.c(), false);
        b.a(parcel, 1000, sendDataRequest.a);
        b.a(parcel, a);
    }

    public SendDataRequest a(Parcel parcel) {
        IBinder iBinder = null;
        int b = a.b(parcel);
        int i = 0;
        byte[] bArr = null;
        Device device = null;
        while (parcel.dataPosition() < b) {
            int i2;
            Device device2;
            IBinder iBinder2;
            byte[] bArr2;
            int a = a.a(parcel);
            IBinder iBinder3;
            switch (a.a(a)) {
                case 1:
                    i2 = i;
                    byte[] bArr3 = bArr;
                    device2 = (Device) a.a(parcel, a, Device.CREATOR);
                    iBinder2 = iBinder;
                    bArr2 = bArr3;
                    break;
                case 2:
                    device2 = device;
                    i2 = i;
                    iBinder3 = iBinder;
                    bArr2 = a.t(parcel, a);
                    iBinder2 = iBinder3;
                    break;
                case 3:
                    iBinder2 = a.r(parcel, a);
                    bArr2 = bArr;
                    device2 = device;
                    i2 = i;
                    break;
                case 1000:
                    iBinder3 = iBinder;
                    bArr2 = bArr;
                    device2 = device;
                    i2 = a.g(parcel, a);
                    iBinder2 = iBinder3;
                    break;
                default:
                    a.b(parcel, a);
                    iBinder2 = iBinder;
                    bArr2 = bArr;
                    device2 = device;
                    i2 = i;
                    break;
            }
            i = i2;
            device = device2;
            bArr = bArr2;
            iBinder = iBinder2;
        }
        if (parcel.dataPosition() == b) {
            return new SendDataRequest(i, device, bArr, iBinder);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public SendDataRequest[] a(int i) {
        return new SendDataRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
