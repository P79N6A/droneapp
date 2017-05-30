package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class ac implements Creator<OnPayloadReceivedParams> {
    static void a(OnPayloadReceivedParams onPayloadReceivedParams, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, onPayloadReceivedParams.a(), false);
        b.a(parcel, 2, onPayloadReceivedParams.b(), i, false);
        b.a(parcel, 3, onPayloadReceivedParams.c());
        b.a(parcel, 1000, onPayloadReceivedParams.a);
        b.a(parcel, a);
    }

    public OnPayloadReceivedParams a(Parcel parcel) {
        ParcelablePayload parcelablePayload = null;
        boolean z = false;
        int b = a.b(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int i2;
            String q;
            boolean z2;
            ParcelablePayload parcelablePayload2;
            int a = a.a(parcel);
            boolean z3;
            switch (a.a(a)) {
                case 1:
                    i2 = i;
                    ParcelablePayload parcelablePayload3 = parcelablePayload;
                    q = a.q(parcel, a);
                    z2 = z;
                    parcelablePayload2 = parcelablePayload3;
                    break;
                case 2:
                    q = str;
                    i2 = i;
                    z3 = z;
                    parcelablePayload2 = (ParcelablePayload) a.a(parcel, a, ParcelablePayload.CREATOR);
                    z2 = z3;
                    break;
                case 3:
                    z2 = a.c(parcel, a);
                    parcelablePayload2 = parcelablePayload;
                    q = str;
                    i2 = i;
                    break;
                case 1000:
                    z3 = z;
                    parcelablePayload2 = parcelablePayload;
                    q = str;
                    i2 = a.g(parcel, a);
                    z2 = z3;
                    break;
                default:
                    a.b(parcel, a);
                    z2 = z;
                    parcelablePayload2 = parcelablePayload;
                    q = str;
                    i2 = i;
                    break;
            }
            i = i2;
            str = q;
            parcelablePayload = parcelablePayload2;
            z = z2;
        }
        if (parcel.dataPosition() == b) {
            return new OnPayloadReceivedParams(i, str, parcelablePayload, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public OnPayloadReceivedParams[] a(int i) {
        return new OnPayloadReceivedParams[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
