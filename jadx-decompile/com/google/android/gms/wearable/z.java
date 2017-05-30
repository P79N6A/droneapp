package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class z implements Creator<ConnectionConfiguration> {
    static void a(ConnectionConfiguration connectionConfiguration, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, connectionConfiguration.a);
        b.a(parcel, 2, connectionConfiguration.a(), false);
        b.a(parcel, 3, connectionConfiguration.b(), false);
        b.a(parcel, 4, connectionConfiguration.c());
        b.a(parcel, 5, connectionConfiguration.d());
        b.a(parcel, 6, connectionConfiguration.i());
        b.a(parcel, 7, connectionConfiguration.e());
        b.a(parcel, 8, connectionConfiguration.f(), false);
        b.a(parcel, 9, connectionConfiguration.g());
        b.a(parcel, 10, connectionConfiguration.h(), false);
        b.a(parcel, a);
    }

    public ConnectionConfiguration a(Parcel parcel) {
        String str = null;
        boolean z = false;
        int b = a.b(parcel);
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        String str3 = null;
        String str4 = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i3 = a.g(parcel, a);
                    break;
                case 2:
                    str4 = a.q(parcel, a);
                    break;
                case 3:
                    str3 = a.q(parcel, a);
                    break;
                case 4:
                    i2 = a.g(parcel, a);
                    break;
                case 5:
                    i = a.g(parcel, a);
                    break;
                case 6:
                    z3 = a.c(parcel, a);
                    break;
                case 7:
                    z2 = a.c(parcel, a);
                    break;
                case 8:
                    str2 = a.q(parcel, a);
                    break;
                case 9:
                    z = a.c(parcel, a);
                    break;
                case 10:
                    str = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ConnectionConfiguration(i3, str4, str3, i2, i, z3, z2, str2, z, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ConnectionConfiguration[] a(int i) {
        return new ConnectionConfiguration[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
