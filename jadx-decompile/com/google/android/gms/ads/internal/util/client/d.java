package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class d implements Creator<VersionInfoParcel> {
    static void a(VersionInfoParcel versionInfoParcel, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, versionInfoParcel.a);
        b.a(parcel, 2, versionInfoParcel.b, false);
        b.a(parcel, 3, versionInfoParcel.c);
        b.a(parcel, 4, versionInfoParcel.d);
        b.a(parcel, 5, versionInfoParcel.e);
        b.a(parcel, a);
    }

    public VersionInfoParcel a(Parcel parcel) {
        boolean z = false;
        int b = a.b(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i3 = a.g(parcel, a);
                    break;
                case 2:
                    str = a.q(parcel, a);
                    break;
                case 3:
                    i2 = a.g(parcel, a);
                    break;
                case 4:
                    i = a.g(parcel, a);
                    break;
                case 5:
                    z = a.c(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new VersionInfoParcel(i3, str, i2, i, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public VersionInfoParcel[] a(int i) {
        return new VersionInfoParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
