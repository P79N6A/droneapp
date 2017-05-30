package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class h implements Creator<StopScanRequest> {
    static void a(StopScanRequest stopScanRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, stopScanRequest.a(), false);
        b.a(parcel, 1000, stopScanRequest.a);
        b.a(parcel, a);
    }

    public StopScanRequest a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        IBinder iBinder = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    iBinder = a.r(parcel, a);
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
            return new StopScanRequest(i, iBinder);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public StopScanRequest[] a(int i) {
        return new StopScanRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
