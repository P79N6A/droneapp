package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class i implements Creator<SessionStopRequest> {
    static void a(SessionStopRequest sessionStopRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, sessionStopRequest.a(), false);
        b.a(parcel, 2, sessionStopRequest.b(), false);
        b.a(parcel, 3, sessionStopRequest.c(), false);
        b.a(parcel, 1000, sessionStopRequest.d());
        b.a(parcel, a);
    }

    public SessionStopRequest a(Parcel parcel) {
        IBinder iBinder = null;
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str2 = a.q(parcel, a);
                    break;
                case 2:
                    str = a.q(parcel, a);
                    break;
                case 3:
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
            return new SessionStopRequest(i, str2, str, iBinder);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public SessionStopRequest[] a(int i) {
        return new SessionStopRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
