package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class ah implements Creator<ParcelablePayload> {
    static void a(ParcelablePayload parcelablePayload, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, parcelablePayload.a());
        b.a(parcel, 2, parcelablePayload.b());
        b.a(parcel, 3, parcelablePayload.c(), false);
        b.a(parcel, 4, parcelablePayload.d(), i, false);
        b.a(parcel, 1000, parcelablePayload.a);
        b.a(parcel, a);
    }

    public ParcelablePayload a(Parcel parcel) {
        ParcelFileDescriptor parcelFileDescriptor = null;
        int i = 0;
        int b = a.b(parcel);
        long j = 0;
        byte[] bArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    j = a.i(parcel, a);
                    break;
                case 2:
                    i = a.g(parcel, a);
                    break;
                case 3:
                    bArr = a.t(parcel, a);
                    break;
                case 4:
                    parcelFileDescriptor = (ParcelFileDescriptor) a.a(parcel, a, ParcelFileDescriptor.CREATOR);
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
            return new ParcelablePayload(i2, j, i, bArr, parcelFileDescriptor);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ParcelablePayload[] a(int i) {
        return new ParcelablePayload[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
