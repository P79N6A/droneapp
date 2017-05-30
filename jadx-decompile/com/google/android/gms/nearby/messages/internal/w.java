package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.nearby.messages.Strategy;

public class w implements Creator<PublishRequest> {
    static void a(PublishRequest publishRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, publishRequest.a);
        b.a(parcel, 2, publishRequest.b, i, false);
        b.a(parcel, 3, publishRequest.c, i, false);
        b.a(parcel, 4, publishRequest.a(), false);
        b.a(parcel, 5, publishRequest.e, false);
        b.a(parcel, 6, publishRequest.f, false);
        b.a(parcel, 7, publishRequest.g);
        b.a(parcel, 8, publishRequest.b(), false);
        b.a(parcel, 9, publishRequest.i);
        b.a(parcel, 10, publishRequest.j, i, false);
        b.a(parcel, a);
    }

    public PublishRequest a(Parcel parcel) {
        boolean z = false;
        ClientAppContext clientAppContext = null;
        int b = a.b(parcel);
        IBinder iBinder = null;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        IBinder iBinder2 = null;
        Strategy strategy = null;
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
                    strategy = (Strategy) a.a(parcel, a, Strategy.CREATOR);
                    break;
                case 4:
                    iBinder2 = a.r(parcel, a);
                    break;
                case 5:
                    str2 = a.q(parcel, a);
                    break;
                case 6:
                    str = a.q(parcel, a);
                    break;
                case 7:
                    z2 = a.c(parcel, a);
                    break;
                case 8:
                    iBinder = a.r(parcel, a);
                    break;
                case 9:
                    z = a.c(parcel, a);
                    break;
                case 10:
                    clientAppContext = (ClientAppContext) a.a(parcel, a, ClientAppContext.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PublishRequest(i, messageWrapper, strategy, iBinder2, str2, str, z2, iBinder, z, clientAppContext);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public PublishRequest[] a(int i) {
        return new PublishRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
