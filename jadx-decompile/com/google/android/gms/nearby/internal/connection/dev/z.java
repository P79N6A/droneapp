package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class z implements Creator<OnDisconnectedParams> {
    static void a(OnDisconnectedParams onDisconnectedParams, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, onDisconnectedParams.a(), false);
        b.a(parcel, 1000, onDisconnectedParams.a);
        b.a(parcel, a);
    }

    public OnDisconnectedParams a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str = a.q(parcel, a);
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
            return new OnDisconnectedParams(i, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public OnDisconnectedParams[] a(int i) {
        return new OnDisconnectedParams[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
