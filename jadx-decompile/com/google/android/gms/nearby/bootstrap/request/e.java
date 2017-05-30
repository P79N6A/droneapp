package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class e implements Creator<EnableTargetRequest> {
    static void a(EnableTargetRequest enableTargetRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, enableTargetRequest.a(), false);
        b.a(parcel, 2, enableTargetRequest.b(), false);
        b.a(parcel, 3, enableTargetRequest.e(), false);
        b.a(parcel, 4, enableTargetRequest.f(), false);
        b.a(parcel, 5, enableTargetRequest.g(), false);
        b.a(parcel, 6, enableTargetRequest.c());
        b.a(parcel, 7, enableTargetRequest.d());
        b.a(parcel, 1000, enableTargetRequest.a);
        b.a(parcel, a);
    }

    public EnableTargetRequest a(Parcel parcel) {
        byte b = (byte) 0;
        IBinder iBinder = null;
        int b2 = a.b(parcel);
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        byte b3 = (byte) 0;
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < b2) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str2 = a.q(parcel, a);
                    break;
                case 2:
                    str = a.q(parcel, a);
                    break;
                case 3:
                    iBinder3 = a.r(parcel, a);
                    break;
                case 4:
                    iBinder2 = a.r(parcel, a);
                    break;
                case 5:
                    iBinder = a.r(parcel, a);
                    break;
                case 6:
                    b3 = a.e(parcel, a);
                    break;
                case 7:
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
            return new EnableTargetRequest(i, str2, str, b3, b, iBinder3, iBinder2, iBinder);
        }
        throw new a.a("Overread allowed size end=" + b2, parcel);
    }

    public EnableTargetRequest[] a(int i) {
        return new EnableTargetRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
