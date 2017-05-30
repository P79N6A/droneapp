package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.Session;

public class h implements Creator<SessionStartRequest> {
    static void a(SessionStartRequest sessionStartRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, sessionStartRequest.a(), i, false);
        b.a(parcel, 2, sessionStartRequest.b(), false);
        b.a(parcel, 1000, sessionStartRequest.c());
        b.a(parcel, a);
    }

    public SessionStartRequest a(Parcel parcel) {
        IBinder iBinder = null;
        int b = a.b(parcel);
        int i = 0;
        Session session = null;
        while (parcel.dataPosition() < b) {
            int i2;
            IBinder iBinder2;
            Session session2;
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = i;
                    Session session3 = (Session) a.a(parcel, a, Session.CREATOR);
                    iBinder2 = iBinder;
                    session2 = session3;
                    break;
                case 2:
                    iBinder2 = a.r(parcel, a);
                    session2 = session;
                    i2 = i;
                    break;
                case 1000:
                    IBinder iBinder3 = iBinder;
                    session2 = session;
                    i2 = a.g(parcel, a);
                    iBinder2 = iBinder3;
                    break;
                default:
                    a.b(parcel, a);
                    iBinder2 = iBinder;
                    session2 = session;
                    i2 = i;
                    break;
            }
            i = i2;
            session = session2;
            iBinder = iBinder2;
        }
        if (parcel.dataPosition() == b) {
            return new SessionStartRequest(i, session, iBinder);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public SessionStartRequest[] a(int i) {
        return new SessionStartRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
