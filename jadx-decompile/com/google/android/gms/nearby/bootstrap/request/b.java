package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public class b implements Creator<ContinueConnectRequest> {
    static void a(ContinueConnectRequest continueConnectRequest, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, continueConnectRequest.a(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, continueConnectRequest.b(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1000, continueConnectRequest.a);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public ContinueConnectRequest a(Parcel parcel) {
        IBinder iBinder = null;
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
            return new ContinueConnectRequest(i, str, iBinder);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ContinueConnectRequest[] a(int i) {
        return new ContinueConnectRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
