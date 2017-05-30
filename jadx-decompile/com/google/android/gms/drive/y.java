package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class y implements Creator<Permission> {
    static void a(Permission permission, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, permission.a);
        b.a(parcel, 2, permission.a(), false);
        b.a(parcel, 3, permission.b());
        b.a(parcel, 4, permission.c(), false);
        b.a(parcel, 5, permission.d(), false);
        b.a(parcel, 6, permission.e());
        b.a(parcel, 7, permission.f());
        b.a(parcel, a);
    }

    public Permission a(Parcel parcel) {
        String str = null;
        boolean z = false;
        int b = a.b(parcel);
        int i = 0;
        String str2 = null;
        int i2 = 0;
        String str3 = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i3 = a.g(parcel, a);
                    break;
                case 2:
                    str3 = a.q(parcel, a);
                    break;
                case 3:
                    i2 = a.g(parcel, a);
                    break;
                case 4:
                    str2 = a.q(parcel, a);
                    break;
                case 5:
                    str = a.q(parcel, a);
                    break;
                case 6:
                    i = a.g(parcel, a);
                    break;
                case 7:
                    z = a.c(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Permission(i3, str3, i2, str2, str, i, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public Permission[] a(int i) {
        return new Permission[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
