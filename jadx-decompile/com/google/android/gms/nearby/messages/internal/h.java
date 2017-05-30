package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class h implements Creator<HandleClientLifecycleEventRequest> {
    static void a(HandleClientLifecycleEventRequest handleClientLifecycleEventRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, handleClientLifecycleEventRequest.a);
        b.a(parcel, 2, handleClientLifecycleEventRequest.b, i, false);
        b.a(parcel, 3, handleClientLifecycleEventRequest.c);
        b.a(parcel, a);
    }

    public HandleClientLifecycleEventRequest a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        ClientAppContext clientAppContext = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            ClientAppContext clientAppContext2;
            int g;
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    int i3 = i;
                    clientAppContext2 = clientAppContext;
                    g = a.g(parcel, a);
                    a = i3;
                    break;
                case 2:
                    g = i2;
                    ClientAppContext clientAppContext3 = (ClientAppContext) a.a(parcel, a, ClientAppContext.CREATOR);
                    a = i;
                    clientAppContext2 = clientAppContext3;
                    break;
                case 3:
                    a = a.g(parcel, a);
                    clientAppContext2 = clientAppContext;
                    g = i2;
                    break;
                default:
                    a.b(parcel, a);
                    a = i;
                    clientAppContext2 = clientAppContext;
                    g = i2;
                    break;
            }
            i2 = g;
            clientAppContext = clientAppContext2;
            i = a;
        }
        if (parcel.dataPosition() == b) {
            return new HandleClientLifecycleEventRequest(i2, clientAppContext, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public HandleClientLifecycleEventRequest[] a(int i) {
        return new HandleClientLifecycleEventRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
