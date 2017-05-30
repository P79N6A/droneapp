package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class m implements Creator<PlayerLevelInfo> {
    static void a(PlayerLevelInfo playerLevelInfo, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, playerLevelInfo.b());
        b.a(parcel, 2, playerLevelInfo.c());
        b.a(parcel, 3, playerLevelInfo.d(), i, false);
        b.a(parcel, 4, playerLevelInfo.e(), i, false);
        b.a(parcel, 1000, playerLevelInfo.a());
        b.a(parcel, a);
    }

    public PlayerLevelInfo a(Parcel parcel) {
        long j = 0;
        PlayerLevel playerLevel = null;
        int b = a.b(parcel);
        int i = 0;
        PlayerLevel playerLevel2 = null;
        long j2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    j2 = a.i(parcel, a);
                    break;
                case 2:
                    j = a.i(parcel, a);
                    break;
                case 3:
                    playerLevel2 = (PlayerLevel) a.a(parcel, a, PlayerLevel.CREATOR);
                    break;
                case 4:
                    playerLevel = (PlayerLevel) a.a(parcel, a, PlayerLevel.CREATOR);
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
            return new PlayerLevelInfo(i, j2, j, playerLevel2, playerLevel);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public PlayerLevelInfo[] a(int i) {
        return new PlayerLevelInfo[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
