package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class l implements Creator<PlayerLevel> {
    static void a(PlayerLevel playerLevel, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, playerLevel.b());
        b.a(parcel, 2, playerLevel.c());
        b.a(parcel, 3, playerLevel.d());
        b.a(parcel, 1000, playerLevel.a());
        b.a(parcel, a);
    }

    public PlayerLevel a(Parcel parcel) {
        long j = 0;
        int i = 0;
        int b = a.b(parcel);
        long j2 = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    j2 = a.i(parcel, a);
                    break;
                case 3:
                    j = a.i(parcel, a);
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
            return new PlayerLevel(i2, i, j2, j);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public PlayerLevel[] a(int i) {
        return new PlayerLevel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
