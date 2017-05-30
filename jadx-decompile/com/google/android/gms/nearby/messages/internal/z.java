package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class z implements Creator<UnpublishRequest> {
    static void a(UnpublishRequest unpublishRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, unpublishRequest.a);
        b.a(parcel, 2, unpublishRequest.b, i, false);
        b.a(parcel, 3, unpublishRequest.a(), false);
        b.a(parcel, 4, unpublishRequest.d, false);
        b.a(parcel, 5, unpublishRequest.e, false);
        b.a(parcel, 6, unpublishRequest.f);
        b.a(parcel, 7, unpublishRequest.g, i, false);
        b.a(parcel, a);
    }

    public UnpublishRequest a(Parcel parcel) {
        boolean z = false;
        ClientAppContext clientAppContext = null;
        int b = a.b(parcel);
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        MessageWrapper messageWrapper = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    messageWrapper = (MessageWrapper) a.a(parcel, a, MessageWrapper.CREATOR);
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
                    z = a.c(parcel, a);
                    break;
                case 7:
                    clientAppContext = (ClientAppContext) a.a(parcel, a, ClientAppContext.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new UnpublishRequest(i, messageWrapper, iBinder, str2, str, z, clientAppContext);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public UnpublishRequest[] a(int i) {
        return new UnpublishRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
