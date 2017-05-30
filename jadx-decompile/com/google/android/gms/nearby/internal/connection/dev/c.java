package com.google.android.gms.nearby.internal.connection.dev;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class c implements Creator<SendConnectionRequestParams> {
    static void a(SendConnectionRequestParams sendConnectionRequestParams, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, sendConnectionRequestParams.a(), false);
        b.a(parcel, 2, sendConnectionRequestParams.b(), false);
        b.a(parcel, 3, sendConnectionRequestParams.c(), false);
        b.a(parcel, 4, sendConnectionRequestParams.d(), false);
        b.a(parcel, 5, sendConnectionRequestParams.e(), false);
        b.a(parcel, 6, sendConnectionRequestParams.f(), false);
        b.a(parcel, 1000, sendConnectionRequestParams.a);
        b.a(parcel, a);
    }

    public SendConnectionRequestParams a(Parcel parcel) {
        byte[] bArr = null;
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    iBinder3 = a.r(parcel, a);
                    break;
                case 2:
                    iBinder2 = a.r(parcel, a);
                    break;
                case 3:
                    iBinder = a.r(parcel, a);
                    break;
                case 4:
                    str2 = a.q(parcel, a);
                    break;
                case 5:
                    str = a.q(parcel, a);
                    break;
                case 6:
                    bArr = a.t(parcel, a);
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
            return new SendConnectionRequestParams(i, iBinder3, iBinder2, iBinder, str2, str, bArr);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public SendConnectionRequestParams[] a(int i) {
        return new SendConnectionRequestParams[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
