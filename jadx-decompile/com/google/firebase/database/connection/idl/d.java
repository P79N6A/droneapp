package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class d implements Creator<HostInfoParcelable> {
    static void a(HostInfoParcelable hostInfoParcelable, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, hostInfoParcelable.a);
        b.a(parcel, 2, hostInfoParcelable.b, false);
        b.a(parcel, 3, hostInfoParcelable.c, false);
        b.a(parcel, 4, hostInfoParcelable.d);
        b.a(parcel, a);
    }

    public HostInfoParcelable a(Parcel parcel) {
        String str = null;
        boolean z = false;
        int b = a.b(parcel);
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str2 = a.q(parcel, a);
                    break;
                case 3:
                    str = a.q(parcel, a);
                    break;
                case 4:
                    z = a.c(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new HostInfoParcelable(i, str2, str, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public HostInfoParcelable[] a(int i) {
        return new HostInfoParcelable[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
