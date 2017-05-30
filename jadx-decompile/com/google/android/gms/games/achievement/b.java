package com.google.android.gms.games.achievement;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.games.PlayerEntity;

public class b implements Creator<AchievementEntity> {
    static void a(AchievementEntity achievementEntity, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, achievementEntity.c(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, achievementEntity.d());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, achievementEntity.e(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, achievementEntity.f(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, achievementEntity.g(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 6, achievementEntity.getUnlockedImageUrl(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 7, achievementEntity.h(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1000, achievementEntity.q());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 8, achievementEntity.getRevealedImageUrl(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 9, achievementEntity.r());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 10, achievementEntity.s(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 11, achievementEntity.k(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 12, achievementEntity.l());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 13, achievementEntity.t());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 14, achievementEntity.u(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 15, achievementEntity.o());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 16, achievementEntity.p());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public AchievementEntity a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
        String str2 = null;
        String str3 = null;
        Uri uri = null;
        String str4 = null;
        Uri uri2 = null;
        String str5 = null;
        int i3 = 0;
        String str6 = null;
        PlayerEntity playerEntity = null;
        int i4 = 0;
        int i5 = 0;
        String str7 = null;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str = a.q(parcel, a);
                    break;
                case 2:
                    i2 = a.g(parcel, a);
                    break;
                case 3:
                    str2 = a.q(parcel, a);
                    break;
                case 4:
                    str3 = a.q(parcel, a);
                    break;
                case 5:
                    uri = (Uri) a.a(parcel, a, Uri.CREATOR);
                    break;
                case 6:
                    str4 = a.q(parcel, a);
                    break;
                case 7:
                    uri2 = (Uri) a.a(parcel, a, Uri.CREATOR);
                    break;
                case 8:
                    str5 = a.q(parcel, a);
                    break;
                case 9:
                    i3 = a.g(parcel, a);
                    break;
                case 10:
                    str6 = a.q(parcel, a);
                    break;
                case 11:
                    playerEntity = (PlayerEntity) a.a(parcel, a, PlayerEntity.CREATOR);
                    break;
                case 12:
                    i4 = a.g(parcel, a);
                    break;
                case 13:
                    i5 = a.g(parcel, a);
                    break;
                case 14:
                    str7 = a.q(parcel, a);
                    break;
                case 15:
                    j = a.i(parcel, a);
                    break;
                case 16:
                    j2 = a.i(parcel, a);
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
            return new AchievementEntity(i, str, i2, str2, str3, uri, str4, uri2, str5, i3, str6, playerEntity, i4, i5, str7, j, j2);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public AchievementEntity[] a(int i) {
        return new AchievementEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
