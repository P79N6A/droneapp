package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class aa implements Creator<UnsubscribeRequest> {
    static void a(UnsubscribeRequest unsubscribeRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, unsubscribeRequest.a);
        b.a(parcel, 2, unsubscribeRequest.b(), false);
        b.a(parcel, 3, unsubscribeRequest.a(), false);
        b.a(parcel, 4, unsubscribeRequest.d, i, false);
        b.a(parcel, 5, unsubscribeRequest.e);
        b.a(parcel, 6, unsubscribeRequest.f, false);
        b.a(parcel, 7, unsubscribeRequest.g, false);
        b.a(parcel, 8, unsubscribeRequest.h);
        b.a(parcel, 9, unsubscribeRequest.i, i, false);
        b.a(parcel, a);
    }

    public UnsubscribeRequest a(Parcel parcel) {
        boolean z = false;
        ClientAppContext clientAppContext = null;
        int b = a.b(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        PendingIntent pendingIntent = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    iBinder2 = a.r(parcel, a);
                    break;
                case 3:
                    iBinder = a.r(parcel, a);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) a.a(parcel, a, PendingIntent.CREATOR);
                    break;
                case 5:
                    i = a.g(parcel, a);
                    break;
                case 6:
                    str2 = a.q(parcel, a);
                    break;
                case 7:
                    str = a.q(parcel, a);
                    break;
                case 8:
                    z = a.c(parcel, a);
                    break;
                case 9:
                    clientAppContext = (ClientAppContext) a.a(parcel, a, ClientAppContext.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new UnsubscribeRequest(i2, iBinder2, iBinder, pendingIntent, i, str2, str, z, clientAppContext);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public UnsubscribeRequest[] a(int i) {
        return new UnsubscribeRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
