package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public class b implements Creator<GameBadgeEntity> {
    static void a(GameBadgeEntity gameBadgeEntity, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, gameBadgeEntity.c());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, gameBadgeEntity.d(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, gameBadgeEntity.e(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, gameBadgeEntity.f(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1000, gameBadgeEntity.g());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public GameBadgeEntity a(Parcel parcel) {
        int i = 0;
        Uri uri = null;
        int b = a.b(parcel);
        String str = null;
        String str2 = null;
        int i2 = 0;
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
                    uri = (Uri) a.a(parcel, a, Uri.CREATOR);
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
            return new GameBadgeEntity(i2, i, str2, str, uri);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public GameBadgeEntity[] a(int i) {
        return new GameBadgeEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
