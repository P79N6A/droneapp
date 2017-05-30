package com.google.android.gms.games.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class c implements Creator<ConnectionInfo> {
    static void a(ConnectionInfo connectionInfo, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, connectionInfo.b(), false);
        b.a(parcel, 2, connectionInfo.c());
        b.a(parcel, 1000, connectionInfo.a());
        b.a(parcel, a);
    }

    public ConnectionInfo a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str = a.q(parcel, a);
                    break;
                case 2:
                    i = a.g(parcel, a);
                    break;
                case 1000:
                    i2 = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ConnectionInfo(i2, str, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ConnectionInfo[] a(int i) {
        return new ConnectionInfo[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
