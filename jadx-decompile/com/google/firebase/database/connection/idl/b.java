package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.List;

public class b implements Creator<ConnectionConfig> {
    static void a(ConnectionConfig connectionConfig, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, connectionConfig.a);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, connectionConfig.b, i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, connectionConfig.c);
        com.google.android.gms.common.internal.safeparcel.b.b(parcel, 4, connectionConfig.d, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, connectionConfig.e);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 6, connectionConfig.f, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 7, connectionConfig.g, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public ConnectionConfig a(Parcel parcel) {
        boolean z = false;
        String str = null;
        int b = a.b(parcel);
        String str2 = null;
        List list = null;
        int i = 0;
        HostInfoParcelable hostInfoParcelable = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    hostInfoParcelable = (HostInfoParcelable) a.a(parcel, a, HostInfoParcelable.CREATOR);
                    break;
                case 3:
                    i = a.g(parcel, a);
                    break;
                case 4:
                    list = a.E(parcel, a);
                    break;
                case 5:
                    z = a.c(parcel, a);
                    break;
                case 6:
                    str2 = a.q(parcel, a);
                    break;
                case 7:
                    str = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ConnectionConfig(i2, hostInfoParcelable, i, list, z, str2, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ConnectionConfig[] a(int i) {
        return new ConnectionConfig[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
