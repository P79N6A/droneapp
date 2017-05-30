package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class g implements Creator<GetPermissionStatusRequest> {
    static void a(GetPermissionStatusRequest getPermissionStatusRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, getPermissionStatusRequest.a);
        b.a(parcel, 2, getPermissionStatusRequest.a(), false);
        b.a(parcel, 3, getPermissionStatusRequest.c, false);
        b.a(parcel, 4, getPermissionStatusRequest.d, i, false);
        b.a(parcel, a);
    }

    public GetPermissionStatusRequest a(Parcel parcel) {
        ClientAppContext clientAppContext = null;
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    iBinder = a.r(parcel, a);
                    break;
                case 3:
                    str = a.q(parcel, a);
                    break;
                case 4:
                    clientAppContext = (ClientAppContext) a.a(parcel, a, ClientAppContext.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GetPermissionStatusRequest(i, iBinder, str, clientAppContext);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public GetPermissionStatusRequest[] a(int i) {
        return new GetPermissionStatusRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
