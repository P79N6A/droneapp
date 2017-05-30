package com.google.android.gms.nearby.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class f implements Creator<PayloadTransferUpdate> {
    static void a(PayloadTransferUpdate payloadTransferUpdate, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, payloadTransferUpdate.a());
        b.a(parcel, 2, payloadTransferUpdate.b());
        b.a(parcel, 3, payloadTransferUpdate.c());
        b.a(parcel, 4, payloadTransferUpdate.d());
        b.a(parcel, 1000, payloadTransferUpdate.a);
        b.a(parcel, a);
    }

    public PayloadTransferUpdate a(Parcel parcel) {
        int i = 0;
        long j = 0;
        int b = a.b(parcel);
        long j2 = 0;
        long j3 = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    j3 = a.i(parcel, a);
                    break;
                case 2:
                    i = a.g(parcel, a);
                    break;
                case 3:
                    j2 = a.i(parcel, a);
                    break;
                case 4:
                    j = a.i(parcel, a);
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
            return new PayloadTransferUpdate(i2, j3, i, j2, j);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public PayloadTransferUpdate[] a(int i) {
        return new PayloadTransferUpdate[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
