package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class ai implements Creator<RemoveListenerRequest> {
    static void a(RemoveListenerRequest removeListenerRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, removeListenerRequest.a);
        b.a(parcel, 2, removeListenerRequest.a(), false);
        b.a(parcel, a);
    }

    public RemoveListenerRequest a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
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
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new RemoveListenerRequest(i, iBinder);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public RemoveListenerRequest[] a(int i) {
        return new RemoveListenerRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
