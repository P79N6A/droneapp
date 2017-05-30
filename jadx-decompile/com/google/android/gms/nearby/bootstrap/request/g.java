package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class g implements Creator<StartScanRequest> {
    static void a(StartScanRequest startScanRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, startScanRequest.b(), false);
        b.a(parcel, 2, startScanRequest.c(), false);
        b.a(parcel, 3, startScanRequest.a());
        b.a(parcel, 1000, startScanRequest.a);
        b.a(parcel, a);
    }

    public StartScanRequest a(Parcel parcel) {
        IBinder iBinder = null;
        byte b = (byte) 0;
        int b2 = a.b(parcel);
        IBinder iBinder2 = null;
        int i = 0;
        while (parcel.dataPosition() < b2) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    iBinder2 = a.r(parcel, a);
                    break;
                case 2:
                    iBinder = a.r(parcel, a);
                    break;
                case 3:
                    b = a.e(parcel, a);
                    break;
                case 1000:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b2) {
            return new StartScanRequest(i, b, iBinder2, iBinder);
        }
        throw new a.a("Overread allowed size end=" + b2, parcel);
    }

    public StartScanRequest[] a(int i) {
        return new StartScanRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
