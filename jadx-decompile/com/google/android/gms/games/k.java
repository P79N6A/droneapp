package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;

public class k implements Creator<PlayerEntity> {
    static void a(PlayerEntity playerEntity, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, playerEntity.c(), false);
        b.a(parcel, 2, playerEntity.d(), false);
        b.a(parcel, 3, playerEntity.i(), i, false);
        b.a(parcel, 4, playerEntity.k(), i, false);
        b.a(parcel, 5, playerEntity.l());
        b.a(parcel, 6, playerEntity.n());
        b.a(parcel, 7, playerEntity.m());
        b.a(parcel, 1000, playerEntity.x());
        b.a(parcel, 8, playerEntity.getIconImageUrl(), false);
        b.a(parcel, 9, playerEntity.getHiResImageUrl(), false);
        b.a(parcel, 14, playerEntity.p(), false);
        b.a(parcel, 15, playerEntity.r(), i, false);
        b.a(parcel, 16, playerEntity.q(), i, false);
        b.a(parcel, 18, playerEntity.o());
        b.a(parcel, 19, playerEntity.g());
        b.a(parcel, 20, playerEntity.e(), false);
        b.a(parcel, 21, playerEntity.f(), false);
        b.a(parcel, 22, playerEntity.s(), i, false);
        b.a(parcel, 23, playerEntity.getBannerImageLandscapeUrl(), false);
        b.a(parcel, 24, playerEntity.t(), i, false);
        b.a(parcel, 25, playerEntity.getBannerImagePortraitUrl(), false);
        b.a(parcel, 26, playerEntity.u());
        b.a(parcel, 27, playerEntity.v());
        b.a(parcel, 28, playerEntity.w());
        b.a(parcel, a);
    }

    public PlayerEntity a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        Uri uri = null;
        Uri uri2 = null;
        long j = 0;
        int i2 = 0;
        long j2 = 0;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        MostRecentGameInfoEntity mostRecentGameInfoEntity = null;
        PlayerLevelInfo playerLevelInfo = null;
        boolean z = false;
        boolean z2 = false;
        String str6 = null;
        String str7 = null;
        Uri uri3 = null;
        String str8 = null;
        Uri uri4 = null;
        String str9 = null;
        int i3 = 0;
        long j3 = 0;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str = a.q(parcel, a);
                    break;
                case 2:
                    str2 = a.q(parcel, a);
                    break;
                case 3:
                    uri = (Uri) a.a(parcel, a, Uri.CREATOR);
                    break;
                case 4:
                    uri2 = (Uri) a.a(parcel, a, Uri.CREATOR);
                    break;
                case 5:
                    j = a.i(parcel, a);
                    break;
                case 6:
                    i2 = a.g(parcel, a);
                    break;
                case 7:
                    j2 = a.i(parcel, a);
                    break;
                case 8:
                    str3 = a.q(parcel, a);
                    break;
                case 9:
                    str4 = a.q(parcel, a);
                    break;
                case 14:
                    str5 = a.q(parcel, a);
                    break;
                case 15:
                    mostRecentGameInfoEntity = (MostRecentGameInfoEntity) a.a(parcel, a, MostRecentGameInfoEntity.CREATOR);
                    break;
                case 16:
                    playerLevelInfo = (PlayerLevelInfo) a.a(parcel, a, PlayerLevelInfo.CREATOR);
                    break;
                case 18:
                    z = a.c(parcel, a);
                    break;
                case 19:
                    z2 = a.c(parcel, a);
                    break;
                case 20:
                    str6 = a.q(parcel, a);
                    break;
                case 21:
                    str7 = a.q(parcel, a);
                    break;
                case 22:
                    uri3 = (Uri) a.a(parcel, a, Uri.CREATOR);
                    break;
                case 23:
                    str8 = a.q(parcel, a);
                    break;
                case 24:
                    uri4 = (Uri) a.a(parcel, a, Uri.CREATOR);
                    break;
                case 25:
                    str9 = a.q(parcel, a);
                    break;
                case 26:
                    i3 = a.g(parcel, a);
                    break;
                case 27:
                    j3 = a.i(parcel, a);
                    break;
                case 28:
                    z3 = a.c(parcel, a);
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
            return new PlayerEntity(i, str, str2, uri, uri2, j, i2, j2, str3, str4, str5, mostRecentGameInfoEntity, playerLevelInfo, z, z2, str6, str7, uri3, str8, uri4, str9, i3, j3, z3);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public PlayerEntity[] a(int i) {
        return new PlayerEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
