package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.nearby.bootstrap.Device;

public class a implements Creator<ConnectRequest> {
    static void a(ConnectRequest connectRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, connectRequest.a(), i, false);
        b.a(parcel, 2, connectRequest.b(), false);
        b.a(parcel, 3, connectRequest.c(), false);
        b.a(parcel, 4, connectRequest.i(), false);
        b.a(parcel, 5, connectRequest.j(), false);
        b.a(parcel, 6, connectRequest.k(), false);
        b.a(parcel, 7, connectRequest.d());
        b.a(parcel, 1000, connectRequest.a);
        b.a(parcel, 8, connectRequest.e());
        b.a(parcel, 9, connectRequest.f(), false);
        b.a(parcel, 10, connectRequest.g());
        b.a(parcel, 11, connectRequest.h());
        b.a(parcel, a);
    }

    public ConnectRequest a(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        Device device = null;
        String str = null;
        String str2 = null;
        byte b2 = (byte) 0;
        long j = 0;
        String str3 = null;
        byte b3 = (byte) 0;
        byte b4 = (byte) 0;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    device = (Device) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, Device.CREATOR);
                    break;
                case 2:
                    str = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 3:
                    str2 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 4:
                    iBinder = com.google.android.gms.common.internal.safeparcel.a.r(parcel, a);
                    break;
                case 5:
                    iBinder2 = com.google.android.gms.common.internal.safeparcel.a.r(parcel, a);
                    break;
                case 6:
                    iBinder3 = com.google.android.gms.common.internal.safeparcel.a.r(parcel, a);
                    break;
                case 7:
                    b2 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, a);
                    break;
                case 8:
                    j = com.google.android.gms.common.internal.safeparcel.a.i(parcel, a);
                    break;
                case 9:
                    str3 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 10:
                    b3 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, a);
                    break;
                case 11:
                    b4 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, a);
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
            return new ConnectRequest(i, device, str, str2, b2, j, str3, b3, b4, iBinder, iBinder2, iBinder3);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + b, parcel);
    }

    public ConnectRequest[] a(int i) {
        return new ConnectRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
