package com.google.android.gms.nearby.internal.connection.dev;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public class a implements Creator<AcceptConnectionRequestParams> {
    static void a(AcceptConnectionRequestParams acceptConnectionRequestParams, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, acceptConnectionRequestParams.a(), false);
        b.a(parcel, 2, acceptConnectionRequestParams.b(), false);
        b.a(parcel, 3, acceptConnectionRequestParams.c(), false);
        b.a(parcel, 4, acceptConnectionRequestParams.d(), false);
        b.a(parcel, 1000, acceptConnectionRequestParams.a);
        b.a(parcel, a);
    }

    public AcceptConnectionRequestParams a(Parcel parcel) {
        byte[] bArr = null;
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        String str = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    iBinder2 = com.google.android.gms.common.internal.safeparcel.a.r(parcel, a);
                    break;
                case 2:
                    iBinder = com.google.android.gms.common.internal.safeparcel.a.r(parcel, a);
                    break;
                case 3:
                    str = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 4:
                    bArr = com.google.android.gms.common.internal.safeparcel.a.t(parcel, a);
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
            return new AcceptConnectionRequestParams(i, iBinder2, iBinder, str, bArr);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + b, parcel);
    }

    public AcceptConnectionRequestParams[] a(int i) {
        return new AcceptConnectionRequestParams[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
