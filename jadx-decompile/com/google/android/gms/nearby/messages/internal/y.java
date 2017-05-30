package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;

public class y implements Creator<SubscribeRequest> {
    static void a(SubscribeRequest subscribeRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, subscribeRequest.a);
        b.a(parcel, 2, subscribeRequest.b(), false);
        b.a(parcel, 3, subscribeRequest.c, i, false);
        b.a(parcel, 4, subscribeRequest.a(), false);
        b.a(parcel, 5, subscribeRequest.e, i, false);
        b.a(parcel, 6, subscribeRequest.f, i, false);
        b.a(parcel, 7, subscribeRequest.g);
        b.a(parcel, 8, subscribeRequest.h, false);
        b.a(parcel, 9, subscribeRequest.i, false);
        b.a(parcel, 10, subscribeRequest.j, false);
        b.a(parcel, 11, subscribeRequest.k);
        b.a(parcel, 12, subscribeRequest.c(), false);
        b.a(parcel, 13, subscribeRequest.m);
        b.a(parcel, 14, subscribeRequest.n, i, false);
        b.a(parcel, 15, subscribeRequest.o);
        b.a(parcel, a);
    }

    public SubscribeRequest a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        IBinder iBinder = null;
        Strategy strategy = null;
        IBinder iBinder2 = null;
        MessageFilter messageFilter = null;
        PendingIntent pendingIntent = null;
        int i2 = 0;
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        boolean z = false;
        IBinder iBinder3 = null;
        boolean z2 = false;
        ClientAppContext clientAppContext = null;
        boolean z3 = false;
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
                    strategy = (Strategy) a.a(parcel, a, Strategy.CREATOR);
                    break;
                case 4:
                    iBinder2 = a.r(parcel, a);
                    break;
                case 5:
                    messageFilter = (MessageFilter) a.a(parcel, a, MessageFilter.CREATOR);
                    break;
                case 6:
                    pendingIntent = (PendingIntent) a.a(parcel, a, PendingIntent.CREATOR);
                    break;
                case 7:
                    i2 = a.g(parcel, a);
                    break;
                case 8:
                    str = a.q(parcel, a);
                    break;
                case 9:
                    str2 = a.q(parcel, a);
                    break;
                case 10:
                    bArr = a.t(parcel, a);
                    break;
                case 11:
                    z = a.c(parcel, a);
                    break;
                case 12:
                    iBinder3 = a.r(parcel, a);
                    break;
                case 13:
                    z2 = a.c(parcel, a);
                    break;
                case 14:
                    clientAppContext = (ClientAppContext) a.a(parcel, a, ClientAppContext.CREATOR);
                    break;
                case 15:
                    z3 = a.c(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new SubscribeRequest(i, iBinder, strategy, iBinder2, messageFilter, pendingIntent, i2, str, str2, bArr, z, iBinder3, z2, clientAppContext, z3);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public SubscribeRequest[] a(int i) {
        return new SubscribeRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
