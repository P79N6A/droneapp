package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.nearby.connection.dev.PayloadTransferUpdate;

public class ad implements Creator<OnPayloadTransferUpdateParams> {
    static void a(OnPayloadTransferUpdateParams onPayloadTransferUpdateParams, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, onPayloadTransferUpdateParams.a(), false);
        b.a(parcel, 2, onPayloadTransferUpdateParams.b(), i, false);
        b.a(parcel, 1000, onPayloadTransferUpdateParams.a);
        b.a(parcel, a);
    }

    public OnPayloadTransferUpdateParams a(Parcel parcel) {
        PayloadTransferUpdate payloadTransferUpdate = null;
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str = a.q(parcel, a);
                    break;
                case 2:
                    payloadTransferUpdate = (PayloadTransferUpdate) a.a(parcel, a, PayloadTransferUpdate.CREATOR);
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
            return new OnPayloadTransferUpdateParams(i, str, payloadTransferUpdate);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public OnPayloadTransferUpdateParams[] a(int i) {
        return new OnPayloadTransferUpdateParams[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
