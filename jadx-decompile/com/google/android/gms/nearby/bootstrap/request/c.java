package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class c implements Creator<DisableTargetRequest> {
    static void a(DisableTargetRequest disableTargetRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, disableTargetRequest.a(), false);
        b.a(parcel, 1000, disableTargetRequest.a);
        b.a(parcel, a);
    }

    public DisableTargetRequest a(Parcel parcel) {
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
            return new DisableTargetRequest(i, iBinder);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public DisableTargetRequest[] a(int i) {
        return new DisableTargetRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
