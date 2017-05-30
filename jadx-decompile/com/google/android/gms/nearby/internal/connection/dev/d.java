package com.google.android.gms.nearby.internal.connection.dev;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class d implements Creator<SendPayloadParams> {
    static void a(SendPayloadParams sendPayloadParams, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, sendPayloadParams.a(), false);
        b.a(parcel, 2, sendPayloadParams.b(), false);
        b.a(parcel, 3, sendPayloadParams.c(), i, false);
        b.a(parcel, 4, sendPayloadParams.d());
        b.a(parcel, 1000, sendPayloadParams.a);
        b.a(parcel, a);
    }

    public SendPayloadParams a(Parcel parcel) {
        boolean z = false;
        ParcelablePayload parcelablePayload = null;
        int b = a.b(parcel);
        String[] strArr = null;
        IBinder iBinder = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    iBinder = a.r(parcel, a);
                    break;
                case 2:
                    strArr = a.C(parcel, a);
                    break;
                case 3:
                    parcelablePayload = (ParcelablePayload) a.a(parcel, a, ParcelablePayload.CREATOR);
                    break;
                case 4:
                    z = a.c(parcel, a);
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
            return new SendPayloadParams(i, iBinder, strArr, parcelablePayload, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public SendPayloadParams[] a(int i) {
        return new SendPayloadParams[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
