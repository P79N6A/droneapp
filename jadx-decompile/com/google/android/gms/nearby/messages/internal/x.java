package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class x implements Creator<RegisterStatusCallbackRequest> {
    static void a(RegisterStatusCallbackRequest registerStatusCallbackRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, registerStatusCallbackRequest.a);
        b.a(parcel, 2, registerStatusCallbackRequest.a(), false);
        b.a(parcel, 3, registerStatusCallbackRequest.b(), false);
        b.a(parcel, 4, registerStatusCallbackRequest.d);
        b.a(parcel, 5, registerStatusCallbackRequest.e, false);
        b.a(parcel, 6, registerStatusCallbackRequest.f, i, false);
        b.a(parcel, a);
    }

    public RegisterStatusCallbackRequest a(Parcel parcel) {
        boolean z = false;
        ClientAppContext clientAppContext = null;
        int b = a.b(parcel);
        String str = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    iBinder2 = a.r(parcel, a);
                    break;
                case 3:
                    iBinder = a.r(parcel, a);
                    break;
                case 4:
                    z = a.c(parcel, a);
                    break;
                case 5:
                    str = a.q(parcel, a);
                    break;
                case 6:
                    clientAppContext = (ClientAppContext) a.a(parcel, a, ClientAppContext.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new RegisterStatusCallbackRequest(i, iBinder2, iBinder, z, str, clientAppContext);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public RegisterStatusCallbackRequest[] a(int i) {
        return new RegisterStatusCallbackRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
