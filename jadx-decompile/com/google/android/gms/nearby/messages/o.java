package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;

public class o implements Creator<Message> {
    static void a(Message message, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, message.d(), false);
        b.a(parcel, 2, message.b(), false);
        b.a(parcel, 3, message.c(), false);
        b.a(parcel, 4, message.e(), i, false);
        b.a(parcel, 5, message.f());
        b.a(parcel, 1000, message.f);
        b.a(parcel, a);
    }

    public Message a(Parcel parcel) {
        NearbyDevice[] nearbyDeviceArr = null;
        int b = a.b(parcel);
        int i = 0;
        long j = 0;
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    bArr = a.t(parcel, a);
                    break;
                case 2:
                    str = a.q(parcel, a);
                    break;
                case 3:
                    str2 = a.q(parcel, a);
                    break;
                case 4:
                    nearbyDeviceArr = (NearbyDevice[]) a.b(parcel, a, NearbyDevice.CREATOR);
                    break;
                case 5:
                    j = a.i(parcel, a);
                    break;
                case 1000:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Message(i, bArr, str2, str, nearbyDeviceArr, j);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public Message[] a(int i) {
        return new Message[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
